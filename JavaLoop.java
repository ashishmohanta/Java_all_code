/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasiclevelcoding;

/**
 *
 * @author nasir uddin ahmed
 */
public class JavaLoop {
    
    public static void main(String[] args){
        
        for(int i=0;i<5;i++){
            for(int j=0;j<6;j++){
                System.out.println("Here i*j->>"+i*j);
                break;
            }
            System.out.println(i);
            break;
        }
    }
    
}
