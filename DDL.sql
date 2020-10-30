create database cadastro_contas;

use cadastro_contas;

create table cli_cliente (

    cli_documento bigint primary key,
    cli_nome varchar(100) not null,
    cli_email varchar(150) unique not null
);
    
create table for_fornecedor(   
    for_cnpj bigint primary key,
    for_nome varchar(100) not null,
    for_tipo varchar(10) not null
);

create table end_endereco (
    end_cep bigint,
    end_numero bigint,
    end_rua varchar(100) not null,
    end_estado varchar(2) not null,
    end_cidade varchar(100) not null,
    end_complemento varchar(50),
    constraint end_endereco_pk primary key (end_cep,end_numero)
);

create table int_instalacao (

    int_numero_instalacao bigint primary key,
    cli_documento bigint not null,
    for_cnpj bigint not null,
    end_cep bigint not null,
    end_numero bigint not null
);   

create table cta_conta (
    int_numero_instalacao bigint,
    cta_mes_referencia date,
    cta_vencimento date not null,
    constraint cta_conta_pk primary key (int_numero_instalacao,cta_mes_referencia)
);

create table ene_energia (
    int_numero_instalacao bigint,
    cta_mes_referencia date,
    ene_consumo_conta_mes bigint not null,
    ene_codigo_fiscal bigint not null,
    ene_grupo_subgrupo bigint not null,
    ene_tipo_fornecimento varchar(50) not null,
    ene_classe_subclasse varchar(50) not null,
    ene_roteiro_leitura varchar(50) not null,
    ene_modalidade_tarifaria varchar(30) not null,
    ene_tensao_nominal varchar(20) not null,
    ene_numero_medidor bigint not null,
    ene_const_multi numeric(10,2) not null,
    ene_leitura_anterior_cod bigint not null,
    ene_leitura_atual_cod bigint not null,
    ene_data_leitura_anterior date not null,
    ene_data_leitura_atual date not null,
    ene_tipo_bandeira varchar(10) not null,
    ene_valor_total numeric (10,2) not null,
    constraint ene_energia_pk primary key (int_numero_instalacao,cta_mes_referencia)
);

create table agu_agua (
    int_numero_instalacao bigint,
    cta_mes_referencia date,
    agu_gr bigint not null,
    agu_codigo_cliente bigint not null,
    agu_numero_conta bigint not null,
    agu_tipo_ligacao varchar(50) not null,
    agu_hidrometro varchar(50),
    agu_data_leitura_anterior date not null,
    agu_data_leitura_atual date not null,
    agu_leitura_anterior bigint not null,
    agu_leitura_atual bigint not null,
    agu_consumo bigint not null,
    agu_vencimento date not null,
    agu_valor_agua numeric(10,2) default 0 not null,
    agu_valor_esgoto numeric(10,2) default 0 not null,
    agu_taxa_regulamentacao numeric(10,2) default 0 not null,
    agu_multa numeric(10,2) default 0 not null,
    agu_tarifa_ate10_agua numeric(10,2),
    agu_tarifa_ate20_agua numeric(10,2),
    agu_tarifa_ate30_agua numeric(10,2),
    agu_tarifa_ate50_agua numeric(10,2),
    agu_tarifa_acima50_agua numeric(10,2),
    agu_tarifa_ate10_esgoto numeric(10,2),
    agu_tarifa_ate20_esgoto numeric(10,2),
    agu_tarifa_ate30_esgoto numeric(10,2),
    agu_tarifa_ate50_esgoto numeric(10,2),
    agu_tarifa_acima50_esgoto numeric(10,2),
    agu_valor_agua1 numeric(10,2),
    agu_valor_agua2 numeric(10,2),
    agu_valor_esgoto1 numeric(10,2),
    agu_valor_esgoto2 numeric(10,2),
    constraint agu_agua_pk primary key (int_numero_instalacao,cta_mes_referencia)
);

alter table cta_conta add constraint instalacao_conta_fk foreign key (int_numero_instalacao) references int_instalacao(int_numero_instalacao);
alter table int_instalacao add constraint cliente_instalacao_fk foreign key (cli_documento) references cli_cliente(cli_documento);
alter table int_instalacao add constraint fornecedor_instalacao_fk foreign key (for_cnpj) references for_fornecedor(for_cnpj);
alter table int_instalacao add constraint endereco_instalacao_fk foreign key (end_cep, end_numero) references end_endereco(end_cep,end_numero);
alter table ene_energia add constraint conta_conta_energia_fk foreign key (int_numero_instalacao, cta_mes_referencia) references cta_conta(int_numero_instalacao, cta_mes_referencia);
alter table agu_agua add constraint conta_conta_agua_fk foreign key (int_numero_instalacao, cta_mes_referencia) references cta_conta(int_numero_instalacao, cta_mes_referencia);