package belajar.swing.tabel;

import javax.swing.table.AbstractTableModel;

import java.util.List;
import java.util.ArrayList;

public class MahasiswaTableModel extends AbstractTableModel{
    private String[] namaKolom 
    = new String[]{"NPM", "Nama"};
    
    private List<Mahasiswa> dataMahasiswa = new ArrayList<Mahasiswa>();
    
    public MahasiswaTableModel(List<Mahasiswa> data){
        this.dataMahasiswa = data;
    }
    
    public String getColumnName(int col) {
        return namaKolom[col].toString();
    }
    public int getRowCount() { return dataMahasiswa.size(); }
    public int getColumnCount() { return namaKolom.length; }
    public Object getValueAt(int baris, int kolom) {
        Mahasiswa m = dataMahasiswa.get(baris);
        
        switch(kolom){
            case 0: return m.getNpm();
            case 1: return m.getNama();
            default: return null;
        }
    }
    
    public boolean isCellEditable(int row, int col){ return true; }
    public void setValueAt(Object value, int baris, int kolom) {
        Mahasiswa m = dataMahasiswa.get(baris);
        String isi = (String) value;
        
        switch(kolom){
            case 0: m.setNpm(isi); break;
            case 1: m.setNama(isi); break;
            default: break;
        }
        fireTableCellUpdated(baris, kolom);
    }
}
