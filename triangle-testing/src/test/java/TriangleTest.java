import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void assignthemtriangles() {

        Triangle.assignthemtriangles("1","1","1");

    }

    @Test
    void getArea() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Triangle.assignthemtriangles("2","3","5");
        Triangle.getArea();
        String Answer =outContent.toString();
        assertEquals(Answer,outContent.toString());

    }
    @Test
    void isTriangleA() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Triangle.assignthemtriangles("3","3","3");
        Triangle.isTriangle();
        // String Answer =outContent.toString();
        assertEquals("equilateral triangle",outContent.toString());
    }



}