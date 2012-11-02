package belajar.swing.combo;

public class Mahasiswa{
    private String npm;
    private String nama;
    
    public String getNpm(){
        return this.npm;
    }
    
    public void setNpm(String x){
        this.npm = x;
    }
    
    public String getNama(){
        return this.nama;
    }
    
    public void setNama(String x){
        this.nama = x;
    }
    
    public String toString(){
        return "["+this.npm+"] - " + this.nama;
    }
}
