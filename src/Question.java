public class Question {
    private String questionText;
    private String[] options;
    private String correctAnswer;
    // private String difficulty;
    private static int totalQuestions = 0;

    public Question() {
        this.questionText = "Unknown question";
        this.options = new String[]{"Option1", "Option2", "Option3", "Option4"};
        this.correctAnswer = "Unknown";
        // this.difficulty = "Easy";
        totalQuestions++;
    }

    public Question(String questionText, String[] options, String correctAnswer) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = correctAnswer;
        // this.difficulty = "Easy";
        totalQuestions++;
    }

    public Question(String questionText, String[] options, String correctAnswer, String difficulty) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = correctAnswer;
        // this.difficulty = difficulty;
        totalQuestions++;
    }

    public void displayQuestion() {
        System.out.println("Question: " + questionText); 
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);  
        }
    }

    public boolean checkAnswer(String answer) {
        return this.correctAnswer.equalsIgnoreCase(answer); 
    }

    public String[] getOptions() {
        return options;
    }

    // Static method to access totalQuestions
    public static int getTotalQuestions() {
        return totalQuestions;
    }
}
