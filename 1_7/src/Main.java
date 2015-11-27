import java.util.HashMap;
import java.util.Map;

/**
 * Created by zaber on 11/26/2015.
 */

public class Main {
    public static void main(String[] args) {

    }

    public int[][] zeroArray(int[][] arr) {
        HashMap<Integer, Boolean> rowMap = new HashMap<Integer, Boolean>();
        HashMap<Integer, Boolean> colMap = new HashMap<Integer, Boolean>();

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == 0) {
                    rowMap.put(row, true);
                    colMap.put(col, true);

                    //This row will be zeroed, so we can move on
                    break;
                }
            }
        }

        //Could just use an array list that denotes the rows/cols to zero
        for (Map.Entry<Integer, Boolean> entry : rowMap.entrySet()) {
            zeroRow(arr, entry.getKey());
        }
        for (Map.Entry<Integer, Boolean> entry : colMap.entrySet()) {
            zeroCol(arr, entry.getKey());
        }

        return arr;
    }

    public void zeroRow(int[][] arr, int row) {
        for (int col = 0; col < arr[row].length; col++) {
            arr[row][col] = 0;
        }
    }

    public void zeroCol(int[][] arr, int col) {
        for (int row = 0; row < arr.length; row++) {
           arr[row][col] = 0;
        }
    }
}
