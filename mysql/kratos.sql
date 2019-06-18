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
	id integer primary key auto_increment not null,
    nome varchar(100),
    telefone char(15)
);

drop table funcionario;

create table funcionario(
	id integer primary key auto_increment not null,
    nome varchar(100),
    id_departamento integer,
    data_cadastro date
);

use sistema;

describe funcionario;

ALTER TABLE funcionario ADD FOREIGN KEY (id_departamento) REFERENCES departamento(id);

INSERT INTO departamento (nome,
    telefone) VALUES (
    "sac",
    "11857653379");
    

SELECT * FROM departamento ORDER BY nome ASC;

SELECT * FROM departamento ORDER BY nome DESC;

SELECT * FROM departamento WHERE telefone IS NULL;

SELECT * FROM departamento WHERE telefone IS NOT NULL;

SELECT * FROM departamento WHERE nome LIKE 'D%';

SELECT * FROM departamento WHERE nome LIKE '%vendas';

SELECT * FROM departamento WHERE nome LIKE '%de%';

SELECT * FROM departamento WHERE nome NOT LIKE '%de%';

SELECT * FROM departamento WHERE id = 400;

SELECT * FROM departamento;

CREATE DATABASE biblioteca;



CREATE TABLE aluno (
	id_aluno integer primary key not null,
    nome varchar(100)
);

CREATE TABLE categoria (
	id_categoria integer primary key not null,
    categoria varchar(100)
);

CREATE TABLE livro (
	id_livro integer primary key not null,
    titulo varchar(200),
	id_categoria integer
);


alter table livro add foreign key (id_categoria) references categoria(id_categoria);

CREATE TABLE emprestimo (
	id_emprestimo integer not null,
    id_aluno integer,
    id_livro integer, 
    data_emprestimo date,
    data_devolucao date,
    primary key (id_emprestimo),
    constraint uk_emprestimo
    unique key (id_aluno, id_livro, data_emprestimo),
    constraint fk_livro_emprestimo 
    foreign key (id_livro) references livro(id_livro),
    constraint fk_aluno_emprestimo 
    foreign key (id_aluno) references aluno(id_aluno)
);

select * from emprestimo;

select livro.id_livro,
		livro.titulo,
        categoria.id_categoria,
        categoria.categoria
from livro
inner join categoria
on livro.id_categoria = categoria.id_categoria;

select * from emprestimo;

select
	a.id_aluno,
    a.nome,
    l.id_livro,
    l.titulo,
    e.data_emprestimo,
    e.data_devolucao
from aluno a
inner join emprestimo e
on a.id_aluno = e.id_aluno
inner join livro l
on e.id_livro = l.id_livro;


select
	a.id_aluno,
    a.nome,
    l.id_livro,
    l.titulo,
    c.id_categoria,
    c.categoria,
    e.data_emprestimo,
    e.data_devolucao
from aluno a
inner join emprestimo e
on a.id_aluno = e.id_aluno
inner join livro l
on e.id_livro = l.id_livro
inner join categoria c
on l.id_categoria = c.id_categoria;


