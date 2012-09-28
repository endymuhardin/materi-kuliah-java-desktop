package belajar.swing.menu;

import javax.swing.*;
import java.awt.*;

public class DemoLayoutKombinasi {
    public static void main(String[] xx){
        // Beberapa button untuk demo
        JLabel lbNama = new JLabel("Nama");
        JLabel lbTelepon = new JLabel("Telepon");
        JTextField tfNama = new JTextField(20);
        JTextField tfTelepon = new JTextField(20);
        JButton btnSimpan = new JButton("Simpan");
        JButton btnBatal = new JButton("Batal");
        
        // Panel
        JPanel panel1 = new JPanel(new BorderLayout());
        JPanel panel8 = new JPanel();
        JPanel panel2 = new JPanel(new GridLayout(2,2));
        // defaultnya flow layout, tidak perlu diset
        JPanel panel3 = new JPanel(new FlowLayout(FlowLayout.TRAILING));
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel(new FlowLayout(FlowLayout.TRAILING));
        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel(new FlowLayout(FlowLayout.TRAILING));
        
        // penempatan panel dan komponen
        panel8.add(panel2);
        panel1.add(panel8, BorderLayout.CENTER);
        panel1.add(panel7, BorderLayout.SOUTH);
        panel2.add(panel3);
        panel2.add(panel4);
        panel2.add(panel5);
        panel2.add(panel6);
        
        panel3.add(lbNama);
        panel4.add(tfNama);
        panel5.add(lbTelepon);
        panel6.add(tfTelepon);
        
        panel7.add(btnSimpan);
        panel7.add(btnBatal);
        
        // menginstankan Frame
        JFrame fr = new JFrame("Belajar Layout");
        
        fr.getContentPane().add(panel1);
        // ukuran frame
        fr.setSize(600,200);
        
        // posisi di tengah
        fr.setLocationRelativeTo(null);
        
        // tampilkan
        fr.setVisible(true);
    }
}
