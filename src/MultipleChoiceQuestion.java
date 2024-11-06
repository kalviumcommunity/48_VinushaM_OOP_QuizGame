public class MultipleChoiceQuestion extends Question {
    public MultipleChoiceQuestion(String text, String[] options, String correctAnswer) {
        super(text, options, correctAnswer);
    }

    @Override
    public void displayFormat() {
        System.out.println("This is a multiple-choice question.");
    }
}
