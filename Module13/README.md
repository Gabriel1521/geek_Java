1.（必做）搭建一个 3 节点 Kafka 集群，测试功能和性能；实现 spring kafka 下对 kafka 集群的操作，将代码提交到 github。


配置好并启动3节点的kafka集群

配置好节点的properties文件
  
![Pasted Graphic](https://user-images.githubusercontent.com/10376496/182018599-7a08fe5b-d297-45b6-8402-50aa2af1dd1c.jpg)


然后启动3个节点
  
![Pasted Graphic 1](https://user-images.githubusercontent.com/10376496/182018605-469f43cb-eecd-4372-b7fa-b95d49292e3e.jpg)



并将3个节点添加到producer和consumer的properties的配置下

properties.put("bootstrap.servers", "localhost:9092,localhost:9093,localhost:9094");



6.（必做）思考和设计自定义 MQ 第二个版本或第三个版本，写代码实现其中至少一个功能点，把设计思路和实现代码，提交到 GitHub。

![Pasted Graphic 2](https://user-images.githubusercontent.com/10376496/182020933-6a89b928-5d48-4116-bcfd-626e1ace911e.jpg)



通过REST API接口完成创建topic和发送和读取消息服务


创建topic

POST /create？topic=“topic-1”

Response 200 Topic create successfully.

Response 400 Topic create failed.


创建一个map，map的key设置为topic，value为一个array

每次通过topic_name和offset从array中读取消息


发送消息

POST /topic/topic-1?message=“This is a message to topic-1.”

Response 200 Message sent successfully.

Response 400 Message send failed.


拉取消息

GET /topic/topic-1?offset=“0”

Response 200 Message : “This is a message to topic-1”

Response 400 No message available.







