import java.util.Scanner;

/**
 * This program demonstrates a simple quiz with a question allowing multiple correct choices.
 */
public class QuestionDemo1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Create an instance of AnyCorrectChoiceQuestion
        AnyCorrectChoiceQuestion1 q = new AnyCorrectChoiceQuestion1();
        q.setText("Name a programming language invented by James Gosling:");

        // Set multiple correct answers (case-sensitive)
        q.setAnswer("Java Oak");

        // Display the question
        q.display();
        System.out.print("Your answer: ");
        String response = in.nextLine();

        // Check the user's answer
        System.out.println(q.checkAnswer(response));
    }
}

