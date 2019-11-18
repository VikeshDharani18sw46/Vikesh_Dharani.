public class LinearSearchString{    
public static int linearSearch(String[] arr, String key){    
        int n=arr.length;
		for(int i=0;i<n;i++){    
		if(arr[i]==key){    
                return i;    
            }    
        }
        		
        return -1;    
     
}
    public static void main(String a[]){    
        String[] a1= {"ME", "Vikesh","Dharani"};    
        String key = "ME";
		linearSearch(a1, key);
        		
        System.out.println(key+" is found at index: "+linearSearch(a1, key));
				
    }    
}    