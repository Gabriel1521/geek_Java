Outline
- 毕业项目
- 毕业总结


### 毕业项目

Module 15

1.（必做）分别用 100 个字以上的一段话，加上一幅图（架构图或脑图），总结自己 对下列技术的关键点思考和经验认识:
* JVM
* NIO
* 并发编程
* Spring 和 ORM 等框架
* MySQL 数据库和 SQL
* 分库分表
* RPC 和微服务
* 分布式缓存
* 分布式消息队列

   
Main Content  
   

* JVM

Java文件运行机制

![Pasted Graphic](https://user-images.githubusercontent.com/10376496/184531711-d6c73ba1-d9bf-4c43-9572-47a66be0aa23.jpg)

![Pasted Graphic 1](https://user-images.githubusercontent.com/10376496/184531716-fe42d6ce-4ad9-4716-871f-555890568ed2.jpg)


Java/Golang 完全不相信程序员，但也惯着程序员。所有的内存生命周期都由 JVM 运行 时统一管理。 在绝大部分场景下，你可以非常自由地写代码，而且不用关心内存到底是 什么情况。 内存使用有问题的时候，我们可以通过 JVM 来进行信息相关的分析诊断和 调整。 

![Pasted Graphic 2](https://user-images.githubusercontent.com/10376496/184531718-1b6799e2-411e-4dda-95c4-edffb90fe668.jpg)

![Pasted Graphic 3](https://user-images.githubusercontent.com/10376496/184531723-23706376-b967-47f8-8b92-2f33c0fd92f6.jpg)

![Pasted Graphic 4](https://user-images.githubusercontent.com/10376496/184531725-541f2604-029d-463b-9d2b-07b6d4a16ac7.jpg)


Java通过将Java的源码文件编译成字节码文件，在JVM上通过类加载器对文件进行加载创建对象实例来完成编译运行。JVM同时负责内存的分配调用，可以内存使用问题可以通过JVM相关分析来Debug。

![Pasted Graphic 5](https://user-images.githubusercontent.com/10376496/184531730-94a1b22f-7de7-4875-8adc-ab408eb72fd5.jpg)

![Pasted Graphic 6](https://user-images.githubusercontent.com/10376496/184531733-4667ec6b-3ce2-45cc-b1f0-f5b600ea893b.jpg)


JVM类加载器

![Pasted Graphic 7](https://user-images.githubusercontent.com/10376496/184531735-c687b381-6160-4932-9a7f-5fd56be219fa.jpg)

![Pasted Graphic 8](https://user-images.githubusercontent.com/10376496/184531742-4f4da0bf-f034-4de1-b469-605a6d29ba80.jpg)

![Pasted Graphic 9](https://user-images.githubusercontent.com/10376496/184532217-dff28af9-5089-4598-9962-c5858cb32354.jpg)

![Pasted Graphic 10](https://user-images.githubusercontent.com/10376496/184532238-82391986-f81d-425c-8327-f6d2d8cb6c53.jpg)

![Pasted Graphic 29](https://user-images.githubusercontent.com/10376496/184532262-4ce75001-a8fd-43be-a638-88ebfa27a7f4.jpg)



JVM内存模型

JVM内存主要包括线程栈与堆内存，每个线程都有自己的线程栈共享堆内存。结构如下图。

![Pasted Graphic 12](https://user-images.githubusercontent.com/10376496/184532274-f9c4cabb-a3f4-49b4-b3b3-f5dd93fe3fed.jpg)

![Pasted Graphic 13](https://user-images.githubusercontent.com/10376496/184532280-faa5501b-93aa-4427-b0bf-69327b1d6c6e.jpg)

![Pasted Graphic 14](https://user-images.githubusercontent.com/10376496/184532287-deccdee8-e423-4228-93a8-63e162670cdb.jpg)

![Pasted Graphic 16](https://user-images.githubusercontent.com/10376496/184532291-5a565d0f-8862-49b4-94fa-d4195e153d2f.jpg)

![Pasted Graphic 15](https://user-images.githubusercontent.com/10376496/184532297-a98d926d-3dcf-4cc9-aded-2ad54cf9c0dd.jpg)

![Pasted Graphic 17](https://user-images.githubusercontent.com/10376496/184532302-0f76554e-b84b-4ef1-86af-b648cdb9e13f.jpg)



JVM启动参数

可以通过JVM启动参数对内存大小进行设置，配合设置的GC策略来对JVM内存使用和GC进行调优。


![Pasted Graphic 18](https://user-images.githubusercontent.com/10376496/184532306-c1fc90da-60c1-4a6d-87a6-2747fc42541e.jpg)

![Pasted Graphic 19](https://user-images.githubusercontent.com/10376496/184532312-2a20f4d4-d8db-461e-83d2-0c622f0ea3c5.jpg)

![Pasted Graphic 19](https://user-images.githubusercontent.com/10376496/184532317-dc446e05-9e34-4469-972d-7432ae738c7a.jpg)

![Pasted Graphic 20](https://user-images.githubusercontent.com/10376496/184532323-ea1545a1-518e-46e8-9457-c97a1696bba7.jpg)

![Pasted Graphic 22](https://user-images.githubusercontent.com/10376496/184532328-44585c0f-bc01-4f26-a397-ea7d75176d06.jpg)

![Pasted Graphic 23](https://user-images.githubusercontent.com/10376496/184532332-cf5b29f0-1358-43e5-adaa-adbc0610fa1c.jpg)

![Pasted Graphic 24](https://user-images.githubusercontent.com/10376496/184532336-dd9e5f33-35f6-47bc-a020-d6c6b162f01b.jpg)

![Pasted Graphic 26](https://user-images.githubusercontent.com/10376496/184532339-b616905b-3a17-447b-a1da-2811a1a22ddc.jpg)

![Pasted Graphic 27](https://user-images.githubusercontent.com/10376496/184532341-17a2cf35-c77e-4a9e-a4f9-40f9ec8ca565.jpg)

![Pasted Graphic 28](https://user-images.githubusercontent.com/10376496/184532347-5800b54a-0894-4dc6-a52e-c49e8b846201.jpg)



* NIO


NIO：NIO是一种同步非阻塞IO, 基于Reactor模型来实现的。
 其实相当于就是一个线程处理大量的客户端的请求，通过一个线程轮询大量的channel，每次就获取一批有事件的channel，然后对每个请求启动一个线程处理即可。
 这里的核心就是非阻塞，就那个selector一个线程就可以不停轮询channel，所有客户端请求都不会阻塞，直接就会进来，大不了就是等待一下排着队而已。
 这里面优化BIO的核心就是，一个客户端并不是时时刻刻都有数据进行交互，没有必要死耗着一个线程不放，所以客户端选择了让线程歇一歇，只有客户端有相应的操作的时候才发起通知，创建一个线程来处理请求。
 
 ![Pasted Graphic 32](https://user-images.githubusercontent.com/10376496/184534380-5b380059-325e-4cd9-a034-a7bf32768277.jpg)


![Pasted Graphic 33](https://user-images.githubusercontent.com/10376496/184534382-f6a35f33-804a-4661-9e49-de5310cab5d9.jpg)


![Pasted Graphic 30](https://user-images.githubusercontent.com/10376496/184534388-099a0541-f8ef-401f-9ab2-af54910a940a.jpg)


![Pasted Graphic 31](https://user-images.githubusercontent.com/10376496/184534391-4368c381-48d5-40fc-8bb7-39d6b7dff230.jpg)


![Pasted Graphic 35](https://user-images.githubusercontent.com/10376496/184534397-5300498a-b46c-4487-ae29-7101c153742e.jpg)

![Pasted Graphic 38](https://user-images.githubusercontent.com/10376496/184534403-af0daedb-fe6f-4399-bbfd-612ddb94d9e7.jpg)

![Pasted Graphic 40](https://user-images.githubusercontent.com/10376496/184534409-0ba502b1-01b8-46c9-81c2-b5f93374227f.jpg)

![Pasted Graphic 42](https://user-images.githubusercontent.com/10376496/184534415-49a1bc73-df8f-49b5-83ce-c5b904604f28.jpg)

![Pasted Graphic 43](https://user-images.githubusercontent.com/10376496/184534417-5e93ca97-f74c-4b90-9375-4712d484e2ad.jpg)

![Pasted Graphic 45](https://user-images.githubusercontent.com/10376496/184534420-590e3820-591e-486b-b24c-603c38ca88c9.jpg)

![Pasted Graphic 48](https://user-images.githubusercontent.com/10376496/184534424-6ca17b57-85ae-44f4-806c-40665ad5ab8d.jpg)

![Pasted Graphic 51](https://user-images.githubusercontent.com/10376496/184534505-d7d65079-061b-4581-b83b-653f9738f08e.jpg)


* 并发编程

![Pasted Graphic 56](https://user-images.githubusercontent.com/10376496/184535029-f4800e54-feee-4756-9627-65aa55fd8fba.jpg)

![Pasted Graphic 57](https://user-images.githubusercontent.com/10376496/184535035-f98fe439-33eb-473d-899a-f6710a2c5aa3.jpg)

![Pasted Graphic 58](https://user-images.githubusercontent.com/10376496/184535037-03d8ccd2-f8ac-4f32-8273-372ead4a5c73.jpg)

![Pasted Graphic 59](https://user-images.githubusercontent.com/10376496/184535048-9f46cdb8-c937-4771-8c64-b1309f13d43b.jpg)

![Pasted Graphic 60](https://user-images.githubusercontent.com/10376496/184535042-dbd481d0-0425-413e-b262-eb7b59d362a1.jpg)

![Pasted Graphic 61](https://user-images.githubusercontent.com/10376496/184535055-160b62b1-2042-4174-b44e-7b2a7956726e.jpg)

![Pasted Graphic 62](https://user-images.githubusercontent.com/10376496/184535069-d0fbd991-a1c8-474b-85fc-a022f746bb29.jpg)

![Pasted Graphic 63](https://user-images.githubusercontent.com/10376496/184535070-17bd0011-a091-4109-a35e-2e71d6c8ce7d.jpg)


![Pasted Graphic 52](https://user-images.githubusercontent.com/10376496/184535076-9178d563-157d-450e-907a-b6f1f3eb9389.jpg)

![Pasted Graphic 53](https://user-images.githubusercontent.com/10376496/184535081-35d7e63a-2cc8-4eaa-8176-7cda1fde54ea.jpg)

![Pasted Graphic 54](https://user-images.githubusercontent.com/10376496/184535086-b9c99d32-bbfe-483e-99c4-39024d1b7705.jpg)

![Pasted Graphic 55](https://user-images.githubusercontent.com/10376496/184535091-56c5545a-3321-4bd5-aaf3-30c0709e0605.jpg)

![Pasted Graphic 64](https://user-images.githubusercontent.com/10376496/184535097-43156ff8-a43f-40d9-a955-24ab547bfb39.jpg)

![Pasted Graphic 66](https://user-images.githubusercontent.com/10376496/184535101-9879b76e-e91a-4ccc-9fc2-f260293df3c3.jpg)

![Pasted Graphic 65](https://user-images.githubusercontent.com/10376496/184535106-74cf03f1-0e99-4eee-b624-f25f4c6c65dd.jpg)


https://www.cnblogs.com/paddix/p/5374810.html

https://baijiahao.baidu.com/s?id=1708721597435904336&wfr=spider&for=pc

![Pasted Graphic 67](https://user-images.githubusercontent.com/10376496/184535119-92f21431-3089-4460-8c1c-e14585e49262.jpg)

![Pasted Graphic 68](https://user-images.githubusercontent.com/10376496/184535124-bcf9f246-a02f-4ca5-bd46-800c475bde0d.jpg)


java.util.concurrency 
锁机制类 Locks : Lock, Condition, ReentrantLock, ReadWriteLock,LockSupport 
原子操作类 Atomic : AtomicInteger, AtomicLong, LongAdder 
线程池相关类 Executor : Future, Callable, Executor, ExecutorService 
信号量三组工具类 Tools : CountDownLatch, CyclicBarrier, Semaphore 
并发集合类 Collections : CopyOnWriteArrayList, ConcurrentMap

![image](https://user-images.githubusercontent.com/10376496/184535788-fde367cb-0069-4890-a7ff-a28ba7b8104d.png)

![Pasted Graphic 71](https://user-images.githubusercontent.com/10376496/184535796-06361e0f-1071-4340-ae51-932f989551b8.jpg)


* Spring 和 ORM 等框架


Spring框架主要构成部分包括AOP，BEAN和ORM。 AOP类似于在pipeline中间增加前后处理过程的filter，Bean可以使用xml生成加载对象，ORM负责object到数据库的连接和映射，包括Hibernate和Mybatis。  

![Pasted Graphic 72](https://user-images.githubusercontent.com/10376496/184535799-f4932a4f-7843-4050-9c31-e94a0c0bac41.jpg)

![Pasted Graphic 76](https://user-images.githubusercontent.com/10376496/184535802-b99f0525-0db0-44a8-8b21-c00483f19fd7.jpg)

![Pasted Graphic 77](https://user-images.githubusercontent.com/10376496/184535807-6e0f778d-3bb4-42e0-b96b-5fc64b00bf8c.jpg)

![Pasted Graphic 78](https://user-images.githubusercontent.com/10376496/184535810-b09e2032-9ded-411a-b723-7af2a1db2618.jpg)

![Pasted Graphic 80](https://user-images.githubusercontent.com/10376496/184535812-fcffb94c-e402-4c52-94fb-2afd7a7f6a50.jpg)

![Pasted Graphic 79](https://user-images.githubusercontent.com/10376496/184535814-f5a8f981-6802-4487-894c-a02e20a9e875.jpg)

![Pasted Graphic 81](https://user-images.githubusercontent.com/10376496/184535817-7c49dc6d-e475-42cd-b8e9-de713f4a8830.jpg)

![Pasted Graphic 82](https://user-images.githubusercontent.com/10376496/184535822-c6e4c809-034b-49bc-bf99-d19028a72e14.jpg)

![Pasted Graphic 83](https://user-images.githubusercontent.com/10376496/184535826-8439e7de-b9fa-49ba-9b77-25904b9515c6.jpg)

![Pasted Graphic 84](https://user-images.githubusercontent.com/10376496/184535829-80ec19a5-fbaf-4112-bd63-618b31d044bb.jpg)

![Pasted Graphic 91](https://user-images.githubusercontent.com/10376496/184535839-1b3f0d81-f319-40e8-adb0-c347bb77ac4e.jpg)

![Pasted Graphic 92](https://user-images.githubusercontent.com/10376496/184535840-6d8db8d1-7db5-471e-bd75-a3ad622b924c.jpg)

![Pasted Graphic 93](https://user-images.githubusercontent.com/10376496/184535841-7d81fecd-b496-4fd8-b618-6c9bd4ed5c74.jpg)

![Pasted Graphic 85](https://user-images.githubusercontent.com/10376496/184535845-472a22ea-4772-44e4-b477-b663a4486e98.jpg)

![Pasted Graphic 86](https://user-images.githubusercontent.com/10376496/184535846-22288ccb-60b2-4f10-bb1b-23bef60bb49b.jpg)

![Pasted Graphic 87](https://user-images.githubusercontent.com/10376496/184535848-dd1bcb7f-3656-4640-835a-9ad243446b09.jpg)

![Pasted Graphic 88](https://user-images.githubusercontent.com/10376496/184535849-e49045d3-ebd0-4603-81d2-a85319efb1b1.jpg)

![Pasted Graphic 90](https://user-images.githubusercontent.com/10376496/184535850-a9c3df16-cc14-4132-b5b1-4e0c7865af4f.jpg)

![Pasted Graphic 89](https://user-images.githubusercontent.com/10376496/184535853-b7ad9282-75c0-4048-9af1-bec7e25a7353.jpg)


* MySQL 数据库和 SQL

![Pasted Graphic 94](https://user-images.githubusercontent.com/10376496/184536263-d99bd62d-4ea1-4d95-9ec7-d68162e4b378.jpg)

![Pasted Graphic 96](https://user-images.githubusercontent.com/10376496/184536264-707e41a3-66a1-41dd-9dc3-4afeda2aa2f6.jpg)

![Pasted Graphic 97](https://user-images.githubusercontent.com/10376496/184536272-6054c3e7-89f7-4c40-a356-95359361ed48.jpg)

![Pasted Graphic 98](https://user-images.githubusercontent.com/10376496/184536275-1f290b09-6436-401e-9567-cd521a7419d3.jpg)

![Pasted Graphic 99](https://user-images.githubusercontent.com/10376496/184536277-fe5fa890-0e50-49ae-b16b-3a0cc2d90050.jpg)

![Pasted Graphic 100](https://user-images.githubusercontent.com/10376496/184536279-b6429c16-688c-4a2b-9730-10569b664461.jpg)

![Pasted Graphic 101](https://user-images.githubusercontent.com/10376496/184536282-2296dc96-d834-44f5-a5df-f730c71dd055.jpg)

![Pasted Graphic 102](https://user-images.githubusercontent.com/10376496/184536283-5ec94576-cb52-43a0-86f3-590d16146266.jpg)

![Pasted Graphic 103](https://user-images.githubusercontent.com/10376496/184536284-6920732f-738e-444d-bbab-5c5e02c8a84d.jpg)

![Pasted Graphic 104](https://user-images.githubusercontent.com/10376496/184536286-d811076d-deb1-4751-8b70-1e248035ec17.jpg)

![Pasted Graphic 105](https://user-images.githubusercontent.com/10376496/184536291-9610b588-a98b-4390-808b-042f9e11fc92.jpg)

![Pasted Graphic 106](https://user-images.githubusercontent.com/10376496/184536294-068a712b-2980-40df-813e-180b62809acf.jpg)

![Pasted Graphic 107](https://user-images.githubusercontent.com/10376496/184536296-7a16fe77-680a-423e-a6bf-5557f58235d5.jpg)

![Pasted Graphic 108](https://user-images.githubusercontent.com/10376496/184536298-c51daa5d-35ff-404f-88ca-70f54da6911f.jpg)


* 分库分表


分库分表主要可以做垂直拆分和水平拆分，垂直拆分是根据业务进行拆分，对系统的影响较大，按高内举松耦合的方法将同类业务聚合一起进行拆分。水平拆分则是以一定规则例如将ID%2将数据分拆到两个数据库中，对系统影响较小，而且可以平均把流量分配到不同数据库。课程中使用shardingsphere-proxy在代码中进行拆分。

![Pasted Graphic 109](https://user-images.githubusercontent.com/10376496/184536642-22a739dc-6ad8-4ff7-9605-f669a25abc7b.jpg)

![Pasted Graphic 110](https://user-images.githubusercontent.com/10376496/184536645-53f918b6-27e9-43a0-9b03-2d40a9722a26.jpg)

![Pasted Graphic 111](https://user-images.githubusercontent.com/10376496/184536648-14f54fa0-6faf-493d-aaf5-34abcb93c417.jpg)

![Pasted Graphic 112](https://user-images.githubusercontent.com/10376496/184536652-dafafd1a-4faa-4558-9131-430934bebbf1.jpg)

![Pasted Graphic 113](https://user-images.githubusercontent.com/10376496/184536655-207b6207-dd47-4322-84e4-7d3b7f3371cf.jpg)

![Pasted Graphic 114](https://user-images.githubusercontent.com/10376496/184536658-dc42b341-b7dd-455b-a71f-ee065162fffe.jpg)

![Pasted Graphic 116](https://user-images.githubusercontent.com/10376496/184536659-de6e3d4e-d20d-4cce-9c28-b2aa34dce82e.jpg)

![Pasted Graphic 117](https://user-images.githubusercontent.com/10376496/184536660-cc8e0f5f-28f3-4721-ae21-75eea5ae6674.jpg)

![Pasted Graphic 118](https://user-images.githubusercontent.com/10376496/184536663-0c4e3d63-1704-4e1b-97f0-ef7b2ac94a16.jpg)

![Pasted Graphic 119](https://user-images.githubusercontent.com/10376496/184536667-81154c0a-ea21-4b33-a37c-dc0ed646ba07.jpg)



* RPC 和微服务


RPC 是远程过程调用(Remote Procedure Call)的缩写形式。 
简单来说，就是“像调用本地方法一样调用远程方法”。
UserService service = new UserService(); User user = service.findById(1); 
UserService service = Rpcfx.create(UserService.class, url); User user = service.findById(1); 

![Pasted Graphic 120](https://user-images.githubusercontent.com/10376496/184538150-027cf716-0ac3-416b-9f75-0cb63f834f53.jpg)

![Pasted Graphic 121](https://user-images.githubusercontent.com/10376496/184538153-5b8ed2c2-609b-43af-8c55-d2559459dd69.jpg)

RPC 原理--1.设计 

共享:POJO 实体类定义，接口定义。 
REST/PB下，真的不需要嘛?另一种选择:WSDL/WADL/IDL 远程->服务提供者，本地->服务消费者。 
------------ rpcfx 里的 api 子项目 


RPC 原理--2.代理 RPC 是基于接口的远程服务调用。 
Java 下，代理可以选择动态代理，或者 AOP 实现 
------------ rpcfx 里的 默认使用动态代理 


RPC 原理--3.序列化 序列化和反序列化的选择: 
1、语言原生的序列化，RMI，Remoting 2、二进制平台无关，Hessian，avro，kyro，fst 等 3、文本，JSON、XML 等 
------------ rpcfx 里的默认使用 JSON 

RPC 原理--4.网络传输 最常见的传输方式: 
- TCP/SSL - HTTP/HTTPS ------------ rpcfx 里的默认使用 HTTP 

RPC 原理--5.查找实现类 通过接口查找具体的业务服务实现。 
------------ rpcfx 里的默认使用 Spring getBean 

![Pasted Graphic 122](https://user-images.githubusercontent.com/10376496/184538161-501636aa-e2d2-49c0-bffa-cae035e2557d.jpg)

![Pasted Graphic 123](https://user-images.githubusercontent.com/10376496/184538163-634cdc7a-0e7a-4db4-98c0-e946122c47be.jpg)

![Pasted Graphic 124](https://user-images.githubusercontent.com/10376496/184538167-c13bfc2b-1d07-4f8d-97e3-c91ffbedae3c.jpg)

![Pasted Graphic 125](https://user-images.githubusercontent.com/10376496/184538170-5d8302df-800c-4633-98d0-360569738f59.jpg)

![Pasted Graphic 126](https://user-images.githubusercontent.com/10376496/184538175-4958ce33-79d1-4176-9ebd-42e025e3fe54.jpg)

整体架构 
1. config 配置层:对外配置接口，以 ServiceConfig, ReferenceConfig 为中心，可以直接初始化配置类， 也可以通过 spring 解析配置生成配置类 
2. proxy 服务代理层:服务接口透明代理，生成服务的客户端 Stub 和服务器端 Skeleton, 以 ServiceProxy 为中心，扩展接口为 ProxyFactory 
3.registry 注册中心层:封装服务地址的注册与发现，以服务 URL 为中心，扩展接口为 RegistryFactory, Registry, RegistryService 
4. cluster 路由层:封装多个提供者的路由及负载均衡，并桥接注册中心，以 Invoker 为中心，扩展接口为 Cluster，Directory，Router，LoadBalance 
5. monitor 监控层:RPC 调用次数和调用时间监控，以 Statistics 为中心，扩展接口为 MonitorFactory, Monitor, MonitorService 
6. protocol 远程调用层:封装 RPC 调用，以 Invocation，Result 为中心，扩展接口为 Protocol， Invoker，Exporter 
7. exchange 信息交换层:封装请求响应模式，同步转异步，以 Request，Response 为中心，扩展接口为 Exchanger，ExchangeChannel，ExchangeClient，ExchangeServer 
8. transport 网络传输层:抽象 mina 和 netty 为统一接口，以 Message 为中心，扩展接口为 Channel， Transporter，Client，Server，Codec 
9. serialize 数据序列化层:可复用的一些工具，扩展接口为 Serialization，ObjectInput， ObjectOutput， ThreadPool 

![Pasted Graphic 127](https://user-images.githubusercontent.com/10376496/184538187-d2df5e6f-1075-4ef8-b8c9-eadb36aa49ff.jpg)

![Pasted Graphic 130](https://user-images.githubusercontent.com/10376496/184538194-4fa89fd8-75e9-47a1-9b54-9e8f655ec783.jpg)

![Pasted Graphic 129](https://user-images.githubusercontent.com/10376496/184538197-a18a7fbd-7b38-44d2-8e5f-64e14c681fab.jpg)

![Pasted Graphic 128](https://user-images.githubusercontent.com/10376496/184538203-d1160e0c-4bcf-4eca-a443-8717a91681c5.jpg)

![Pasted Graphic 131](https://user-images.githubusercontent.com/10376496/184538206-67a75985-d6a5-41c4-bc27-eada8dcc3244.jpg)

![Pasted Graphic 132](https://user-images.githubusercontent.com/10376496/184538208-9b9f2d1a-9848-4f0f-8179-fffee3133795.jpg)

配置中心(ConfigCenter):管理系统需要的配置参数信息 
注册中心(RegistryCenter):管理系统的服务注册、提供发现和协调能力 
元数据中心(MetadataCenter):管理各个节点使用的元数据信息 
相同点:都需要保存和读取数据/状态，变更通知 不同点:配置是全局非业务参数，注册中心是运行期临时状态，元数据是业务模型 

服务注册 
服务提供者启动时， - 将自己注册到注册中心(比如 zk 实现)的临时节点。 
- 停止或者宕机时，临时节点消失 

注册的数据格式 
- 节点 key，代表当前服务(或者服务+版本) 
- 多个子节点，每一个为一个提供者的描述信息 


服务发现 
服务消费者启动时， - 从注册中心代表服务的主节点拿到多个代表提供者的临时节点列表，并本地缓存(why???)。 - 根据 router 和 loadbalance 算法从其中的某一个执行调用。 - 如果可用的提供者集合发生变化时，注册中心通知消费者刷新本地缓存的列表。 例如 zk 可以使用 curator 作为客户端操作。 

服务集群 
多个服务提供者都提供了同样的服务，这时应该如何处理? >> 大家回忆一下，我们提到了多少种处理方式。 对于完全相同能力的多个服务，我们希望他们能一切协同工作，分摊处理流量。 
- 路由 - 负载均衡 

服务路由(Service Route) 跟网关的路由一样 
1、比如基于 IP 段的过滤， 2、再比如服务都带上 tag，用 tag 匹配这次调用范围。 


服务负载均衡(Service LoadBalance) 跟 Nginx 的负载均衡一样。 
多个不同策略，原理不同，目的基本一致(尽量均匀): 
1、Random(带权重)== dubbo 默认的策略 
2、RoundRobin(轮询) 3、LeastActive(快的多给) 
4、ConsistentHashLoadBalance(同样参数请求到一个提供者 


服务过滤 
所有的复杂处理，都可以抽象为管道+过滤器模式(Channel+Filter) 这个机制是一个超级 bug 的存在， 可以用来实现额外的增强处理(类似 AOP)，也可以中断当前处理流程，返回特定数据。
对比考虑一下，我们 NIO 网关时的 filter，servlet 的 filter 等。 

为什么需要服务流控(Flow Control) 
稳定性工程: 
1、我们逐渐意识到一个问题:系统会故障是正常现象，就像人会生病 2、那么在系统出现问题时，直接不服务，还是保持部分服务能力呢? 
系统的容量有限。
保持部分服务能力是最佳选择，然后在问题解决后恢复正常状态。
响应式编程里，这就是所谓的回弹性(Resilient)。 需要流控的本质原因是，输入请求大于处理能力。 

服务流控 
流控有三个级别: 
1、限流(内部线程数，外部调用数或数据量) 
2、服务降级(去掉不必要的业务逻辑，只保留核心逻辑) 
3、过载保护(系统短时间不提供新的业务处理服务，积压处理完后再恢复输入请求) 



* 分布式缓存

![Pasted Graphic 133](https://user-images.githubusercontent.com/10376496/184538220-42dd79fb-f278-43b6-b091-d0ec04a11f37.jpg)

![Pasted Graphic 134](https://user-images.githubusercontent.com/10376496/184538226-991f5f7f-669c-4bdc-8b71-23913093188e.jpg)

![Pasted Graphic 135](https://user-images.githubusercontent.com/10376496/184538232-db6512ef-5fa3-4b11-ab26-ffc9770693da.jpg)


容量 
资源有限
- 缓存数据容量是必须要考虑的问题
- 思考系统的设计容量、使用容量、峰值，应该是我们做架构设计的一个常识 


过期策略 
- 按FIFO或LRU
- 按固定时间过期
- 按业务时间加权:例如3+5x 

![Pasted Graphic 136](https://user-images.githubusercontent.com/10376496/184538260-8c514bfd-f55f-4c21-8e60-c1e4908ac02e.jpg)

![Pasted Graphic 136](https://user-images.githubusercontent.com/10376496/184538293-0e103059-b7d7-4ac3-ae08-6bcce4ce7965.jpg)


![Pasted Graphic 136](https://user-images.githubusercontent.com/10376496/184538277-7adf7bfd-0016-468b-8845-2d21376f53c1.jpg)


![Pasted Graphic 139](https://user-images.githubusercontent.com/10376496/184538282-e719ab55-437b-4818-be7a-df14674790f2.jpg)

![Pasted Graphic 140](https://user-images.githubusercontent.com/10376496/184538307-d5404abc-01e6-475f-aeab-515639686102.jpg)

![Pasted Graphic 141](https://user-images.githubusercontent.com/10376496/184538310-b97e7dd2-9710-4a2d-981b-b0feea350c7a.jpg)

![Pasted Graphic 142](https://user-images.githubusercontent.com/10376496/184538316-08d3779e-a58d-4a1c-bf0b-68bd1c86eff6.jpg)

![Pasted Graphic 143](https://user-images.githubusercontent.com/10376496/184538321-278d4db3-4801-4f8c-891e-4f72cd44c974.jpg)

![Pasted Graphic 144](https://user-images.githubusercontent.com/10376496/184538323-9f25d630-41f2-4e14-8d84-09dd8eba0d72.jpg)

![Pasted Graphic 145](https://user-images.githubusercontent.com/10376496/184538325-13b7c4f9-398b-4616-b018-c1475c59e8f6.jpg)

![Pasted Graphic 147](https://user-images.githubusercontent.com/10376496/184538329-a10cb68a-65e1-48a2-a522-5f2152caa87e.jpg)

![Pasted Graphic 148](https://user-images.githubusercontent.com/10376496/184538335-c79ac9a9-8d7f-4035-a4d0-b6a475260884.jpg)

![Pasted Graphic 149](https://user-images.githubusercontent.com/10376496/184538338-8287e0ae-0e1d-466e-9b3c-8f40300b1d69.jpg)

![Pasted Graphic 150](https://user-images.githubusercontent.com/10376496/184538339-622f84d4-b273-4968-a866-8ab04b26b1e4.jpg)

![Pasted Graphic 146](https://user-images.githubusercontent.com/10376496/184538341-e11bb9fa-b7c5-41ce-89ac-f43b743b164b.jpg)


Redis 的 Java 客户端-Jedis 官方客户端，类似于 JDBC，可以看做是对 redis 命令的包装。 
基于 BIO，线程不安全，需要配置连接池管理连接。 

![Pasted Graphic 152](https://user-images.githubusercontent.com/10376496/184538346-589532f3-5b96-46d2-9dfa-16890d4a6fe8.jpg)

![Pasted Graphic 151](https://user-images.githubusercontent.com/10376496/184538350-17b097a7-f076-45f1-936a-f0153dd828b0.jpg)

![Pasted Graphic 153](https://user-images.githubusercontent.com/10376496/184538353-268a24ee-40bb-4c6a-847a-167d4219e02e.jpg)




* 分布式消息队列


![Pasted Graphic 154](https://user-images.githubusercontent.com/10376496/184538358-29f32dd2-8815-41f2-8d63-725af4fa893f.jpg)

![Pasted Graphic 155](https://user-images.githubusercontent.com/10376496/184538366-8e596329-3748-4272-8f1c-a1f41e21874a.jpg)

MQ 的四大作用 对比其他通信模式，MQ 的优势在于: 
- 异步通信:异步通信，减少线程等待，特别是处理批量等大事务、耗时操作。
- 系统解耦:系统不直接调用，降低依赖，特别是不在线也能保持通信最终完成。 
- 削峰平谷:压力大的时候，缓冲部分请求消息，类似于背压处理。
- 可靠通信:提供多种消息模式、服务质量、顺序保障等 


![Pasted Graphic 156](https://user-images.githubusercontent.com/10376496/184538382-6a96f17d-24b1-46eb-9b54-ab6f072fa19a.jpg)

![Pasted Graphic 157](https://user-images.githubusercontent.com/10376496/184538385-1ff5850c-48c3-4db2-9b40-c81cfd46aa59.jpg)

![Pasted Graphic 158](https://user-images.githubusercontent.com/10376496/184538388-b06419ed-418d-47ca-ad35-69685356395e.jpg)

![Pasted Graphic 159](https://user-images.githubusercontent.com/10376496/184538390-2ab9ade2-b533-4fb7-abf9-e8e9ff6aebbe.jpg)

![Pasted Graphic 160](https://user-images.githubusercontent.com/10376496/184538392-28e0cd0e-5230-4cdc-beb8-79ab82752293.jpg)

![Pasted Graphic 161](https://user-images.githubusercontent.com/10376496/184538400-de1c9d20-5b84-47ee-81d2-db5863c273ec.jpg)

![Pasted Graphic 162](https://user-images.githubusercontent.com/10376496/184538404-f7b2143c-a9f5-4baa-882e-3e876c062b2c.jpg)

![Pasted Graphic 163](https://user-images.githubusercontent.com/10376496/184538405-563bc542-a87c-4cfb-9208-1d973946326a.jpg)

![Pasted Graphic 164](https://user-images.githubusercontent.com/10376496/184538409-cacb18c3-6578-40b7-8258-7eb1b8352106.jpg)


### 毕业总结

核心技术点感觉在RPC和微服务部分，Spring和ORM等框架用于服务和实例创建以及Mybatis等ORM技术用于与数据库对接，其他例如数据库分库分表、分布式缓存和分布式消息队列主要目的在于对流量进行拆分，多线程并发编程与NIO主要用于多任务处理主要是提高CPU使用效率和网络等待时间，JVM调优则用于了解类加载机制与GC调优。

感谢老师和助教以及班主任和其他人的在课程中的帮助。 All the best.

