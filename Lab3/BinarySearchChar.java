import java.util.Arrays;

class BinarySearchChar{
public static int binarySearch(char[] arr,char x){
int low=0;
int high=arr.length-1;
int mid;
while(low<=high){
mid=(low+high)/2;
if(arr[mid]<x){
low=mid+1;
}
else if(arr[mid]>x){
high=mid-1;
}else{
return mid;
}
}
return -1;
}
public static void main(String[] args){
char array[]={'A','B','C'};
char search='C';
Arrays.sort(array);
int searchIndex=binarySearch(array,search);
System.out.println(searchIndex);

}
}