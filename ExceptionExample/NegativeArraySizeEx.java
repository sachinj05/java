package ExceptionExample;

public class NegativeArraySizeEx {
    public static void main(String[] args) {
        int[] array = new int[-5];
        System.out.println("Array length: " + array.length);
    }
}
