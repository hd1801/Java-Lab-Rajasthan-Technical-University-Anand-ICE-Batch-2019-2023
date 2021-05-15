public class reverseArrray {
    public static void main(String[] args) {
       int a[]={10,20,30,40,50};
        for (int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
            System.out.println("");
        
        for (int i = 0,j=a.length-1; i <= (a.length)/2; i++,j--) {
            int c=a[i];
            a[i]=a[j];
            a[j]=c;
        }
        for (int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
    }
}
