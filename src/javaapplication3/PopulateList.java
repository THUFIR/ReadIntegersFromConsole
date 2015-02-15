package javaapplication3;

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
        do {
            i = getInt();
            ints.add(i);
            System.out.println("sum is " + sumList(ints));
            iterations++;
        } while (iterations < 6);
    }

    private int getInt() {
        Console c = System.console();
        String s = c.readLine();
        int i = Integer.parseInt(s);
        return i;
    }

    private int sumList(List<Integer> ints) {
        int sum = 0;
        for (int i : ints) {
            sum += i;
        }
        return sum;
    }
}
