import java.util.Scanner;
class calculator {
public static void main (String args[]){
Scanner input = new Scanner (System.in);

char symbol[] = new char[4];
for(int i=0; i<4; i++){
symbol[i] = input.next().charAt(0);
}

System.out.print("Enter nummber 1: ");
int num1 = input.nextInt();
System.out.print("Enter nummber 2: ");
int num2 = input.nextInt();

System.out.print("Enter index : ");
int index = input.nextInt();

switch (symbol[index]){
case '+' :
System.out.println("Addition : "+ (num1 + num2));
break;
case '-' :
System.out.println("Subtraction : "+ (num1 - num2));
break;
case '*' :
System.out.println("Multiplication : "+ (num1 * num2));
break;
case '/' :
System.out.println("Divion : "+ (num1 / num2));
break;
default :
System.out.println(symbol+" does not exist");
break;
}


}
}