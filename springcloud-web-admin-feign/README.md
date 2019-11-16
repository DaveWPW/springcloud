web-admin-feign 服务消费者
    Feign 是一个声明式的伪 Http 客户端，它使得写 Http 客户端变得更简单。
    使用 Feign，只需要创建一个接口并注解。它具有可插拔的注解特性，可使用 Feign 注解
和 JAX-RS 注解。Feign 支持可插拔的编码器和解码器。Feign 默认集成了 Ribbon，并和 
Eureka 结合，默认实现了负载均衡的效果。

    在 Application 主配置类添加 @EnableDiscovryClient 注解
    在 Srvice 接口中添加 @FeignClient(value = "指定提供者应用程序名称")

Feign 使用 Hystrix 熔断器
    服务故障的 “雪崩” 效应，由于网络原因或者自身的原因，服务并不能保证 100% 可用。
    为了解决这个问题，业界提出了熔断器模型。
    Feign 是自带熔断器的，但默认是关闭的。
    
    在 application.yml 配置文件添加以下配置
    feign:
      hystrix:
        enabled: true
    
    在 Service 接口中增加 fallback 指定类, 指定类需实现当前接口
    @FeignClient(value = "指定提供者应用程序名称"
            , fallback = ServiceHystrix.class)
    
熔断器仪表盘监控

    在 Application 主配置类添加 @EnableHystrix, @EnableHystrixDashboard 注解
    再需要添加一个熔断器仪表盘监控配置类