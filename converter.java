import java.util.Scanner;

public class converter {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the currency rate");
        double currency = sc.nextDouble();
        System.out.println("Enter amount of money");
        int hryvna =sc.nextInt();
        double amount = hryvna / currency;
        //double rest = hryvna / currency - amount;
        System.out.println("You can buy " + amount);
    }
}