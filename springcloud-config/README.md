config 分布式配置中心服务端
    GitHub 创建 springcloud-config-github 项目
    远程配置 https://github.com/DaveWPW/springcloud-config-github
    
    在 Application 主配置类添加 @EnableConfigServer 注解
    在 application 配置文件添加
    spring:
      application:
        name: springcloud-config
      cloud:
        config:
          label: master
          server:
            git:
              uri: https://github.com/DaveWPW/springcloud-config-github
              search-paths: respo
              username: DaveWPW
              password: 
    server:
      port: 8888
    必须指定端口号8888，如需修改添加 bootstrap.yml 配置文件添加修改端口号配置