import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTestIsocoles {

    @Test
    void isTriangle() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Triangle.assignthemtriangles("3","3","5");
        Triangle.isTriangle();
        // String Answer =outContent.toString();
        assertEquals("isosceles",outContent.toString());
    }
}