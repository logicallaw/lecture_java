class ArrayUtil {	
	static public int[] concat(int[] arr1, int[] arr2) {
		int length = arr1.length + arr2.length;
		int[] temp = new int[length];
		
		for (int cnt = 0, i = 0; cnt < length;) {
			if (cnt < arr1.length) {
				temp[cnt++] = arr1[i++];
			}
			else {
				if (cnt == arr1.length) i = 0;
				temp[cnt++] = arr2[i++];
			}
		}
		
		return temp;
	}
	
	static public void print(int[] arr) {
		System.out.print("[ ");
		for (int i = 0; i < arr.length; i++) 
			System.out.print(arr[i] + " ");
		System.out.print("]");
	}
	
}
public class Lab04_4 {
	public static void main(String[] args) {
		
		int[] array1 = {1993, 0, 5, 1, 6};
		int[] array2 = {1990, 0, 2, 1, 2};
		int[] array3;
		array3 = ArrayUtil.concat(array1, array2);
	    ArrayUtil.print(array3);
	    
	}

}
