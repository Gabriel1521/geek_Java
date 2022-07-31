package module13.restmq;
package module13.restmq;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;



public class TopicHttpHandler implements HttpHandler{

        public Map<String,List<String>> m1 = new HashMap<>();

        @Override
        public void handle(HttpExchange exchange) throws IOException {
            String topic_name = "topic-1";
            String response = "Topic " + topic_name + " is successfully created" ;


            List<String> l1 = new LinkedList<>();

            m1.put(topic_name, l1);

            exchange.sendResponseHeaders(200, 0);
            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes("UTF-8"));
            os.close();
        }

}

public class PublishMessageHandler implements HttpHandler{
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        String topic_name = "topic-1";
        int offset = 1;

        TopicHttpHandler t1 = new TopicHttpHandler();

        Map<String,List<String>> m2 = t1.m1;

        List<String> l2 = m2.get(topic_name);

        l2.add("This is a new message add to topic-1.");

        offset += 1;

        t1.m1.replace(topic_name,l2);

        exchange.sendResponseHeaders(200, 0);
        OutputStream os = exchange.getResponseBody();
        os.write(response.getBytes("UTF-8"));
        os.close();
    }
}

public class PollMessageHandler implements HttpHandler{
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        String topic_name = "topic-1";
        int offset = 1;

        TopicHttpHandler t1 = new TopicHttpHandler();

        Map<String,List<String>> m2 = t1.m1;

        List<String> l2 = m2.get(topic_name);

        String message = l2.get(offset);

        System.out.println("Topic "+ topic_name+ " Offset "+ offset+ " Message: "+ message);

        exchange.sendResponseHeaders(200, 0);
        OutputStream os = exchange.getResponseBody();
        os.write(response.getBytes("UTF-8"));
        os.close();
    }
}
