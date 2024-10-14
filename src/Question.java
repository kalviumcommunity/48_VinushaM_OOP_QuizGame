public class Question {
    private String questionText;
    private String[] options;
    private String correctAnswer;
    private String difficulty;
    private static int totalQuestions = 0;

    public Question() {
        this.questionText = "Unknown question";
        this.options = new String[]{"Option1", "Option2", "Option3", "Option4"};
        this.correctAnswer = "Unknown";
        this.difficulty = "Easy";
        totalQuestions++;
    }

    public Question(String questionText, String[] options, String correctAnswer) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = correctAnswer;
        this.difficulty = "Easy";
        totalQuestions++;
    }

    public Question(String questionText, String[] options, String correctAnswer, String difficulty) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = correctAnswer;
        this.difficulty = difficulty;
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

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public void displayQuestion() {
        System.out.println("Question: " + this.questionText + " (Difficulty: " + this.difficulty + ")"); 
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
