import java.util.*;
class Tranpose{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows and columns for the matrix:");
        int r=sc.nextInt();
        int c=sc.nextInt();
        
        int[][] matrix=new int[r][c];
        int[][] transpose=new int[c][r];
        
        System.out.println("Enter elements of the matrix:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        
        // Transpose of the matrix
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                transpose[j][i]=matrix[i][j];
            }
        }
        
        System.out.println("Transposed Matrix:");
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}