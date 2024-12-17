import java.util.Scanner;

public  class Demo0407 {
    public static void main(String[] args) {
        // 定义输入扫描器对象，用于接受键盘输入
        Scanner sc = new Scanner(System.in);

        // 定义3行2列的二维数组,存储3名学生的2门成绩
        int[][] scores = new int[3][2];
        // 使用嵌套循环的方式为数组赋值, scores.length获取第一维数组的长度
        for(int i = 0; i < scores.length; i++) {
            // scores[i].length获取第二维数组的长度
            for(int j = 0; j < scores[i].length; j++) {
                System.out.println("请输入第" + ( i + 1 ) +
                        "个学生的第" + ( j + 1 ) +
                        "门课成绩:");
                // 将输入的数据存入对应的数组位置
                scores[i][j] = sc.nextInt();
            }
        }

        // 输出分隔符
        System.out.println("====================");

        // 使用嵌套循环的方式访问二维数组元素, scores.length获取第一维数组的长度
        for(int i = 0; i < scores.length; i++) {
            // scores[i].length获取第二维数组的长度
            for(int j = 0; j < scores[i].length; j++) {
                // 获取当前遍历到的二维数组元素
                int score = scores[i][j];
                // 输出分数
                System.out.println("第" + ( i + 1 ) +
                        "个学生的第" + ( j + 1 ) +
                        "门课成绩是:" + score);
            }
        }

    }
}
