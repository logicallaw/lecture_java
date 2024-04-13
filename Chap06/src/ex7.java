public class ex7 {
	public static void main(String[] args) {
		//1차원배열
		int[] i1 = new int[3]; 
		
		int[] i2 = new int[]; 
		int[3] i3 = new int[]; 
		
		int[3] i4 = new int[3]; //객체 배열 생성시 참조타입 변수는 SIZE 지정 불가
		
		//2차원배열
		int[][] a1 = new int[3][4]; //정방형 배열
		int[][] a2 = new int[3][]; //비정방형 배열
		
		int[][] a3 = new int[][3];
		
		int[3][] a4 = new int[3][4];
		int[][4] a5 = new int[3][4];
		int[3][4] a6 = new int[3][4];
		
		int[3][] a7 = new int[3][];
		int[][4] a8 = new int[3][];
		int[3][4] a9 = new int[3][];
		
		int[3][] a3 = new int[][3];
		int[][4] a3 = new int[][3];
		int[3][4] a3 = new int[][3];
		
		//배열 선언시 값 초기화
		int[] b1 = {1,2,3,4,5};
		int[][] b2 = {{1,2,3},{4},{5,6,7,8}};
		for(int i = 0; i < b2.length; i++) {
			for (int j = 0; j < b2[i].length; j++) {
				System.out.println(b2[i][j] + " ");
			}
		}
		
		int[5] b3 = {1,2,3,4,5};
		int[3][] b4 = {{1,2,3},{4},{5,6,7,8}};
		int[3][3] b5 = {{1,2,3},{4},{5,6,7,8}};
		int[][3] b6 = {{1,2,3},{4},{5,6,7,8}};
		
		
	}

}
