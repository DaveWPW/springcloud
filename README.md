dependencies 管理项目（统一的依赖管理）
eureka 服务注册中心(服务注册与发现)
sercive-admin 服务提供者
web-admin-ribbon 服务消费者（Ribbon）
web-admin-feign 服务消费者（Feign默认集成了Ribbon，并和Eureka结合，默认实现了负载均衡的效果）
web-admin-feign 配置 Hystrix（Feign 是自带熔断器的，但默认是关闭的）
web-admin-feign 配置 Hystrix Dashboard（熔断器仪表盘监控）
zull API网关（Zuul的主要功能是路由转发和过滤器，Zuul默认和Ribbon结合实现了负载均衡的功能）
zull 配置网关路由失败时回调（网关向 api 服务请求失败了，但是消费者客户端向网关发起的请求是成功的，不应该把 api 的 404,500 等问题抛给客户端）
zull 实现路由网关的服务过滤功能
config 分布式配置中心服务端(获取 GitHub 的项目配置)
web-admin-feign 修改 application.yml 配置文件使用 GitHub 云端配置
修改 dependencies 项目添加 ZipKin 依赖、版本号
zipkin 服务追踪（所有被追踪的项目都要添加 zipkin 依赖，添加 zipkin 服务配置）
修改 dependencies 项目添加 Admin Server 依赖、版本号
admin 服务监控 (Spring Boot Admin Server 服务端）