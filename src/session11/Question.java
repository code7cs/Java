package session11;

public abstract class Question {
    public Question() {
    }

    public abstract String getQuestion();

    public abstract void setQuestion(String q);

    public abstract Answer getAnswer();

    public abstract void setAnswer(Answer a);
}
