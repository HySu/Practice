import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        String operator = sc.nextLine();

        if(operator.equals("+")){
            System.out.println("더하기 연산자");
        } else if(operator.equals("-")){
            System.out.println("빼기 연산자");
        } else if(operator.equals("*")){
            System.out.println("곱하기 연산자");
        } else if(operator.equals("/")){
            System.out.println("나누기 연산자");
        }
    }
}