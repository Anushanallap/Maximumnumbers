package Day13;

public class UC3 {
	 public static int maximumThreeNumbers(int a,int b,int c){
			
			int maximumnum;
			
	        Integer num1 = (Integer) a;
	        Integer num2 = (Integer) b;
	        Integer num3 = (Integer) c;
	        
	        if ((num1.compareTo(num2))>0&& (num1.compareTo(num3))>0){
	        	maximumnum = a;
	        } else if (num2.compareTo(num3)>0){
	        	maximumnum  = b;
	        }else{
	        	maximumnum = c;
	        }
	        System.out.println("The three largest numbers is: "+maximumnum);
	        return maximumnum;

}
	 public static String maxThreeNumbers(String a,String b,String c){
		 
	        String maximum;
	        
	        if ((a.compareTo(b))>0 && (a.compareTo(c))>0){
	        	maximum = a;
	            
	        } else if (b.compareTo(c)>0){
	        	
	        	maximum  = b;
	            
	        }else{
	        	
	        	maximum = c;
	        }
	        System.out.println("The three largest strings is: "+maximum);
	        
	        return maximum;
	        
	    }
	    public static void main(String []args){
	    	
	        System.out.println(" find maximum among three numbers using Generics.");
	        maxThreeNumbers("plant","plane","plan");
	    }
}

	 
