# camunda-rest-kafka

Teste

# Tecnologias

    - Repositório: Github
    - CI/CD: GitHub Actions
    - Build: Maven
    - Testes Automatizados: JUnit
    - Análise de Código: SonarQube
    - Deploy Automatizado: Docker - Azure App Service

# Objetivo

Camunda é uma solução qua traz a integração e possibilidade de desenvolvimento de fluxos BPMN com a integração de código juntamente ao processo, desta forma, o objetivo desta solução, é realizar uma simulação de multiplas origens REST e KAFKA para o processamento distribuido de processos, mas com visibilidade de fim a fim.

# Estratégia

Para este projeto, é adotado o processo de gitflow

Branchs:
1. feature/<CódigoTask>: Apresenta o desenvolvimento de uma tarefa ou conjunto de tarefas
2. dev 
3. release/<dataRelease>
4.
5. main -> Código que está em produção e deve ser tageado para ser gerado a versão de build para o ambiente de produção.


# Publicação

A cada momento que for necessário realizar a publicação, para que seja o mais prático de se gerenciar possível, será adotada a conteinirização do produto. Desta forma, as tags e informações serão responsáveis para determinar o ambiente e processo de publicação.


# Código

1. É adotado o padrão de MVC (Model-View-Controller) para o desenvolvimento.
2. As especificiedades do objeto devem ser adotadas como última parte do nome do objeto
Exemplo:
DTO => <Classe>DTO.java
Controller => <Nome>Controller.java

* Casos especificos devem ser adicionados se necessário

# Commits

Devem:

1. Usar o modo imperativo na linha do assunto
2. Explicar no corpo do texto as mudanças feitas e o motivo
3. Descrever o problema, não presumindo que o revisor o entenda
4. Identifique no inicio do commit o que ele realiza.

Exemplos:

a. feat: Possibilitar envio de notificações aos alunos
b. test: Validar valores nulos na classe de AlunotDTO
