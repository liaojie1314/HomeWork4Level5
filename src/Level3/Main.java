package Level4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        boolean flag=true;
        while (flag){
            System.out.println("请输入第一个数：");
            double a=scanner.nextDouble();
            System.out.println("请输入第二个数：");
            double b=scanner.nextDouble();
            int pd=1;
            while (pd==1){
                System.out.println("请输入运算符：");
                String operator=scanner.next();
                switch (operator){
                    case "+":
                        System.out.println("a+b的和为:"+(a+b));
                        pd=0;
                        break;
                    case "-":
                        System.out.println("a-b的差为："+(a-b));
                        pd=0;
                        break;
                    case "*":
                        System.out.println("a*b的积为："+(a*b));
                        pd=0;
                        break;
                    case "/":
                        try{
                            if (b==0) {
                                throw new ArithmeticException();
                            }
                            System.out.println("a/b的值为："+(a/b));
                        }catch (ArithmeticException e){
                            System.out.println("程序出现异常，除数b不能等于0！");
                        }
                        pd=0;
                        break;
                    default:
                        System.out.println("输入符号错误！");
                }
            }
            boolean flag2=true;
            while (flag2){
                System.out.println("是否继续使用？"+"YES/NO");
                String choose=scanner.next();
                if("YES".equals(choose)){
                    System.out.println("继续使用。");
                    break;
                }else if ("NO".equals(choose)){
                    System.out.println("欢迎下次使用。");
                    return;
                }else{
                    System.out.println("输入不正确，请重新输入！！！");
                }
            }
        }
    }
}
