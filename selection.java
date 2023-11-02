
public class selection
{
	public static void main(String[] args) {
	int arr[] = {2,7,14,5,1,9,4};
	for(int i=0;i<arr.length;i++)
	for(int j=i;j<arr.length;j++)
	
	
	        if(arr[i]>arr[j]){
	            int temp=arr[i];
	            arr[i]=arr[j];
	            arr[j]=temp;
	        }
	        
	  for(int ele:arr)
	        System.out.print(ele+" ");
	        
		
	}
}
