
public class insertion
{
	public static void main(String[] args) {
	int arr[] = {2,7,14,5,78,1,9,4,-6};
	for(int i=1;i<arr.length;i++)
	for(int j=i;j>0;j--)
	
	
	        if(arr[j-1]>arr[j]){
	            int temp=arr[j];
	            arr[j]=arr[j-1];
	            arr[j-1]=temp;
	        }
	        
	  for(int ele:arr)
	        System.out.print(ele+" ");
	        
		
	}
}
