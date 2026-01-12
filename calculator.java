public class calculator {

    void add(int num1, int num2) {
        System.out.println("Sum is " + (num1 + num2));
    }

    void sub(int num1, int num2) {
        System.out.println("Sub is " + (num1 - num2));
    }
    void mul(int num1, int num2) {
        System.out.println("mul is " + (num1 * num2));
    }
    void div(int num1, int num2) {
        System.out.println("div is " + (num1/num2));
    }
    public static void main(String[] args) {

        calculator c = new calculator();   

        c.add(10, 15);    
        c.sub(10, 15);
        c.mul(10,15);
        c.div(10,15);   
    }
}
