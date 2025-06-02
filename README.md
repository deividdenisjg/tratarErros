## 📖 Sobre

Este projeto é um microsserviço que possui dois endpoints um para criação de usuário e outro para pesquisar usuário por id. O objetivo desse projeto é apenas
criar uma forma amigável para retornar mensagens quando o usuário não for encontrado.

Nesse projeto foi criado uma classe global que utiliza a anotação RestControllerAdvice para que possa ficar "escutando" toda a aplicação e direcionando para
as exeções corretas de acordo com o nome da classe passada pela anotação ExceptionHandler.

As mensagens de erro são formatadas seguindo o modelo da classe ErrorResponse localizada no pacote "response".

O projeto existe apenas duas tratativas de erros que são de "Usuário não encontrado" e "Erro interno", mas esses métodos são apenas exemplos sendo possível criar
diferentes tratativas como para aplicação sem conexão com banco de dados, senha inválida entre outros.

Aqui foi apenas uma demostração de como utilizar exceções de forma amigável para o usuário, além de estudar uma pouco mais sobre Java, Spring Boot, Docker, Maven e MongoDB.

## 🚀 Tecnologias Utilizadas

Este projeto foi desenvolvido com as seguintes tecnologias:

- Java 17  
- Spring Boot  
- MongoDB
- Maven  
- Docker
- Postman (testar a API)

Crie um Docker-compose.yaml para subir o microserviço e o mongodb no docker:    
services:
  trataerror:
    container_name: trataerros
    build:
      context: ./trataerros
    ports:
      - "8080:8080"
    networks:
      - app-network

  mongodb:
    container_name: mongodb
    image: mongo:6.0
    ports:
      - "27017:27017"
    networks:
      - app-network

networks:
  app-network:
    driver: bridge
