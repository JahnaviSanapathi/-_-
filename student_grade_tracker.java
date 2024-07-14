import java.util.Arrays;
import java.util.Scanner;
public class MinMaxFinder {

    public static int setmini(int[] A, int N)
    {
        int mini = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            if (A[i] < mini) {
                mini = A[i];
            }
        }
        return mini;
    }

   
    public static int setmaxi(int[] A, int N)
    {
        int maxi = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            if (A[i] > maxi) {
                maxi = A[i];
            }
        }
        return maxi;
    }
    
    public static int  average(int[] A,int N)
    {
        int avg = 0;
        for(int i = 0;i < N; i++)
        {
            avg=avg+A[i];
        }
        return avg/N;
        
    }

    public static void main(String[] args)
    {
       
        Scanner sc = new Scanner(System.in);

		
		System.out.println("Enter the number of the students: ");
		int arr_size = 0;
		if (sc.hasNextInt()) 
		{
			arr_size = sc.nextInt();
		}

		int[] A = new int[arr_size];

	
		System.out.println("Enter the students grade :");
		for (int i = 0; i < arr_size; i++)
		{
			if (sc.hasNextInt())
			{
				A[i] = sc.nextInt();
			}
		}

        System.out.println("Minimum Grade is: "
                           + setmini(A, arr_size));
         System.out.println("Average Grade is: "
                           + average(A, arr_size));                   
        System.out.println("Maximum Grade is: "
                           + setmaxi(A, arr_size));
    }
}
