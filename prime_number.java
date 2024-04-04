import java.util.Scanner;

class prime_number {
public static void main(String args[]){

int i, j, arr[][] = {{13,2,4},{35,5,71},{16,8,29}};
boolean check;
for(i=0; i<arr.length; i++){
for(j=0; j<arr[i].length; j++){
check = false;
for(int prime=2; prime<= arr[i][j]/2; prime++){

if(arr[i][j]%prime==0){
check = true;
break;
}

}
if(!check){
System.out.println(arr[i][j]+" : "+i+" , "+j);
}
}
}

}
}