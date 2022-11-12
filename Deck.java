public class Deck {
    public static String[] ranks ={"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    public static String[] suits ={"Clubs", "Diamonds", "Hearts", "Spades"};

    Queue<String> cards = new Queue<>();

    Deck() {
        for (int i = 0; i < (ranks.length * suits.length); i++) {
            cards.enqueue(String.valueOf(new RankSuit(ranks[i % ranks.length], suits[i / ranks.length])));
        }
    }
    public static int rankPriority(String rank) {
        for (int i = 0; i < Deck.ranks.length; i++) {
            if (rank == Deck.ranks[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Deck d = new Deck();
        System.out.println(d);
    }


////}
//import java.util.stream.*;
//import java.util.*;
//class Deck{
//    public static void main(String[] args) {
//        List<Integer> number = Arrays.asList(2,3,4,6,20);
//
//        List<Integer> square = number.stream().map(x -> x*x).collect(Collectors.toList());
//        System.out.println(square);
//
//        List<String> names = Arrays.asList("Reflaction", "Abstraction" ,"Stream");
//        List<String> result = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
//        System.out.println(result);
//
//        List<String> show = names.stream().sorted().collect(Collectors.toList());
//        System.out.println(show);
//
//        Set<Integer> squareSet =
//                number.stream().map(x->x*x).collect(Collectors.toSet());
//        System.out.println(squareSet);
//
//        number.stream().map(x->x*x).forEach(y->System.out.println(y));
//        int even =
//                number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
//
//        System.out.println(even);
//    }
//}