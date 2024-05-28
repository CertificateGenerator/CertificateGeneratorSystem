package br.ucsal;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
	
		String outputPath = "../CertificateGeneratorSystem/output";
		
		String backgroundPath = "src/main/resources/seminario_background.jpg";
        
		CertificateGenerator certificateGenerator = new CertificateGenerator(outputPath, backgroundPath);
		
		List<Participante> participants = new ArrayList<>();
		participants.add(new Participante("John Doe", "john@example.com", "Seminário de Engenharia de Software", 10));
		participants.add(new Participante("Jane Smith", "jane@example.com", "Seminário de Engenharia de Software", 8));
		
		certificateGenerator.generateCertificatesFromList(participants);
		
		//File inputFile = new File("/path/to/input/file.xlsx");
		//certificateGenerator.generateCertificatesFromFile(inputFile);
	}
}
