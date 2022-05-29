## Module03

### 1.思考有多少种方式，在main函数启动一个新线程，运行一个方法，拿到这 个方法的返回值后，退出主线程？


使用countdownlatch





使用semaphore


设定semaphore，worker数量为2

从低到高调用fib

直到执行到最后第36个线程返回结果

改进版本：

使用dp和arr来存储之前结果，但是需要等待之前子线程结束，速度快大概10倍但是有时候因为没等子线程结束有时会造成结果不正确




### 6.（必做）把多线程和并发相关知识梳理一遍，画一个脑图，截图上传到 GitHub 上。 可选工具:xmind，百度脑图，wps，MindManage，或其他。

#### 多线程工具

![Pasted Graphic 2](https://user-images.githubusercontent.com/10376496/170873742-c52527f9-e2b7-4cba-b783-d31ad29f5b03.jpg)


#### 锁

用于线程并发协作

![Pasted Graphic 4](https://user-images.githubusercontent.com/10376496/170873766-1a090781-a2d0-48cc-858f-1cf0f0b17cb5.jpg)

可重入锁，公平锁
读写锁分离，Condition将大锁拆分成小锁

注意：

- 降低锁的范围
- 细分锁的粒度，拆分锁

#### 原子类

并发计数器

![Pasted Graphic 3](https://user-images.githubusercontent.com/10376496/170873794-2cf877a5-7c94-4a1b-9b82-cf8dc7d29819.jpg)



CAS乐观锁 - 只在写上加锁，写的进程会在写入数据的时候检查读取的数据是否有变化，如果有变化重新读取计算，再重新写入

在并发量不太大的情况下CAS和无锁成本更低更高效一些


![Pasted Graphic 5](https://user-images.githubusercontent.com/10376496/170873812-cc2d2019-b82c-4667-9662-72d3aa407d78.jpg)

#### AQS

- Semaphore
- Countdownlatch
- CyclicBarrier


信号量

控制同一时间并发线程数

![Pasted Graphic 6](https://user-images.githubusercontent.com/10376496/170873848-1cfc43a4-44a8-4a15-a2aa-709a0f9ee35e.jpg)



#### Future/Callable

返回数据和错误封装到Future里返回

![Pasted Graphic 7](https://user-images.githubusercontent.com/10376496/170873864-0abed244-0b28-4e19-b1cc-c746ca9872d2.jpg)



#### 各数据类型并发安全分析


![Pasted Graphic](https://user-images.githubusercontent.com/10376496/170872982-3a0219b7-6699-4845-95a6-26b391d75e40.jpg)


![Pasted Graphic 1](https://user-images.githubusercontent.com/10376496/170872975-41a30692-30cd-4406-b4b6-0142302191f6.jpg)
