package HomeWork_7;

public class Short_Long {
    public static void main(String[] args) {
        int numbers[] = {123, 45678, 987654321, 1234, 123456};

        int longestNumber = 0;
        int longestNumberLength = Integer.MIN_VALUE;

        int shortestNumber = 0;
        int shortestNumberLength = Integer.MAX_VALUE;

        for (int current : numbers) {
            int currentNumber = current;
            int currentNumberLength = 0;

            while (current != 0) {
                int currentDigit = current % 10;
                current -= currentDigit;
                current /= 10;
                currentNumberLength++;
            }
            if (currentNumberLength >= longestNumberLength) {
                longestNumber = currentNumber;
                longestNumberLength = currentNumberLength;
            }
            if (currentNumberLength <= shortestNumberLength) {
                shortestNumber = currentNumber;
                shortestNumberLength = currentNumberLength;
            }

        }
        System.out.println("The longest number: " + longestNumber + " " );
        System.out.println("The shortest number: " + shortestNumber + " ");
            }
        }


