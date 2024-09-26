import java.util.Scanner;

public class TEST {

    /**
     * 使用while 循环编写程序，打印1~10之间的自然数
     */
    public void methodWhile(){
        int num = 1;
        int max = 10;
        while(num <= max){
            System.out.println(num);
            num ++;
        }
    }

    /**
     *  使用while循环语句编写程序，从键盘上读取一个非负整数n，计算一个n的阶乘
     *
     */
    public void methodFactorial(){

        int n ;
        int i = 1;
        int tar = 1;
        System.out.println("请输入一个数用于阶乘：");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        //判断输入数据是否为非负整数
        if (n <= 0){
            System.out.println("请输入一个非负整数！");
            methodFactorial();
        }



        while(i <= n){
            tar *= i;
            i++;
        }
        System.out.println("阶乘结果为：" + tar);
    }

    /*public void wH(){

    }*/

    public static void main(String[] args) {
        System.out.println("sss");

        TEST test = new TEST();
        //test.methodWhile();
        test.methodFactorial();
    }
}
