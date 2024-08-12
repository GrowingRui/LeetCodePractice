import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class SortThePeople {
    public static String[] sortPeople(String[] names, int[] heights) {
        for (int i = 0; i < heights.length; i++){
            int x = i;
            for (int j = i+1; j < heights.length; j++){
                if (heights[x] < heights[j]){
                    x = j;
                }
            }
            if (x != i){
                int h = heights[i];
                String n = names[i];
                heights[i] = heights[x];
                names[i] = names[x];
                heights[x] = h;
                names[x] = n;
            }
        }
        return names;
    }

    /*
    public static String[] sortPeople2(String[] names, int[] heights) {
        List<Pair<Integer, String>> heightAndNames = new ArrayList<>();

        for (int i = 0; i < names.length; ++i)
            heightAndNames.add(new Pair<>(heights[i], names[i]));

        Collections.sort(heightAndNames, (a, b) -> b.getKey() - a.getKey());

        for (int i = 0; i < heightAndNames.size(); ++i)
            names[i] = heightAndNames.get(i).getValue();

        return names;
    }
     */


    public static void main(String[] args) {
        String[] names1 = new String[]{"Mary","John","Emma"};
        String[] names2 = new String[]{"Alice","Bob","Bob"};
        int[] heights1 = new int[]{180,165,170};
        int[] heights2 = new int[]{155,185,150};
        String[] res = sortPeople(names2,heights2);
        System.out.println(Arrays.toString(res));
    }
}
