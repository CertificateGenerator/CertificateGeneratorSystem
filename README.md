# Sistema de Geração de Certificados

O **`CertificateGeneratorSystem`** é uma aplicação de exemplo que utiliza o **`CertificateGeneratorComponent`** para gerar certificados para participantes de eventos. 

## ⚙️ Como Usar

- Para usar o **`CertificateGeneratorComponent`**, é necessário compilar o JAR através do comando mvn package no projeto **`CertificateGeneratorComponent`**. Em seguida, adicione o JAR resultante ao Build Path do projeto CertificateGeneratorSystem.
- Primeiro, clone o repositório do **`CertificateGeneratorComponent`** e compile o JAR usando o comando mvn package.
- No projeto **`CertificateGeneratorSystem`**, clique com o botão direito no projeto > Build Path > Configure Build Path > Adicionar JARs Externos e selecione o JAR do **`CertificateGeneratorComponent`**.

## 👤 Lista de Participantes 

```java
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
    }
}
```
Certifique-se de ajustar os caminhos dos arquivos conforme necessário.

## 📊 Planilha de Participantes

```java
  File inputFile = new File("/path/to/input/file.xlsx");
  certificateGenerator.generateCertificatesFromFile(inputFile);
```
