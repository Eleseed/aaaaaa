package pokemoninterface;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;
public class MyFrame extends JFrame implements ActionListener{
    JButton button;
    JButton b2;
    JButton b3;
    JButton b4;
    JLabel fundo;
    MyFrame() {    
        super("Pokemon");
        fundo = new JLabel(new ImageIcon("images\\fundo.jpg"));
        fundo.setBounds(0,0,1920,1080);
        
        button = new JButton();
        button.setBounds(610,750,200,50);
        button.addActionListener(this);
        button.setText("Jogar");
        button.setFocusable(false);
        button.setFont(new Font("Comic Sans",Font.BOLD,25));
        button.setBorder(BorderFactory.createEtchedBorder());
        
        b2 = new JButton();
        b2.setBounds(610,850,200,50);
        b2.addActionListener(this);
        b2.setText("Ranking");
        b2.setFocusable(false);
        b2.setFont(new Font("Comic Sans",Font.BOLD,25));
        b2.setBorder(BorderFactory.createEtchedBorder());
        
        b3 = new JButton();
        b3.setBounds(1110,750,200,50);
        b3.addActionListener(this);
        b3.setText("Saiba mais");
        b3.setFocusable(false);
        b3.setFont(new Font("Comic Sans",Font.BOLD,25));
        b3.setBorder(BorderFactory.createEtchedBorder());
        
        b4 = new JButton();
        b4.setBounds(1110,850,200,50);
        b4.addActionListener(this);
        b4.setText("Sair");
        b4.setFocusable(false);
        b4.setFont(new Font("Comic Sans",Font.BOLD,25));
        b4.setBorder(BorderFactory.createEtchedBorder());
        
        this.setSize(1920,1080);
        this.setResizable(false);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        fundo.add(button);
        fundo.add(b2);
        fundo.add(b3);
        fundo.add(b4);
        getContentPane().add(fundo);
        this.add(button);
        this.add(b2);
        this.add(b3);
        this.add(b4);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button) {
            System.out.println("Botão funciona");
        }
        else if(e.getSource()==b2) {
            System.out.println("Botão funciona");
        }
        else if(e.getSource()==b3) {
            System.out.println("Botão funciona");
        }
        else if(e.getSource()==b4) {
            System.out.println("Botão funciona");
        }
        
        
    }
}
