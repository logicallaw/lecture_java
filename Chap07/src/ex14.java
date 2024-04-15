
public class ex14 {
	public static int[] concat(int[] i1, int[] i2) {
		int[] temp = new int[i1.length + i2.length];
		int counter = 0;
		for (int i = 0, j = 0; i < i1.length + i2.length;i++) {
			if (i < i1.length) {
				temp[counter++] = i1[j++];
			}
			else {
				if (i == i1.length) j = 0;
				temp[counter++] = i2[j++];
			}
		}
		return temp;
	}
	public static void main(String[] args) {
		int[] array1 = {1993, 0, 5, 1, 6};
		int[] array2 = {1990, 0, 2 ,1 ,2};
		int[] array3 = concat(array1, array2);
		System.out.print("[ ");
		for (int element : array3)
			System.out.print(element + " ");
		System.out.println("]");
	}

}
