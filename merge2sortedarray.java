
public class merge2sortedarray
{
  public static void merge (int arr[], int arr1[], int arr2[]){
 int p1=0,p2=0,p=0;
	 
        while(p1<arr1.length && p2<arr2.length){
            if(arr1[p1]<arr2[p2]){
                //System.out.println("comparing in if"+arr1[p1]+ " "+ arr2[p2]);
                arr[p]=arr1[p1];
                p++;
                p1++;
            }
            else{
                // System.out.println("comparing in else"+arr1[p1]+ " "+ arr2[p2]);
                arr[p]=arr2[p2];
                p++;
                p2++;
            }
        }
        while(p1<arr1.length){
            arr[p++]=arr1[p1++];
        }
        while(p2<arr2.length){
            arr[p++]=arr2[p2++];
        }
          

  }



  public static void main (String[]args)
  {
    int arr1[] = { 2, 10, 14, 78, 699 };
    int arr2[] = { 1, 5, 23, 67, 224 };
    int arr[] = new int[10];



    merge (arr, arr1, arr2);

  for (int ele:arr)
      System.out.print (ele + " ");


  }
}
