
public class countsort
{
    public static int[] countsort(int arr[]){
        //find minandmax
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[min])
                min=i;
        }
         int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[max])
                max=i;
        }
        min = arr[min];
        max=arr[max];
         

        
        
        //make frequency array
        int freqarr[] = new int[max-min+1];
        
        for(int i=0;i<arr.length;i++){
           
            int index=arr[i]-min;
             freqarr[index]++;
   
        }
        //makefrequencysum array
         for(int i=1;i<freqarr.length;i++){
             freqarr[i]+=freqarr[i-1];
   
        }
        
        //do sort
        int res[] = new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            int value= arr[i];
            int pos= freqarr[value-min];
            res[pos-1]=value;
            freqarr[value-min]--;
            
        }
        
        return res;
    }
    
    
	public static void main(String[] args) {
	
		int arr[] = {3,6,1,4,9,6,2,5,8,9,9,9,5,8,5,9,3,4,5,2,7,2,5,3,7};
		int res[]=new int[arr.length];
		res=countsort(arr);

        for(int i=0;i<res.length;i++){
             System.out.print(res[i]+" ");
   
        }



	}
}
