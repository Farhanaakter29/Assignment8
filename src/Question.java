import java.util.ArrayList;

public class Question {
    private String text;

    public Question(String text) {
        this.text = text;
    }

    public void display() {
        System.out.println(text);
    }

    public String getText() {
        return text;
    }
}

