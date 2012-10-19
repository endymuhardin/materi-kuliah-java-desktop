package belajar.swing.widget;

import javax.swing.*;
import java.awt.BorderLayout;
import javax.swing.border.*;
import javax.swing.tree.*;

public class TreeDemo {
    public static void main(String[] xx){
        // 0. Bikin Frame
        JFrame fr = new JFrame("Demo Tree");
        
        // 1. Set size
        fr.setSize(400,400);
        
        // 2. Bagi dua dengan split pane
        JPanel pnlKiri = new JPanel(new BorderLayout());
        JPanel pnlKanan = new JPanel();
        
        // berikan border supaya ada labelnya
        TitledBorder brdKiri = 
            BorderFactory.createTitledBorder("Panel Kiri");
        TitledBorder brdKanan = 
            BorderFactory.createTitledBorder("Panel Kanan");
        
        pnlKiri.setBorder(brdKiri);
        pnlKanan.setBorder(brdKanan);
        
        JSplitPane split = new JSplitPane(
            JSplitPane.HORIZONTAL_SPLIT,
            pnlKiri,
            pnlKanan
        );
        split.setDividerLocation(150);
        fr.getContentPane().add(split);
        
        // 3. Tambahkan tree di panel kiri
        DefaultMutableTreeNode root =
            new DefaultMutableTreeNode("Pemrograman 3");
        
        DefaultMutableTreeNode sesi01 =
            new DefaultMutableTreeNode("Sesi 01");
        
        DefaultMutableTreeNode sesi0101 =
            new DefaultMutableTreeNode("Setup Project");
        
        DefaultMutableTreeNode sesi0102 =
            new DefaultMutableTreeNode("Memahami Frame");
        
        DefaultMutableTreeNode sesi02 =
            new DefaultMutableTreeNode("Sesi 02");
            
        // digabungkan
        root.add(sesi01);
        sesi01.add(sesi0101);
        sesi01.add(sesi0102);
        root.add(sesi02);
        
        JTree tree = new JTree(root);
        JScrollPane scrTree = new JScrollPane(tree);
        pnlKiri.add(scrTree);
        
        // 4. Tampilkan
        fr.setLocationRelativeTo(null);
        fr.setVisible(true);
    }
}
