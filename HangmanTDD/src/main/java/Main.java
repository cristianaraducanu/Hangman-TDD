import java.util.List;

public class Main {
    public static void main(String[] args) {
        HangmanEngine engine = new HangmanEngine(List.of("MINECRAFT", "SKYSCRAPER", "OBERIK", "SUPERMAN", "GRUESOME"));
        engine.playGame();
    }
}
