import java.util.List;

public class PrintUtils {
    public static void printGameLost(String currentWord) {
        System.out.println("""
                ┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼
                ███▀▀▀██┼███▀▀▀███┼███▀█▄█▀███┼██▀▀▀
                ██┼┼┼┼██┼██┼┼┼┼┼██┼██┼┼┼█┼┼┼██┼██┼┼┼
                ██┼┼┼▄▄▄┼██▄▄▄▄▄██┼██┼┼┼▀┼┼┼██┼██▀▀▀
                ██┼┼┼┼██┼██┼┼┼┼┼██┼██┼┼┼┼┼┼┼██┼██┼┼┼
                ███▄▄▄██┼██┼┼┼┼┼██┼██┼┼┼┼┼┼┼██┼██▄▄▄
                ┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼
                ███▀▀▀███┼▀███┼┼██▀┼██▀▀▀┼██▀▀▀▀██▄┼
                ██┼┼┼┼┼██┼┼┼██┼┼██┼┼██┼┼┼┼██┼┼┼┼┼██┼
                ██┼┼┼┼┼██┼┼┼██┼┼██┼┼██▀▀▀┼██▄▄▄▄▄▀▀┼
                ██┼┼┼┼┼██┼┼┼██┼┼█▀┼┼██┼┼┼┼██┼┼┼┼┼██┼
                ███▄▄▄███┼┼┼─▀█▀┼┼─┼██▄▄▄┼██┼┼┼┼┼██▄
                ┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼
                ┼┼┼┼┼┼┼┼██┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼██┼┼┼┼┼┼┼┼┼
                ┼┼┼┼┼┼████▄┼┼┼▄▄▄▄▄▄▄┼┼┼▄████┼┼┼┼┼┼┼
                ┼┼┼┼┼┼┼┼┼▀▀█▄█████████▄█▀▀┼┼┼┼┼┼┼┼┼┼
                ┼┼┼┼┼┼┼┼┼┼┼█████████████┼┼┼┼┼┼┼┼┼┼┼┼
                ┼┼┼┼┼┼┼┼┼┼┼██▀▀▀███▀▀▀██┼┼┼┼┼┼┼┼┼┼┼┼
                ┼┼┼┼┼┼┼┼┼┼┼██┼┼┼███┼┼┼██┼┼┼┼┼┼┼┼┼┼┼┼
                ┼┼┼┼┼┼┼┼┼┼┼█████▀▄▀█████┼┼┼┼┼┼┼┼┼┼┼┼
                ┼┼┼┼┼┼┼┼┼┼┼┼███████████┼┼┼┼┼┼┼┼┼┼┼┼┼
                ┼┼┼┼┼┼┼┼▄▄▄██┼┼█▀█▀█┼┼██▄▄▄┼┼┼┼┼┼┼┼┼
                ┼┼┼┼┼┼┼┼▀▀██┼┼┼┼┼┼┼┼┼┼┼██▀▀┼┼┼┼┼┼┼┼┼
                ┼┼┼┼┼┼┼┼┼┼▀▀┼┼┼┼┼┼┼┼┼┼┼▀▀┼┼┼┼┼┼┼┼┼┼┼
                ┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼
                """);
        System.out.println("GAME OVER! The word was " + currentWord);
    }

