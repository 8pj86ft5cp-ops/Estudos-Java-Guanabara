import javax.swing.*;
import java.awt.*;

public class VerificadorIdade {
    public static void main(String[] args) {//metodo principal
        JFrame janela = new JFrame("Verificador de Idade");//cria a janela com um titulo
        JLabel label  = new JLabel("Digite sua idade:");//cria o label para intruir o usuario
        JTextField campoIdade = new JTextField();//cria o campo de texto para o usuario digitar a idade
        JButton botaoVerificado = new JButton ("Verificar Idade");//cria o botao para verificar a idade
        JLabel resultado = new JLabel("");//cria o label para exibir o resultado
        label.setBounds(20, 30, 40, 50);
        campoIdade.setBounds(40, 100, 400, 100);
        botaoVerificado.setBounds(40, 150, 100,100);
        resultado.setBounds(40, 200, 400, 600);

        janela.add(label);
        janela.add(campoIdade);
        janela.add(botaoVerificado);
        janela.add(resultado);

        janela.setSize(500, 700);
        janela.setLayout(null);
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
