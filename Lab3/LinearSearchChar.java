public class LinearSearchChar{    
public static int linearSearch(char[] array, char key){    
        int num=array.length;
		for(int i=0;i<num;i++){    
            if(array[i] == key){    
                return i;    
            }    
        }    
        return -1;    
    }    
    public static void main(String a[]){    
        char[] a1= {'a','e','i','o','u'};    
        char key = 'e';    
        System.out.println(key+" is found at index: "+linearSearch(a1, key));    
    }    
}    