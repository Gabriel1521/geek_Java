
1.（必做）配置 redis 的主从复制，sentinel 高可用，Cluster 集群。

Cluster, sentinel file


6.（必做）搭建 ActiveMQ 服务，基于 JMS，写代码分别实现对于 queue 和 topic 的消息生产和消费，代码提交到 github。

通过destination创建topic和queue队列，然后消费者和生产者再在其中添加和消费消息。

        Destination destination = new ActiveMQTopic("test.topic");

        // Queue
        Destination destination = new ActiveMQQueue("test.queue");
