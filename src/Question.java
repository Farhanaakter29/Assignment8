public class Question
{
  private String text;
 private String answer;
    private String response;

    public Question(String text) {
        this.text = "";
        answer = "";
           }
           public void setText(String questionText)
   {
         text = questionText;
  }
 public void setAnswer(String correctResponse)
   {
 answer = correctResponse;
  }
   public boolean checkAnswer(String response)
 {
     this.response = response;
     return response.equals(answer);
  }
    public void display()
   {
              System.out.println(text);
   }
}


