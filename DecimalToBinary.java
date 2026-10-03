/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package all.java.code.pkgfor.uiu.lab.by.turjo;

/**
 *
 * @author nasir uddin ahmed
 */
public class DecimalToBinary {
    
    public static void main(String[] args){
        int number=420,mod=0,i=0,count=-1,j,k;
        k=number;
        int array[]= new int[100];
        int temp[] = new int [100];
        while(number!=0){
            mod=number%2;
            array[i]=mod;
//            i++;
            count++;
            number=number/2;
                i++;
        }
        System.out.println("The Decimal Number Is->> "+k);
        System.out.println("The Binary Number Will Be : ");
        for(j=count;j>=0;j--){
            System.out.print(array[j]+" ");
           
            
        }
        System.out.println();
      
    }
    
}
