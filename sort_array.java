import java.util.Scanner;

class sort_array{
public static void main(String args[]){
Scanner input = new Scanner (System.in);

System.out.print("Enter size of array --> ");
int size = input.nextInt();

int array[] = new int[size];

for(int i=0; i<size; i++){
array[i] = input.nextInt();
}

int temp = 0;
for(int i=0; i<size; i++){
for(int k=0; k<size; k++){

if(array[k]>array[i]){
temp = array[i];
array[i] = array[k];
array[k] = temp;
}
}
}

for(int j=0; j<size; j++){
System.out.print(array[j]+"\t");
}

}
}