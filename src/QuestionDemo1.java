import java.util.Scanner;

/**
 * This program demonstrates a multiple-choice question with multiple correct answers.
 */
public class QuestionDemo1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Create a MultiChoiceQuestion object
        MultiChoiceQuestion mcq = new MultiChoiceQuestion();

        // Set the question and multiple correct answers
        mcq.setText("Which of the following are programming languages?");
        mcq.setAnswers("Java Python C++");

        // Display the question
        mcq.display();

        // Get the user's response
        System.out.print("Your answers: ");
        String response = in.nextLine();

        // Check if the response is correct
        boolean isCorrect = mcq.checkAnswer(response);
        System.out.println("Correct? " + isCorrect);

        in.close();
    }
}

