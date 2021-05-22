class A
{
    public static void main(String[] args) {
        int a[]={20,12,45,2,21,43};
        int s,f;
        s=f=a[0];
        for (int i=1;i<a.length;i++)
        {
            if(a[i]>f)
            f=a[i];

        }   

        for (int i=1;i<a.length;i++)
        {
            if(a[i]>s&&a[i]!=f)
            s=a[i];
            
        }
        System.out.println("Largest Element: "+f);
        System.out.println("Second Largest Element: "+s);
        

    }
}