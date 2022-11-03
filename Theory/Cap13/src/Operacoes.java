/**
 * @author isaquehg
 * @since 11/03/22
 * @version 1.0 Only Sum & Subtraction
 * Class for basic Math operations
 */
public class Operacoes {
    //input numbers
    public double num1;
    public double num2;

    /**
     * Needed Constructor for receiving parameters
     * @param num1 First number for the operations
     * @param num2 Second one for the operations
     */
    //constructor
    Operacoes(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    /**
     * Sum between two numbers
     * @return returns a Double
     */
    //operations between num1 'n num2
    public double sum(){
        return num1 + num2;
    }
    /**
     * Difference between two numbers
     * @return returns a Double
     */
    public double sub(){
        return num1 - num2;
    }
}
