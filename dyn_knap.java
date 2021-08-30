/*6a
Implement in Java, the 0/1 Knapsack problem using (a) Dynamic Programming method

 */
import java.util.Scanner;
public class dyn_knap {
	    static int max(int a, int b) 
	    { 
	        return (a > b)? a : b; 
	    }
	    static int knapSack(int W, int wt[], int val[], int n)
	    {
	        
	        int [][]V = new int[n+1][W+1];
	        for (int i = 0; i <= n; i++)
	            for (int j = 0; j <= W; j++)
	            	if (i==0 || j==0)
	            		V[i][j] = 0;
	 
		   // Build table K[][] in bottom up manner
	        for (int i = 1; i <= n; i++)
	        {
	            for (int j = 1; j <= W; j++)
	            {
	                
	                if (j<wt[i])
	                	V[i][j] = V[i-1][j];
	                else
	                	 V[i][j] = max(V[i-1][j],V[i-1][j-wt[i]]+val[i]);
	                    
	            }
	        }
	 
	       System.out.println("The final matrix is as follows");
	       for(int i=0;i<=n;i++)
	       {
	    	   for(int j=0;j<=W;j++)
	    	   {
	       		   System.out.print(V[i][j] + "\t"); 
	    	   }
	           System.out.print("\n");
	       }   
	       System.out.println("Selected Items");
	       Item_Select(n,W,wt, V);
	       return V[n][W];
	    }
	 
	    public static void main(String args[])
	    {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the number of items: ");
	        int n = sc.nextInt();
	        System.out.println("Enter the items weights: ");
	        int []wt = new int[n + 1];
	        for(int i=1; i<=n; i++)
	            wt[i] = sc.nextInt();
	 
	        System.out.println("Enter the items values: ");
	        int []val = new int[n + 1];
	        for(int i=1; i<=n; i++)
	            val[i] = sc.nextInt();
	 
	        System.out.println("Enter the maximum capacity: ");
	        int W = sc.nextInt();
	 
	        System.out.println("The maximum value that can be put in a knapsack of capacity W is: " + knapSack(W, wt, val, n));
	     }
		public static void Item_Select(int n, int W, int[] wt, int V [][])
		{
			while (n>0 && W>0)
			{
				if(V[n][W]!=V[n-1][W])
				{
					System.out.println(" Item " +n + " is selected");
					W=W-wt[n];
					n=n-1;
				}
				else
					n=n-1;
			}
		}
	}


