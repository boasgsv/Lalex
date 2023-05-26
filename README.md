Gabriele Souza Vilas Bôas           745738
Geovanne Mansano Fritch da Silva    791072
Pedro Gonçalves dos Santos          794042

# Analisador léxico para a Linguagem LA

## Pré-requisitos

- Java 11 ou superior (ver [Java: Can't use ANTLR 4.11.1 on Java 8 #3994] https://github.com/antlr/antlr4/issues/3994 )

- Apache Maven 3.6.3 ou superior

## Compilação

É necessário compilar o projeto via Maven com:

    mvn clean compile

Em sequência, para empacotar o projeto:

    mvn package
    
## Rodar

Para rodar a suite de testes inteira
    
    ./test_run.sh

Para rodar para um par `entrada` e `saida` arbitrário, basta seguir o código abaixo e indicar caminho dos arquivos de entrada e saída

    java -jar target/lalex-1.0-SNAPSHOT-jar-with-dependencies.jar path_entrada path_saida
