package module13.restmq;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;

public class TopicHttpHandler implements HttpHandler{
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            String topic_name = "topic-1";
            String response = "Topic " + topic_name + " is successfully created" ;
            exchange.sendResponseHeaders(200, 0);
            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes("UTF-8"));
            os.close();
        }

}
