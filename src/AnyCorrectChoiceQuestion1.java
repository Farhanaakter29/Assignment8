import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A question where multiple correct answers are allowed.
 * The respondent needs to provide any one of the correct answers.
 */
public class AnyCorrectChoiceQuestion1 extends Question {
    private List<String> correctAnswers;

    /**
     * Constructs a question with multiple correct choices.
     */
    public AnyCorrectChoiceQuestion1() {
        super();
        correctAnswers = new ArrayList<>();
    }

    /**
     * Sets the correct answers for this question.
     * The answers should be provided as a space-separated string.
     * @param correctResponse a string containing all correct answers separated by spaces
     */
    @Override
    public void setAnswer(String correctResponse) {
        correctAnswers = Arrays.asList(correctResponse.split(" "));
    }

    /**
     * Checks a given response for correctness.
     * The response is correct if it matches any one of the correct answers.
     * @param response the response to check
     * @return true if the response matches any correct answer, false otherwise
     */
    @Override
    public boolean checkAnswer(String response) {
        return correctAnswers.contains(response);
    }

    /**
     * Displays this question along with instructions for multiple correct answers.
     */
    @Override
    public void display() {
        super.display();
        System.out.println("(You may enter any one of the correct answers.)");
    }

    public void setText(String s) {
    }
}

