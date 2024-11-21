import java.util.Scanner;

/**
 * This program demonstrates the usage of toString methods for Question and ChoiceQuestion.
 */
public class QuestionDemo1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Create a ChoiceQuestion object
        ChoiceQuestion cq = new ChoiceQuestion();

        // Set the main question text
        cq.setText("Which of the following are programming languages?");

        // Add choices using addChoice
        cq.addChoice("Java");
        cq.addChoice("Banana");
        cq.addChoice("Python");
        cq.addChoice("Carrot");

        // Set the correct answer
        cq.setAnswer("Java Python");

        // Display the question with choices
        cq.display();

        // Print the string representation of the question
        System.out.println("\n" + cq.toString());  // Prints the string representation

        // Get the user's response
        System.out.print("Your answer: ");
        String response = in.nextLine();

        // Check if the response is correct
        boolean isCorrect = cq.checkAnswer(response);
        System.out.println("Correct? " + isCorrect);

        // Test the toString method for the base Question class
        Question q = new Question();
        q.setText("What is the capital of France?");
        q.setAnswer("Paris");
        System.out.println("\n" + q.toString());  // Prints the string representation of a simple question

        in.close();
    }
}
