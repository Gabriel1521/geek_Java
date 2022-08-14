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


* Spring 和 ORM 等框架



* MySQL 数据库和 SQL




