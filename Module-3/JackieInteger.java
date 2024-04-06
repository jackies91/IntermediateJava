/*Jackie Scott Module 3  
An int data field titled with your first name.
A constructor that takes and sets the initial value.
Getter and setter methods.
Non-Static methods titled isEven(), isOdd(), and isPrime() returning true or false based on the variable’s value.
Static methods with signatures isEven(int), isOdd(int), and isPrime(int) with the same basic logic as the previous methods with results based on the parameter.
Static methods with signatures isEven( Integer), isOdd( Integer), and isPrime( Integer) with the same basic logic as the previous methods with results based on the parameter.
The methods equals(int) and equals( Integer) which returns true if int values are equal and false if they are not.
*/

public class JackieInteger {
    //An int data field titled after me
    private int jackie;

    //constructor that takes and sets the initial value.
    public JackieInteger(int jackie) {
        this.jackie = jackie;
    }

    // Getter to retrieve the values
    public int getJackie() {
        return jackie;
    }

    // Setter method to set the value of the object
    public void setJackie(int jackie) {
        this.jackie = jackie;
    }

    //Non-static methods titled isEven(), isOdd(), and isPrime()
    //Method to check if the value is even
    public boolean isEven() {
        return jackie % 2 == 0;
    }

    //Method to check if the value is odd
    public boolean isOdd() {
        return jackie % 2 != 0;
    }

    //Method to check if the value is prime
    public boolean isPrime() {
        if (jackie <= 1) {
            return false;
        }
        for (int i = 2; i * i <= jackie; i++) {
            if (jackie % i == 0) {
                return false;
            }
        }
        return true;
    }

    //Static methods with the same basic logic as the previous methods
    //Static method to check if a given value is even
    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    //Static method to check if a given value is odd
    public static boolean isOdd(int value) {
        return value % 2 != 0;
    }

    //Static method to check if a given value is prime
    public static boolean isPrime(int value) {
        if (value <= 1) {
            return false;
        }
        for (int i = 2; i * i <= value; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    //Static methods with signatures isEven( Integer), isOdd( Integer), and isPrime( Integer)
    public static boolean isEven(JackieInteger jackieInteger) {
        return jackieInteger.isEven();
    }

    public static boolean isOdd(JackieInteger jackieInteger) {
        return jackieInteger.isOdd();
    }

    public static boolean isPrime(JackieInteger jackieInteger) {
        return jackieInteger.isPrime();
    }

    //The methods equals(int) and equals( Integer)
    // Method to check if the value of the current object is equal to a given value
    public boolean equals(int otherValue) {
        return this.jackie == otherValue;
    }

    // Method to check if the value of the current object is equal to the value of a given object
    public boolean equals(JackieInteger otherJackieInteger) {
        return this.jackie == otherJackieInteger.getJackie();
    }

    //test code
    //Main method to test the functionality
    public static void main(String[] args) {
        //Create JackieInteger objects with different values
        JackieInteger jackie1 = new JackieInteger(7);
        JackieInteger jackie2 = new JackieInteger(9);
        JackieInteger jackie3 = new JackieInteger(11);

        //Test isEven, isOdd, and isPrime methods
        System.out.println("Is jackie1 even? " + jackie1.isEven());
        System.out.println("Is jackie2 odd? " + jackie2.isOdd());
        System.out.println("Is jackie3 prime? " + jackie3.isPrime());

        //Test static methods
        System.out.println("Is 4 even? " + JackieInteger.isEven(8));
        System.out.println("Is 7 odd? " + JackieInteger.isOdd(9));
        System.out.println("Is 11 prime? " + JackieInteger.isPrime(11));

        //Test static methods with Integer parameter
        System.out.println("Is jackie1 even? " + JackieInteger.isEven(jackie1));
        System.out.println("Is jackie2 odd? " + JackieInteger.isOdd(jackie2));
        System.out.println("Is jackie3 prime? " + JackieInteger.isPrime(jackie3));

        //Test equals methods
        System.out.println("Is jackie1 equal to jackie2? " + jackie1.equals(jackie2));
        System.out.println("Is jackie1 equal to jackie3? " + jackie1.equals(jackie3));
    }
}
