import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {

    @Test
    void getWidth() {
        int width = 5;
        int height = 5;
        Matrix m = new Matrix(width, height);
        Assertions.assertEquals(width, m.getWidth());
    }

    @ParameterizedTest
    @CsvSource({"5,5", "10,20", "9384,12384"})
    void getWidth_OK(int width, int height) {
        Matrix m = new Matrix(width, height);
        Assertions.assertEquals(width, m.getWidth());
    }
    @Test
    void getWidth_NEGATIVE() {
        int width = -1;
        int height = 5;
        Assertions.assertThrows(NegativeArraySizeException.class, () -> {
            new Matrix(width, height);
        });
    }

    @Test
    void getHeight() {
        int width = 5;
        int height = 5;
        Matrix m = new Matrix(width, height);
        Assertions.assertEquals(height, m.getHeight());
    }

    @Test
    void fill() {
        int num = 5;
        Matrix m = new Matrix(5, 5);
        m.Fill(num);
        Assertions.assertEquals(m.getWidth()*m.getHeight(), m.Count(num));

    }

    @Test
    void count() {
        int num = 5;
        Matrix m = new Matrix(5,6);
        m.Fill(num);
        Assertions.assertEquals(m.getWidth()*m.getHeight(), m.Count(num));
    }

    @Test
    void found() {
        int num = 7;
        Matrix m = new Matrix(5,5);
        m.Fill(7);
        Assertions.assertFalse(m.Found(5));
    }

    @Test
    void _toString() {

    }
}