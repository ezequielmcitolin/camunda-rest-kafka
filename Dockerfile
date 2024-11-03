# Passo 01: Construção da aplicação
FROM maven:3.9.4-eclipse-temurin-17 AS build

WORKDIR /app
COPY pom.xml .

# Atualização das dependências
RUN mvn dependency:go-offline

# Copia o projeto inteiro
COPY . .

# Construção da aplicação
RUN mvn clean package -DskipTests 

# Passo 02: Constrói a imagem final
FROM openjdk:17-alpine AS run

# Define e copia o arquivo da aplicação
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar

# A aplicação rodará na porta 80
EXPOSE 8080

# Execução do Entrypoint da
ENTRYPOINT ["java","-jar","app.jar"]
