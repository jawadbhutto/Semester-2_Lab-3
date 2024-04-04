import java.util.Scanner;

class percentage {
public static void main(String args[]){

Scanner input = new Scanner(System.in);


System.out.print("How many subject : ");
int subject = input.nextInt();
float mark[]= new float[subject];
float obtain = 0.0f;
float total = subject * 100;
for(int i=0; i<subject; i++){
System.out.print("Enter Subject "+(i+1)+" : ");
mark[i] = input.nextFloat();

obtain = obtain + mark[i];

}

System.out.print("Percentage --> "+ ((obtain/total) * 100) +"%");





}

}