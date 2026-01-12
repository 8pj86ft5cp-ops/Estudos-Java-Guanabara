import javax.swing.*;
 

public class ConversoDeTemperatura {
    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog("Digite a temperatura em Celsius:");//caixa de dialogo para entranda de dados 
        Double Celsius = Double.parseDouble(entrada);//converter a entrada para double
        Double Fahrenheit = (Celsius *9/5) +32;//formula de conversao de celsius para fahreneit
        JOptionPane.showMessageDialog(null,"A temperatura em Fahrenheit é:"+ Fahrenheit + "ºF");
    }
    
}
