/*Jackie Scott 3/22/2024 
 * Module 1 
 * This program will have Four constants named STOPPED, SLOW, MEDIUM, and FAST. The constants are to hold the values of 0, 1, 2, and 3 respective
 * A private field named speed that holds one of the constant values with the default being STOPPED.
 * A private Boolean field titled on that specifies whether the fan is on or off.
 * A private field named radius that holds the radius of the fan with a default value of 6.
 * A String field that holds the color, with the default being white.
 * Setter and getter methods for all mutable fields.
 * A no-argument constructor that sets all fields with a default value.
 * A constructor taking arguments and setting values.
 * Write a toString() method that returns a description of the Fans state.
 */

public class Fan {

    // define our four constants
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // fields or traits of our fan making private so it cannot be accessed outside
    // the fan class
    private int speed;
    private boolean power;
    private double radius;
    private String color;

    // no-argument constructors to set initial field information
    public Fan() {
        speed = STOPPED;
        power = false;
        radius = 6.0;
        color = "white";
    }

    // constructor to take parameters in order to set values
    // adding keyword "this" to reference the fan object fields
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.power = on;
        this.radius = radius;
        this.color = color;
    }

    // encapsulation; defining our setters first
    // adding this keyword to ensure we are referencing correct private field and
    // not the parameter
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // getters so we can see the private fields
    public int getSpeed() {
        return speed;
    }

    public boolean power() {
        return power;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    // toString() method, so instead of seeing coded return, we see a detailed
    // return we can read in plain language

    public String toString() {
        // Determine if the fan is powered on or off
        String powered;
        if (power) {
            powered = "on";
        } else {
            powered = "off";
        }

        // Construct the string representation of the fan with newline characters
        return "Fan is " + powered + "\nSpeed: " + speed + "\nRadius: " + radius + "\nColor: " + color;
    }

}
