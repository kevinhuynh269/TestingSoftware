import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTestK {

    @Test
    void isTriangleA() {
     //   ByteArrayOutputStream outContent = new ByteArrayOutputStream();
     //   System.setOut(new PrintStream(outContent));
        Triangle.assignthemtriangles("e","6","3");
        Triangle.isTriangle();
        // String Answer =outContent.toString();
     //   assertEquals("equilateral triangle",outContent.toString());
    }

}