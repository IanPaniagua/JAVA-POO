public class Operadores {
    public static void main(String[] args) {
        // Arithmetich Operators
        int a = 10;
        int b = 3;

        System.out.println("Addition: " + (a + b));        // 13
        System.out.println("Subtraction: " + (a - b));     // 7
        System.out.println("Multiplication: " + (a * b));  // 30
        System.out.println("Division: " + (a / b));        // 3
        System.out.println("Modulus: " + (a % b));         // 1

        // Assignment Operators

        // Used to assign values to variables

        int c = 5;

        c += 3;  // a = a + 3 => 8
        System.out.println("a += 3: " + a);

        c *= 2;  // a = a * 2 => 16
        System.out.println("a *= 2: " + a);

        // Comparison Operators
        // Used to compare two values. Return true or false.

        int x = 10;
        int y = 5;

        System.out.println("x > y: " + (x > y));     // true
        System.out.println("x == y: " + (x == y));   // false
        System.out.println("x != y: " + (x != y));   // true

        // Logical Operators
        // Use to combine boolean expresions.

        int d = 8;
        int e = 3;

        boolean result1 = (d > 5 && e < 5); // true && true => true
        boolean result2 = (d < 5 || e < 2); // false || false => false
        boolean result3 = !(d == e);        // !(false) => true

        System.out.println("Logical AND: " + result1);
        System.out.println("Logical OR: " + result2);
        System.out.println("Logical NOT: " + result3);


        // Unary Operators
        // Operate on a single operand

        int t = 5;

        System.out.println("Original value: " + t);   // 5

        System.out.println("a++: " + (t++));          // 5 (then becomes 6)
        System.out.println("++a: " + (++t));          // 7 (already incremented)

        int j = -a;
        System.out.println("Unary minus: " + j);      // -7

        boolean isJavaFun = true;
        System.out.println("Logical NOT: " + !isJavaFun); // false



    }
}
