public class Question {
    private String questionText;
    private String[] options;
    private String correctAnswer;

    private static int totalQuestions = 0;

    public Question(String questionText, String[] options, String correctAnswer) {
        this.questionText = questionText; 
        this.options = options; 
        this.correctAnswer = correctAnswer; 
        totalQuestions++;
    }

    // Accessor (Getter) for questionText
    public String getQuestionText() {
        return questionText;
    }

    // Mutator (Setter) for questionText
    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
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

    // Static method to access totalQuestions
    public static int getTotalQuestions() {
        return totalQuestions;
    }
}
