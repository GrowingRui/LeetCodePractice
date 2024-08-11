import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class KthDistinctStringInAnArray {
    public static String kthDistinct(String[] arr, int k) {
        String res = "";
        ArrayList<String> aux = new ArrayList<>();
        aux.addAll(Arrays.asList(arr));
        ArrayList<String > sol = new ArrayList<>();
        for (int i = 0; i < arr.length; i++){
            String x = aux.removeFirst();
            if (!sol.contains(x) && !aux.contains(x)){
                sol.add(x);
            }
            aux.add(x);
        }
        if (k <= sol.size()){
            res = sol.get(k-1);
        }
        return res;
    }

    public static String kthDistinct2(String[] arr, int k) {
        // HashMap to store the frequency of each string
        HashMap<String, Integer> frequencyMap = new HashMap<>();
        for (String s : arr) {
            frequencyMap.put(s, frequencyMap.getOrDefault(s, 0) + 1);
        }

        // ArrayList to store distinct strings
        ArrayList<String> distinctStrings = new ArrayList<>();
        for (String s : arr) {
            if (frequencyMap.get(s) == 1) {
                distinctStrings.add(s);
            }
        }
        // Check if k is within the bounds of distinctStrings
        if (k <= 0 || k > distinctStrings.size()) {
            return ""; // Return empty string if k is out of bounds
        }

        // Return the k-th distinct string
        return distinctStrings.get(k - 1);
    }

    public static void main(String[] args) {
        String[] test = {"d","b","c","b","c","a"};
        String[] test2 = {"aaa","aa","a"};
        String[] test3 = {"a","b","a"};
        System.out.println(kthDistinct(test3,3));
    }
}
