# MyLearning
`Aiming` `Learning` `JavaWeb` `Java Base` `Java-接口` `Java-多态`
@[toc]
## 一、开发前言
### 1.1Java语言概述
<h4>什么是Java语言</h4>

>Java语言是美国Sun公司（Stanford University Network），在1995年推出的高级的编程语言。所谓编程语言，是计算机的语言，人们可以使用编程语言对计算机下达命令，让计算机完成人们需要的功能。

<h4>Java语言发展历史</h4>

<li>1995年Sun公司发布Java1.0版本</li>
<li>1997年发布Java 1.1版本</li>
<li>1998年发布Java 1.2版本</li>
<li>2000年发布Java 1.3版本</li>
<li>2002年发布Java 1.4版本</li>
<li>2004年发布Java 1.5版本</li>
<li>2006年发布Java 1.6版本</li>
<li>2009年Oracle甲骨文公司收购Sun公司，并于2011发布Java 1.7版本</li>
<li>2014年发布Java 1.8版本</li>
<li>2017年发布Java 9.0版本</li>

<h4>Java语言能做什么</h4>

>Java语言主要应用在互联网程序的开发领域。常见的互联网程序比如天猫、京东、物流系统、网银系统等，以及服务器后台处理大数据的存储、查询、数据挖掘等也有很多应用。

### 1.2 计算机基础知识
<h4>二进制</h4>

>计算机中的数据不同于人们生活中的数据，人们生活采用十进制数，而计算机中全部采用二进制数表示，它只包含0、1两个数，逢二进一，1+1=10。每一个0或者每一个1，叫做一个bit（比特）。
下面了解一下十进制和二进制数据之间的转换计算。
><li><strong>十进制数据转成二进制数据：</strong>使用除以2获取余数的方式</li>
>6 = 2<sup>2</sup> + 2 + 0 = (110)<sub>2</sub></br>
><li><strong>二进制数据转成十进制数据：</strong>使用8421编码的方式</li>
>(1001011)<sub>2</sub> = (64 + 0 + 0 + 8 + 4 + 2 + 1)<sub>10</sub> = (75)<sub>10</sub></br>

><strong>Tips: & </strong>二进制数系统中，每个0或1就是一个位，叫做bit（比特）

## 二、Java语言开发环境搭建
### 2.1 Java虚拟机————JVM
<ul>
<li><strong>JVM</strong>（Java Virtual Machine ）：Java虚拟机，简称JVM，是运行所有Java程序的假想计算机，是Java程序的运行环境，是Java 最具吸引力的特性之一。我们编写的Java代码，都运行在 `JVM` 之上。</li>
<li><strong>跨平台</strong>：任何软件的运行，都必须要运行在操作系统之上，而我们用Java编写的软件可以运行在任何的操作系统上，这个特性称为<strong>Java语言的跨平台特性</strong>。该特性是由JVM实现的，我们编写的程序运行在JVM上，而JVM运行在操作系统上。
</li>
</ul>

![Java基于不同平台的虚拟机](https://img-blog.csdnimg.cn/20191108003927585.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQxNzg4Nzg2,size_16,color_FFFFFF,t_70)  

### 2.2 JRE 和 JDK

<ul>
<li><strong>JRE</strong>(Java Runtime Environment) ：是Java程序的运行时环境，包含 `JVM` 和运行时所需要的 `核心类库` 。</li>
<li><strong>JDK</strong>(Java Development Kit)：是Java程序开发工具包，包含 `JRE` 和开发人员使用的工具。
</li>
</ul>
我们想要运行一个已有的Java程序，那么只需安装 `JRE` 即可。</br>
我们想要开发一个全新的Java程序，那么必须安装 `JDK` 。
