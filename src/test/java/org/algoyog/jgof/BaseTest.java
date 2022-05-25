package org.algoyog.jgof;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class BaseTest {
    protected final PrintStream standardOut = System.out;
    protected final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp(){
        System.setOut(new PrintStream(outputStreamCaptor));
    }


    @AfterEach
    public void tearDown(){
        System.setOut(standardOut);
    }
}
