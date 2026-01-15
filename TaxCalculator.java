import java.util.Scanner;
public class TaxCalculator {
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("======== The is tax paying system ========");
System.out.print("Enter your salary = ");
int a = sc.nextInt();
System.out.print("Total tax you have to pay = ");
if(a<249999){
    System.out.println("0");
}
else if(a>250000 && a<500000){
int b = a*5/100;
System.out.println(b);
}
else if(a>500001 && a<999999){
int b = a*20/100;
System.out.println(b);
}
else if(a>100000){
int b = a*30/100;
System.out.println(b);
}
else{
    System.out.println("0");
}
