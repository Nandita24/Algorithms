/*10(a)
Write Java programs to Implement All-Pairs Shortest Paths problem using Floyd's algorithm

*/

import java.util.Scanner;
public class Floyd{
    public static void main(String args[])
    {
        Scanner Sc =new Scanner(System.in);
        System.out.println("Enter the total number of nodes");
        int n=Sc.nextInt();
        System.out.println("Enter the adjacency matrix");
        int d[][]= new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                d[i][j]=Sc.nextInt();
            }
        }
        for(int k=0;k<n;k++){
            for(int j=0;j<n;j++){
                for(int i=0;i<n;i++){
                    d[i][j]=Math.min(d[i][j],d[i][k]+d[k][j]);
                }
            }
        }
        System.out.println("the matrix is ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(d[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
}
