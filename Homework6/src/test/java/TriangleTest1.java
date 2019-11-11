import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest1 {

    @Test
    void isTriangleB() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Triangle.assignthemtriangles("3","4","6");
        Triangle.isTriangle();
        // String Answer =outContent.toString();
        assertEquals("Scalene",outContent.toString());
    }
}