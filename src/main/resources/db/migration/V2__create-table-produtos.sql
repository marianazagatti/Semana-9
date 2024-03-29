CREATE TABLE produtos(

    id BIGINT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    descricao VARCHAR(100) NOT NULL,
    preco DECIMAL(5,2) NOT NULL,
    fabricante_id BIGINT NOT NULL,

    PRIMARY KEY(id),
    FOREIGN KEY (fabricante_id) REFERENCES fabricantes(id)
);