package task;

import java.util.Scanner;
import java.util.TreeMap;

public class GameMoves {

	public static int combinationCounts(int input1)

    {
		TreeMap<String, char[]> map = new TreeMap<String, char[]>();
	    map.put("A", new char[] { 'A', 'B','D' } );
	    map.put("B", new char[] { 'A', 'B','C','E' });
	    map.put("C", new char[] { 'F', 'B','C' });
	    map.put("D", new char[] { 'A', 'G','D','E' });
	    map.put("E", new char[] { 'F', 'B','D','E','H' });
	    map.put("F", new char[] { 'I', 'F','C','E' });
	    map.put("G", new char[] { 'D', 'G','H' });
	    map.put("H", new char[] { 'G', 'H','I', 'E','J'});
	    map.put("I", new char[] { 'H', 'I','F' });
	    map.put("J", new char[] { 'H', 'J'});

	    
	    int[][] max = new int[input1][10];
        for(int i= 0 ; i < 10 ; i++)

        {
        	
        	max[0][i]=1;
           
        }

        for(int i=1 ;i < input1;i++ )

        {

            int j=0;

            for (String entry : map.keySet()) {
                
                int count=0;

                char[] temp =map.get(entry);
                

                for(int k=0 ; k < temp.length;k++)
                {
                	count=count + max[i-1][temp[k] -'A'];
                }

                max[i][j]=count;

                j++;

            }

            
        }

        int sum=0;

        for(int i=0;i<10;i++)

        	sum+=max[input1-1][i];

         return sum;
		
    } 
	public static void main(String[] args){
		// TODO Auto-generated method stub
     Scanner in = new Scanner(System.in);
     int output = 0;
     int ip1 = Integer.parseInt(in.nextLine().trim());
     output = combinationCounts(ip1);
     System.out.println(String.valueOf(output));
     
	}

}
