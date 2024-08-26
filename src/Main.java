import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player1 = new Player("Alice");

        String[] options1 = {"London", "Berlin", "Paris", "Madrid"};
        Question question1 = new Question("What is the capital of France?", options1, "Paris");

        System.out.println("Welcome to the Quiz Game!");
        System.out.println("-------------------------");
        question1.displayQuestion();

        System.out.print("Enter the number of your answer: ");
        int playerChoice = scanner.nextInt();

        String playerAnswer = options1[playerChoice - 1];
        System.out.println("You selected: " + playerAnswer);

        if (question1.checkAnswer(playerAnswer)) {
            System.out.println("Correct answer!");
            player1.addPoints(10);  
        } else {
            System.out.println("Incorrect answer!");
        }

        player1.displayScore();
        player1.resetScore();

        System.out.println("\nResetting the score...");
        player1.displayScore();

        System.out.println("\nThank you for playing!");

        scanner.close();
    }
}