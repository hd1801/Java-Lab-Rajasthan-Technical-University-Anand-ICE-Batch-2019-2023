public class returnArray {
    public static void main(String[] args) {
        
        int arr[]=setValue();
        for (int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static int[] setValue(){
        
        return new int[]{10,20,32,12,33};
    }

}
