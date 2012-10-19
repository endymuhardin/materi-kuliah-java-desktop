package belajar.swing.widget;

import javax.swing.*;
import java.awt.GridLayout;

public class ButtonDemo {
    public static void main(String[] xx){
        // 0. Bikin Frame
        JFrame fr = new JFrame("Demo Button");
        
        // 1. Set size
        fr.setSize(400,400);
        
        // 2. Tambahkan panel
        JPanel isi = new JPanel(new GridLayout(3,1));
        fr.getContentPane().add(isi);
                
        // 3. Tambahkan komponen
        JRadioButton rbPria = new JRadioButton("Pria");
        JRadioButton rbWanita = new JRadioButton("Wanita");
        
        // dalam satu group harus pilih salah satu
        ButtonGroup bgJenis = new ButtonGroup();
        bgJenis.add(rbPria);
        bgJenis.add(rbWanita);
        
        JPanel pnlJenis = new JPanel();
        pnlJenis.add(new JLabel("Jenis Kelamin : "));
        pnlJenis.add(rbPria);
        pnlJenis.add(rbWanita);
        isi.add(pnlJenis);
        
        JCheckBox cbMembaca = new JCheckBox("Membaca");
        JCheckBox cbBerenang = new JCheckBox("Berenang");
        JPanel pnlHobi = new JPanel();
        pnlHobi.add(new JLabel("Hobi"));
        pnlHobi.add(cbMembaca);
        pnlHobi.add(cbBerenang);
        isi.add(pnlHobi);
        
        JButton btnSimpan = new JButton("Simpan");
        JButton btnBatal = new JButton("Batal");
        btnBatal.setEnabled(false); // enable/disable
        JPanel pnlTombol = new JPanel();
        pnlTombol.add(btnSimpan);
        pnlTombol.add(btnBatal);
        isi.add(pnlTombol);
        
        // 4. Tampilkan
        fr.setLocationRelativeTo(null);
        fr.setVisible(true);
    }
}
