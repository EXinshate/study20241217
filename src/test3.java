public class test3 {
    public static void main(String[] args) {
        // 定义长度为10的整形数组，并初始化
        int[] nums = {34, 32, 45, 67, 98, 43, 31, 47, 13, 22};
        // 定义要查找的目标数据
        int searchNum = 13;
        // 定义变量记录查找到的目标数据位置,变量初始值设为-1
        int index = -1;
        // 通过循环遍历数组，使用顺序查找法查找目标数据
        for(int i = 0; i < nums.length; i++) {
            // 判断遍历的当前元素和目标数据是否相等
            if(nums[i] == searchNum) {
                // 如果相等则记录目标数据在数组中的位置
                index = i;
                // 结束循环
                break;
            }
        }
        // 循环结束后，判断记录目标数据位置是否为-1
        if(index == -1) {
            // 如果记录的位置为-1,说明没有找到数据
            System.out.println("在数组中没有要找到的目标数据");
        } else {
            // 如果记录的位置不为-1,则说明找到了目标数据
            System.out.println("找到了目标数据，位置是:" + index);
        }
    }
}