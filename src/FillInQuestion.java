public class FillInQuestion extends Question {
    @Override
    public void setText(String questionText) {
        int start = questionText.indexOf("_");
        int end = questionText.lastIndexOf("_");

        if (start != -1 && end != -1 && start < end) {
            String answer = questionText.substring(start + 1, end);
            super.setAnswer(answer);

            String formattedText = questionText.substring(0, start) + "_____" + questionText.substring(end + 1);
            super.setText(formattedText);
        } else {
            super.setText(questionText);
        }
    }
}

