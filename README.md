# smallservice
微服务
什么是微服务
问服务之间是如何独立通信的
springcloud和dubbo有哪些区别
springboot和springcloud请你谈谈对他们的理解
什么是服务熔断？什么是服务降级
微服务的优缺点分别是什么？说下你在项目开发中碰到的坑
你所知道的微服务技术栈有哪些
eureka和zookeeper都可以提供服务注册与发现的功能，请说说两个的区别

原来使用 dobbo zookeeper nginx等等来实现微服务架构

springcloud=分布式微服务架构下的一站式解决方案，是各个微服务架构落地技术的集合体，俗称微服务全家桶

springboot关注的微观 是对于一个个不同的微服务 
springcloud关注宏观的微服务协调整理治理框架，它将springboot开发的一个个单体微服务整合并管理起来



在学习基础上加上了自己的一些配置如 tk.mapper 和 mybatis自动生成相关文件等 并把数据库交互层抽取到api中


Eureka：
是什么       Netflix在设计eureka的时候遵循的是AP原则
原理讲解
构件步骤
集群配置
作为服务注册中心 eureka和zookeeper有什么区别

Eureka是netflix的子模块，也是核心模块之一。eureka是一个基于rest的服务
用户定位服务，以云端中间层服务发现和故障转移、服务注册与发现对于微服务架构来说是非常重要的，
有了服务发现与注册，只需要使用服务的标识符，就可以访问到服务，而不需要修改服务调用的配置文件了。功能类似于dubbo的注册中心，比如zookeeper


# springboot2以上的eureka的artifactId是spring-cloud-starter-netflix-eureka-server

# 记笔记的节数 26节 eureka自我保护  29节 eureka 为什么比zookeeper好
