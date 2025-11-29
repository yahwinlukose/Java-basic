import java.util.*;
class Addmatrix {
	public static void main(String args[]) {
		int a[][],b[][],sum[][],r,c,i,j;
		Scanner s;
		s = new Scanner(System.in);
		System.out.println("Enter the no. of r & c");
		r = s.nextInt();
		c = s.nextInt();
		a = new int[r][c];
		b = new int[r][c];
		sum = new int[r][c];
		for(i = 0;i < r;i++){
			for(j = 0;j < c;j++){
				System.out.println("Enter a["+i+"]["+j+"]:");
				a[i][j] = s.nextInt();
			}
		}
		for(i = 0;i < r;i++){
			for(j = 0;j < c;j++){
				System.out.println("Enter b["+i+"]["+j+"]:");
				b[i][j] = s.nextInt();
			}
		}
		for(i = 0;i < r;i++){
			for(j = 0;j < c;j++){
				sum[i][j] = a[i][j] + b[i][j];
			}
		}
		for(i = 0;i < r;i++){
			for(j = 0;j < c;j++){
				System.out.print(sum[i][j] + "\t");
			}
			System.out.println("");
		}
		
	}
}