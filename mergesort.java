
public class mergesort
{
  public static int[] merge ( int arr1[], int arr2[]){
 int p1=0,p2=0,p=0;
	 
	 int arr[] = new int[arr1.length+arr2.length];
	 
	 
        while(p1<arr1.length && p2<arr2.length){
            if(arr1[p1]<arr2[p2]){
                //System.out.println("comparing in if"+arr1[p1]+ " "+ arr2[p2]);
                arr[p++]=arr1[p1++];
                // p++;
                // p1++;
            }
            else{
                // System.out.println("comparing in else"+arr1[p1]+ " "+ arr2[p2]);
                arr[p++]=arr2[p2++];
                // p++;
                // p2++;
            }
        }
        while(p1<arr1.length){
            arr[p++]=arr1[p1++];
        }
        while(p2<arr2.length){
            arr[p++]=arr2[p2++];
        }
        return arr;
          

  }
  public static int[] mergesort(int[] arr,int low,int high){
      if(low==high){
          int res[] = new int[1];
          res[0]=arr[low];
          return res;
      }
      
      
      int mid=(low+high)/2;
      int[] fh= mergesort(arr,low,mid);
      int[] sh =mergesort(arr,mid+1,high);
      int sa[] = merge(fh,sh);
      return sa;
       
  }



  public static void main (String[]args)
  {
    int arr[] = { 2,1, 10,23,5, 14, 78, 699, 224 };
   int res[]=new int[9];
   res=mergesort(arr,0,arr.length-1);
   
   
    // int arr1[]={1,3,5,8};
    // int arr2[]={2,4,6,9,11};
    // int arr[] = new int[9];
    // arr=merge (arr1, arr2);

  for (int ele:res)
      System.out.print (ele + " ");


  }
}
