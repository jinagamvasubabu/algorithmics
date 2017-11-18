import java.util.Scanner;

public class TicTacToe {
    private static int moveCount = 0;

    public static void main(String[] args) {

        char[][] board = new char[3][3];

        fillBoard(board);

        Scanner scanner = new Scanner(System.in);
        int playerChoice = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (playerChoice % 2 == 0) {
                    System.out.println("It's X's choice !!!");
                    int x = scanner.nextInt();
                    int y = scanner.nextInt();
                    if (checkItsLegal(x, y, 'O', board)) {
                        board[x][y] = 'X';
                        displayBoard(board);
                        if (checkIsItWin(x, y, 'X', board)) {
                            System.out.println("X Won!!!");
                            return;
                        }
                        playerChoice++;
                    } else {
                        System.out.println("Wrong choice!!!!");
                        displayBoard(board);
                    }
                } else {
                    System.out.println("It's O's choice !!!");
                    int x = scanner.nextInt();
                    int y = scanner.nextInt();
                    if (checkItsLegal(x, y, 'X', board)) {
                        board[x][y] = 'O';
                        displayBoard(board);
                        if (checkIsItWin(x, y, 'O', board)) {
                            System.out.println("O Won!!!");
                            return;
                        }
                        playerChoice++;
                    } else {
                        System.out.println("Wrong choice!!!!");
                        displayBoard(board);
                    }
                }
            }
        }
    }

    private static void fillBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    private static void displayBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static Boolean checkIsItWin(int x, int y, char C, char[][] board) {
        moveCount++;
        // check rows
        for (int i = 0; i < 3; i++) {
            if (board[x][i] != C)
                break;

            if (i == 2) {
                return true;

            }
        }

        for (int i = 0; i < 3; i++) {
            if (board[i][y] != C)
                break;

            if (i == 2) {
                return true;
            }
        }

        //check diag
        if (x == y) {
            //we're on a diagonal
            for (int i = 0; i < 3; i++) {
                if (board[i][i] != C)
                    break;
                if (i == 2) {
                    return true;
                }
            }
        }

        if (x + y == 2) {
            for (int i = 0; i < 3; i++) {
                if (board[i][(2) - i] != C)
                    break;
                if (i == 2) {
                    return true;
                }
            }
        }

        return (moveCount == 8);

    }

    private static Boolean checkItsLegal(int x, int y, char C, char[][] board) {
        return (x < 3 && y < 3) && (board[x][y] != C);
    }

}