package entrevista;

import java.util.Scanner;

public class Hackerrank11 {
    static boolean isAnagram(String a, String b) {
    	if (a.length() != b.length()) {
    		return false;
    	}
    	
        char[] aArray = a.toLowerCase().toCharArray();
        char[] bArray = b.toLowerCase().toCharArray();

        selectionSort(aArray);
        selectionSort(bArray);
        
        for(int i=0; i< a.length(); i++) {
        	if(aArray[i]!=bArray[i]) {
        		return false;
        	} 
        }
        
        return true;
        // Complete the function
    }
    
    static void selectionSort(char[] arr){

    	 for (int i = 0; i < arr.length; i++){
    	     int min = i;
    	   for (int k = i; k<arr.length; k++){
    	      if (arr[k]< arr[min]){
    	          min = k;
    	      }
    	   }  
    	  char temp = arr[i];
    	  arr[i] = arr[min];
    	  arr[min] = temp;  
    	 }

    	}

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

}
