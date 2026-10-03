
package sakhhor.sir;


class Card {
    
    public int suit;
    public int value;
    
    public Card(){
        
    }
    public Card(int s,int v){
        suit=s;
        value=v;
        
    }
    public Card(Card c){
        suit=c.suit;
        value=c.value;
    }
    public static void main(String[] args){
        Card ace = new Card();
        Card king = new Card(0,12);
        Card jack = new Card(ace);
        jack.suit=3;

        
        System.out.println(ace.suit+ " "+ace.value);
        System.out.println(king.suit+ " "+king.value);
        System.out.println(jack.suit+ " "+jack.value);
        
    }
}
