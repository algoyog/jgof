package org.algoyog.jgof.behavior.routing.cor;

import org.algoyog.jgof.common.Request;
import org.algoyog.jgof.common.Response;

public abstract class Handler {
    public abstract Response handle(Request request);
    public void execute(Request request){
        this.handle(request);
        if(next_handler!=null){
            next_handler.execute(request);
        }
    }
    private Handler next_handler;

    public Handler getNext_handler() {
        return next_handler;
    }

    public void setNext_handler(Handler next_handler) {
        this.next_handler = next_handler;
    }
}
