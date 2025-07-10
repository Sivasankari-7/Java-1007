import java.util.Arrays;
class Bubblesort
{
	public static void main(String[] args) 
	{
		int num[]={4,6,3,2,1,7,9,5};
		int size=num.length;
		System.out.println("before shorting:"+Arrays.toString(num));
		for(int i=0;i<size;i++){
			for(int j=0;j<size-1;j++){
				if(num[j]>num[j+1]){
					int temp=num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
				}
			}
		}
		
		System.out.println();
		System.out.println("After shorting:"+Arrays.toString(num));
	}
	
	
}
