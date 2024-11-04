# camunda-rest-kafka


# Tecnologias

    - Repositório: Github
    - CI/CD: GitHub Actions
    - Build: Maven
    - Testes Automatizados: JUnit
    - Análise de Código: JIT
    - Deploy Automatizado: Docker - Azure App Service

# Objetivo

Camunda é uma solução qua traz a integração e possibilidade de desenvolvimento de fluxos BPMN com a integração de código juntamente ao processo, desta forma, o objetivo desta solução, é realizar uma simulação de multiplas origens REST e KAFKA para o processamento distribuido de processos, mas com visibilidade de fim a fim.

# Estratégia

Para este projeto, é adotado o processo de gitflow

Branchs:
1. feature/<CódigoTask>: Apresenta o desenvolvimento de uma tarefa ou conjunto de tarefas
2. dev : Consolidaçõ das features desenvolvidas
3. release/<dataRelease>: Código gerdo e travado para um conjunto de publicações realizadas.
4. main -> Código que está em produção e deve ser tageado para ser gerado a versão de build para o ambiente de produção.

* Criada regra para considerar as regras para as branchs de dev, release e main para não permitir commit direto.

# Publicação

A cada momento que for necessário realizar a publicação, para que seja o mais prático de se gerenciar possível, será adotada a conteinirização do produto. Desta forma, as tags e informações serão responsáveis para determinar o ambiente e processo de publicação.

Feito somente para o ambiente de produção: https://camunda-rest-kafka-ezequiel-ufrgs01.azurewebsites.net


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


git remote add origin git@github.com:ezequielmcitolin/camunda-rest-kafka.git




# Fluxo

![Fluxo](/.github\workflows\Diagrama-Github.png "Fluxo")


1. O developer junto com o Product Owner são os responsáveis pela manutenção do fluxo.
2. Não existe ambiente para feature, ela deve ser testada locamente e integrada na dev, através de PR com a revisão de ao menos um colega.
3. Quando na dev, são executado os testes e realizado o teste pelo QA 
4. Quando validado o conjunto de tarefas necessário, é criado uma release, onde é publicado também para ação do QA e do Product Owner, para validação das features que irão para produção.
5. Validada a Release, é criado um novo PR que ao ser concluido, é jogada para produção, a feature de implementação selecionada. 

* ATENÇÃO: Não foi colocado fluxo de hotfix mas seria igual ao de release.
* Foram criadas rulesets para que o código não seja passado para as branchs de dev, release e main, caso não tenham Pull Request sido feio para tal ação.


