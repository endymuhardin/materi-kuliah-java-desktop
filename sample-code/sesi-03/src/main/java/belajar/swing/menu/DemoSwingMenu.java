package belajar.swing.menu;

import javax.swing.*;
import java.awt.event.*;

public class DemoSwingMenu {
    public static void main(String[] xx){
        
        // menginstankan Frame
        JFrame fr = new JFrame("Belajar Menu");
        
        // Menu Bar
        JMenuBar menubar = new JMenuBar();
        
        // buat menu
        JMenu menuFile = new JMenu("File");
        
        // buat anaknya menu file
        JMenuItem miFileNew = new JMenuItem("New");
        JMenuItem miFileOpen = new JMenuItem("Open");
        
        // ini ada submenunya
        JMenu miFileRecent = new JMenu("Recent");
        int jumlahSubmenu = 3;
        for(int i=0; i<jumlahSubmenu; i++){
            miFileRecent.add(new JMenuItem("File "+(i+1)));
        }
        
        // pasang
        menuFile.add(miFileNew);
        menuFile.add(miFileOpen);
        
        // berikan separator
        menuFile.addSeparator();
        
        menuFile.add(miFileRecent);
        
        // pasang di menubar
        menubar.add(menuFile);
        
        // pasang di Frame
        fr.setJMenuBar(menubar);
        
        
        // Popup Menu
        final JPopupMenu pop = new JPopupMenu();
        JMenuItem miCut = new JMenuItem("Cut");
        JMenuItem miCopy = new JMenuItem("Copy");
        
        pop.add(miCut);
        pop.add(miCopy);
        
        JPanel panel = new JPanel();
        fr.getContentPane().add(panel);
        
        // pasang popup menu di menuitem Open
        panel.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e) {
                // aktif hanya bila klik kanan
                if(e.getButton() != MouseEvent.BUTTON3){
                    return;
                }
                pop.show(
                e.getComponent(), // parent component 
                e.getX(),  // posisi X
                e.getY()); // posisi Y
            }
        });
        
        // ukuran frame
        fr.setSize(400,400);
        
        // posisi di tengah
        fr.setLocationRelativeTo(null);
        
        // tampilkan
        fr.setVisible(true);
    
    }
}
