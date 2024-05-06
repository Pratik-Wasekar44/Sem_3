public class Calci{


    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = add(a,b);
    }
    public static int add(int a, int b){
        //function to add two numbers
        return (a + b);
    }
    public static int sub(int a, int b){
        //function to subtract two numbers
        return (a - b);
    }
    public static int mul(int a, int b){
        // function to multiply two numbers
        return (a * b);
    }
    public static int remainder(int a, int b){
        // funtion to find remainder of a number
        return (a % b);
    }
    public static int div(int a, int b){
        try{
            if(b!=0){
                return a/b;
            }
            else{
                throw new DivideByZeroException("Divided by Zero Exception");
            }
        }

        //catch blocks
        catch(DivideByZeroException error){
            System.out.println(error);
        }
        return 0;
    }
    public static int square(int a){
        // function to reutrn square of a number
        return (a*a);
    }
    public static int cube(int a){
        //function to return cube of a number
        return (a*a*a);
    }

    public static long powerOf(long base , long power){
        long result = 1;
        for(int i = 0; i < power; i++){
            result*=base;
        }
        return result;
    }

    public static double ePower(long power){
        double result = 1;
        for(int i=0;i<power;i++){
            result*=2.71828;
        }
        return result;
    }

    public static double absolute(long number){
        return Math.abs(number);
    }

    public static double reciprocal(long a){
        try{
            if(a!=0){
                return 1/a;
            }
            else{
                throw new DivideByZeroException("Divide by Zero Exception");
            }
        }

        catch(DivideByZeroException error){
            System.out.println(error);
        }
        return 0.0;
    }

    public long factorial(long n){
        try{
            if(n==1){
                return 1;
            }
            else if(n<0){
                throw new NegativeNumberException("Factorial of Negative number is not allowed");
            }
            else{
                return n*factorial(n-1);
            }
        }
        catch(NegativeNumberException e){
            System.out.println(e);
        }
        return 0;
    }

    public static double cubeRoot(double num){
        return Math.cbRoot(num);
    }

    public long permutations(long n,long r){
        long a1 = factorial(n);
        long a2 = factorial(n-r);
        return a1/a2;
    }

    public long combinations(long n,long r){
        long a1 = factorial(n);
        long a2 = factorial(n-r);
        long a3 = factorial(r);
        return a1/(a3*a2);
    }
}

class DivideByZeroException extends Exception{
    DivideByZeroException(String error){
        super(error);
    }
}

class NegativeNumberException extends Exception{
    NegativeNumberException(String err){
        super(err);
    }
}