import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MonitorRede {
    public static void main(String[] args) { //metodo principal

        JFrame janela = new JFrame("VAMO TELECOM");// titulo da janela
        JLabel lblStatus = new JLabel("Status: Aguardando...", SwingConstants.CENTER);// Label de status
        JTextField txtIp = new JTextField("8.8.8.8"); // IP padrão
        JButton btnTestar = new JButton("Testar Conexão");// Botao de teste

        // Estilizando para parecer ferramenta de rede
        lblStatus.setFont(new Font("Arial", Font.BOLD, 16));// Fonte maior e em negrito
        lblStatus.setOpaque(true);// Necessario para mudar a cor de fundo
        lblStatus.setBackground(Color.LIGHT_GRAY);// Cor inicial
        lblStatus.setForeground(Color.BLACK);// Cor do texto

        txtIp.setBounds(50, 30, 200, 30);
        btnTestar.setBounds(50, 70, 200, 40);
        lblStatus.setBounds(0, 130, 300, 50);

        btnTestar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String ip = txtIp.getText();
                checkHost(ip, lblStatus);
            }
        });

        janela.add(txtIp);
        janela.add(btnTestar);
        janela.add(lblStatus);
        janela.setSize(300, 250);
        janela.setLayout(null);
        janela.setLocationRelativeTo(null); // Centraliza na tela
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // O método que fala com o Sistema Operacional
    public static void checkHost(String ip, JLabel label) {
        try {
            // No Windows, o comando é "ping -n 1" (manda apenas 1 pacote)
            Process processo = Runtime.getRuntime().exec("ping -n 1 " + ip);
            int retorno = processo.waitFor();

            if (retorno == 0) {
                label.setText("ONLINE: " + ip);
                label.setBackground(Color.GREEN);
                label.setForeground(Color.BLACK);
            } else {
                label.setText("OFFLINE: " + ip);
                label.setBackground(Color.RED);
                label.setForeground(Color.WHITE);
            }
        } catch (Exception err) {
            label.setText("Erro ao executar ping.");
        }
    }
}