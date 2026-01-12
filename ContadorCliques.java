import javax.swing.*;
import java.awt.event.*;//importacao das classes necessarias

public class ContadorCliques {
    static int contador = 0; //variavel para contar os cliques

    public static void main(String[] args) {//metodo principal
        JFrame janela = new JFrame("Contador de Cliques");//cria a janela com um titulo
        JButton botao = new JButton ("Clique aqui!");//cria o botao
        JLabel label = new JLabel("Numero de cliques: 0"); //label para exibir o numero de cliques 

        botao.setBounds(40, 150, 300, 40); //define o tamanho e a pisicao do botao
        label.setBounds(40, 100, 200, 30);//define o tamanho e a posicao do label
        janela.add(botao); //adiciona o botao na janela
        janela.add(label); //adiciona o label na janela

        janela.setSize(400, 500);//define o tamanho da janela
        janela.setLayout(null);//define o layout da janela como nulo
        janela.setVisible(true);//torna a janela visivel
    }
}
