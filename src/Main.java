import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[] array = {3, 2, 1, 0};
        System.out.println(main.getArrays(array));

        List<Integer> strings = new ArrayList<>();
        strings.add(2);
        strings.add(3);
        strings.add(1);
        strings.add(0);
        System.out.println(main.getAverageOfAllNumbers(strings));

        main.multiPlication(10);

        main.countFromOneToHundred();

        List<String> firstLetters = new ArrayList<>();
        firstLetters.add("a");
        firstLetters.add("b");
        firstLetters.add("c");
        List<String> secondLetters = new ArrayList<>();
        secondLetters.add("1");
        secondLetters.add("2");
        secondLetters.add("3");
        System.out.println(main.getTwoListOfStrings(firstLetters, secondLetters));

        main.triangleSymbols(4);


    }


    public int getArrays(int[] a) {
        int sum = 0;
        for (int num : a) {
            sum = sum + num;
        }
        return sum;
    }

    public double getAverageOfAllNumbers(List<Integer> b) {
        double sum = 0;
        for (int x : b) {
            sum += x;

        }
        return sum / b.size();
    }

    public void multiPlication(int l) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i <= 10; i++) {
            int result = i * l;
            System.out.println(l + " * " + i + " = " + result);
        }
    }


    public void countFromOneToHundred() {
        for (int i = 1; i <= 100; i++) {
            if ((i % 3 == 0) && (i % 5 == 0))
                System.out.println("FizzBuzz");
            else if (i % 3 == 0)
                System.out.println("Fizz");
            else if (i % 5 == 0)
                System.out.println("Buzz");
            else System.out.println(i);


        }
    }

    public List<String> getTwoListOfStrings(List<String> f, List<String> n) {
        List<String> newList = new ArrayList<>();
        for (int i = 0; i < f.size(); i++) {
            newList.add(f.get(i));
            newList.add(n.get(i));
        }
        return newList;
    }

    public void triangleSymbols(int j) {
        for (int stars = 0; stars < j; stars++) {
            for (int colons = 0; colons < stars + 1; colons++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

