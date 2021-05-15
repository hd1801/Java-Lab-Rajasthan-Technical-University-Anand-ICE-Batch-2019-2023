public class min {
    public static void main(String[] args) {
    
    int a[]={10,20,30,40,50};
    System.out.println("Min Value in array: "+minArray(a) );
    }
    public static int minArray(int a[])
        {   int min=a[0];
            for (int i = 1; i <a.length; i++) {
                if(min<a[i])
                    min=a[i];
        }
        return min;
    }
}