package ExceptionExample;

public class ArrayStoreEx {
    public static void main(String args[]){
        {

            // Since Double class extends Number class
            // only Double type numbers
            // can be stored in this array
            Number[] a = new Double[2];

            // Trying to store an integer value
            // in this Double type array
            a[0] = 4;
        }
    }

}
