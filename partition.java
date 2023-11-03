
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
    




  public static void main (String[]args)
  {
    int arr[] = { 2,1, 10,23,5, 1114, 78, 699, 224,14 };
    quicksort(arr,0,arr.length-1);
   
    int e =partition(arr,arr.length-1,0,arr.length-1);
   System.out.println(e);
   
    
  for (int ele:arr)
      System.out.print (ele + " ");


  }
}
