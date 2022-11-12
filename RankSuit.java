//public class RankSuit implements Comparable<RankSuit>{
//    public String ranks;
//    public String suits;
//
//    RankSuit(String rank,String suit){
//        this.suits = suit;
//        this.ranks = rank;
//    }
//
//    public String toString() {
//        return "\n"+ranks+" "+suits;
//    }
//
//    @Override
//    public int compareTo(RankSuit anotherRankSuit) {
//        if (Deck.rankPriority(this.ranks) > Deck.rankPriority(anotherRankSuit.ranks)){
//                return 1;
//        }
//        else if(Deck.rankPriority(this.ranks) < Deck.rankPriority(anotherRankSuit.ranks)){
//            return -1;
//        }
//        else{
//            return 0;
//        }
//    }
//
//}
