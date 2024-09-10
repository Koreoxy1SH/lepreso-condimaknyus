public class OperationMath {
    public static void main(String[] args) {
        int a = 100;
        int b = 10;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        //Augmented Assignments
        int z = 10;
        z += 10;
        z -= 10;
        z *= 10;
        z /= 10;
        z %= 10;

        System.out.println(z);


        //Unary Operator
        int x = +100;
        int i = -10;

        x++;
        System.out.println(x);

        i--;
        System.out.println(i);

        System.out.println(!true);
    }
    
}
