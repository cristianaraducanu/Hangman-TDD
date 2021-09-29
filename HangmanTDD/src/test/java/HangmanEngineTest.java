import exceptions.NoWordsException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

class HangmanEngineTest {
    private HangmanEngine engine;

    @BeforeEach
    public void setUp() {
        this.engine = new HangmanEngine(List.of("FIRST", "SESOND"));
    }

    @Test
    public void setCurrentWord() {
        final String currentWord = engine.setCurrentWordRandomly();
        assertThat(currentWord).isNotNull();
        assertThat(engine.getWords()).contains(currentWord);
    }

    @Test
    public void setCurrentWordFromEmptyList() {
        engine.setWords(Collections.emptyList());
        final NoWordsException expected = new NoWordsException("There are no words existing in this game!");
        final Throwable result = catchThrowable(() -> engine.setCurrentWordRandomly());
        assertThat(result).isInstanceOf(NoWordsException.class).usingRecursiveComparison().isEqualTo(expected);
    }

    @Test
    public void convertStringToCharacterList() {
        final String word = "word";
        final List<Character> list = engine.convertStringToCharList(word);
        final List<Character> expected = List.of('w','o','r','d');
        assertThat(list).isEqualTo(expected);
    }

    @Test
    public void firstLetterReveal() {
        engine.setCurrentWordRandomly();
        Character first = engine.firstLetterReveal();
        assertThat(engine.getCurrentWord().indexOf(first)).isNotEqualTo(-1);
        assertThat(engine.getRemainingLetters().contains(first)).isFalse();
    }

    @Test
    public void guessUnexistingLetter() {
        engine.setCurrentWordRandomly();
        assertThat(engine.guessLetter('!')).isFalse();
    }

    @Test
    public void guessExistingLetter() {
        engine.setCurrentWordRandomly();
        assertThat(engine.guessLetter(engine.getCurrentWord().charAt(0))).isTrue();
        assertThat(engine.getRemainingLetters().contains(engine.getCurrentWord().charAt(0))).isFalse();
    }

    @Test
    public void guessUnexistingLetterTwice() {
        engine.setCurrentWordRandomly();
        engine.guessLetter('!');
        assertThat(engine.guessLetter('!')).isFalse();
    }

    @Test
    public void winGame() {
        engine.setCurrentWordRandomly();
        for(int index = 0; index < engine.getCurrentWord().length(); index++) {
            engine.guessLetter(engine.getCurrentWord().charAt(index));
        }
        assertThat(engine.checkResult()).isEqualTo(1);
    }

    @Test
    public void loseGame() {
        engine.setCurrentWordRandomly();
        engine.guessLetter('!');
        engine.guessLetter('?');
        engine.guessLetter('*');
        engine.guessLetter('%');
        engine.guessLetter('#');
        engine.guessLetter('$');
        engine.guessLetter('@');
        assertThat(engine.checkResult()).isEqualTo(-1);
    }

    @Test
    public void gameContinues() {
        engine.setCurrentWordRandomly();
        engine.guessLetter('!');
        engine.guessLetter('!');
        assertThat(engine.checkResult()).isEqualTo(0);
    }
}