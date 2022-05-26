package org.algoyog.jgof.behavior.routing.cor;

import org.algoyog.jgof.BaseTest;
import org.algoyog.jgof.common.Request;
import org.algoyog.jgof.common.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CorTest extends BaseTest {
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

    @Test
    public void test_cor_flow(){
        h1.setNext_handler(h2);
        h1.execute(new Request());
        Assertions.assertEquals("In Handler1\nIn Handler2",outputStreamCaptor.toString().trim());
    }

}
