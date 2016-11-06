import java.util.*;

public class Karatsuba {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        
        String x = input.next();
        String y = input.next();
        
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int prod = 0;
        
        if(x.length() > 1 && y.length() > 1){
            a = Integer.parseInt(x.substring(0,Math.round(x.length()/2))) * (int)Math.pow(10,(double)(x.length()-Math.round(x.length()/2)));
            b = Integer.parseInt(x.substring(Math.round(x.length()/2)));
            c = Integer.parseInt(y.substring(0,Math.round(y.length()/2))) * (int)Math.pow(10,(double)(y.length()-Math.round(y.length()/2)));
            d = Integer.parseInt(y.substring(Math.round(y.length()/2)));

            System.out.println("a: " + a);
            System.out.println("b: " + b);
            System.out.println("c: " + c);
            System.out.println("d: " + d);

            prod = (a*c) + (a*d) + (b*c) + (b*d);
        }
        
        else{
            a = Integer.parseInt(x);
            b = Integer.parseInt(y);
            
            prod = a*b;
        }
        
        System.out.println("Product: " + prod);
    }
}
