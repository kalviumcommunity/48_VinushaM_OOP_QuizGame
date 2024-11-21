public class TrueFalseQuestion extends Question {
    public TrueFalseQuestion(String text, String correctAnswer) {
        super(text, new String[]{"True", "False"}, correctAnswer);
    }

    @Override
    public void displayFormat() {
        System.out.println("This is a true/false question.");
    }
}
