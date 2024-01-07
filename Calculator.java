import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        int Oprations, Number1=10, Number2=5;
        System.out.println("**List Of Oprations**\n 1.Addition \n 2.Subtraction \n 3.Multipication \n 4.Divide");
        System.out.println("Choose Operation :");
        Scanner sc = new Scanner(System.in);
        Oprations =sc.nextInt();

        int result=0;
        switch (Oprations){
            case 1:
                result=Number1+Number2;
                break;
            case 2:
                result=Number1-Number2;
                break;
            case 3:
                result=Number1*Number2;
                break;
            case 4:
                result=Number1/Number2;
                break;

            default :
                System.out.println("Wrong Choice Entered...");
        }
        System.out.println("Result is :"+result);
        sc.close();
    }
}