    public static void printGameWon() {
        System.out.println("\n\n=============================================================");
        System.out.println("""
                                                                                                                                                                                          \s
                                                                                                                                                                                          \s
                        CCCCCCCCCCCCC    OOOOOOOOO    NNNNNNNN        NNNNNNNN       GGGGGGGGGGGGRRRRRRRRRRRRRRRRR                 AAA        TTTTTTTTTTTTTTTTTTTTTTT  SSSSSSSSSSSSSSS !!!\s
                     CCC::::::::::::C  OO:::::::::OO  N:::::::N       N::::::N    GGG::::::::::::R::::::::::::::::R               A:::A       T:::::::::::::::::::::TSS:::::::::::::::!!:!!
                   CC:::::::::::::::COO:::::::::::::OON::::::::N      N::::::N  GG:::::::::::::::R::::::RRRRRR:::::R             A:::::A      T:::::::::::::::::::::S:::::SSSSSS::::::!:::!
                  C:::::CCCCCCCC::::O:::::::OOO:::::::N:::::::::N     N::::::N G:::::GGGGGGGG::::RR:::::R     R:::::R           A:::::::A     T:::::TT:::::::TT:::::S:::::S     SSSSSS!:::!
                 C:::::C       CCCCCO::::::O   O::::::N::::::::::N    N::::::NG:::::G       GGGGGG R::::R     R:::::R          A:::::::::A    TTTTTT  T:::::T  TTTTTS:::::S           !:::!
                C:::::C             O:::::O     O:::::N:::::::::::N   N::::::G:::::G               R::::R     R:::::R         A:::::A:::::A           T:::::T       S:::::S           !:::!
                C:::::C             O:::::O     O:::::N:::::::N::::N  N::::::G:::::G               R::::RRRRRR:::::R         A:::::A A:::::A          T:::::T        S::::SSSS        !:::!
                C:::::C             O:::::O     O:::::N::::::N N::::N N::::::G:::::G    GGGGGGGGGG R:::::::::::::RR         A:::::A   A:::::A         T:::::T         SS::::::SSSSS   !:::!
                C:::::C             O:::::O     O:::::N::::::N  N::::N:::::::G:::::G    G::::::::G R::::RRRRRR:::::R       A:::::A     A:::::A        T:::::T           SSS::::::::SS !:::!
                C:::::C             O:::::O     O:::::N::::::N   N:::::::::::G:::::G    GGGGG::::G R::::R     R:::::R     A:::::AAAAAAAAA:::::A       T:::::T              SSSSSS::::S!:::!
                C:::::C             O:::::O     O:::::N::::::N    N::::::::::G:::::G        G::::G R::::R     R:::::R    A:::::::::::::::::::::A      T:::::T                   S:::::!!:!!
                 C:::::C       CCCCCO::::::O   O::::::N::::::N     N:::::::::NG:::::G       G::::G R::::R     R:::::R   A:::::AAAAAAAAAAAAA:::::A     T:::::T                   S:::::S!!!\s
                  C:::::CCCCCCCC::::O:::::::OOO:::::::N::::::N      N::::::::N G:::::GGGGGGGG::::RR:::::R     R:::::R  A:::::A             A:::::A  TT:::::::TT     SSSSSSS     S:::::S   \s
                   CC:::::::::::::::COO:::::::::::::OON::::::N       N:::::::N  GG:::::::::::::::R::::::R     R:::::R A:::::A               A:::::A T:::::::::T     S::::::SSSSSS:::::S!!!\s
                     CCC::::::::::::C  OO:::::::::OO  N::::::N        N::::::N    GGG::::::GGG:::R::::::R     R:::::RA:::::A                 A:::::AT:::::::::T     S:::::::::::::::SS!!:!!
                        CCCCCCCCCCCCC    OOOOOOOOO    NNNNNNNN         NNNNNNN       GGGGGG   GGGRRRRRRRR     RRRRRRAAAAAAA                   AAAAAATTTTTTTTTTT      SSSSSSSSSSSSSSS   !!!\s
                                                                                                                                                                                          \s
                                                                                                                                                                                          \s
                                                                                                                                                                                          \s
                                                                                                                                                                                          \s
                                                                                                                                                                                   \s""");
    }

    public static void printRevealed(String currentWord, List<Integer> guessedLettersIndexes, List<Character> wrongLetters) {
        System.out.println();
        for (int i = 0; i < currentWord.length(); i++) {
            if (guessedLettersIndexes.contains(i)) {
                System.out.print(" " + currentWord.charAt(i) + " ");
            } else {
                System.out.print(" _ ");
            }
        }
        System.out.print("                      ");
        for (Character wrongLetter : wrongLetters) {
            System.out.print(wrongLetter + " ");
        }
    }

    public static void hangmanImage(List<Character> wrongLetters) {
        if (wrongLetters.size() == 1) {
            System.out.println("\n\n");
            System.out.println("  +---+");
            System.out.println("  |   |");
            System.out.println("      |");
            System.out.println("      |");
            System.out.println("      |");
            System.out.println("      |");
            System.out.println("=========");
            System.out.println();
        }
        if (wrongLetters.size() == 2) {
            System.out.println("\n\n");
            System.out.println("  +---+");
            System.out.println("  |   |");
            System.out.println("  O   |");
            System.out.println("      |");
            System.out.println("      |");
            System.out.println("      |");
            System.out.println("=========");
            System.out.println();
        }
        if (wrongLetters.size() == 3) {
            System.out.println("\n\n");
            System.out.println("  +---+");
            System.out.println("  |   |");
            System.out.println("  O   |");
            System.out.println("  |   |");
            System.out.println("      |");
            System.out.println("      |");
            System.out.println("=========");
            System.out.println();
        }
        if (wrongLetters.size() == 4) {
            System.out.println("\n\n");
            System.out.println("  +---+");
            System.out.println("  |   |");
            System.out.println("  O   |");
            System.out.println(" /|   |");
            System.out.println("      |");
            System.out.println("      |");
            System.out.println("=========");
            System.out.println();
        }
        if (wrongLetters.size() == 5) {
            System.out.println("\n\n");
            System.out.println("  +---+");
            System.out.println("  |   |");
            System.out.println("  O   |");
            System.out.println(" /|\\  |");
            System.out.println("      |");
            System.out.println("      |");
            System.out.println("=========");
            System.out.println();
        }
        if (wrongLetters.size() == 6) {
            System.out.println("\n\n");
            System.out.println("  +---+");
            System.out.println("  |   |");
            System.out.println("  O   |");
            System.out.println(" /|\\  |");
            System.out.println(" /    |");
            System.out.println("      |");
            System.out.println("=========");
            System.out.println();
        }
        if (wrongLetters.size() == 7) {
            System.out.println("\n\n");
            System.out.println("  +---+");
            System.out.println("  |   |");
            System.out.println("  O   |");
            System.out.println(" /|\\  |");
            System.out.println(" / \\  |");
            System.out.println("      |");
            System.out.println("=========");
            System.out.println();

        }
    }

    public static void printStart() {
        System.out.println("==========================");
        System.out.println("       LET'S START!       ");
        System.out.println("==========================");
    }
}
