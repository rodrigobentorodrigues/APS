CREATE TABLE funcionario (
	nome varchar(40) not null,
	sexo varchar(10) not null,
	habilitacao varchar(20) not null,
	idade int not null,
	email varchar(40) not null,
	senha varchar(20) not null,
	id SERIAL primary key
);

CREATE TABLE doador (
	nome varchar(40) not null,
	cpf varchar(15) not null unique,
	dataNascimento varchar(10) not null,
	sexo varchar(10) not null,
	tipoSanguineo varchar(5) not null,
	peso double precision not null,
	id SERIAL primary key
);

CREATE TABLE doacao(
	nome character varying(40) NOT NULL,
	fatorrh character varying(3) NOT NULL,
	datadedoacao character varying(10),
	primary key(nome, fatorrh, datadedoacao)
);  