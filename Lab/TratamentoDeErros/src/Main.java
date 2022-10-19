import javax.swing.*;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        /*
        - throws
        - try
        - catch
        - finally
        * */

        //JOptionPane
        //Confirmation
        //JOptionPane.showConfirmDialog(null, "ok");

        //Input
        //String input1 = JOptionPane.showInputDialog("Message");

        //Message
        //JOptionPane.showMessageDialog(null, "CALCULADORA");

        //CALCULADORA
        System.out.println("------------------------------");
        JOptionPane.showMessageDialog(null, "CALCULADORA");
        String operacao = JOptionPane.showInputDialog("Escolha uma operação(SOMAR: 0, SUBTRAIR: 1, DIVIDIR: 2, MULTIPLICAR: 3): ");
        try {
            int op = parseInt(operacao);
            if ((op == 0) || (op == 1) || (op == 2) || (op == 3)) {
                int result = 0;

                String numero1 = JOptionPane.showInputDialog("Digite o primeiro número");
                String numero2 = JOptionPane.showInputDialog("Digite o segundo número");
                try {
                    int num1 = parseInt(numero1);
                    int num2 = parseInt(numero2);

                    if (op == 0) {
                        result = num1 + num2;
                    } else if (op == 1) {
                        result = num1 - num2;
                    } else if (op == 2) {
                        try {
                            result = num1 / num2;
                        } catch (ArithmeticException e) {
                            JOptionPane.showMessageDialog(null, "Divisão por zero!");
                        }
                    } else{
                        result = num1 * num2;
                    }
                    String result_str = Integer.toString(result);
                    JOptionPane.showMessageDialog(null, result_str);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Valores não válidos!!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Valor de Operação não válido!");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor não válido!");
        }
    }
}