/*12
Design and implement in Java to find all Hamiltonian Cycles in a connected undirected 
Graph G of n vertices using backtracking principle.

*/
import java.util.Scanner;

public class ham_cycle 
{
	static int n;
	static int adj[][] = new int[10][10];
	static int x[] = new int[10];
	static int flag = 0;
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of vertices");
		n = scan.nextInt();
		System.out.println("Enter the adjacency matrix");
		for(int i = 1; i <= n; i++)
			for(int j = 1; j <= n; j++)
				adj[i][j] = scan.nextInt();
		x[1] = 1;
		Hamiltonian(2);
		if(flag == 0)
			System.out.println("No Hamiltonian cycle present for the given graph");
	}
	
	static void Hamiltonian(int k)
	{
		do
		{
			NextValue(k);
			if(x[k] == 0)
				return;
			if(k == n)
			{
				flag = 1;
				System.out.println("The Hamiltonian cycle is:");
				for(int i = 1; i <= n; i++)
					System.out.print(x[i]+" ");
				System.out.print("1\n");
			}
			else
				Hamiltonian(k + 1);
		}while(true);
	}
	
	static void NextValue(int k)
	{
		int j;
		do
		{
			x[k] = (x[k] + 1) % (n + 1);
			if(x[k] == 0)
				return;
			if(adj[x[k - 1]][x[k]] == 1)
			{
				for(j = 1; j <= k - 1; j++)
					if(x[j] == x[k])
						break;
				if(j == k)
					if((k < n) || ((k == n) && adj[x[n]][x[1]] == 1))
						return;
			}
		}while(true);
	}
}





