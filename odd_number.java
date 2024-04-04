import java.util.Scanner;

class odd_number {
public static void main(String []args){

int arr[][]={{12,21,31},{43,52,65},{73,84,94}};

for(int i=0; i<3; i++){
for(int j=0; j<3; j++){
if(arr[i][j]%2!=0){
System.out.println(arr[i][j]+"  Index : "+i+" , "+j);
}
}
}

}
}