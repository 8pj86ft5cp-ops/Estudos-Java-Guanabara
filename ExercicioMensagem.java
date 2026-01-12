import javax.swing.JOptionPane;//importacao da classe JOptionPane
import javax.swing.JButton;//importacao da classe JButton
import javax.swing.JFrame;//importacao da classe JFrame
 

public class ExercicioMensagem {//definicao da classe
    public static void main(String[] args) {//metodo principal 

    String nome = JOptionPane.showInputDialog("Qual e o seu nome?");//caixa de dialogo para entrada de dados
    JOptionPane.showMessageDialog(null, "Seja bem-vindo, " + nome + ",clique embaixo!");//caixa de dialogo para exibir mensagem personalizada 
    
        JFrame janela = new JFrame();//cria a janela
        JButton botao = new JButton("Clique aqui " + nome); //cria o botao com uma mensagem personalizada
//anulei todo o codigo abaixo,por abir uma janela secundaria com um botao,similar ao exercicio anteriro, codigo funciona,mas fico sem sentindo manter ele baixo daqui

       // botao.setBounds(40, 150, 300, 40); //define o tamanho e a pisicao do botao
       // janela.add(botao); //adiciona o botao na janela

       // janela.setSize(400, 500);//define o tamanho da janela
       // janela.setLayout(null);//define o layout da janela como nulo
        //janela.setVisible(true);//torna a janela visivel 

    }
}
