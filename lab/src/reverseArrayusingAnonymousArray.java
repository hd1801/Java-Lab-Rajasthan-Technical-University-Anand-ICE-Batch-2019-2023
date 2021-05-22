public class reverseArrayusingAnonymousArray {
    public static void main(String[] args) {
        int a[]={10,20,30,40,50};
        for (int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
            System.out.println("");
            reverse(a);
       
    }
     public static void reverse(int[] arr){
        for (int i = 0,j=arr.length-1; i <= (arr.length)/2; i++,j--) {
            int c=arr[i];
            arr[i]=arr[j];
            arr[j]=c;
             
        }
        for (int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    
    }
}
