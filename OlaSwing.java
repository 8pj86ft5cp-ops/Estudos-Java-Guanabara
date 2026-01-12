import javax.swing.JButton;
import javax.swing.JFrame;

    public class OlaSwing {
        public static void main(String[] args) {
          JFrame janela = new JFrame();
          JButton botao = new JButton("Click aqui,se voce for o MAYLANDER");
          
          botao.setBounds(40, 150, 300, 40);
          janela.add(botao);

          janela.setSize(400, 500);
          janela.setLayout(null);
          janela.setVisible(true);
        }


    }