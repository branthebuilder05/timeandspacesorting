
public class bubble
{
	public static void main(String[] args) {
	int arr[] = {2,7,14,5,1,9,4};
	for(int i=0;i<arr.length;i++)
	for(int j=1;j<arr.length-i;j++)
	        if(arr[j]<arr[j-1]){
	            int temp=arr[j];
	            arr[j]=arr[j-1];
	            arr[j-1]=temp;
	        }
	        
	  for(int ele:arr)
	        System.out.print(ele+" ");
	        
		
	}
}
