package TicTacToeChecker;

public class Solution {
    public static int isSolved(int[][] board) {
        int startIndexRow = 0;

        for (int i = 0; i < 3; i++) {
            if(isHorizontal(board, board[i][0], i, 0)){
                return board[i][0];
            }

            if(isVertical(board, board[0][i], 0, i)){
                return board[0][i];
            }
        }

        if(isLeftOnRigth(board, board[0][0], 0, 0)){
            return board[0][0];
        }

        if(isRigthOnLeft(board, board[0][2], 0, 2)){
            return board[0][2];
        }

        if(isEmpty(board)){
            return -1;
        }

        return 0;
    }

    private static boolean isHorizontal(int[][] board, int item, int indexRow, int indexColumn){
        if(item == 0){
            return false;
        }

        if(indexColumn > 2){
            return true;
        }

        if(board[indexRow][indexColumn] == item){
            return isHorizontal(board, item, indexRow, indexColumn + 1);
        }

        return false;
    }

    private static boolean isVertical(int[][] board, int item, int indexRow, int indexColumn){
        if(item == 0){
            return false;
        }

        if(indexRow == 3){
            return true;
        }

        if(board[indexRow][indexColumn] == item){
            return isVertical(board, item, indexRow + 1, indexColumn);
        }

        return false;
    }

    private static boolean isLeftOnRigth(int[][] board, int item, int indexRow, int indexColumn){
        if(item == 0){
            return false;
        }

        if(indexRow == 3){
            return true;
        }

        if(board[indexRow][indexColumn] == item){
            return isLeftOnRigth(board, item, indexRow + 1, indexColumn + 1);
        }

        return false;
    }

    private static boolean isRigthOnLeft(int[][] board, int item, int indexRow, int indexColumn){
        if(item == 0){
            return false;
        }
        if(indexRow > 2){
            return true;
        }

        if(board[indexRow][indexColumn] == item){
            return isRigthOnLeft(board, item, indexRow + 1, indexColumn - 1);
        }

        return false;
    }

    private static boolean isEmpty(int[][] board){
        for (var item: board) {
            for (var value: item) {
                if(value == 0){
                    return  true;
                }
            }
        }

        return false;
    }
}
