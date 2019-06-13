-- CREATE DATABASE kratos;

USE kratos;

CREATE TABLE alunos (
	id int(11) primary key auto_increment not null,
	nome varchar(50),
    sobrenome varchar(50),
    email varchar(50),
    data_nascimento date,
    cpf varchar(11) unique
);

CREATE TABLE professores (
	id int(11) primary key auto_increment not null,
    nome varchar(50),
    email varchar(50),
    data_nascimento date,
    cpf varchar(11) unique
);

CREATE TABLE cursos (
	id int(11) primary key auto_increment not null,
    nome varchar(50)
);

CREATE TABLE turmas (
	id int(11) primary key auto_increment not null,
    descricao varchar(50),
    periodo varchar(20),
    id_alunos int(11),
    id_professores int(11),
    id_cursos int(11)
);

SHOW TABLES;

DESCRIBE alunos;

USE kratos;

INSERT INTO alunos (nome,
	sobrenome,
    email,
    data_nascimento,
    cpf
    ) VALUES (
    "Jorge",
    "Ferreira",
    "jorge@digitalhouse.com",
    "1990-07-18",
    "36832130891"
    );
    
    INSERT INTO alunos (nome,
	sobrenome,
    email,
    data_nascimento,
    cpf
    ) VALUES (
    "João",
    "Camargo",
    "joao@digitalhouse.com",
    "2001-05-22",
    "12345678901"
    );
    
    SELECT id, 
		nome, 
		sobrenome, 
		email, 
		data_nascimento, 
		cpf 
		FROM alunos;

SELECT * FROM alunos;

SELECT * FROM alunos WHERE nome = "João" AND email = "joao@digitalhouse.com";

DELETE FROM alunos WHERE id = 2;

UPDATE alunos SET sobrenome = "Luiza" WHERE id = 1;

INSERT INTO professores (nome,
    email,
    data_nascimento,
    cpf
    ) VALUES (
    "Lu",
    "lu@digitalhouse.com",
    "2001-05-07",
    "12345678951"
    );

DESCRIBE professores;

SELECT * FROM professores;

INSERT INTO cursos (nome
    ) VALUES (
    "Generation"
    );
    
    
DELETE FROM professores WHERE id = 2;

INSERT INTO turmas (descricao,
	periodo,
    id_alunos,
    id_professores,
    id_cursos
    ) VALUES (
    "É uma turma foda",
    "Integral",
    2,
    2,
    2
    );
    
    DROP TABLE turmas;
    
ALTER TABLE turmas ADD FOREIGN KEY (id_alunos) REFERENCES alunos(id);

ALTER TABLE turmas ADD FOREIGN KEY (id_professores) REFERENCES professores(id);

ALTER TABLE turmas ADD FOREIGN KEY (id_cursos) REFERENCES cursos(id);

DESCRIBE turmas;

create database sistema;

use sistema;

create table departamento(
	id_departamento integer primary key auto_increment not null,
    nome varchar(100),
    telefone char(15)
);

create table funcionario(
	id_funcionario integer primary key auto_increment not null,
    nome varchar(100),
    id_departamento integer,
    data_cadastro date
);

use sistema;

describe funcionario;

ALTER TABLE funcionario ADD FOREIGN KEY (id_departamento) REFERENCES departamento(id);






