import java.util.Objects;
import java.util.Scanner;

public class Bank {

    Scanner input = new Scanner(System.in);

    public double Balance ;
    public String Name ;
    public int PIN ;

    public void MENU (){
        System.out.println("Welcome to EasyBank! \n 1 : Log In \n 2 : Create Account ");
        int MenuOption = input.nextInt();

        if (MenuOption == 1 ){

            LOGIN();

        }

        System.out.print("Enter Your Initial Deposit Amount : ");
        int initial_deposit = input.nextInt();
        Balance += initial_deposit ;

        System.out.print(" 1 : Deposit\n 2 : Withdrawl\n 0 : Exit Program \n   : ");
        int Menu_Option = input.nextInt();

        if (Menu_Option == 1){
            DEPOSIT();
        }else if (Menu_Option == 2) {
            WITHDRAWL();
        }else {
            System.out.println("Thank You For Using Our Program!");
        }
    }

    public void CREATEACCOUNT (){
        System.out.println("Enter Your Name : ");
        String Name = input.nextLine();
        System.out.println("Create A PIN ");
        int PIN = input.nextInt();
        System.out.println(Name + " Your Account Has Been Created Sucessfully!");

    }

    public void LOGIN (){
        System.out.print("Enter Your Name : ");
        String name = input.nextLine();
        System.out.print("Enter Your PIN : ");
        int Login_PIN = input.nextInt();

        if (Objects.equals(name, Name) && Login_PIN == PIN ){
            System.out.println("Welcome "+" To your Account ");
        }

        System.out.println("YOU DONT HAVE ANY ACCOUNT");
    }

    public void DEPOSIT (){
        System.out.print("Enter Your Deposit Amount X500: ");
        int Deposit = input.nextInt();
        if (Deposit % 500 == 0 && Deposit >= 500 ){
            Balance += Deposit ;
            System.out.println(Deposit + "$ Has Been Deposited to Your Account!");
            System.out.println("Your Current Balance  :  " + Balance+ "$" );
            System.out.print(" 1 : Deposit\n 2 : Withdrawl\n 0 : Exit Program \n   : ");
            int Menu_Option = input.nextInt();
            if (Menu_Option == 1){
                DEPOSIT();
            }else if (Menu_Option == 2) {
                WITHDRAWL();
            }else {
                System.out.println("Thank You For Using Our Program!");
            }
        }else {
            System.out.println("Invalid Entry ");
            DEPOSIT();
        }
    }

    public void WITHDRAWL  (){
        System.out.print("Enter Your Withdrawal Amount : ");
        int Withdrawl = input.nextInt();
        if (Withdrawl < Balance ){
            Balance -= Withdrawl ;
            System.out.println(Withdrawl + "$ Has Been Withdrawed From Your Account!");
            System.out.println("Your Current Balance  :  " + Balance+ "$" );
            System.out.print(" 1 : Deposit\n 2 : Withdrawl\n 0 : Exit Program \n   : ");
            int Menu_Option = input.nextInt();
            if (Menu_Option == 1){
                DEPOSIT();
            }else if (Menu_Option == 2) {
                WITHDRAWL();
            }else {
                System.out.println("Thank You For Using Our Program!");
            }
        }else {
            System.out.println("Invalid Entry ");
            WITHDRAWL();
        }
    }

}
