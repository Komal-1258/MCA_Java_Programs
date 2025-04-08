public class Factorial {
    public static void main(String[] args)
     { 
        System.out.print("Factorial of the given no is: ");
        System.out.println(fact(5));
    }
    
    public static int fact(int n)
    {   
        if(n==0)
        {
            return 1;
        }
        int Output=fact(n-1);
        int result=n*Output;
        return result;
    }
    
}