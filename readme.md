# 大202 2020310853
## 一、目的
掌握对象传值的影响，并修改程序，实力化多个Lake对象，同一Fish对象均setFish 其中，通过调用输出方法，查看weight的变化情况。
## 二、对象传值
#### 个人理解
引用传递是指向真实内容的地址值，在方法调用时，实参地址被传递给形参，在方法体中实参和形参指向同一块内存地址，对形参操作会影响实参。
##三、 代码结合
1. 首先实力化了一个Fish对象niqiu，并输出此时其重量。
```java
        Fish niqiu = new Fish();
        System.out.println("泥鳅：" +niqiu.weight);//输出1
```
2. 然后，将niqiu通过Lake中setfish方法放入其中，并用eat方法增重，显示此时taihu中taihu中niqiu重量以及niqiu本身就是重量。
```java
		Lake taihu  = new Lake();
		taihu.setFish(niqiu);
		taihu.eat(15);
		System.out.println("泥鳅：" +niqiu.weight);//输出2
		System.out.println("太湖里的泥鳅：" +taihu.fish.weight);//输出3
```
3. 再实力化另一个Lake对象lake1，将niqiu放入其中，同样用eat方法增重，显示此时taihu中，lake1中niqiu，以及niqiu本身的重量。
```java
        Lake lake1 = new Lake();
		lake1.setFish(niqiu);
		lake1.eat(215);
		System.out.println("泥鳅：" + niqiu.weight);//输出4
		System.out.println("lake1里的泥鳅：" +lake1.fish.weight);//输出5
		System.out.println("太湖里的泥鳅：" +taihu.fish.weight);//输出6
```
4. 对比发现，当对象在方法中做形参时，实际指向了实参的地址，因此，在方法调用时，改变形参的同时也改变了实参。不仅如此，还同时改变了同样指向这一地址的其他类里面的该对象。
## 四、运行截图
![](https://github.com/Minomeis/Java-Homework1025/blob/master/001.jpg)
