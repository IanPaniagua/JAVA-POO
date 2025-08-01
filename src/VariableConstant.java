public class VariableConstant {
    public static void main(String[] args) {
        // Variables

        String name = "Manuel";
        System.out.println(name);

        // La variabla puede cambiar

        name = "Ian";

        System.out.println(name);

        // El tipo no puede cambiar (por ejemplo no podemos poner un numero en "name"

        // name = 12; error

        // Se puede utilizar la palabra reservada var en versiones nuevas de Java.

        var apellido = "Paniagua";
        apellido = "Hernandez";
        // apellido = 12; Error, por que el programa detecta que apellido era un String.


        // Variable Constante

        final String EMAIL = "email@gmail.com";
        // EMAIL = "otroeamil@gmai.com";  No podemos cambiar el valor de una variabla constante (final)

    }

}
