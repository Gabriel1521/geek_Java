

2.（必做）写代码实现 Spring Bean 的装配，方式越多越好（XML、Annotation 都可以）, 提交到 GitHub。

通过applicationContext.xml定义bean
然后在SpringDemo01里加载context

ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

然后加载bean

Student student123 = (Student) context.getBean("student123");


8.（必做）给前面课程提供的 Student/Klass/School 实现自动配置和 Starter。

通过
private String beanName;
private ApplicationContext applicationContext;
引入自动配置信息和starter


10.（必做）研究一下 JDBC 接口和数据库连接池，掌握它们的设计和用法

在druid.properties上配置jdbc连接信息
然后用jdbc_conn里的TestDruid加载jdbc建立数据库连接池
