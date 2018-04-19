# spring-cloud


 **此项目供本人学习使用：**
 
   #### 1.项目说明
         
         本项目主要快速搭建spring-cloud项目（从https://github.com/dyc87112/SpringCloud-Learning上学习）
    ，包含了
    
      (1) 服务（server）注册：a.用Eurake 实现
                            b. 用consul实现
      
      (2) 消费者：a.用Cloud提供的负载均衡器客户端接口来实现服务的消费  
                 b.集成Ribbon来实现服务的消费
                 c.集成Feign来实现服务的消费
             
     仅点到知识点，具体使用还需要逐个深入学习    
        
   #### 2.安装依赖
       
       本地需要安装jdk、maven等 基础工具
       
   #### 3.文件说明
       
       pom.xml  项目maven依赖包。
       .gitignore  git不提交文件
   
   #### 4.目录说明 
   
        database为数据库脚本文件；
   
        以下为目录结构,按照如下目录结构的顺序往下看
   
   _目录结构：_ 
     
      
      ├──eureka-server             //Eurake服务注册中心
      │
      ├──eureka-client             //用Eurake服务注册方式的客户端，即服务提供方
      │  
      ├──eureka-client-consul      //用consul服务注册方式的客户端，即服务提供方
      │
      ├──eureka-consumer           //用Cloud提供的负载均衡器客户端接口来实现服务的消费，服务消费者
      │
      ├──eureka-consumer-ribbon    //用ribbon实现服务的消费，服务消费者
      │
      ├──eureka-consumer-feign     //用feign实现服务的消费，服务消费者
      │

      
   
   