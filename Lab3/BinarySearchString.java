import java.util.Arrays;

class BinarySearchString{
public static int binarySearch(String[] arr,String x){
int low=0;
int high=arr.length-1;
int mid;
while(low<=high){
mid=(low+high)/2;
if(arr[mid].compareTo(x)<0){
low=mid+1;
}
else if(arr[mid].compareTo(x)>0){
high=mid-1;
}else{
return mid;
}
}
return -1;
}
public static void main(String[] args){
String array[]={"AA","B","C","D"};
String search="B";
Arrays.sort(array);
int searchIndex=binarySearch(array,search);
System.out.println(searchIndex);

}
}