package belajar.swing.menu;

import javax.swing.*;
import java.awt.BorderLayout;

public class DemoBorderLayout {
    public static void main(String[] xx){
        // Beberapa button untuk demo
        JButton btn1 = new JButton("Tombol 1");
        JButton btn2 = new JButton("#2");
        JButton btn3 = new JButton("Tombol Tiga");
        JButton btn4 = new JButton("Tombol 4 : Panjang");
        JButton btn5 = new JButton("Btn 5");
        JButton btn6 = new JButton("No. 6");
        
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(btn1, BorderLayout.NORTH);
        panel.add(btn2, BorderLayout.SOUTH);
        panel.add(btn3, BorderLayout.WEST);
        panel.add(btn4, BorderLayout.EAST);
        panel.add(btn5, BorderLayout.CENTER);
        
        // tidak bisa add button 6, tempatnya cuma 5
        // panel.add(btn6);
        
        // menginstankan Frame
        JFrame fr = new JFrame("Belajar Layout");
        
        fr.getContentPane().add(panel);
        // ukuran frame
        fr.setSize(800,400);
        
        // posisi di tengah
        fr.setLocationRelativeTo(null);
        
        // tampilkan
        fr.setVisible(true);
    }
}
