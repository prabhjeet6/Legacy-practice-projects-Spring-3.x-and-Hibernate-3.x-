import java.util.Scanner;


public class BubbleSort {

	int arr[]=new int[5];
	void Bubble()
	{
		int i;
		Scanner s=new Scanner(System.in);
		for( i=0; i<5;i++)
		{
			arr[i]=s.nextInt();
		}
		for(i=0;i<5;i++)
		{
			for(int j=0;j<5-i-1;j++)//< n-i-1
				//because n-i-1(i being the no. of elements sorted,and -1 because j+1 will compare ahead )
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		// 5 3 2 7 1
		//0 to 4
		//3 5 2 7 1
		//1 to 4
		//3 2 5 7 1
		//2 to 4
		//3 to 4
		//3 2 5 1 7
		
		for(i=0;i<5;i++)
		{
			System.out.println(arr[i]);
		}
	}	
		public static void main(String asd[])
		{
			(new BubbleSort()).Bubble();
		}
		
		
	
}
