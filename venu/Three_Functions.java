package venu;

public class Three_Functions {

	public static void main(String[] args) {
		int[] arr= {10,11,12};
		Mini(arr);
		System.out.println(Mini(arr));
		Max(arr);
		System.out.println(Max(arr));
		int av=Avg(arr);
		System.out.println(av);
		 
		}

	public static int  Mini(int[] array)
	{if(array[0]>array[1]&&array[0]>array[2])
	 {}	return array[0];	
	}
	public static int  Max(int[] array)
	{if(array[2]>array[1]&&array[2]>array[1])
	 {}	return array[2];	
	}
	public static int  Avg(int[] array)
	{int av=(array[0]+array[1]+array[2])/3;
	return av;	
	}
}
