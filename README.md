# Analisador léxico para a Linguagem LA

## Pré-requisitos

Java 11 ou superior (ver [Java: Can't use ANTLR 4.11.1 on Java 8 #3994] https://github.com/antlr/antlr4/issues/3994 )
Maven

## Compilação

É necessário compilar o projeto via Maven

    mvn clean package
    
## Rodar

Para rodar a suite de testes inteira
    
    ./test_run.sh

Para rodar para um par `entrada` e `saida` arbitrário

    java -jar target/lalex-1.0-SNAPSHOT-jar-with-dependencies.jar entrada saida
