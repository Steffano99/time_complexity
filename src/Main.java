//ALGORITHM: MULTIPLYING TWO INTEGERS USING REPEATED ADDITION METHOD.
//DETERMINING THE TOTAL TIME IT TAKES TO COMPLETE THE MULTIPLICATION PROCESS BASED ON THE NUMBERS SUPPLIED BY THE USER AS INPUT.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
int a; int b; int t;
int Product=0;
int Time = 0;

Scanner in =new Scanner (System.in);
        System.out.println("Enter first number to be multiplied");
a = in.nextInt();


Scanner input =new Scanner (System.in);
        System.out.println("Enter second number to be multiplied");
b = input.nextInt();

if(a<b){
    Time+=1;
    t=a; a=b; b=t;
    Time+=3;

    for (int i = 1; i <= b; i++) {
        Time += 3;
        Product = Product + a;
        Time+=2;
    }
}
else if(a>b) {
    Time += 1;

    for (int i = 1; i <= b; i++) {
        Time += 3;
        Product = Product + a;
        Time+=2;
    }
}
Time+=1;
        System.out.println("Total Time for execution is:"+ Time);
        System.out.println("The Product is:"+ Product);
    }
}
