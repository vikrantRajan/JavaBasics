public class Main {
    public static void main(String[] args) {
        boolean isHired = false;
        boolean passedTest = true;
        if (isHired) System.out.println("You are hired!");
        else System.out.println("You are not hired!");

        if (passedTest && !isHired) {
            System.out.println("You passed the test, but not hired!");
        } else if (!passedTest && !isHired) {
            System.out.println("You failed the test, not hired!");
        }

        boolean failOne = true;
        boolean failTwo = true;

        if (!failOne || !failTwo) {
            System.out.println("You've totally failed!");
        }

        int topScore = 100;
        if (topScore <= 100) {
            System.out.println("You have got the high score!");
        }

    }
}