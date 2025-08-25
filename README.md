Para manter as chaves de acesso ao banco de dados seguras e fora do controle de versão (como o Git), a melhor prática é usar variáveis de ambiente ou um gerenciador de segredos, como o HashiCorp Vault ou o AWS Secrets Manager. O Spring Boot já vem preparado para lidar com isso de forma nativa.

Vamos ver as duas abordagens mais comuns.

Opção 1: Usar Variáveis de Ambiente

Essa é a forma mais simples e direta. Em vez de colocar os valores sensíveis no seu application.properties, você os injeta no ambiente de execução da aplicação.

Passo 1: Remova as credenciais do application.properties

Seu arquivo de configuração deve ter as chaves, mas sem os valores. Por exemplo:
Properties

spring.datasource.url=jdbc:mysql://localhost:3306/mydatabase
spring.datasource.username=${DB_USERNAME}
spring.datasource.password=${DB_PASSWORD}

Observe que os valores agora são placeholders (${...}). O Spring Boot irá procurar por variáveis de ambiente com esses nomes (DB_USERNAME e DB_PASSWORD) quando a aplicação for iniciada.

Passo 2: Injete as variáveis de ambiente

Onde quer que sua aplicação esteja sendo executada, você precisa definir essas variáveis.

No seu computador local (Linux/macOS):
Bash

export DB_USERNAME=<NOME-DO-BANCO-DE-DADOS>
export DB_PASSWORD=<SENHA-DO-BANCO-DE-DADOS>
./mvnw spring-boot:run

No Windows:
Bash

set DB_USERNAME=<NOME-DO-BANCO-DE-DADOS>
set DB_PASSWORD=<SENHA-DO-BANCO-DE-DADOS>
.\mvnw spring-boot:run

    Em ambientes de produção (Docker, Kubernetes, etc.): Você usará os recursos da plataforma para injetar as variáveis de ambiente.

        Docker: Use a flag -e no comando docker run.

        Kubernetes: Use a seção env na sua configuração de Deployment.

Dessa forma, os valores sensíveis ficam fora do seu código-fonte e são gerenciados pelo ambiente.