import org.junit.jupiter.api.Assertions;

/**
 * This is the Junit 5 test class for the box class
 * Tests all methods and constructor is working correctly
 *
 * @author Asfandyar Tanwer
 * @version 1.0
 */
class BoxTest {
    
    @org.junit.jupiter.api.Test
    void Box() {
        Box testBox = new Box(5, 6, 7);
        Assertions.assertEquals(5, testBox.getLength());
        Assertions.assertEquals(6, testBox.getWidth());
        Assertions.assertEquals(7, testBox.getHeight());
    }
    
    @org.junit.jupiter.api.Test
    void getLength() {
        Box testBox = new Box(5,6,7);
        Assertions.assertEquals(5,testBox.getLength());
    }

    @org.junit.jupiter.api.Test
    void getWidth() {
        Box testBox = new Box(5,6,7);
        Assertions.assertEquals(6, testBox.getWidth());
    }

    @org.junit.jupiter.api.Test
    void getHeight() {
        Box testBox = new Box(5,6,7);
        Assertions.assertEquals(7, testBox.getHeight());
    }

    @org.junit.jupiter.api.Test
    void setLength() {
        Box testBox = new Box(5,6,7);
        testBox.setLength(-8);
        Assertions.assertEquals(-8, testBox.getLength());
    }

    @org.junit.jupiter.api.Test
    void setWidth() {
        Box testBox = new Box(5,6,7);
        testBox.setWidth(9.45);
        Assertions.assertEquals(9.45, testBox.getWidth());
    }

    @org.junit.jupiter.api.Test
    void setHeight() {
        Box testBox = new Box(5,6,7);
        testBox.setHeight(570.890);
        Assertions.assertEquals(570.890, testBox.getHeight());
    }
}
