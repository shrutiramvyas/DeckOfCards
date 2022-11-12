import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Cards {
    static String[] ranks ={"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    static String[] suits ={"Clubs", "Diamonds", "Hearts", "Spades"};
    public String[] player1 = new String[9];
    public String[] player2 = new String[9];
    public String[] player3 = new String[9];
    public String[] player4 = new String[9];
    ArrayList<String> totalCards = new ArrayList<>();



    public void totalCardsMethod(){
        String selectCard;
        for( int i = 0; i < suits.length; i++ ){
            for( int j = 0; j < ranks.length; j++ ){
                selectCard = suits[i] + ranks[j];
                totalCards.add(selectCard);
            }
        }
    }
    public void shuffle(){
        Collections.shuffle(totalCards);
    }
    public void distributedCards(){
        for( int i = 0; i < 36; i++){
            if(i < 9){
                player1[i] = totalCards.get(0);
            }
            else if(i >= 9 && i < 18){
                player2[i-9] = totalCards.get(0);
            }
            else if(i >= 18 && i < 27 ){
                player3[i-18] = totalCards.get(0);
            }
            else if(i >= 27 && i < 36){
                player4[i-27] = totalCards.get(0);
            }
            totalCards.remove(0);
        }
        System.out.println("Player1");
        for( int i = 0; i < 9; i++) {
            System.out.print(player1[i] + " ");
        }
        System.out.println();
        System.out.println("Player2");
        for( int i = 0; i < 9; i++) {
            System.out.print(player2[i] + " ");
        }
        System.out.println();
        System.out.println("Player3");
        for( int i = 0; i < 9; i++) {
            System.out.print(player3[i] + " ");
        }
        System.out.println();
        System.out.println("Player4");
        for( int i = 0; i < 9; i++) {
            System.out.print(player4[i] + " ");
        }
    }
    public void display(){
        System.out.println(totalCards);
    }
    public static void main(String[] args) {
        Cards c = new Cards();
        c.totalCardsMethod();
        c.display();
        c.shuffle();
        c.display();
        c.distributedCards();
        c.display();
    }

}