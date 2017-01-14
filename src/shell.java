import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Created by Devashish Katoriya on 31-12-2016.
 * Program to Illustrate the working of Shell sort using BufferedReader in JAVA
 */

public class shell {
    public static void main(String []args) throws IOException
    {
        int i,n,temp,swapped,gap,count;
        int []a = new int[200];

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);

        System.out.print("\nEnter how many elements ? ");
        n = Integer.parseInt(br.readLine());

        System.out.print("\nEnter the array elements :- \n");		//Input from User
        for(i=0;i<n;i++)
        {
            a[i] = Integer.parseInt(br.readLine());
        }

        System.out.print("\nThe array is :- \n\n");
        for(i=0;i<n;i++)
        {
            System.out.print("\t"+a[i]);
        }

        System.out.print("\n\n");
        gap = n/2;
        count = 1;
        do															//Shell Sort
        {
            do
            {
                swapped = 0;
                for(i=0;i<n-gap;i++)
                {
                    if(a[i]>a[i+gap])
                    {
                        temp = a[i];
                        a[i] = a[i+gap];
                        a[i+gap] = temp;
                        swapped = 1;
                    }
                }
            }while(swapped == 1);
            System.out.print("\nIteration "+count+" : ");
            for(i=0;i<n;i++)
            {
                System.out.print("\t"+a[i]);
            }
            count++;
            gap = gap/2;
        }while(gap>0);

        System.out.print("\n\nArray after Shell Sort :- \n\n");		//Display Array
        for(i=0;i<n;i++)
        {
            System.out.print("\t"+a[i]);
        }

        System.out.print("\n\n");
    }
}
