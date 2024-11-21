import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class MultiChoiceQuestion extends Question {
    private List<String> correctAnswers;
    public MultiChoiceQuestion() {
        super(text);  // Call the constructor of the superclass (Question)
        correctAnswers = new ArrayList<>();
    }
    public void setAnswers(String answers) {
        // Split the answers into a list and store them
        correctAnswers = Arrays.asList(answers.split("\\s+"));
    }
    @Override
    public boolean checkAnswer(String response) {
        List<String> userAnswers = Arrays.asList(response.split("\\s+"));
        // Check if user answers match the correct answers (ignoring order)
     return correctAnswers.containsAll(userAnswers) && userAnswers.containsAll(correctAnswers);
    }
    @Override
    public void display() {
        super.display();
        System.out.println("Enter all correct answers, separated by spaces.");
    }
}

