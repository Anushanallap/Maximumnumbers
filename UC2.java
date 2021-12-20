package Day13;

public class UC2 {

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
    
    public static double maximumThreeNumbers(double a,double b,double c){
    	
        double max;
        Double num1 = (Double) a;
        Double num2 = (Double) b;
        Double num3 = (Double) c;

        if ((num1.compareTo(num2))>0 && (num1.compareTo(num3))>0){
            max = a;
            
        } else if (num2.compareTo(num3)>0){
        	
            max  = b;
            
        }else{
        	
            max = c;
        }
        
        System.out.println("The three largest float numbers is: " + max);
        
        return max;
        
    }
        
    public static void main(String []args){
        System.out.println("hello class!");
        
        System.out.println("find maximum among three numbers using Generics.");
        
        maximumThreeNumbers(1.5,11.25,39.68);
    }

}
