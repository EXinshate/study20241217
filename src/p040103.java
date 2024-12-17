class Demo0401 {
    public static void main(String[] args) {
        int[] nums = new int[3];       // 定义长度为3的整形数组
        nums[0] = 10;                  // 为数组元素赋值
        nums[1] = 20;
        nums[2] = 30;
        System.out.println(nums[0]);  // 打印数组元素中的值
        System.out.println(nums[1]);
        System.out.println(nums[2]);
    }
}
class Demo0402 {
    // 定义一个名为 Demo0402 的类

    public static void main(String[] args) {
        // 主方法，程序的入口点

        int[] nums = new int[3];          // 创建一个长度为3的整型数组 nums
        // 这里使用了数组的声明和初始化，nums 是一个整型数组，可以存储3个整数

        nums[0] = 10;                     // 为数组的第一个元素赋值为 10
        nums[1] = 20;                     // 为数组的第二个元素赋值为 20
        nums[2] = 30;                     // 为数组的第三个元素赋值为 30

        // 使用 for 循环遍历数组 nums 中的每个元素
        for(int i = 0; i < nums.length; i++) {  // nums.length 获取数组的长度，作为循环条件
            // 循环从 0 开始，到 nums.length - 1 结束（即 2），确保访问数组的每个元素
            System.out.println(nums[i]);  // 输出数组 nums 中索引为 i 的元素的值
            // 这里的 nums[i] 会依次输出 10, 20, 30
        }
    }
}
class Demo0403 {
    // 定义一个名为 Demo0403 的类

    public static void main(String[] args) {
        // 主方法，程序的入口点

        // 声明并初始化一个字符串数组 names，包含四个元素
        String[] names = {"唐僧", "孙悟空", "猪八戒", "沙和尚"};
        // 这里使用了数组的简化初始化语法，直接在声明时赋值

        // 使用增强的 for 循环（foreach 循环）遍历数组
        for (String name : names) {      // 对于 names 数组中的每个元素，将其赋值给临时变量 name
            System.out.println(name);     // 输出临时变量 name 的值
        }
    }
}
