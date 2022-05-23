package org.algoyog.jgof.behavior.routing.cor;

import org.algoyog.jgof.common.Request;
import org.algoyog.jgof.common.Response;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class CorTest {
    Handler h1 = new Handler() {
        @Override
        public Response handle(Request request) {
            System.out.println("In Handler1");
            return null;
        }
    };

    Handler h2 = new Handler() {
        @Override
        public Response handle(Request request) {
            System.out.println("In Handler2");
            return null;
        }
    };

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp(){
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void test_cor_flow(){
        h1.setNext_handler(h2);
        h1.execute(new Request());
        Assertions.assertEquals("In Handler1\nIn Handler2",outputStreamCaptor.toString().trim());
    }


    @AfterEach
    public void tearDown(){
        System.setOut(standardOut);
    }

}
