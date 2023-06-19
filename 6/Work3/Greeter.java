package src.main.java.homework6.Work3;

public class Greeter {
    private String formality;

    public Greeter() {
        this.formality = "default";
    }

    public String greet() {
        return switch (this.formality) {
            case "formal" -> "Good evening, sir.";
            case "casual" -> "Sup bro?";
            case "intimate" -> "Hello Darling!";
            default -> "Hello.";
        };
    }

    public void setFormality(String formality) {
        this.formality = formality;
    }
}
