package practise;

import java.util.*;
import java.lang.*;
 
class AntiDiagonal{
  
static void diagonal(int[][] A)
{
    int n = A.length;
    int N = 2 * n - 1;
  
    ArrayList<ArrayList<Integer>> result = new ArrayList<>();
     
    for(int i = 0; i < N; i++)
        result.add(new ArrayList<>());
  
    for(int i = 0; i < n; i++)
        for(int j = 0; j < n; j++)
            result.get(i + j).add(A[i][j]);
    
    for(int i=0;i<result.size();i++)
    {
    	for(int j = 0; j < result.get(i).size(); j++)
 	   {
 		  System.out.print(result.get(i).get(j) + " ");
 	   }
    }
}
   
public static void main(String[] args)
{
   Scanner in=new Scanner(System.in);
   int k=in.nextInt();
   int A[][]=new int[k][k];
   for(int i=0;i<k;i++)
   {
	   for(int j=0;j<k;j++)
	   {
		   A[i][j]=in.nextInt();
	   }
   }
    diagonal(A);
}
}
