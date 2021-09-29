import exceptions.NoWordsException;

import java.util.*;
import java.util.stream.Collectors;


public class HangmanEngine {
    private List<String> words;

    private String currentWord;

    private List<Character> remainingLetters;
    private final List<Integer> guessedLettersIndexes = new ArrayList<>();
    private final List<Character> wrongLetters = new ArrayList<>();

    private final Scanner in = new Scanner(System.in);

    private static final int MAX_WRONG_LETTERS = 7;

    public HangmanEngine(List<String> words) {
        this.words = words
                .stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        setCurrentWordRandomly();
        firstLetterReveal();
    }

    public List<String> getWords() {
        return words;
    }

    public void setWords(List<String> words) {
        this.words = words
                .stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    public String getCurrentWord() {
        return currentWord;
    }

    public List<Character> getRemainingLetters() {
        return remainingLetters;
    }

    public String setCurrentWordRandomly() {
        Random random = new Random();
        if (words.size() > 0) {
            this.currentWord = words.get(random.nextInt(words.size()));
            this.remainingLetters = convertStringToCharList(currentWord);
            return currentWord;
        } else throw new NoWordsException("There are no words existing in this game!");
    }


    public Character firstLetterReveal() {
        PrintUtils.printStart();

        Random random = new Random();
        Character first = currentWord.charAt(random.nextInt(currentWord.length()));
        remainingLetters.removeAll(Collections.singletonList(first));
        addToGuessedLetterIndexes(first);
        PrintUtils.printRevealed(currentWord, guessedLettersIndexes, wrongLetters);
        return first;
    }

    private void userGuess() {
        guessLetter(in.next().charAt(0));
    }

    public boolean guessLetter(Character letter) {
        letter = Character.toUpperCase(letter);
        if (remainingLetters.contains(letter)) {
            addToGuessedLetterIndexes(letter);
            remainingLetters.removeAll(Collections.singletonList(letter));
            PrintUtils.printRevealed(currentWord, guessedLettersIndexes, wrongLetters);
            return true;
        } else {
            if (wrongLetters.contains(letter)) {
                System.out.println("YOU ALREADY TRIED THIS LETTER!");
                PrintUtils.printRevealed(currentWord, guessedLettersIndexes, wrongLetters);
                return false;
            }
            System.out.println("\nWrong Answer!");
            wrongLetters.add(letter);
            PrintUtils.printRevealed(currentWord, guessedLettersIndexes, wrongLetters);
            return false;
        }
    }

    public void addToGuessedLetterIndexes(Character letter) {
        for (int index = currentWord.indexOf(letter); index >= 0; index = currentWord.indexOf(letter, index + 1)) {
            guessedLettersIndexes.add(index);
        }
    }

    public void playGame() {
        while (remainingLetters.size() > 0) {
            userGuess();
            PrintUtils.hangmanImage(wrongLetters);

            switch (checkResult()) {
                case 1:
                    PrintUtils.printGameWon();
                    return;
                case -1:
                    PrintUtils.printGameLost(currentWord);
                    return;
                default:
            }
        }
    }

    public int checkResult() {
        if (remainingLetters.size() == 0 && wrongLetters.size() < MAX_WRONG_LETTERS) {
            return 1;
        } else if (wrongLetters.size() >= MAX_WRONG_LETTERS) {
            return -1;
        } else return 0;

    }

    public List<Character> convertStringToCharList(String currentWord) {
        List<Character> list = new ArrayList<>();
        for (char c : currentWord.toCharArray()) {
            list.add(c);
        }
        return list;
    }
}
