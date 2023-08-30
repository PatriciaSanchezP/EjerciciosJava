package entrevista;

public class EjercicioEntrevista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,5,5,5,5};
	    long sum1 = 0L;
	    for(int i=0; i<arr.length; i++){
	        if(i==0){
	            continue;
	        } 
	        sum1+=arr[i];	        
	    }

	    long sum2 = 0L;
	    for(int i=0; i<arr.length; i++){
	        if(i==1){
	            continue;
	        } 
	        sum2+=arr[i];	        
	    }
 
	    long sum3 = 0L;
	    for(int i=0; i<arr.length; i++){
	        if(i==2){
	            continue;
	        } 
	        sum3+=arr[i];	        
	    }
   
	    long sum4 = 0L;
	    for(int i=0; i<arr.length; i++){
	        if(i==3){
	            continue;
	        } 
	        sum4+=arr[i];	        
	    }
     
	    long sum5 = 0L;
	    for(int i=0; i<arr.length; i++){
	        if(i==4){
	            continue;
	        } 
	        sum5+=arr[i];	        
	    }

 
        long menor = 0L;
        if(sum1<=sum2 && sum1<=sum3 && sum1<=sum4 && sum1<=sum5) {
        	menor = sum1;
        } else if (sum2<=sum1 && sum2<=sum3 && sum2<=sum4 && sum2<=sum5) {
        	menor = sum2;
        } else if (sum3<=sum1 && sum3<=sum2 && sum3<=sum4 && sum3<=sum5) {
        	menor = sum3;
        } else if (sum4<=sum1 && sum4<=sum2 && sum4<=sum3 && sum4<=sum5) {
        	menor = sum4;
        } else if (sum5<=sum1 && sum5<=sum2 && sum5<=sum3 && sum5<=sum4) {
        	menor = sum5;
        }
        
        
        
        long mayor = 0L;
        if(sum1>sum2 && sum1>sum3 && sum1>sum4 && sum1>sum5) {
        	mayor = sum1;
        } else if (sum2>sum1 && sum2>sum3 && sum2>sum4 && sum2>sum5) {
        	mayor = sum2;
        } else if (sum3>sum1 && sum3>sum2 && sum3>sum4 && sum3>sum5) {
        	mayor = sum3;
        } else if (sum4>sum1 && sum4>sum2 && sum4>sum3 && sum4>sum5) {
        	mayor = sum4;
        } else if (sum5>sum1 && sum5>sum2 && sum5>sum3 && sum5>sum4) {
        	mayor = sum5;
        }
        
        System.out.println(menor+ " " + mayor);
        	
        


	}

}
