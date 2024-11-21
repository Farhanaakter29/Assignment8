class ChoiceQuestion extends Question {
    /**
     * Adds a choice to the question. Each choice is prefixed with a number.
     * @param choice the choice text
     */
    public void addChoice(String choice) {
        String choiceNumber = Integer.toString(getChoiceCount() + 1);
        addText(choiceNumber + ". " + choice);
    }

    /**
     * Gets the number of choices added to the question.
     * This is just an example method to keep track of the number of choices added.
     * @return the number of choices
     */
    private int getChoiceCount() {
        // Count the number of lines in the text to determine how many choices are added
        String[] lines = super.text.split("\n");
        return lines.length;
    }
}

