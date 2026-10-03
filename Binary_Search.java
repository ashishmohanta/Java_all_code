
package sakhhor.sir;


public class Binary_Search {
    public static void main(String[] args){
        int[] a = {5,6,74,0,2,36};
        int key=2;
         for(int i=0;i<a.length-1;i++)
    for(int j=0;j<a.length-i-1;j++){
        if(a[j]>a[j+1]){
            int temp=a[j];
            a[j]=a[j+1];
            a[j+1]=temp;
        }
    }
          System.out.println("The Array After Bubble Sort");
        for(int element:a){
            System.out.print(element+" ");
        }
        System.out.println();
        Binary_Search obj = new Binary_Search();
        int flag = obj.bsearch(a,0,a.length-1,key);
        if(flag==-1){
            System.out.println("The Key Not Found");
        }
        else{
            System.out.println("The Value Found At Index : "+flag);
        }
         
    }
    public int bsearch(int a[],int start,int end,int key){
        int i;
    if(start>end){
        return -1;
    }
    i=((start+end)/2);
    if(a[i]==key){
        return i;
    }
    else{
        if(a[i]>key){
            return bsearch(a,start,i-1,key);
        }
        else{
            return bsearch(a,i+1,end,key);
        }
    }
    }
    
}
