import java.util.ArrayList;

public class HomeWork {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(18);
        numbers.add(3);
        numbers.add(-7);
        numbers.add(14);
        numbers.add(142);
        findMin(numbers);
    }

    static int findMin(ArrayList<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            if (number < sum) {
                sum = number;
                System.out.println("Минимальное число: " + sum);
            }
        }
        return sum;
    }
}
