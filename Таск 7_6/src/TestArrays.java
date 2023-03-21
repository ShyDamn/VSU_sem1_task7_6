public class TestArrays {
    public TestCase[] getTestArrays() {
        TestCase differenceBetweenIndexesIsLessThanTwo = new TestCase(new int[]{1, 2, 3, 4, 5, 6}, 0);
        TestCase evenNumbersOnly = new TestCase(new int[]{2, 4, 12, 8}, 0);
        TestCase oddNumbersOnly = new TestCase(new int[]{3, 1, 51, 13, 5, 75}, 1);
        TestCase onlyZeros = new TestCase(new int[]{0, 0, 0, 0, 0, 0}, 0);
        TestCase indexLastEvenNumberMoreIndexLastOddNumber = new TestCase(new int[]{3, 5, 6, 7, 12, 10, 2}, 6);
        TestCase indexLastEvenNumberLessIndexLastOddNumber = new TestCase(new int[]{2, 4, 5, 28, 31, 3, 5}, 0);
        TestCase sumIsZero = new TestCase(new int[]{2, 0, 0, 0, 0, 3}, 1);
        TestCase emptyArray = new TestCase(new int[]{}, 0);
        TestCase arrayWithZeros = new TestCase(new int[]{23, 0, 32, 5, 0, 6, 8}, 1);
        TestCase arrayWithZerosAndEvenNumber = new TestCase(new int[]{0, 0, 2, 0}, 0);
        TestCase arrayWithZerosAndOddNumber = new TestCase(new int[]{0, 3, 0, 0}, 0);

        return new TestCase[]{differenceBetweenIndexesIsLessThanTwo, evenNumbersOnly, oddNumbersOnly,
                onlyZeros, indexLastEvenNumberMoreIndexLastOddNumber, indexLastEvenNumberLessIndexLastOddNumber,
                sumIsZero, emptyArray, arrayWithZeros, arrayWithZerosAndEvenNumber, arrayWithZerosAndOddNumber};
    }
}