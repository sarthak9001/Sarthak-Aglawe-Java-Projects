import java.util.Random;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Random rn = new Random();
        Scanner sc = new Scanner(System.in);
        
int a = rn.nextInt(3)+1;// to generate a random number upto 0-3
System.out.println("======== Rock,Paper,Seasor Game ========");
System.out.println("Choose your Option = \n1 = Rock\n2 = Paper\n3 = Seasor");
System.out.print("= ");
int num = sc.nextInt();
switch (num) {
    case 1:
        System.out.print("Rock");
        break;
case 2:
        System.out.print("Paper");
        break;
case 3:
        System.out.println("Seasor");
        break;

    default:
        break;
}    System.out.println();
    System.out.println(" System choose =");

switch (a) {
    case 1:
        System.out.print("Rock");
        break;
case 2:
        System.out.print("Paper");
        break;
case 3:
        System.out.println("Seasor");
    default:
        break;
}
if (num == a) {
    System.out.println();
    System.out.println("=[ Game Tie ]=");
}
else if((num==1 && a==2)||
        (num==2 && a==3)||
        (num==3 && a==1)){
            System.out.println();
            System.out.println("=[ You loos ]=");
        }
else{
        System.out.println();

    System.out.println(" Win");
}
System.out.println("Thanks for playing the game");
System.out.println("=============================================");

System.out.println();
}
}
