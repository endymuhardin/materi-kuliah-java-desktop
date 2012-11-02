package belajar.swing.event;

import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.*;

public class TextComponentDemo {
    public static void main(String[] xx){
        // 0. Bikin Frame
        JFrame fr = new JFrame("Demo Text Component");
        
        // 1. Set size
        fr.setSize(400,400);
        
        // 2. Tambahkan panel
        JPanel isi = new JPanel(new GridLayout(3,1));
        fr.getContentPane().add(isi);
        
        
        // 3. Tambahkan komponen
        JTextField tfNama = new JTextField(20);
        JPanel pnlNama = new JPanel();
        pnlNama.add(new JLabel("Nama : "));
        pnlNama.add(tfNama);
        isi.add(pnlNama);
        
        JPasswordField tfPass = new JPasswordField(20);
        tfPass.setEchoChar('x');
        JPanel pnlPass = new JPanel();
        pnlPass.add(new JLabel("Password : "));
        pnlPass.add(tfPass);
        isi.add(pnlPass);
        
        // text area dengan ukuran 10 baris x 20 kolom
        final JTextArea taAlamat = new JTextArea(10,20);
        taAlamat.setLineWrap(true); // ganti baris kalau sudah mentok kanan
        JPanel pnlAlamat = new JPanel();
        pnlAlamat.add(new JLabel("Alamat : "));
        
        // scrollbar untuk membungkus textarea
        JScrollPane scrAlamat = new JScrollPane(taAlamat);
        pnlAlamat.add(scrAlamat);
        isi.add(pnlAlamat);
        
        // 4. Event Handler
        class TampilkanKetikanListener implements KeyListener{
            public void keyTyped(KeyEvent e){
                char huruf = e.getKeyChar();
                String isi = taAlamat.getText();
                isi = isi + huruf;
                taAlamat.setText(isi);
            }
            public void keyPressed(KeyEvent e){}
            public void keyReleased(KeyEvent e){}
        }
        
        TampilkanKetikanListener t = new TampilkanKetikanListener();
        tfNama.addKeyListener(t);
        tfPass.addKeyListener(t);
        
        // 5. Tampilkan
        fr.setLocationRelativeTo(null);
        fr.setVisible(true);
    }
}
