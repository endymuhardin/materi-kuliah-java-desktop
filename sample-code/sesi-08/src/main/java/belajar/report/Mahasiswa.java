package belajar.report;

import java.math.BigDecimal;

public class Mahasiswa {
	private String npm;
	private String nama;
	private BigDecimal ipk;

	public String getNpm(){
		return npm;
	}

	public void setNpm(String npm){
		this.npm = npm;
	}

	public String getNama(){
		return nama;
	}

	public void setNama(String nama){
		this.nama = nama;
	}

	public BigDecimal getIpk(){
		return ipk;
	}

	public void setIpk(BigDecimal ipk){
		this.ipk = ipk;
	}
}