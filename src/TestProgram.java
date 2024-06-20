public class TestProgram {
    public static void main(String[] args) {
        FillInQuestion fiq = new FillInQuestion();
        fiq.setText("The inventor of Java was _James Gosling_");

        System.out.println("Question: " + fiq.display());
        System.out.println("Response 'James Gosling' is " + (fiq.checkAnswer("James Gosling") ? "correct" : "incorrect"));
        System.out.println("Response '  JAMES   gosling ' is " + (fiq.checkAnswer("  JAMES   gosling ") ? "correct" : "incorrect"));
        System.out.println("Response 'Gosling' is " + (fiq.checkAnswer("Gosling") ? "correct" : "incorrect"));
    }
}
