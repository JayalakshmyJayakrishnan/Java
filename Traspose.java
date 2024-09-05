import java.util.*;
public class Transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, m, n;
        System.out.println("Enter the number of rows in mat: ");
        m = sc.nextInt();
        System.out.println("Enter the number of columns in mat: ");
        n = sc.nextInt();

        int[][] mat = new int[m][n];
        int[][] transpose = new int[n][m];

        System.out.println("Enter the elements of mat: \n");
        for(i=0; i<m ; i++){
            for(j=0; j<n ; j++){
                System.out.println("  ");
                mat[i][j] = sc.nextInt();
            }
        }

        
        for(i=0; i<m ; i++){
            for(j=0; j<n ; j++){
                transpose[j][i] = mat[i][j];
            }
        }
        System.out.println("The transpose matrix is: \n");
        for(i=0; i<n ; i++){
            for(j=0; j<m ; j++){
                System.out.print(transpose[i][j]+"  ");
            }
            System.out.println();
        }
    }
}



