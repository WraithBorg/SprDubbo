# Dubbo 与 Spring Cloud 和 nacos的整合

#### Test URL
consumer 127.0.0.1:8080/hello


#### nacos
下载安装nacos服务`https://github.com/alibaba/nacos/releases`  （这里用的是nacos-server-1.1.4）  
启动nacos服务  
`http://127.0.0.1:8848/nacos/#/login`  
默认用户名nacos 默认密码nacos  

#### 测试dubbo
启动DoProviderApplication  
启动DoConsumerApplication  
访问 `127.0.0.1:8080/hello`
