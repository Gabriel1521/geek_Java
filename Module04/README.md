Module03

1.思考有多少种方式，在main函数启动一个新线程，运行一个方法，拿到这 个方法的返回值后，退出主线程？


使用countdownlatch





使用semaphore


设定semaphore，worker数量为2

从低到高调用fib

直到执行到最后第36个线程返回结果

改进版本：

使用dp和arr来存储之前结果，但是需要等待之前子线程结束，速度快大概10倍但是有时候因为没等子线程结束有时会造成结果不正确




6.（必做）把多线程和并发相关知识梳理一遍，画一个脑图，截图上传到 GitHub 上。 可选工具:xmind，百度脑图，wps，MindManage，或其他。




各数据类型并发安全分析

![Pasted Graphic](https://user-images.githubusercontent.com/10376496/170872982-3a0219b7-6699-4845-95a6-26b391d75e40.jpg)


![Pasted Graphic 1](https://user-images.githubusercontent.com/10376496/170872975-41a30692-30cd-4406-b4b6-0142302191f6.jpg)
