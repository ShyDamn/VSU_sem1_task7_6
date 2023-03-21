public class TestCase {

    private final int[] arrayForTest;
    private final int result;

    public TestCase(int[] arrayForTest, int result) {
        this.arrayForTest = arrayForTest;
        this.result = result;
    }

    public int[] getArrayForTest() {
        return arrayForTest;
    }

    public int getResult() {
        return result;
    }
}

