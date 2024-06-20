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
        // Normalize the answer and response strings
        String normalizedAnswer = normalizeString(answer);
        String normalizedResponse = normalizeString(response);

        return normalizedResponse.equals(normalizedAnswer);
    }

    public String display() {
        return text;
    }

    // Helper method to normalize strings
    private String normalizeString(String input) {
        if (input == null) {
            return "";
        }
        return input.trim().replaceAll("\\s+", " ").toLowerCase();
    }
}
