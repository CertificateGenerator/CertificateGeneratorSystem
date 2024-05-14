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
        
        // passar uma lista de pessoas que vão receber esse certificado
        // poder escrever um template de texto para substituir no PDF
        // o componente recebe o endereço da imagem, que está na aplicação
        // o default pode ser uma imagem em branco ou pegar no resources
        // o componente pode ter uma forma de ter um template com o título, texto, quantos templates vamos desenvolver (2)
        // deixar uma forma clara pra se usar o componente ter como estender e passar outro template
        // usar variáveis pra conseguir sobrescrever e gerenciar se quiser mudar
        // deixar ele mais genérico com os padrões de projeto
        // pensar o mais simples possível mas já nas issues do github: definir uma linguagem de script ou linguagem template ou usar alguma
        // propriedade de título, texto, pode ter assinatura (1, 2, 3)
        // o certificado pode não ser de participante, pode ter uma outra entidade, pensar em componentes genéricos
        // fazer segregação de interface e injeção de dependência (aplicar solid) 
        // podemos fazer um UML e um diagrama pra gente ver
	}
}