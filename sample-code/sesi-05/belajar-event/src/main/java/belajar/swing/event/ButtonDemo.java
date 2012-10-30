package belajar.swing.event;

import java.awt.event.*;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.Component;

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
        final JButton btnBatal = new JButton("Batal");
        btnBatal.setEnabled(false); // enable/disable
        JPanel pnlTombol = new JPanel();
        pnlTombol.add(btnSimpan);
        pnlTombol.add(btnBatal);
        isi.add(pnlTombol);
        
        // 4. Membuat Listener sebagai Inner Class
        class HaloListener implements ActionListener {
            public void actionPerformed(ActionEvent e){
                System.out.println("Terjadi ActionEvent");
                btnBatal.setEnabled(true);
            }
        }
        
        class ListenerUntukMouse implements MouseListener{
            public void mouseClicked(MouseEvent e){
                System.out.println("Mouse diklik");
                Component sumberEvent = e.getComponent();
                System.out.println("Komponen : "+sumberEvent.getClass().getName());
                
                if(JButton.class.isAssignableFrom(sumberEvent.getClass())){
                    JButton btn = (JButton) sumberEvent;
                    System.out.println("Label : "+btn.getText());
                }
                
                switch(e.getButton()){
                    case MouseEvent.BUTTON1:
                        System.out.println("Klik tombol kiri");
                        break;
                    case MouseEvent.BUTTON2:
                        System.out.println("Klik tombol tengah");
                        break;
                    case MouseEvent.BUTTON3:
                        System.out.println("Klik tombol kanan");
                        break;
                    default: 
                        System.out.println("Tombol tidak dikenali");
                }
                
                int jumlahKlik = e.getClickCount();
                System.out.println("Diklik "+jumlahKlik+" kali");
                
            }
            public void mousePressed(MouseEvent e){}
            public void mouseReleased(MouseEvent e){}
            public void mouseEntered(MouseEvent e){
                System.out.println("Mouse enter");
            }
            public void mouseExited(MouseEvent e){
                System.out.println("Mouse exit");
            }
        }
        
        // 5. Pasang Listener
        HaloListener h = new HaloListener();
        btnSimpan.addActionListener(h);
        
        ListenerUntukMouse l = new ListenerUntukMouse();
        btnBatal.addMouseListener(l);
        cbBerenang.addMouseListener(l);
        
        // 6. Tampilkan
        fr.setLocationRelativeTo(null);
        fr.setVisible(true);
    }
    
    
}




