public class Number {
    private int value;
    private int content;

    public Number(int value, int content) {
        this.value = value;
        this.content = content;
    }

    public int getValue() {
        return value;
    }

    public int getContent() {
        return content;
    }

    public void setContent(int content) {
        this.content = content;
    }
}