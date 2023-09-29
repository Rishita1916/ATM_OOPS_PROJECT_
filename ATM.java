import java.util.Scanner;
import java.util.HashMap;


public class ATM {
    public static void main(String[] args){
        ATMop obj=new ATMop();
        op();

    }
}
class Data{
    float balance;

}

class ATMop{
    Scanner sc=new Scanner(System.in);
    HashMap<Integer,Data> map=new HashMap<>();

    ATMop(){
        System.out.println("*****************************************************************************");
        System.out.println("WELCOME TO ATM");
    }
    public void menu(Data obj){

        System.out.println("Please enter a valid choice");
        System.out.println("1.Check Balance ");
        System.out.println("2.Depostie money");
        System.out.println("3.Withdraw money");
        System.out.println("4.Check another account");
        System.out.println("5.Exit");

        int x=sc.nextInt();
        if(x==1){
            check_balance(obj);
        }
        else if(x==2){
            deposite(obj);
        }
        else if(x==3){
            withdraw(obj);
        }
        else if(x==4){
            op();
        }
        else if(x==5){
            System.out.println("Thankyou for visiting");
        }
        else{
            System.out.println("Please enter a valid choice!");
            menu(obj);

        }


        }
        public void op(){
            System.out.println("*****************************************************************************");

            System.out.print("enter your pincode: ");
            int pincode=sc.nextInt();

            if(map.containsKey(pincode)==true){
                Data obj=map.get(pincode);
                menu(obj);
            }
            else{
                System.out.println("please create your account first!");
                System.out.println("set your pincode");
                int pin=sc.nextInt();
                Data obj=new Data();
                map.put(pin,obj);
                menu(obj);
            }

        }
        public void check_balance(Data obj){
            System.out.println("*****************************************************************************");

            System.out.println("your balance is : "+ obj.balance);
        }
        public void deposite(Data obj){
            System.out.println("*****************************************************************************");

            System.out.println("enter the amount: ");
            float a=sc.nextFloat();
            obj.balance+=a;
            System.out.println("your amount deposited successfully!");

        }
        public void  withdraw(Data obj){
            System.out.println("*****************************************************************************");

            System.out.println("enter the amount: ");
            float a=sc.nextFloat();
            obj.balance-=a;
            System.out.println("amount withdrawn successfully!");

        }
}
