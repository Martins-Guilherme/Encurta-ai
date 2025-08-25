## 🔐 Segurança de Credenciais - Spring Boot
Problema
Manter credenciais de banco de dados seguras e fora do controle de versão (Git).
Solução: Variáveis de Ambiente

### 1. Configure o application.properties

    spring.datasource.url=jdbc:mysql://localhost:3306/mydatabase
    spring.datasource.username=${DB_USERNAME}
    spring.datasource.password=${DB_PASSWORD}

#### 2. Defina as variáveis de ambiente

##### Linux/macOS:

    
    export DB_USERNAME=seu_usuario
    export DB_PASSWORD=sua_senha
    ./mvnw spring-boot:run
    

##### Windows:


    set DB_USERNAME=seu_usuario
    set DB_PASSWORD=sua_senha
    .\mvnw spring-boot:run
    

#### 3. Para produção

    
    Docker: Use flag -e no docker run
    Kubernetes: Configure seção env no Deployment
    Cloud: Use recursos da plataforma para injetar variáveis
    

### Resultado

<p>✅ Credenciais ficam fora do código-fonte</p>
<p>✅ Gerenciamento pelo ambiente de execução</p>
<p>✅ Segurança mantida</p>
