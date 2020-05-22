# action08-log-trace

#### 介绍
日志聚合和链路追踪，基于Spring Cloud Sleuth 和 Zipkin 

### 说明文档

[链路追踪](https://www.yuque.com/faury/ufigmz/ungx9m)

[日志聚合](https://www.yuque.com/faury/ufigmz/qhv7hg)

### 上面为原有的作者模块，我新增加了zipkinserver模块，新加的功能：
### 1.zipkin数据存储到es（调用链日志） topic zipkin
### 2.增加logback日志（业务日志）发送的kafka然后通过logstash存储到es中 topic buslog
### 想要达到的效果是：
### 1.通过zipkinserver能看出整个调用链的过程
### 2.通过业务日志看出业务相关信息

![image text] (https://github.com/mushang8923/zipkin/blob/master/bus.png)

### 然后通过kibana查看相关的日志信息，通过zipkinui查看调用链信息
### logstash 配置文件如下
##### input {
#####    kafka {
#####        bootstrap_servers => "127.0.0.1:9092"
#####        topics => ["buslog"]
#####        codec => json
#####        }
}
 
output {
    elasticsearch {
#####        hosts => ["127.0.0.1:9200"]
#####        index => "buslog"
#####    }
#####    stdout{
#####        codec=>rubydebug
#####    }
#####}

