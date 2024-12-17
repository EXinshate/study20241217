public class test {
    public static void main(String[] args) {
        // 定义长度为10的整形数组，并初始化
        int[] nums = {34, 32, 45, 67, 98, 43, 31, 47, 13, 22};

        System.out.println("=========排序前===========");
        // 循环输出排序前的数组数据
        for (int n : nums) {
            System.out.print(n + " ");
        }

        // 输出换行
        System.out.println();

        // 使用双重循环实现冒泡排序,外层循环控制排序比较的轮数
        for (int i = 1; i < nums.length; i++) {
            // 内层循环控制每一轮比较的次数
            for (int j = 0; j < nums.length - i; j++) {
                // 每次比较相邻的两个元素的大小
                if (nums[j] > nums[j + 1]) {
                    // 如果前面的元素大于后面的元素，则交换位置
                    // 先将前面的数组元素的数据存入临时变量
                    int temp = nums[j];
                    // 再将后面的数组元素的数据存到前面的数组元素中
                    nums[j] = nums[j + 1];
                    // 最后将临时变量中的数据存储到后面数组元素中
                    nums[j + 1] = temp;
                }
            }
        }

        System.out.println("=========排序后===========");
        // 循环输出排序后的数组数据
        for (int n : nums) {
            System.out.print(n + " ");
        }

        // 输出换行
        System.out.println();

        System.out.println("=========使用二分查找法===========");

        // 使用二分法查找数据
        // 定义要查找的目标数据
        int searchNum = 47;
        // 定义变量记录查找到的目标数据的位置，初始为-1
        int index = -1;
        // 定义低位索引变量，初始为0
        int low = 0;
        // 定义高位索引变量,初始为数组长度减1
        int high = nums.length - 1;
        // 定义中间位置变量,初始为-1
        int middle = -1;
        // 通过循环实现二分查找过程
        do {
            // 计算中间位置
            middle = (low + high) / 2;
            // 使用中间位置对应的数据和目标数据比较
            if (nums[middle] == searchNum) {
                // 如果两个数据相等，则用index存储中间位置
                index = middle;
                // 退出循环
                break;
            }

            // 如果中间数据大于目标数据，则将高位索引设置为中间位置减1
            if (nums[middle] > searchNum) {
                high = middle - 1;
            } else {
                // 否则，将低位索引设置为中间位置加1
                low = middle + 1;
            }

        } while (low <= high);  // 循环条件是低位索引位置小于高位索引位置

        // 输出二分查找结果
        if (index == -1) {
            // 如果index记录的位置是-1，说明没有找到目标值
            System.out.println("在数组中没有找到目标值");
        } else {
            // 如果index记录的位置不是-1，说明找到了目标值
            System.out.println("找到了目标值:" + searchNum + " 它的索引位置是:" + index);
        }
    }
}



