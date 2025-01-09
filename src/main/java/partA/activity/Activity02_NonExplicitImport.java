package partA.activity;

public class Activity02_NonExplicitImport {
    public static void main(String[] args) {
        System.out.println("Let's play some craps! Throw the dice!");
        int min = 1;
        int max = 6;
        int dice = min + (int)(Math.random() * ((max-min) + 1));
        System.out.println("You rolled a: " + dice);
    }
}
