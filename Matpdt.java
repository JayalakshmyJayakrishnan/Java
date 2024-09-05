import java.util.*;
class Matpdt {
    public static void main(String[] args) {
        int i,j,k,m,n;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of rows in mat1: ");
        m = sc.nextInt();
        System.out.println("Enter the number of columns in mat1: ");
        n = sc.nextInt();

        System.out.println("Enter the number of rows in mat2: ");
        n = sc.nextInt();
        System.out.println("Enter the number of columns in mat2: ");
        m = sc.nextInt();
        int[][] mat1 = new int[m][n];
        int[][] mat2 = new int[n][m];
        int[][] pdt = new int[m][m];


        System.out.println("Enter the elements of mat1: \n");
        for(i=0; i<m ; i++){
            for(j=0; j<n ; j++){
                System.out.println("  ");
                mat1[i][j] = sc.nextInt();
            }
        }


        System.out.println("Enter the elements of mat2: \n");
        for(i=0; i<n ; i++){
            for(j=0; j<m ; j++){
                System.out.println("  ");
                mat2[i][j] = sc.nextInt();
            }
        }


        for(i=0; i<m; i++){
            for(j=0; j<m; j++){
                pdt[i][j]=0;
                for(k=0; k<n; k++){

                    pdt[i][j]+= mat1[i][k]*mat2[k][j]; 


                }
            }
        }
        

        System.out.println("The product of the two matrices: ");
        for(i=0; i<m ; i++){
            for(j=0; j<m ; j++){
                System.out.print(pdt[i][j] + " ");
                }
                    System.out.println();
            }

    }

   
}
