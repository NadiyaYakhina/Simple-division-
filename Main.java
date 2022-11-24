import java.util.Scanner; 

public class Main {
    
    public static void main(String args[]) { 
        
        int a, b, q=0; 
        
        System.out.println("Enter two positive integers "); 
        
        Scanner innn = new Scanner(System.in); 
        a = innn.nextInt(); 
        b = innn.nextInt(); 
        
        int r = a; 
        
        while (r>=b){ 
            r = r - b; 
            q = q + 1;
        }
        System.out.println("Quotient: "+ q + " Remainder: " + r); 
    }  
}

