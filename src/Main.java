import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String firstName = "mat";
        String lastName = "fle";
        String name = firstName + lastName;
        System.out.println(name);


        int num1 = 3;
        int num2 = 4;
        System.out.println(num1+num2);
        double result = (double) num1/num2;
        System.out.println(result);
        int num3 = 8;
        System.out.println(num3++);
        System.out.println(num3);
        System.out.println(++num3);


        Scanner scan = new Scanner(System.in);
        String Nname = scan.nextLine();
        String NlastName = scan.nextLine();
        System.out.println("your name is " + Nname + " " + NlastName);


        int Nnum1 = scan.nextInt();
        int Nnum2 = scan.nextInt();
        int sum = Nnum1 + Nnum2;
        System.out.println(sum);


    }
}