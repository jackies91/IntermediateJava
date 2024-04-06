//Jackie Scott Module 1
//3/24/24
//main class that uses class fan
//test codes that creates 
//2 instances of fan class
//displays functionality of fan class methods

public class Main {
    public static void main(String[] args) {
        // using our fan class
        // displaying our default field values first
        Fan f = new Fan();
        // argument constructor
        Fan f2 = new Fan(Fan.FAST, true, 10.0, "black");

        // Displaying initial states
        System.out.println("Our initial fan settings: \n" + f.toString());
        System.out.println("-------------");
        System.out.println("The new fan settings: \n" + f2.toString());

        // Setting new values to display functionality of the fan methods
        f.setSpeed(Fan.SLOW);
        f.setPower(false);
        f.setRadius(8.0);
        f.setColor("blue");

        // Displaying new values to show functionality
        System.out.println("-------------");
        System.out.println("The fan settings are now: \n" + f.toString());
    }

}