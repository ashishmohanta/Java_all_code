/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nasir uddin ahmed
 */
public class Casting {
    public static void main ( String [ ] args ){
        long bigValue = 99L;
        int  smallValue = ( int ) bigValue;  // Cas t ing
        System.out.println(smallValue ) ;
        smallValue = 50 ;
        bigValue = smallValue ; // Auto Cas t ing
        System.out.println ( bigValue) ;
        
        
    }
    
}
