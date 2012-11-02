package belajar.swing.event;

import javax.swing.*;
import java.awt.GridLayout;

public class TabDemo {
    public static void main(String[] xx){
        // 0. Bikin Frame
        JFrame fr = new JFrame("Demo Tab");
        
        // 1. Set size
        fr.setSize(400,400);
        
        // 2. Tambahkan panel
        JTabbedPane isi = new JTabbedPane();
        isi.setTabPlacement(JTabbedPane.BOTTOM);
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
        isi.addTab("Jenis Kelamin",pnlJenis);
        
        JCheckBox cbMembaca = new JCheckBox("Membaca");
        JCheckBox cbBerenang = new JCheckBox("Berenang");
        JPanel pnlHobi = new JPanel();
        pnlHobi.add(new JLabel("Hobi"));
        pnlHobi.add(cbMembaca);
        pnlHobi.add(cbBerenang);
        isi.addTab("Hobi",pnlHobi);
        
        JButton btnSimpan = new JButton("Simpan");
        JButton btnBatal = new JButton("Batal");
        btnBatal.setEnabled(false); // enable/disable
        JPanel pnlTombol = new JPanel();
        pnlTombol.add(btnSimpan);
        pnlTombol.add(btnBatal);
        isi.addTab("Proses",pnlTombol);
        
        JSlider slider = new JSlider(
            JSlider.HORIZONTAL,
            0, // minimum
            100, // maksimum
            10 // posisi awal
        );
        
        JPanel pnlSlider = new JPanel();
        pnlSlider.add(new JLabel("Volume : "));
        pnlSlider.add(slider);
        isi.addTab("Slider", pnlSlider);
        
        int tahun = 2012;
        SpinnerModel spTahun = new SpinnerNumberModel(
            tahun,          // posisi awal
            tahun - 100,    // minimum
            tahun + 100,    // maksimum
            1               // increment/decrement
        );
        JSpinner spinner = new JSpinner(spTahun);
        spinner.setEditor(new JSpinner
                    .NumberEditor(spinner,"####"));
        JPanel pnlSpin = new JPanel();
        pnlSpin.add(new JLabel("Tahun : "));
        pnlSpin.add(spinner);
        isi.addTab("Spinner", pnlSpin);
        
        // 4. Tampilkan
        fr.setLocationRelativeTo(null);
        fr.setVisible(true);
    }
}
