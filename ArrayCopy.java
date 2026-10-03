
public class ArrayCopy
{
    public static void main(String[] args)
    {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int[] b = {100,200,300,400,500};
        System.out.println("a Array");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+ " ");
        }
        System.out.println();
        System.out.println("b Array");
        for(int i=0;i<b.length;i++)
        {
            System.out.print(b[i]+ " ");
        }
        System.arraycopy(b, 0, a, 0, b.length);
        System.out.println();
        System.out.println("a Array after copy");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+ " ");
        }
        
    }
    
}
