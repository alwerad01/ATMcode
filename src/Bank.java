import java.util.Objects;
import java.util.Scanner;

public class Bank {

    Scanner input = new Scanner(System.in);

    public double Balance;
    public String Name = "user";
    public int PIN = 1234 ;

    public void MAINMENU() {
        System.out.print("Welcome to EasyBank! \n 1 : Log In \n 2 : Create Account\n 0 : Exit Program\n   : ");
        int MenuOption = input.nextInt();

        if (MenuOption == 1) {
            LOGIN();
        } else if (MenuOption == 2) {
            CREATEACCOUNT();
        }else if (MenuOption == 0){
            System.out.println("Thank You For Using Our Program!");
        }
    }

    public void CREATEACCOUNT() {
        input.nextLine();
        System.out.print("Enter Your Name : ");
        Name = input.nextLine();
        System.out.print("Create A PIN ");
        PIN = input.nextInt();

        System.out.println(Name + " Your Account Has Been Created Sucessfully!");

        System.out.print("Enter Your Initial Deposit Amount : ");
        int initial_deposit = input.nextInt();
        Balance += initial_deposit;
        System.out.println(initial_deposit + "$ Has Been Deposited to Your Account!");
        System.out.println("Your Current Balance  :  " + Balance + "$");

            System.out.print(" 1 : Deposit\n 2 : Withdrawl\n 3 : Main Menu \n 0 : Exit Program ");
            int Menu_Option = input.nextInt();
            if (Menu_Option == 1) {
                DEPOSIT();
            } else if (Menu_Option == 2) {
                WITHDRAWL();
            } else if (Menu_Option == 3) {
                MAINMENU();
            }else {
                System.out.println("Thank You For Using Our Program!");
            }
    }

    public void LOGIN() {
        input.nextLine();
        System.out.print("Enter Your Name : ");
        String name = input.nextLine();
        System.out.print("Enter Your PIN : ");
        int Login_PIN = input.nextInt();

        if (name.equalsIgnoreCase(Name) && Login_PIN == PIN) {
            System.out.println("Welcome " + " To your Account ");
            System.out.println("Name : " + Name);
            System.out.println("Your Current Balance  :  " + Balance + "$");

            System.out.print(" 1 : Deposit\n 2 : Withdrawl\n 3 : Main Menu \n 0 : Exit Program\n  :  ");
            int Menu_Option = input.nextInt();
            if (Menu_Option == 1) {
                DEPOSIT();
            } else if (Menu_Option == 2) {
                WITHDRAWL();
            } else if (Menu_Option == 3) {
                MAINMENU();
            }else {
                System.out.println("Thank You For Using Our Program!");
            }

        }else {
            System.out.println("User Not Found! ");

            System.out.print(" 1 : For Try Again\n 2 : Create An Account\n 0 : Exit Program \n   : ");
            int Menu_Option = input.nextInt();

            if (Menu_Option == 1) {
                LOGIN();
            } else if (Menu_Option == 2) {
                CREATEACCOUNT();
            } else {
                System.out.println("Thank You For Using Our Program!");
            }
        }
    }

    public void DEPOSIT() {
        System.out.print("Enter Your Deposit Amount X500: ");
        int Deposit = input.nextInt();
        if (Deposit >= 0) {
            Balance += Deposit;
            System.out.println(Deposit + "$ Has Been Deposited to Your Account!");
            System.out.println("Your Current Balance  :  " + Balance + "$");
            System.out.print(" 1 : Deposit\n 2 : Withdrawl\n 3 : Main Menu\n 0 : Exit Program  : ");
            int Menu_Option = input.nextInt();
            if (Menu_Option == 1) {
                DEPOSIT();
            } else if (Menu_Option == 2) {
                WITHDRAWL();
            } else if (Menu_Option == 3) {
                MAINMENU();
            } else {
                System.out.println("Thank You For Using Our Program!");
            }
        } else {
            System.out.println("Invalid Entry\n Enter 0 For Back Menu ");
            DEPOSIT();
        }
    }

    public void WITHDRAWL() {
        System.out.print("Enter Your Withdrawal Amount : ");
        int Withdrawl = input.nextInt();
        if (Withdrawl < Balance) {
            Balance -= Withdrawl;
            System.out.println(Withdrawl + "$ Has Been Withdrawed From Your Account!");
            System.out.println("Your Current Balance  :  " + Balance + "$");
            System.out.print(" 1 : Deposit\n 2 : Withdrawl\n 3 : Main Menu\n 0 : Exit Program \n   : ");
            int Menu_Option = input.nextInt();
            if (Menu_Option == 1) {
                DEPOSIT();
            } else if (Menu_Option == 2) {
                WITHDRAWL();
            } else if (Menu_Option == 3) {
                MAINMENU();
            } else {
                System.out.println("Thank You For Using Our Program!");
            }
        } else {
            System.out.println("Invalid Entry ");
            WITHDRAWL();
        }
    }
}
