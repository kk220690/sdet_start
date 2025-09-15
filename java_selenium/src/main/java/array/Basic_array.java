package array;

public class Basic_array {

	public static void main(String[] args) 
	{
		int arr[]= {12,25,98};
		int arr1[]=arr;
		arr[1]=35;
		System.out.println(arr[1]);
		System.out.println(arr1[1]);
		System.out.println("this is additional msg");

	}

}
