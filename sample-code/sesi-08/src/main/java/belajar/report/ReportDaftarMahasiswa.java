package belajar.report;

import java.io.InputStream;

import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.xml.JRXmlLoader;

public class ReportDaftarMahasiswa{
	private static String templateReport
		= "/daftar-mahasiswa.jrxml";

	public static void main(String[] xx) throws Exception {
		// 1. Load template
		InputStream template = 
			ReportDaftarMahasiswa.class
			.getResourceAsStream(templateReport);

		JasperDesign jd = JRXmlLoader.load(template);

		// 2. Compile
		JasperReport report 
			= JasperCompileManager.compileReport(jd);

		// 3. Isi data
		List<Mahasiswa> daftarMahasiswa = buatSampleData();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("tahun", 2012);

		JasperPrint jrprint = 
				JasperFillManager.fillReport(report,
                params, 
                new JRBeanCollectionDataSource(
                	daftarMahasiswa));

		// 4. Export
		JRPdfExporter exporter = new JRPdfExporter();
				
		exporter.setParameter(
			JRExporterParameter.JASPER_PRINT, 
			jrprint);

		exporter.setParameter(
			JRExporterParameter.OUTPUT_FILE_NAME, 
			"target/daftar-mahasiswa-pdf");
		
		exporter.exportReport();
	}

	private static List<Mahasiswa> buatSampleData(){
		// nantinya ini query dari database
		List<Mahasiswa> hasil = new ArrayList<Mahasiswa>();

		Mahasiswa m1 = new Mahasiswa();
		m1.setNpm("NPM-001");
		m1.setNama("Mahasiswa 001");
		m1.setIpk(new BigDecimal("3.1"));
		hasil.add(m1);

		Mahasiswa m2 = new Mahasiswa();
		m2.setNpm("NPM-002");
		m2.setNama("Mahasiswa 002");
		m2.setIpk(new BigDecimal("3.2"));
		hasil.add(m2);

		Mahasiswa m3 = new Mahasiswa();
		m3.setNpm("NPM-003");
		m3.setNama("Mahasiswa 003");
		m3.setIpk(new BigDecimal("3.3"));
		hasil.add(m3);

		Mahasiswa m4 = new Mahasiswa();
		m4.setNpm("NPM-004");
		m4.setNama("Mahasiswa 004");
		m4.setIpk(new BigDecimal("3.4"));
		hasil.add(m4);

		Mahasiswa m5 = new Mahasiswa();
		m5.setNpm("NPM-005");
		m5.setNama("Mahasiswa 005");
		m5.setIpk(new BigDecimal("3.5"));
		hasil.add(m5);

		return hasil;

	}
}