CREATE TABLE produto (
    id SERIAL NOT NULL PRIMARY KEY,
    nome varchar(100) NOT NULL,
    descricao varchar(255) NOT NULL,
    preco int NOT NULL
)