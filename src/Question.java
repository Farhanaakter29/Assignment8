public class Question {
    private String text;
    private String answer;

    public void setText(String questionText) {
        text = questionText;
    }

    public void setAnswer(String correctResponse) {
        answer = correctResponse;
    }

    public boolean checkAnswer(String response) {
        return response.equals(answer);
    }

    public String display() {
        return text;
    }
}
