Flowable (V6)
========






# -----------------以下为我摸到的石头--------------------

![Image text](https://github.com/dianbuliang/flowable-root/raw/master/zimages/0.png)

![Image text](https://github.com/dianbuliang/flowable-root/raw/master/zimages/熊猫.jpg)

### 环境

​	**IntelliJ IDEA + MAVEN3.6 + JDK1.8(官方也用这个)**

### 如何跑起来

​	**下载代码，目录如下（图1）：**

​	![Image text](https://github.com/dianbuliang/flowable-root/raw/master/zimages/1.png)

​	**modules目录如下（图2）：**

​	![Image text](https://github.com/dianbuliang/flowable-root/raw/master/zimages/2.png)

***第一次打开此目录时，有的文件夹不是黑的，那是因为对应pom文件还没有被MAVEN管理。**

***将所有pom文件导入MAVEN，有的文件夹下面有多个pom 如（图3）：**

![Image text](https://github.com/dianbuliang/flowable-root/raw/master/zimages/3.png)

​	**所以切记仔细，把所有的都导入，全部导入后图2中区域2应有 156 个文件（好像还有一个文件夹）**

------



#### 	尝试启动

​	**1.先启动flowable-idm模块(看图4)**

​		![Image text](https://github.com/dianbuliang/flowable-root/raw/master/zimages/4.png)

​			**没错，用springboot的启动类启动。运行启动类后会发现少了很多jar包（图5）**

​		**TO BE CONTINUE......**











### 更换数据库

​	**源码默认使用的是H2数据库，我要换成MySQL数据可（换成别的也类似）**

​	**以flowable-idm模块为例：**

​	**（图5）**

​	![Image text](https://github.com/dianbuliang/flowable-root/raw/master/zimages/5.png)

​	**（图6）**

![Image text](https://github.com/dianbuliang/flowable-root/raw/master/zimages/6.png)

**图5、图6将MySQL连接的依赖引入，不做这些会报mysql驱动用不了的异常**

**更改配置文件（图7）**

![Image text](https://github.com/dianbuliang/flowable-root/raw/master/zimages/7.png)

**好啦，配完了，可以启动了。**





 

