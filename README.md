# 🔗 EncurtaAi API

## Sobre o Projeto

Aplicação Spring Boot para encurtamento de URLs com geração automática de QR Codes. Desenvolvida com JPA/Hibernate para persistência de dados.

## 🚀 Funcionalidades

<ul>
    <li>✂️ Encurtamento de URLs - Transforma URLs longas em links curtos</li>
    <li>📱 QR Code - Gera códigos QR automaticamente para cada link</li>
    <li>🕒 Timestamp - Registra data/hora de criação</li>
    <li>💾 Persistência - Armazena dados com JPA/Hibernate</li>
</ul>

## 🛠️ Tecnologias

<ul>
    <li>Java - Linguagem principal</li>
    <li>Spring Boot - Framework web</li>
    <li>JPA/Hibernate - Mapeamento objeto-relacional</li>
    <li>PostgreSQL - Banco de dados (Neon)</li>
</ul>

## 🌐 Infraestrutura

<ul>
    <li>Banco de Dados: PostgreSQL hospedado no Neon</li>
    <li>Persistência: JPA/Hibernate com configuração de variáveis de ambiente</li>
    <li>Segurança: Credenciais gerenciadas via variáveis de ambiente</li>
</ul>


## 📊 Modelo de Dados
```java
@Entity
@Table(name = "------")
public class Link {
    private Long id;                    // ID único
    private String urlLong;             // URL original
    private String urlEncurtada;        // URL encurtada
    private String urlQrCode;           // QR Code gerado
    private LocalDateTime urlCriadaEm;  // Data de criação
}
```

## 🎯 Casos de Uso
<ol>
    <li>- Compartilhamento de links em redes sociais</li>
    <li>- Campanhas de marketing digital</li>
    <li>- Analytics de cliques</li>
    <li>- Geração rápida de QR Codes</li>
    <ul>
        <li><strong>em processo de desenvolvimento...</strong></li>
    </ul>
</ol>


## 📈 Próximos Passos
- [ ] API REST completa
- [ ] Interface web
- [ ] Analytics de cliques
- [ ] Customização de links


**Desenvolvido com ☕ e Spring Boot**


## 🔐 Segurança de Credenciais - Spring Boot

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
