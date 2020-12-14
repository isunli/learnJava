package basic;

public class MethodOverloading {
    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 100);
        System.out.println("New score is "+newScore);
        calculateScore(200);
    }
    public static int calculateScore(String playerName, int score){
        System.out.println("Player "+playerName+" scored "+score+" points");
        return score * 1000;
    }
    public static int calculateScore(int score){
        System.out.println("Unnamed player scored "+score+" points");
        return score * 1000;
    }
    public static int calculateScore(){
        System.out.println("Unnamed player scored 0 points");
        return 0 * 1000;
    }
    // change return type does not overload the method
//    public static void calculateScore(){
//        System.out.println("Unnamed player scored 0 points");
//    }
}
