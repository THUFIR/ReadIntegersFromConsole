package homework;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

public class PopulateList {

    public static void main(String[] args) {
        new PopulateList().loadList();
    }

    private void loadList() {
        List<Integer> ints = new ArrayList<>();
        int iterations = 0;
        int i = 0;
        while (iterations < 6) {
            i = getInt();
            ints.add(i);
            System.out.println("sum is " + sumList(ints));
            System.out.println("avg is " + avg(ints));
            iterations++;
        }
    }

    private int getInt() {
        Console c = System.console();
        String s = c.readLine();
        int i = Integer.parseInt(s);
        return i;
    }

    private float avg(List<Integer> ints) {
        float s = (float) sumList(ints);
        float avg = s / ints.size();
        return avg;
    }

    private int sumList(List<Integer> ints) {
        int sum = 0;
        for (int i : ints) {
            sum += i;
        }
        return sum;
    }
}
