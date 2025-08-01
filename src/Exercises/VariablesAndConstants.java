package Exercises;

public class VariablesAndConstants {
    public static void main(String[] args){
        // Declare a String variable and assign your name to it. #13
        String myName = "IAN";

        // Create an int variable and assign your age to it. # 14
        int myAge = 31;

        // Declare a boolean variable that indicates if you like programming. #15
        boolean ILikeProgramming = true;

        // Declare a constant with your email. #16
        final String EMAIL = "myemail@gmail.com";

        // Create a char variable and store your initial in it. Closes #17
        char myInitial = 'I';

        // Declare a String variable with your hometown, then change its value and print it again. #18
        String myHometown = "Sa Pobla";
        System.out.println(myHometown);
        myHometown = "Hamburg";
        System.out.println(myHometown);

        int a = 2;
        int b = 3;
        System.out.println(a + b);

        // Print the type of two previously created variables. #20
        System.out.println(myHometown.getClass().getSimpleName());
        System.out.println(EMAIL.getClass().getSimpleName());

        //Try declaring a variable without initializing it, then assign a value and print it. #21
        variableWithoutInitianion = "text";
        System.out.println(variableWithoutInitianion);
        // I get this error in the console:
        /*
        java: Symbol nicht gefunden
        Symbol: Variable variableWithoutInitianion
        Ort: Klasse Exercises.VariablesAndConstants
         */












    }
}
