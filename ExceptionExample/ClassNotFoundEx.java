package ExceptionExample;

public class ClassNotFoundEx {
    // Main driver method
    public static void main(String args[])
    {

        // Try block to check for exceptions
        try {

            Class.forName("Unknown Class");
        }

        // Catch block to handle exceptions

        catch (ClassNotFoundException e) {

            // Displaying exceptions on console along with
            // line number using printStackTrace() method
            e.printStackTrace();
        }
    }
}
