
import java.util.HashMap;
import java.util.Map;
import	java.util.Scanner;public class Solution
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int mind=Integer.MAX_VALUE;
        Map< Integer, Integer> hm=new HashMap<>();
        int arr[]=new  int[n];
        for(int i=0;i<n; i++)
        {
            arr[i]=in.nextInt();
            if(hm.containsKey(arr[i]))
            {
                int j=hm.get(arr[i]);
                if((i-j)<mind)
                {
                    mind=(i-j);
                }
            }
            else
            {
                hm.put(arr[i],i);
            }

        }
        if (mind==Integer.MAX_VALUE)
        {
            System.out.println(-1);
        }
        else
        {
            System.out.println(mind);
        }

    }
}
