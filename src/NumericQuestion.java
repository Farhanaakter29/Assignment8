public class NumericQuestion extends Question {
    private double answer;

    public void setAnswer(double correctResponse) {
        answer = correctResponse;
    }

    public boolean checkAnswer(String response) {
        try {
            double responseAsDouble = Double.parseDouble(response);
            return Math.abs(responseAsDouble - answer) <= 0.01;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
