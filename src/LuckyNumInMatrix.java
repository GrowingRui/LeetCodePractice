import java.util.ArrayList;
import java.util.List;
public class LuckyNumInMatrix {
    public static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> sol = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++){
            int x = matrix[i][0], p = 0;
            for (int j = 0; j < matrix[i].length; j++){
                if (x > matrix[i][j]){
                    x = matrix[i][j];
                    p = j;
                }
            }
            boolean m = true;
            for (int k = 0; k < matrix.length && m; k++){
                if (x < matrix[k][p]){
                    m = false;
                }
            }
            if (m){
                sol.add(x);
            }
        }
        return sol;
    }

    public static void main(String[] args) {
        int[][] test1 = new int[][]{
                {3,7,8},
                {9,11,13},
                {15,16,17}
        };
        int[][] test2 = new int[][]{
                {1,10,4,2},
                {9,3,8,7},
                {15,16,17,12}
        };
        int[][] test3 = new int[][]{
                {7,8},
                {1,2}
        };
        List<Integer> sol = luckyNumbers(test2);
        System.out.println(sol);
    }
}


