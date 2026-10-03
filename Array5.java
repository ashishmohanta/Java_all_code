
public class Array5 {
    
    public static void main(String[] args){
        int[] x ={1,2,3,4,5,6,7,8};
        int[] y = {10,20,30,40,50,60,70,80,90,100};
        System.arraycopy(x, 2, y, 4, 2);
        for(int i =0 ;i<y.length;i++){
            System.out.print(y[i]+" ");
        }
        int[] a = new int[5];
        for(int i=0;i<a.length;i++){
            a[i]=i+2;
        }
        System.out.println();
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
//        a=new int [3];
//        System.out.println();
//        for(int i=0;i<a.length;i++){
//            System.out.print(a[i]+" ");
//        }
    }
    
}
