public class TestProgram {
    public static void main(String[] args) {
        NumericQuestion nq = new NumericQuestion();
        nq.setText("What is 1 + 1?");
        nq.setAnswer(2.0);

        System.out.println("Question: " + nq.display());
        System.out.println("Response '2.0' is " + (nq.checkAnswer("2.0") ? "correct" : "incorrect"));
        System.out.println("Response '2.01' is " + (nq.checkAnswer("2.01") ? "correct" : "incorrect"));
        System.out.println("Response '1.98' is " + (nq.checkAnswer("1.98") ? "correct" : "incorrect"));
        System.out.println("Response '3.0' is " + (nq.checkAnswer("3.0") ? "correct" : "incorrect"));
    }
}
