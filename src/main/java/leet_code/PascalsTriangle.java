package leet_code;

import java.util.*;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> first = new ArrayList<>();
        first.add(1);
        result.add(first);
        List<Integer> second = new ArrayList<>();
        if(numRows == 1) {
            return result;
        }
        second.add(1);
        second.add(1);
        result.add(second);
        for(int i = 3; i <= numRows; i++) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            List<Integer> previous = result.get(i-2);
            for(int j = 1; j < i-1; j++) {
                int value = previous.get(j) + previous.get(j-1);
                list.add(value);
            }
            list.add(1);
            result.add(list);
        }

        return result;
    }

    public static void main(String[] args) {
        PascalsTriangle pt = new PascalsTriangle();
        List<List<Integer>> result = pt.generate(5);
        System.out.println(result);
        // OUTPUT: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
    }
}
