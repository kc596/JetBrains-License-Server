# JetBrains-License-Server

#### 项目介绍
JetBrains-License-Server
IDEA,PHPStorm,WebStorm 等编辑器激活服务器源代码

#### 软件架构
框架采用Spring Boot+Spring MVC
无任何业务其他处理逻辑，代码简洁清晰
一句话概括原理就是:
激活的过程中会访问一个接口，然后这个接口返回一个XML 给这个XML使用PEM私钥签名 就完成激活。
签名证书反编译自 https://www.jetbrains.com/help/license_server/downloading.html
想挑战的童鞋可以试试，我觉得还是挺有难度的。[:滑稽]


#### 依赖环境

1. JDK1.8
2. Maven

#### 安装说明

1. git clone https://gitee.com/Suimg/JetBrains-License-Server.git
2. cd JetBrains-License-Server
3. mvn package
4. java -jar target/license-server.jar

#### 参与贡献

1. Fork 本项目
2. 新建 Feat_xxx 分支
3. 提交代码
4. 新建 Pull Request


#### 码云特技

1. 使用 Readme\_XXX.md 来支持不同的语言，例如 Readme\_en.md, Readme\_zh.md
2. 码云官方博客 [blog.gitee.com](https://blog.gitee.com)
3. 你可以 [https://gitee.com/explore](https://gitee.com/explore) 这个地址来了解码云上的优秀开源项目
4. [GVP](https://gitee.com/gvp) 全称是码云最有价值开源项目，是码云综合评定出的优秀开源项目
5. 码云官方提供的使用手册 [http://git.mydoc.io/](http://git.mydoc.io/)
6. 码云封面人物是一档用来展示码云会员风采的栏目 [https://gitee.com/gitee-stars/](https://gitee.com/gitee-stars/)