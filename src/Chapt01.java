import java.util.Scanner;

class Demo0307 { // 定义一个名为 Demo0307 的类
    public static void main(String[] args) { // 主方法，程序的入口点
        int num = 0; // 抄写次数初始值为0

        // 当 num 小于 3 时，继续执行循环
        while (num < 3) { // 循环条件为抄写次数不足3
            // 输出诗句
            System.out.print("鹅鹅鹅，曲项向天歌。白毛浮绿水，红掌拨清波。");

            // 循环次数递增
            num++; // 将 num 的值增加 1

            // 输出当前完成的抄写次数
            System.out.println("完成了" + num + "次");
        }
    }
}
class Demo0308 {
    public static void main(String[] args) {
        int sum = 0;        // 初始化和为0，用于存储1到100的累加结果
            int i = 1;          // i为当前需要加到和中的数字，从1开始

        // 使用while循环，条件是i小于等于100
        while (i <= 100) { // 当i的值小于或等于100时，继续执行循环
            sum += i;       // 将当前的i值加到sum中，等价于sum = sum + i
            i++;            // 将i的值增加1，以便在下一次循环中处理下一个数字
        }

        // 循环结束后，输出1到100的和
        System.out.println("1+2+3+…+100的结果：" + sum); // 打印结果
    }
}
class Demo0309 {
    public static void main(String[] args) {
        int sum = 0;          // 初始化和为0，用于存储1到100的累加结果
        int i = 1;            // i为当前需要加到和中的数字，从1开始

        // 使用do-while循环，确保至少执行一次循环体
        do {
            sum += i;         // 将当前的i值加到sum中，等价于sum = sum + i
            i++;              // 将i的值增加1，以便在下一次循环中处理下一个数字
        } while (i <= 100);   // 循环条件：只要i小于或等于100，就继续执行循环

        // 循环结束后，输出1到100的和
        System.out.println("1+2+3+…+100运算结果为：" + sum); // 打印结果
    }
}
class Demo0310 {
    public static void main(String[] args) {
        int sum = 0;  // 初始化和为0，用于存储1到100的累加结果

        // 使用for循环，从1循环到100
        for(int i = 1; i <= 100; i++) {
            sum = sum + i;  // 将当前的i值加到sum中，更新sum的值
        }

        // 循环结束后，输出1到100的和
        System.out.println("1+2+3+…+100运算结果为：" + sum);
    }
}
class Demo0311 {
    public static void main(String[] args) {
        int sum = 0;  // 初始化和为0，用于存储1到100的累加结果
        int i = 1;    // 初始化计数器i为1，从1开始累加

        // 使用for循环，循环条件为i小于等于100
        for( ; i <= 100 ; ) {
            sum = sum + i;  // 将当前的i值加到sum中，更新sum的值
            i++;             // 将i的值增加1，以便在下一次循环中处理下一个数字
        }

        // 循环结束后，输出1到100的和
        System.out.println("1+2+3+…+100运算结果为：" + sum);
    }
}
class Demo0312 {
    public static void main(String[] args) {
        // 外层循环控制行数，从1到9
        for (int i = 1; i <= 9; i++) {
            // 内层循环控制每一行的列数，从1到当前行数i
            for (int j = 1; j <= i; j++) {
                // 输出乘法表的每一项，格式为 "j*i=i*j"
                System.out.print(j + "*" + i + "=" + (i * j) + "  ");
            }
            // 一行结束后换行
            System.out.println();
        }
    }
}
class Demo0313 { // 定义主类
    public static void main(String[] args) { // 主方法，程序的入口点
        Scanner scanner = new Scanner(System.in); // 创建 Scanner 对象以从控制台读取输入
        System.out.println("-------输入学生成绩------"); // 打印输入部分的标题
        System.out.println("输入负数以终止循环。"); // 提示用户如何退出循环

        // 开始一个无限循环，不断提示输入学生成绩
        while (true) {
            System.out.print("请输入学生成绩: "); // 提示用户输入学生成绩

            // 检查下一个输入是否为有效的 double 类型
            if (scanner.hasNextDouble()) {
                double score = scanner.nextDouble(); // 读取输入的成绩为 double 类型

                // 检查成绩是否为负数
                if (score < 0) {
                    break; // 如果成绩为负数，退出循环
                }

                // 打印输入的成绩
                System.out.println("学生成绩为：" + score); // 输出学生的成绩
            } else {
                // 如果输入不是有效的 double 类型，提示用户
                System.out.println("无效输入，请输入一个数字。"); // 打印无效输入的错误信息
                scanner.next(); // 清除 Scanner 中的无效输入
            }
        }

        // 在退出循环后打印终止消息
        System.out.println("循环终止！"); // 输出循环结束的消息
        scanner.close(); // 关闭 Scanner 以释放资源
    }
}
class Demo0314 {
    public static void main(String[] args) {
        // 定义一个标签为 labelName 的代码块
        labelName: {
            int i = 1; // 初始化变量 i 为 1
            System.out.println("代码块语句1....."); // 打印第一条消息

            // 判断 i 是否等于 1
            if (i == 1) { // 这是一个跳转条件
                // 如果条件为真，使用 break 跳出 labelName 标签的代码块
                break labelName;
            }

            // 如果条件不成立，这行代码将会被执行
            System.out.println("代码块语句2....."); // 打印第二条消息
        }

        // 代码块结束后执行的代码
        System.out.println("代码块后续的代码"); // 打印后续消息
    }
}
class Demo0315 {
    public static void main(String[] args) {
        // 初始化变量 x, y, z，初始值均为 1
        int x = 1, y = 1, z = 1;

        // labelX 是一个标签，用于标识外层循环
        labelX: for (x = 1; x < 100; x++) {
            // labelY 是一个标签，用于标识中间层循环
            labelY: for (y = 1; y < 100; y++) {
                // labelZ 是一个标签，用于标识内层循环
                labelZ: for (z = 1; z < 100; z++) {
                    // 如果 x + y + z 的和等于 10，则退出外层循环
                    if (x + y + z == 10) {
                        break labelX; // 退出到 labelX 所在的循环
                    }
                }
            }
        }

        // 输出退出循环时 x, y, z 的值
        System.out.println("退出循环是x为：" + x);
        System.out.println("退出循环是y为：" + y);
        System.out.println("退出循环是z为：" + z);
    }
}
class Demo0316 {
    public static void main(String[] args) {
        System.out.println("-------循环遍历1~10之间的偶数，4不要打印出来------");
        for(int i = 1 ; i <= 10 ; i++){
            if( i%2 != 0){
                continue;
            }
            if( i == 4 ){
                continue;
            }
            System.out.print(i + "\t");
        }
    }
}
class Demo0317 {
    public static void main(String[] args) {
        // 打印九九乘法表的标题
        System.out.println("-------九九乘法表------");

        // 外层循环，控制乘法表的行，i 从 1 到 9
        a: for (int i = 1; i <= 9; i++) {
            // 内层循环，控制乘法表的列，j 从 1 到 10
            b: for (int j = 1; j <= 10; j++) {
                // 打印当前的乘法表达式和结果
                System.out.print(j + "*" + i + "=" + i * j + "\t");

                // 如果 i 等于 j，表示当前行的乘法表已经完成
                if (i == j) {
                    // 打印换行符，准备开始下一行的乘法表
                    System.out.println();
                    // 使用 continue a 跳出内层循环，继续外层循环
                    continue a;
                }
            }
        }
    }
}
class Demo0318 {
    public static void main(String[] args) {
        System.out.println("-------循环遍历1~10，碰到4结束------");
        for(int i = 1 ; i <= 10 ; i++){
            System.out.println(i + "\t");
            if( i == 4 ){
                return;
            }
        }
        System.out.println("循环外的代码");
    }
}