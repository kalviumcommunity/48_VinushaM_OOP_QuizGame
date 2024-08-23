public class Main {
    public static void main(String[] args) {
        Player player = new Player("Alice");
        System.out.println("Player Name: " + player.getName());
        System.out.println("Initial Score: " + player.getScore());

        String[] options = {"Berlin", "Paris", "Rome", "Madrid"};
        Question question = new Question("What is the capital of France?", options, 2);

        System.out.println("Question: " + question.getQuestionText());
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
        
        int userAnswer = 2;

        if (userAnswer == question.getCorrectOption()) {
            System.out.println("Correct Answer!");
            player.incrementScore(); 
        } else {
            System.out.println("Incorrect Answer.");
        }

        System.out.println("Updated Score: " + player.getScore());
    }
}