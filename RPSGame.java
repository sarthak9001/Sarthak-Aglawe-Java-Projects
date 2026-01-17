import java.util.Random;
import java.util.Scanner;
public class day20 {
    public static void main(String[] args) {
        Random rn = new Random();
        Scanner sc = new Scanner(System.in);
        
int a = rn.nextInt(4);// to generate a random number upto 0-3
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
}
System.out.println();
System.out.print("System Choose = ");
System.out.print(a);
if(a==1){
System.out.println(" = Rock");
}
else if(a==2){
    System.out.println(" = Paper");
}
else if(a==3){
    System.out.println(" = Seasor");
}
System.out.print("Game = ");
if (a==2){
    System.out.println("Loss");
}
else if (a==3){
    System.out.println("Win");
}
else if (a==1){
    System.out.println("Win");
}
else if (a==3){
    System.out.println("Loss");
}
else if (a==1){
    System.out.println("Loss");
}
else if (a==2){
    System.out.println("Win");
}
else if (a==2){
    System.out.println("Loss");
}
else{
    System.out.println("tie");
}
System.out.println("");
}
    
}
