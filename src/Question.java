
public class Question {
    public String text;
    public String text;
    protected Object text;
    private String answer;
    public Question() {
        text = "";
        answer = "";
    }

    /**
     * Sets the question text.
     * @param questionText the text of this question
     */
    public void setText(String questionText) {
        text = questionText;
    }

    /**
     * Adds additional text to the question text.
     * @param additionalText the additional text to append to the question
     */
    public void addText(String additionalText) {
        text += " " + additionalText;
    }

    /**
     * Sets the answer for this question.
     * @param correctResponse the answer
     */
    public void setAnswer(String correctResponse) {
        answer = correctResponse;
    }

    /**
     * Checks a given response for correctness.
     * @param response the response to check
     * @return true if the response was correct, false otherwise
     */
    public boolean checkAnswer(String response) {
        return response.equals(answer);
    }

    /**
     * Displays this question.
     */
    public void display() {
        System.out.println(text);
    }
}
