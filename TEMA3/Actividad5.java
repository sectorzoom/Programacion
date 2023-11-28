import java.util.*;

public class Actividad5 {
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        game();
    }
    public static void game () {
        System.out.println("Bienvenidos al 'Encuentra la pareja' de David Giménez\nA continuación te mostraré el table de juego," +
                        "preparáte!");
        String[] board = {"león", "caballo", "mono", "tigre", "elefante", "gato", "perro", "rata", "cebra", "pájaro","león", "caballo", "mono", "tigre", "elefante", "gato", "perro", "rata", "cebra", "pájaro"};
        String[] invisibleBoard = new String[20];
        board(board,invisibleBoard);
        System.out.println(Arrays.toString(board));
        coupleSelection(board,invisibleBoard);

    }
    public static void board (String[] board, String[] invisibleBoard) {
        for (int i = 0; i < board.length; i++) {
            invisibleBoard[i] = "X";
        }

        for (int i = 0; i < board.length; i++) {
            int randomIndex = random.nextInt(board.length);
            String temp = board[randomIndex];
            board[randomIndex] = board[i];
            board[i] = temp;
        }
        System.out.println(Arrays.toString(invisibleBoard));
    }
    public static void coupleSelection (String[] board, String[] invisibleBoard) {
        int count = 0;
        int round = 1;
        do {
            System.out.println("Ronda " + round);
            int firstCard = selectCard();
            int secondCard = selectCard();
            if (sameCard(board,invisibleBoard,firstCard,secondCard)){
                count++;
            }
            notSameCard(board,invisibleBoard,firstCard,secondCard);
            System.out.println(Arrays.toString(invisibleBoard));
            round++;
        } while (count != 10);
        System.out.println("Enhorabuena, has ganado!!");
    }
    public static int selectCard () {
        System.out.println("Recuerda elige una carta del 1 al 20!!\nElige la primera carta: ");
        int card = scanner.nextInt()-1;
        while (card < 0 || card > 19) {
            System.out.println("Número incorrecto, recuerda, debe ser un número del 1 al 20");
            card = scanner.nextInt() - 1;
        }
        return card;
    }
    public static boolean sameCard(String[]board, String[]invisibleBoard, int firstCard, int secondCard) {
        boolean sameCard = false;
        if ((Objects.equals(board[firstCard], board[secondCard])) && firstCard != secondCard) {
            System.out.println("Has acertado!");
            invisibleBoard[firstCard] = board[firstCard];
            invisibleBoard[secondCard] = board[secondCard];
            sameCard = true;
        }
        return sameCard;
    }
    public static void notSameCard (String[]board, String[]invisibleBoard, int firstCard, int secondCard) {
        if (firstCard == secondCard) {
            System.out.println("Has repetido la carta!");
        }
        if (!Objects.equals(board[firstCard], board[secondCard])) {
            if (Objects.equals(board[firstCard], invisibleBoard[firstCard]) || Objects.equals(board[secondCard], invisibleBoard[secondCard])) {
                System.out.println("Has repetido la carta!");
            } else {
                System.out.println("No son la misma!");
                invisibleBoard[firstCard] = board[firstCard];
                invisibleBoard[secondCard] = board[secondCard];
                System.out.println(Arrays.toString(invisibleBoard));
                System.out.print("\r\n".repeat(5));

                invisibleBoard[firstCard] = "X";
                invisibleBoard[secondCard] = "X";
            }

        }
    }
}
