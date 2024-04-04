import java.util.Scanner;

class diagonal {
public static void main(String args[]){
Scanner input = new Scanner (System.in);

System.out.print("Enter rows of 2d array : " );
int rows = input.nextInt();
System.out.print("Enter coloum of 2d array : ");
int coloums = input.nextInt();
int array[][] = new int[rows][coloums];
int sum = 0 ;
for(int i=0; i<rows; i++){
for(int k=0; k<coloums; k++){
array[i][k] = input.nextInt();
}
}
for(int i=0; i<rows; i++){
for(int k=0; k<coloums; k++){
System.out.print(array[i][k]+"  ");
}
System.out.println("");
}

for(int i=0; i<coloums ; i++){
sum = sum + array[i][i];
}

System.out.println("Total sum of diagonal --> "+ sum);



}

}