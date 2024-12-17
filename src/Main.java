class Saler{
    static int ticket=5;
    public void sale(){
        --ticket;
    }
}
// 模拟售票
class Demo0512 {
    public static void main(String[] args) {
        Saler s1=new Saler(); 				// 创建售票员1
        s1.sale();
        System.out.println("销售员1剩余票："+s1.ticket+"张");
        Saler s2=new Saler(); 				// 创建售票员2
        s2.sale();
        System.out.println("销售员2剩余票："+s1.ticket+"张");
    }
}