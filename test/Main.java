import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();
        int[] numbers = {1,2,3,4,5};
        for (Integer number : numbers) {
            integerStack.push(number);
        }
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = integerStack.pop();
        }
        for (Integer number : numbers) {
            System.out.printf("%d, ",number);
        }
    }
}
