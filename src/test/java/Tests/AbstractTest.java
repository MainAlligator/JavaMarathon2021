package Tests;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class AbstractTest {

    private static final PrintStream systemOut = System.out;
    private static final InputStream systemIn = System.in;

    private static ByteArrayInputStream testIn;
    private static ByteArrayOutputStream testOut;


    public void setUpOutput() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }

    protected String getOutput() {
        return testOut.toString()
                .replaceAll("\\n|\\r\\n", System.getProperty("line.separator"));
    }

    protected void setInput(String input) {
        testIn = new ByteArrayInputStream(input.getBytes());
        System.setIn(testIn);
    }


    public void restoreSystemInputOutput() {
        System.setIn(systemIn);
        System.setOut(systemOut);
    }

}
