package patternPrinting;


public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//
//		System.out.println("rightHalfPyramid");
//		rightHalfPyramid(4);
//		System.out.println("invertedRightHalfPyramid");
//		invertedRightHalfPyramid(4);
//		System.out.println("leftHalfPyramid");
//		leftHalfPyramid(4);
//		System.out.println("revartedLeftHalfPyramid");
//		revartedLeftHalfPyramid(4);
//		System.out.println("solidRectangle");
//		solidRectangle(4);
//		System.out.println("hollowRectangle");
//		hollowRectangle(4,5);
//		System.out.println("leftHalfDiamond");
//		leftHalfDiamond(4);
//		System.out.println("rightHalfPyramidWithNumber");
//		rightHalfPyramidWithNumber(4);
//		System.out.println("invertedRightHalfPyramidWithNumber");
//		invertedRightHalfPyramidWithNumber(4);
//		System.out.println("floydsTriangle");
//		floydsTriangle(4);
		System.out.println("zeroOneTriangle");
		zeroOneTriangle(4);

	}
	
	public static void rightHalfPyramid(int n) {
//	i
//	1   *      Star = 1 = i j will run 1 times 1 star
//	2	**     Star = 2 = i j will run 2 times 2 star
//	3	***    Star = 3 = i j will run 3 times 3 star
//	4	****   Star = 4 = i j will run 4 times 4 star
//		1 
//		2 3 
//		4 5 6 
//		7 8 9 10
		//int num = 1;
		for(int i = 1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void invertedRightHalfPyramid(int n) {
//	i
//	4	**** i=4 j loop will run 4 times so 4 star
//	3	***	 i=3 j loop will run 3 times so 3 star
//	2	**   i=2 j loop will run 2 times so 2 star
//	1	*    i=1 j loop will run 1 times so 1 star

		for(int i = n; i>=1; i--) {
			//inner loop for star printing
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//      i
//		1	**** star=4 =n-i+1= 4-1+1
//		2	***	 star=3 =n-i+1 =4-2+1
//		3	**   star=2 =n-i+1 =4-3+1
//		4	*    star=1 =n-i+1 =4-4+1
//		for(int i = 1; i<=n; i++) {
//			for(int j = 1; j<=n-i+1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
	
	}
	public static void leftHalfPyramid(int n) {
//	i	
//	1	   *space=3=n-i, *=1=i total=n=4
//	2	  **space=2=n-i, *=2=i total=n=4
//	3	 ***space=1=n-i, *=3=i total=n=4
//	4	****space=0=n-i, *=4=i total=n=4
		for(int i = 1; i<=n; i++) {
			//inner loop for space printing
			for(int j= 1; j<=n-i; j++) {
				System.out.print(" ");
			}
			//inner loop for star printing
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		
	}
	
	public static void revartedLeftHalfPyramid(int n) {
//	i
//	0	**** space=0 = i, *=4=n-i total=n=4
//	1	 *** space=1 = i, *=3=n-i total=n=4
//	2	  ** space=2 = i, *=2=n-i total=n=4
//	3	   * space=3 = i, *=1=n-i total=n=4
		for(int i = 0; i<n; i++) {
			//inner loop for space printing
			for(int j = 1; j<=i;j++) {
				System.out.print(" ");
			}
			//inner loop for star printing
			for(int j = 1; j<=n-i; j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void solidRectangle(int n) {
//	i	
//	1	* * * * row and column are same so loop will run n times
//	2	* * * * 
//	3	* * * * 
//	4	* * * * 
		for(int i=0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	
			
	}
	public static void hollowRectangle(int r, int c) {
		
//		1,1* 1,2* 1,3* 1,4* 1,5*
//		2,1*                2,5*
//		3,1*   	            3,5*
//		4,1* 4,1* 4,3* 4,4* 4,5*
		
		//in case of hollow rectangle we can see the stars are present at the place either 
		//the values are 1 for i and j variable or the values are max for i and j variable
		//logic is written in resource.docx
		for(int i=1; i<=r; i++) {
			for(int j = 1; j<=c; j++) {
				//in case of hollow rectangle we can see the stars are present at the place either 
				//the values are 1 for i and j variable or the values are max for i and j variable.
				if(i==1 || j==1 || i==r||j==c) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}

	private static void leftHalfDiamond(int n) {
		// TODO Auto-generated method stub

		
//		    *
//		   **
//		  ***
//		 ****
//		 ****
//		  ***
//		   **
//		    *
		
//		same logic as leftHalfPyramid and revartedLeftHalfPyramid
		for(int i = 1; i<=n; i++) {
			for(int j= 1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		for(int i = 0; i<n; i++) {
			
			for(int j = 1; j<=i;j++) {
				System.out.print(" ");
			}
			for(int j = 1; j<=n-i; j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
	private static void rightHalfPyramidWithNumber(int n) {
		
//	1	1    i is 1 so j will loop till 1
//	2	12   i is 2 so j will loop till 2
//	3	123  i is 3 so j will loop till 3
//	4	1234 i is 4 so j will loop till 4
		//this prints the value of j (column). j goes till i so each time the max
		//value of j is the value of i.
		for(int i=1; i<=n; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		
	}

	private static void invertedRightHalfPyramidWithNumber(int n) {
		
//	1	1234 n-i+1 = 4-1+1 = 4 j will loop till 4
//	2	123  n-i+1 = 4-2+1 = 3 j will loop till 3
//	3	12   n-i+1 = 4-3+1 = 2 j will loop till 2
//	4	1    n-i+1 = 4-4+1 = 1 j will loop till 1
		
		for(int i=1; i<=n; i++) {
			for(int j = 1; j<=n-i+1; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	private static void floydsTriangle(int n) {

//	1	1         i = 1; j will loop till 1
//	2	2 3       i = 2; j will loop till 2
//	3	4 5 6     i = 3; j will loop till 3
//	4	7 8 9 10  i = 4; j will loop till 4
		//num is a variable what keeps increasing with each j loop
		int num=1;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(num + " ");
				num ++;
			}
			System.out.println();
		}

	}

	private static void zeroOneTriangle(int n) {
		// TODO Auto-generated method stub
//		1
//		01
//		101
//		0101
		
		//logic is written in resource.docx
		for(int i=1; i<=n; i++) {
			for(int j =1; j<=i; j++) {
				int sum = 0;
				sum = i+j;
				if(sum%2 == 0) {//when the sum is Even we print 1
					System.out.print("1 ");
				}
				else {//when the sum is ODD we print 1
					System.out.print("0 ");
				}
			}
			System.out.println();
			
		}
	}


}
	


