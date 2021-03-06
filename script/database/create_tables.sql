-- Script criação das tabelas
-- Lucas Concato
CREATE TABLE public.departamento
(
    id integer NOT NULL,
    nome character varying(50) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT departamento_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.departamento
    OWNER to postgres;

-- Table: public.equipamento

-- DROP TABLE public.equipamento;
-- Lucas Concato
CREATE TABLE public.equipamento
(
    id_departamento integer NOT NULL,
    id_produto integer NOT NULL,
    quantidade integer NOT NULL,
    CONSTRAINT pk_equipamento PRIMARY KEY (id_departamento, id_produto),
    CONSTRAINT equipamento_id_departamento_fkey FOREIGN KEY (id_departamento)
        REFERENCES public.departamento (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT equipamento_id_produto_fkey FOREIGN KEY (id_produto)
        REFERENCES public.produto (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.equipamento
    OWNER to postgres;

-- Table: public.equipamento_ordem

-- DROP TABLE public.equipamento_ordem;

CREATE TABLE public.equipamento_ordem
(
    id_ordem integer NOT NULL,
    id_departamento integer NOT NULL,
    id_produto integer NOT NULL,
    CONSTRAINT pk_equipamento_ordem PRIMARY KEY (id_ordem, id_departamento, id_produto),
    CONSTRAINT equipamento_ordem_id_departamento_fkey FOREIGN KEY (id_departamento)
        REFERENCES public.departamento (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT equipamento_ordem_id_ordem_fkey FOREIGN KEY (id_ordem)
        REFERENCES public.ordem_servico (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT equipamento_ordem_id_produto_fkey FOREIGN KEY (id_produto)
        REFERENCES public.produto (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.equipamento_ordem
    OWNER to postgres;

-- Table: public.fornecedor

-- DROP TABLE public.fornecedor;
-- Lucas Concato
CREATE TABLE public.fornecedor
(
    id integer NOT NULL,
    nome character varying(100) COLLATE pg_catalog."default" NOT NULL,
    cnpj integer NOT NULL,
    endereco character varying(100) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT fornecedor_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.fornecedor
    OWNER to postgres;

-- Table: public.funcionario

-- DROP TABLE public.funcionario;

CREATE TABLE public.funcionario
(
    id integer NOT NULL,
    nome character varying(50) COLLATE pg_catalog."default",
    email character varying(50) COLLATE pg_catalog."default",
    senha character varying(50) COLLATE pg_catalog."default",
    datanascimento date,
    id_departamento integer,
    CONSTRAINT funcionario_pkey PRIMARY KEY (id),
    CONSTRAINT fk_id_departamento FOREIGN KEY (id_departamento)
        REFERENCES public.departamento (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.funcionario
    OWNER to postgres;

-- Table: public.ordem_servico

-- DROP TABLE public.ordem_servico;

CREATE TABLE public.ordem_servico
(
    id integer NOT NULL,
    descricao_problema character varying(100) COLLATE pg_catalog."default" NOT NULL,
    data_solicitacao date NOT NULL,
    data_entrega date NOT NULL,
    id_funcionario integer,
    id_solicitante integer,
    CONSTRAINT ordem_servico_pkey PRIMARY KEY (id),
    CONSTRAINT ordem_servico_id_funcionario_fkey FOREIGN KEY (id_funcionario)
        REFERENCES public.funcionario (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT ordem_servico_id_solicitante_fkey FOREIGN KEY (id_solicitante)
        REFERENCES public.funcionario (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.ordem_servico
    OWNER to postgres;

-- Table: public.produto

-- DROP TABLE public.produto;

CREATE TABLE public.produto
(
    id integer NOT NULL,
    nome character varying(100) COLLATE pg_catalog."default" NOT NULL,
    quantidade integer NOT NULL,
    valor numeric(10,2) NOT NULL,
    descricao character varying(100) COLLATE pg_catalog."default" NOT NULL,
    id_fornecedor integer,
    CONSTRAINT produto_pkey PRIMARY KEY (id),
    CONSTRAINT produto_id_fornecedor_fkey FOREIGN KEY (id_fornecedor)
        REFERENCES public.fornecedor (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.produto
    OWNER to postgres;
