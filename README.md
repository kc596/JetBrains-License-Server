# JetBrains-License-Server

## About ths project
this project is written by suimg (chinese)
and i'm a java program engineer work in Bei Jing
so this project originally is used for myself
but in the near future.When I looked at the program log, I found many foreign IPs.
So I decided to bring this originally open source project to GitHub.I hope to help more foreigners.
Project in China: https://gitee.com/Suimg/JetBrains-License-Server.git
If you want to know more information, you can also visit my personal website https://www.suimg.cn I look forward to your visit.
And if you have WeChat or QQ you can also add me as a friend.
WeChat: smg_pub
QQ: 2544976756
Remarks: From GitHub

## About the new version of the editor can not be activated
* Due to changes in the activation system of JetBrains' new editor, the program is not available in the new version.
* The key was obtained after downloading the activation program, but now you must purchase the certificate through the official channel.
* One thing worth celebrating is that the official website supports historical versions of downloads and non-mandatory upgrades, so this program is still available for editors prior to 2018.2.


#### Project Introduction
JetBrains-License-Server
IDEA, PHPStorm, WebStorm and other editors activate server source code

#### Software Architecture
Framework using Spring Boot + Spring MVC
No other business processing logic, the code is simple and clear
The general principle in one sentence is:
During the activation process, an interface is accessed, and the interface returns an XML to the XML to complete the activation using the PEM private key signature.
The signing certificate is decompiled from https://www.jetbrains.com/help/license_server/downloading.html
I want to try the children's shoes that I want to challenge. I think it is quite difficult. [:funny]

The 2.0 version optimizes and succinctly processes the program, and the pom file is reduced to the extreme. The code of the program is also more simple and easy to understand.


#### Dependent environment

1. JDK1.8
2. Maven

#### Instructions for use

1. git clone https://github.com/SuimgCn/JetBrains-License-Server.git
2. cd JetBrains-License-Server
3. mvn package
4. java -Dserver.port=80 -jar target/license-server.jar suimg


#### Background process
##### starting program
1. nohup java -Dserver.port=80 -jar target/license-server.jar suimg >ls.log 2>&1 &
##### Ending the program
1. ps -def |grep target/license-server.jar|awk '{print $2}'|xargs kill -9


#### Precautions
1. This activation procedure does not apply to any version of 2018.2 and later
2. This project was rebuilt by @Suimg on September 24, 2018. The previous code has been marked as version 1.0.
3. About the command to start the project You can configure the port bound by the project with the -Dserver.port parameter. The parameter after the jar is the authorized user name.
4. The authorized user name cannot be Chinese or the authorized user will be empty or not displayed.
5. For more details and introduction, please go to https://www.suimg.cn/idea.do

##### About Open Source License Agreement
* Honestly, I don't know much about this open source protocol. I didn't care about this when I created this project. I just thought that Apache is familiar. So I chose Apache 2.0 as the open source protocol.
* Actually, I feel more like BSD, Emmmm. I am not very clear about this. Don't care about this.
