package Day13;

public class UC5 {
	
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
	 
	public static <G extends Comparable> void maxNumsGenerics(G a,G b,G ... args){
        G maximum = a;
        // Iterate over all the elements
        for (G x:args){
            if ((maximum.compareTo(x))<0){
            	maximum = x;
            } 
        }
        System.out.println(" The maximum number among the given is " + maximum);
    }
       
    public static void main(String []args){
    	
        Integer a = 6, b = 9, c = 5, d = 8;
        
        String g = "water", h ="to", i = "the", j="plant";
        
        System.out.println("Today we shall find maximum among three numbers using Generics.");
        
        maxNumsGenerics(a,b,c,d);
        
        maxNumsGenerics(g,h,i,j);
    }
}
