访问以及filter运行流程解释

HttpClient send request  

然后NettyServer接收到请求后，通过handler进行处理，filter加在inbound的handler里面，对header进行相应处理，再通过outbound返回。  
