package fundamentals;

public class Arrays {

	public static void main(String[] args) {
		
		// one dimensional array
		
		// forwards order
		int [] fac = {1, 1, 2, 6, 24, 120, 720, 5040};
		
		for(int i=0; i<fac.length; i++)
			System.out.println("fac[" + i + "] " + fac[i]);
		
		System.out.println("");
		
		// reverse order
		for(int i=fac.length - 1; i>=0; i--)
			System.out.println("fac[" + i + "] " + fac[i]);
		
		System.out.println("");
		
		// forwards order, print every other element
		for(int i=0; i<fac.length; i++)
			System.out.println("fac[" + i + "] " + fac[i]);
		
		System.out.println("");
		
		// reverse order, print every other element
		for(int i=fac.length - 1; i>=0; i--)
			System.out.println("fac[" + i + "] " + fac[i]);
		
		
		// two dimensional array
		System.out.println("");
		
		int [][] sum = { {0, 1, 2, 3}, // sum.length is 3 bc there are three arrays inside sum
						 {1, 2, 3, 4}, // sum[0].length is 4 because there are four items in the row sum[0]
						 {2, 3, 4, 5} }; // 3 rows, 4 columns
		
		for(int i=0; i<sum.length; i++)
			for(int j=0; j<sum[0].length; j++)
				System.out.println("sum[" + i + "] [" + j + "]" + sum[i][j]);
		
		System.out.println("");
		
		
		// three dimensional array
		System.out.println("");
		
		int [][][] num = { { {1,2},  {3,4},  {5,6},  {7,8}  }, // 3 rows, 4 columns, 2 each to make a 3D cube
						   { {9,10}, {11,12}, {13,14}, {15,16} },
						   { {17,18}, {19,20}, {21,22},{23,24} }  };
		
		for(int i=0; i<num.length; i++)
			for(int j=0; j<num[0].length; j++)
				for(int k=0; k<num[0][0].length; k++)
					System.out.println("num[" + i + "] [" + j + "] [" + k + "] " + num[i][j][k]);
		
		System.out.println("");
		

	}

}
