public class Calci{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = add(a,b);
    }
    //function to add two numbers
    public static int add(int a, int b){
        return (a + b);
    }

    //function to subtract two numbers
    public static int sub(int a, int b){
        return (a - b);
    }


    // function to multiply two numbers
    public static int mul(int a, int b){
        return (a * b);
    }

    // funtion to find remainder of a number
    public static int remainder(int a, int b){
        return (a % b);
    }

    //function to divide two numbers
    public static int div(int a, int b){
        return (a / b);
    }


}