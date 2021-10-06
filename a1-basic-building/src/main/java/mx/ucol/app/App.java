package mx.ucol.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Operations op = new Operations();
        int firstNumber = 10;
        int secondNumber = 5;

        String environmentalVariable;

        try {
            environmentalVariable = System.getProperty("WSNSHELL_HOME");
            System.out.println("EnvVar: " + environmentalVariable);
        } catch (Exception e) {
            System.err.println(e);
        }

        System.out.println( "This is the Basic Building app." );
        System.out.println("We can perform basic operations here: ");
        System.out.format("Addition: %d + %d = %d\n", firstNumber, secondNumber, op.addition(firstNumber, secondNumber));
        System.out.format("Substraction: %d + %d = %d\n", firstNumber, secondNumber, op.substraction(firstNumber, secondNumber));
        System.out.format("Multiplication: %d + %d = %d\n", firstNumber, secondNumber, op.multiplication(firstNumber, secondNumber));
        // Made a change
    }
}
