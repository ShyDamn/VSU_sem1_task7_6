import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        Test testProgram = new Test();
        TestResult testResult = testProgram.test();

        if (testResult.getResultOfTest()) {
            System.out.println("All tests passed successfully. The program works correctly.");

            System.out.print("Enter the length of the array: ");
            int lengthOfArray = readNumber();

            if (lengthOfArray != 0) {
                System.out.println("Enter the array numbers.");
            }

            int[] array = readArray(lengthOfArray);
            System.out.println(FirstNegativeElement.findMin(array));
        }
    }

    private static int readNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int[] readArray(int a) {
        int[] arr = new int[a];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = readNumber();
        }
        return arr;
    }
}
