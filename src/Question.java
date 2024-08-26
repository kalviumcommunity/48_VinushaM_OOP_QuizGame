public class Question {
    private String questionText;
    private String[] options;
    private String correctAnswer;

    public Question(String questionText, String[] options, String correctAnswer) {
        this.questionText = questionText; 
        this.options = options; 
        this.correctAnswer = correctAnswer; 
    }

    public void displayQuestion() {
        System.out.println("Question: " + this.questionText); 
        for (int i = 0; i < this.options.length; i++) {
            System.out.println((i + 1) + ". " + this.options[i]);  
        }
    }

    public boolean checkAnswer(String answer) {
        return this.correctAnswer.equalsIgnoreCase(answer); 
    }

    public String[] getOptions() {
        return this.options;
    }
}
