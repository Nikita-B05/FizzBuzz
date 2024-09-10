public class Reduce {
    public static void main(String[] args) {
        int counter = 0;
        int number = 100;
        while (number != 0) {
            boolean isEven = number % 2 == 0;

            if (isEven) {
                number = number / 2;
            }
            else {
                number = number - 1;
            }
            counter++;
        }

        System.out.println(counter);
    }

}
