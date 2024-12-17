

public class Demo0408 {
    public static void main(String[] args) {
        // 定义要排序的整形数组
        int[] nums = {56, 32, 8, 76, 12};

        System.out.println("=========排序前===========");
        // 循环输出初始的数组数据
        for(int n : nums) {
            System.out.print(n+" ");
        }
        // 换行
        System.out.println();

        // 使用双重循环实现冒泡排序,外层循环控制排序比较的轮数
        for(int i = 1; i<nums.length; i++) {
            // 内层循环控制每一轮比较的次数
            for(int j=0; j<nums.length-i;j++) {
                // 每次比较相邻的两个元素的大小
                if(nums[j] > nums[j+1]) {
                    // 如果前面的元素大于后面的元素，则交换位置
                    // 先将前面的数组元素的数据存入临时变量
                    int temp = nums[j];
                    // 再将后面的数组元素的数据存到前面的数组元素中
                    nums[j] = nums[j+1];
                    // 最后将临时变量中的数据存储到后面数组元素中
                    nums[j+1] = temp;
                }
            }
        }

        System.out.println("=========排序后===========");
        // 循环输出排序后的数组数据
        for(int n : nums) {
            System.out.print(n+" ");
        }

    }
}
