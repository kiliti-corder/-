import java.util.Scanner;

public class TEST {

    /**
     * ʹ��while ѭ����д���򣬴�ӡ1~10֮�����Ȼ��
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
     *  ʹ��whileѭ������д���򣬴Ӽ����϶�ȡһ���Ǹ�����n������һ��n�Ľ׳�
     *
     */
    public void methodFactorial(){

        int n ;
        int i = 1;
        int tar = 1;
        System.out.println("������һ�������ڽ׳ˣ�");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        //�ж����������Ƿ�Ϊ�Ǹ�����
        if (n <= 0){
            System.out.println("������һ���Ǹ�������");
            methodFactorial();
        }



        while(i <= n){
            tar *= i;
            i++;
        }
        System.out.println("�׳˽��Ϊ��" + tar);
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
