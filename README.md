# Exemplo de projeto com SpringBoot + Rest + MongoDB + Maven

- Utilzando exemplo com separação por módulos (core, web)

Foi utilizado no exemplo:
- Java 8
- Maven
- SpringBoot 2.0
- SpringBoot Web Starter
- SpringBoot Data Starter - MongoDB
- logback

- Configure sua conexão nos properties application-dev / application-prod

- Crie um database no mongoDB com o nome: appbd

- crie uma collection com o nome: "pessoa"

- inclua um registro na collection "pessoa" para simular o serviço:
  exemplo:

{
    "_id" : 1,
    "nome" : "gustavo",
    "idade" : "32",
    "email" : "gdinsantos1@gmail.com"
}

- verifique / altere o destino dos logs de sua aplicação em: logback.xml

- para simular, execute o Application.java (modulo web), passando como argumento o seguinte parametro:
-Dspring.profiles.active=dev (ou prod)

