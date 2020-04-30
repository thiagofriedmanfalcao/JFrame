package frame;

import javax.swing.*;
import java.awt.*;

public class ExemploFrame extends JFrame{

    public ExemploFrame() {
        JButton button1 = new JButton("PAUSAR");

        JLabel labelNome = new JLabel("Nome:");
        JLabel labelUsername = new JLabel("Username:");
        JLabel labelSenha = new JLabel("Senha:");
        JLabel labelObs = new JLabel("Obs:");

        JTextField textNome = new JTextField(25);
        JTextField textUsername = new JTextField(25);
        JTextField textSenha = new JTextField(25);
        
        JTextArea textAreaObs = new JTextArea(5, 30);

        JScrollPane scrollPane = new JScrollPane(textAreaObs);

        Container pane = this.getContentPane();
        pane.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        pane.add(labelNome);
        pane.add(textNome);

        pane.add(labelUsername);
        pane.add(textUsername);

        pane.add(labelSenha);
        pane.add(textSenha);
        
        pane.add(labelObs);
        pane.add(textAreaObs);

        textAreaObs.setLineWrap(true);

        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);        
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        pane.add(button1);

        this.setSize(600, 400);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        ExemploFrame objFrame = new ExemploFrame();
    }
}