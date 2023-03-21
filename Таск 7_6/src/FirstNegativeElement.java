public class FirstNegativeElement {
    public static int findMin(int[] array) {
        int indexOfMin = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[indexOfMin]) {
                indexOfMin = i;
            }
        }
        return indexOfMin;
    }
}