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



* 分布式缓存



* 分布式消息队列
