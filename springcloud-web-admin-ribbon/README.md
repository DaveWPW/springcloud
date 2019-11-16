web-admin-ribbon 服务消费者
    Ribbon 是一个负载均衡客户端，可以很好的控制 http 和 tcp 的一些行为。

    在 Application 主配置类添加 @EnableDiscoveryClient 注解
    再添加 RestTemplate 配置类
    在 Service 层实现类调用 RestTemplate 方法
    
Ribbon 使用 Hystrix 熔断器
    
    在 Application 主配置类添加 @EnableHystrix 注解
    在 Service 层实现类的方法上添加 
        @HystrixCommand(fallbackMethod = "熔断后调用的方法名称")
        
熔断器仪表盘监控

    在 Application 主配置类添加 @EnableHystrixDashboard 注解
    再需要添加一个熔断器仪表盘监控配置类