import java.util.Scanner;

class Task2{
public static void main(String[] args){
int num, temp;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of elements you want to add in array:");
num=sc.nextInt();

int arr[]=new int[num];

System.out.println("Enter all Elements:");
for(int i=0; i<num; i++){
arr[i]=sc.nextInt();
}
for(int i=0; i<num;i++){
System.out.println(arr[i]);
}

}
}