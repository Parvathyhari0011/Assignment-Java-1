package p1;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array1[] = new int[5];
		array1[0] = 10;
//array1[2]="Anu";

		for (int i = 0; i < array1.length; i++)
			System.out.println(array1[i]);

		String pgm[] = new String[6];
		pgm[0] = "Java programming";

		for (int j = 0; j < pgm.length; j++) {
			System.out.println(pgm[j]);

		}

		String days[] = { "Monday", "Tuesday" };
		for (int j = 0; j < days.length; j++) {
			System.out.println(days[j]);

		}

		for (String day : days) {
			System.out.println(day);
		}

		System.out.println(days[0]);

	int array2[][] = new int[2][3];

		array2[0][0] = 4;

		//int array2[][] = {{4,5,6},{7,8,9}};
		
		
		String str [][]=new String[2][3];
		str[0][0]="Monday";

//		for(int a1:array2)
//		{
//			System.out.println(a1);
//		}
//		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(array2[i][j]+" ");
			}
			System.out.println();
		}
		String n="Sree";//literal
		String n1=new String("Sree");
		n1=n+n1;
		
		System.out.println(n1);
		
		System.out.println(n);
		System.out.println(n1.charAt(2));

	}
}
