import java.net.InetSocketAddress;
import com.sun.net.httpserver.HttpServer;


import java.io.IOException;
import java.io.OutputStream;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;


public class HttpServerDemo {
    public static void main(String[] args) throws Exception {
        //创建http服务器，绑定本地8888端口*
        HttpServer httpServer = HttpServer.create(new InetSocketAddress(8888), 0);
        //创建上下文监听,拦截包含/test的请求*
        httpServer.createContext("/create", new TopicHttpHandler());
        httpServer.createContext("/publishmessage", new PublishMessageHandler());
        httpServer.createContext("/pollmessage", new PollMessageHandler());
        httpServer.start();
    }
}

