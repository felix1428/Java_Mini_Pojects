import java.util.*;
public class ATM {
    public static void main(String []args){
        Scanner n = new Scanner(System.in);
        System.out.print("Greetings!!!");
        int pin = 1428;
        int balance = 100000;

        int Credit =0;
        int deposit = 0;

        String name;

        int in_pin = n.nextInt();

        if(pin == in_pin){
            System.out.println("Welcome you ! Please enter your name.");
            name = n.next();
            System.out.println("Hello Mr."+name);
            boolean exit = false;
            while( !exit ) {
                System.out.println();
                System.out.println("Press 1 to Check your balance.");
                System.out.println("Press 2 to Withdraw Money.");
                System.out.println("Press 3 to Deposit Money.");
                System.out.println("Press 4 to Take receipt.");
                System.out.println("Press 5 to Exit.");

                int input = n.nextInt();
                switch (input) {
                    default: {
                        System.out.println("Enter a valid input or number.");
                    }
                    break;
                    case 1: {
                        System.out.println("YOUR CURRENT BALANCE IS RUPEES :" + balance);
                    }
                    break;
                    case 2: {
                        System.out.println("Enter your Withdraw amount");
                        Credit = n.nextInt();
                        if (Credit <= balance) {
                            System.out.println("Your transaction is completed Successfully.");
                            balance = balance - Credit;
                            System.out.println("The balance amount: " + balance);
                        }
                    }
                    break;
                    case 3: {
                        System.out.println("Enter your Deposit amount");
                        deposit = n.nextInt();
                        balance = balance + deposit;
                        System.out.println("Your transaction is completed Successfully.");
                        System.out.println("The balance amount: " + balance);
                    }
                    break;
                    case 4: {
                        System.out.println(" YOUR Receipt !!!");
                        System.out.println("Credit Amount: " + Credit);
                        System.out.println("Deposit Amount: " + deposit);
                        System.out.println("Thank you (-_-)");
                    }
                    break;
                    case 5 :{
                        System.out.println("$$$ THANK YOU HAVE A NICE DAY $$$");
                        exit = true;
                        break;
                    }
                }
            }
        }else{
            System.out.println("Enter a valid PIN");
        }
        System.out.println("Have a nice day!!!  Come again.");
    }
}
