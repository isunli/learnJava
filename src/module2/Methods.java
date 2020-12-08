package module2;

public class Methods {
    public static void main(String[] args) {
        calculateScore();
        calculateScore(true, 10000, 8, 200);
    }
    public static void calculateScore(){
        System.out.println("This is from a method");
    }
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        if(gameOver){
            int finalScore = score + (levelCompleted*bonus);
            finalScore+=1000;
            System.out.println("Your finale score was "+finalScore);
            return finalScore;
        }
        return -1;
    }
}
