/**
 * This class provides a base to be used with BoxGUI.
 * Create a Box Object with length, width, and height with
 * respective getters and setters for each variable
 *
 * @author Asfandyar Tanwer
 * @version 1.0
 */
public class Box {

    private double length; // length of box
    private double width; // width of box
    private double height; // height of box

    /**
     * This is the constructor for the Box class
     * @param length the length of the box
     * @param width the width of the box
     * @param height the height of the box
     */
    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    /**
     * This method returns the length of the box
     * @return the length of the box
     */
    public double getLength() {
        return length;
    }

    /**
     * This method returns the width of the box
     * @return the width of the box
     */
    public double getWidth() {
        return width;
    }

    /**
     * This method returns the height of the box
     * @return the height of the box
     */
    public double getHeight() {
        return height;
    }

    /**
     * This method sets a new length for the box
     * @param length the new length of the box
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * This method sets a new width for the box
     * @param width the new width of the box
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * This method sets a new height for the box
     * @param height the new height of the box
     */
    public void setHeight(double height) {
        this.height = height;
    }
}