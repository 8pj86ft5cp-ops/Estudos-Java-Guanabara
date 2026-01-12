import javax.swing.*;
import java.awt.Color;

public class ExercicioLayout {
 
    public static void main(String[] args) {
        JFrame janela = new JFrame ("Exercicio de Layout");
        JButton botao = new JButton( "botao A"); 
        JButton botaoB = new JButton ("botao B"); 

        botao.setBounds(40, 0, 300, 40);
        botaoB.setBounds(40, 500, 300, 40);
        janela.add(botao);
        janela.add(botaoB);

        botao.setBackground(Color.GREEN);
        botao.setForeground(Color.WHITE);
        botaoB.setBackground(Color.RED);
        botaoB.setForeground(Color.BLACK);

        janela.setSize(400,600);
        janela.setLayout(null);
        janela.setVisible(true);
    }
}      
