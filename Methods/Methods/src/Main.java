public class Main {
    public static void main(String[] args) {
        String score = printScore(100, false);
        System.out.println("Final result = " + score);
    }

    public static String printScore(int score, boolean complete) {
        int finalScore = calculateScore(score);
        if (complete) System.out.println("Score: " + finalScore);
        else System.out.println("Failed! Score: " + finalScore);
        return String.valueOf(finalScore);
    }

    public static int calculateScore(int score) {
        return score * 100;
    }
}