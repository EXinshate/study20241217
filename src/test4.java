// 定义Dog类，表示狗的信息
class Dog {
    private String name;  // 声明姓名私有属性
    private int age;      // 声明年龄私有属性

    // 构造方法，用于初始化成员属性
    public Dog(String str, int n) {
        name = str;  // 将传入的名字参数赋值给name属性
        age = n;     // 将传入的年龄参数赋值给age属性
    }

    // 定义显示信息的方法，用于输出狗的名字和年龄
    public void show() {
        System.out.println("名字：" + name + ", 年龄：" + age);  // 打印狗的名字和年龄到控制台
    }
}

// 测试类，用于创建Dog对象并调用其方法
public class test4 {
    public static void main(String[] args) {
        // 创建一个Dog对象，并传递参数给构造方法
        // Dog d = new Dog();  // 这一行被注释掉了，因为没有无参构造函数，直接使用带参数的构造方法
        Dog d = new Dog("旺财", 5);  // 创建一个名为“旺财”，年龄为5岁的狗对象

        // 调用show方法显示狗的信息
        d.show();  // 输出：名字：旺财, 年龄：5
    }
}