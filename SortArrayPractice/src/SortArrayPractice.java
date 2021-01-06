
public class SortArrayPractice
{
	public static void sortArray(int[] arr)
	{
		for(int i = 0; i < arr.length - 1; i++)
		{
			int min = i;
			for(int j = i + 1; j < arr.length; j++)
			{
				if(arr[j] < arr[min])
				{
					min = j;
				}
			}
			
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}
	
	public static void main(String[] args)
	{
		int[] arr = {23, 54, 1, 56, 8, 45};
		
		sortArray(arr);
		
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
}
