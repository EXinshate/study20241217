class Student{     // 学生类
    String name;   // 姓名
    int age;       // 年龄
}

 class Demo0406 {
    public static void main(String[] args) {

        Student[] stus = new Student[2];         // 创建长度为2的学生数组
        stus[0] = new Student();                 // 为第一个数组元素存储学生对象
        stus[0].name = "张三";                    // 设置学生对象的属性
        stus[0].age = 20;

        stus[1] = new Student();                 // 为第二个数组元素存储学生对象
        stus[1].name = "李四";                    // 设置学生对象的属性
        stus[1].age = 18;

        for(Student s : stus) {                  // 使用foreach循环输出学生对象
            System.out.println(s.name+" "+s.age);
        }


    }
}