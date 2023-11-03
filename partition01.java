
public class Main
{
    public static int partition(int[] arr,int p,int l,int h){
        int tracker=l,pivot=l;
        for(int i=l;i<=h;i++){
            if(arr[i]<arr[p]){
                int temp=arr[tracker];
                arr[tracker]=arr[pivot];
                arr[pivot]=temp;
                tracker++;
                pivot++;
            }
            else{
                tracker++;
            }
            
            
            
        }
        int temp=arr[p];
                arr[p]=arr[pivot];
                arr[pivot]=temp;
            return pivot;
        
    }
    
    public static int quickselect(int[] arr,int kthsmallest,int low,int high){
        
        int pivot=partition(arr,high,low,high);
       //System.out.println(pivot);
        
        if(pivot==kthsmallest){
             
        
            return arr[pivot];}
        
        if(pivot>kthsmallest){
          // System.out.println("in if "); 
           return  quickselect(arr,kthsmallest,low,pivot-1);
        }
        else{
          //  System.out.println("in else ");
         return  quickselect(arr,kthsmallest,pivot+1,high);   
        }
         
    }
    
public static void partition01(int[] arr,int p,int l,int h){
        int tracker=l,pivot=l;
        for(int i=l;i<=h;i++){
            if(arr[i]==0){
                int temp=arr[tracker];
                arr[tracker]=arr[pivot];
                arr[pivot]=temp;
                tracker++;
                pivot++;
            }
            else{
                tracker++;
            }
            
            
            
        }
       
        
    }



  public static void main (String[]args)
  {
    int arr[] = { 2,1, 10,23,5, 1114, 78, 699, 224,14,8888 };
      int arr1[] = {0,0,0,1,0,1,1,1,0,1,0,1,1,1,0 };
      partition01(arr1,0,0,arr1.length-1);

    
  for (int ele:arr1)
      System.out.print (ele + " ");


  }
}
