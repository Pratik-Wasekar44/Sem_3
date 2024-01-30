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
        //function to divide two numbers
        return (a / b);
    }
    public static int square(int a){
        // function to reutrn square of a number
        return (a*a);
    }
    public static int cube(int a){
        //function to return cube of a number
        return (a*a*a);
    }

}