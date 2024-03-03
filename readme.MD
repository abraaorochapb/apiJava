# Projeto Java com Spring, JPA/Hibernate e Swagger

Este é um projeto desenvolvido em Java utilizando o framework Spring, JPA/Hibernate para persistência de dados e Swagger para documentação da API.

## Etapas para Executar o Projeto

### Clonar o Repositório

```bash
git clone https://github.com/abraaorochapb/apiJava.git
```

### Configurar o Banco de Dados

1. Abra o arquivo `application.properties` localizado no diretório `src/main/resources`.
2. Configure as propriedades do banco de dados de acordo com suas credenciais e preferências. Por exemplo:

   ```properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/sua_database
   spring.datasource.username=seu_usuario
   spring.datasource.password=sua_senha
   ```

   Certifique-se de substituir `nome_do_banco`, `seu_usuario` e `sua_senha` pelas suas configurações específicas.

### Executar o Projeto

Você pode executar o projeto usando sua IDE favorita (por exemplo, IntelliJ IDEA, Eclipse) ou através da linha de comando usando Maven:

```bash
cd nome_do_projeto
mvn spring-boot:run
```

Isso iniciará o servidor local e você poderá acessar a API através da URL fornecida pela documentação do Swagger.

## Documentação da API

A documentação da API é gerada pelo Swagger. Após iniciar o servidor, você pode acessar a documentação através do seguinte URL:

```
http://localhost:8080/swagger-ui/index.html
```

Isso permitirá que você visualize e teste os endpoints da API diretamente no navegador.

Se houver alguma dúvida ou problema durante a execução do projeto, não hesite em entrar em contato.
