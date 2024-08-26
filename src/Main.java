import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player1 = new Player("Vinusha M");

        Question[] questions = {
            new Question("What is the capital of India?", new String[]{"Mumbai", "Delhi", "Kolkata", "Chennai"}, "Delhi"),
            new Question("Which Indian festival is known as the Festival of Lights?", new String[]{"Holi", "Diwali", "Eid", "Navratri"}, "Diwali"),
            new Question("Who is known as the Father of the Nation in India?", new String[]{"Jawaharlal Nehru", "Sardar Patel", "Mahatma Gandhi", "Subhas Chandra Bose"}, "Mahatma Gandhi"),
            new Question("What is the national currency of India?", new String[]{"Dollar", "Euro", "Rupee", "Yen"}, "Rupee"),
            new Question("Which river is considered the holiest in India?", new String[]{"Yamuna", "Ganges", "Indus", "Godavari"}, "Ganges"),
            new Question("Who was the first President of India?", new String[]{"Dr. Rajendra Prasad", "Dr. Sarvepalli Radhakrishnan", "Jawaharlal Nehru", "Lal Bahadur Shastri"}, "Dr. Rajendra Prasad"),
            new Question("Which city in India is often referred to as the 'Silicon Valley of India' due to its thriving technology and startup ecosystem?", new String[]{"Mumbai", "Hyderabad", "Chennai", "Bengaluru"}, "Bengaluru")
        };

        System.out.println("Welcome to the Quiz Game!");
        System.out.println("-------------------------");

        for (Question question : questions) {
            question.displayQuestion();

            System.out.print("Enter the number of your answer: ");
            int playerChoice = scanner.nextInt();
            String playerAnswer = question.getOptions()[playerChoice - 1];
            System.out.println("You selected: " + playerAnswer);

            if (question.checkAnswer(playerAnswer)) {
                System.out.println("Correct answer!");
                player1.addPoints(10); 
            } else {
                System.out.println("Incorrect answer!");
            }

            player1.displayScore();
            System.out.println();
        }
        System.out.println("Resetting the score...");
        player1.resetScore();
        player1.displayScore();

        System.out.println("\nThank you for playing!");

        scanner.close();
    }
}