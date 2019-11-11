import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTestLetter {

    @Test
    void isTriangle3() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Triangle.assignthemtriangles("100","6","3");
        Triangle.isTriangle();
        String Answer =outContent.toString();
        assertEquals("not a triangle",outContent.toString());
    }
}