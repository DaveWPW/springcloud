zull API网关
    Zuul 的主要功能是路由转发和过滤器。路由功能是微服务的一部分，
比如 /api/user 转发到到 User 服务，/api/shop 转发到到 Shop 服务。
Zuul 默认和 Ribbon 结合实现了负载均衡的功能。

    在 Application 主配置类添加 @EnableEurekaClient 表示 Eureka 提供者, 
    @EnableZuulProxy 注解。
    在 application.yml 配置文件添加路由配置
    zuul:
      routes:
        api-a:
          path: /api/a/**
          serviceId: springcloud-web-admin-ribbon
        api-b:
          path: /api/b/**
          serviceId: springcloud-web-admin-feign
          
zull 配置网关路由失败时回调

    添加组件类实现 FallbackProvider 接口
    
zull 实现路由网关的服务过滤功能

    添加组件类实现 ZuulFilter 抽象类