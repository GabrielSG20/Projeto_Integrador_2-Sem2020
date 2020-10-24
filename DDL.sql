create database cadastro_contas;

use cadastro_contas;

create table cli_cliente (

    cli_documento bigint primary key,
    cli_nome varchar(100) not null,
    cli_email varchar(150) unique
);

create table int_instalacao (

    int_numero_instalacao bigint primary key,
    cli_documento bigint not null,
    for_fornecedor_id bigint not null,
    end_cep bigint not null,
    end_numero bigint not null
);
    
create table for_fornecedor(

    for_fornecedor_id bigint auto_increment primary key,    
    for_cnpj bigint not null unique,
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
    for_fornecedor_id bigint not null,
    end_cep bigint not null,
    end_numero bigint not null
);   

create table cta_conta (
    int_numero_instalacao bigint,
    cta_mes_referencia date,
    cta_vencimento date not null,
    constraint cta_conta_pk primary key (int_numero_instalacao,cta_mes_referencia)
);
      
alter table cta_conta add constraint instalacao_conta_fk foreign key (int_numero_instalacao) references int_instalacao(int_numero_instalacao);
alter table int_instalacao add constraint cliente_instalacao_fk foreign key (cli_documento) references cli_cliente(cli_documento);
alter table int_instalacao add constraint fornecedor_instalacao_fk foreign key (for_fornecedor_id) references for_fornecedor(for_fornecedor_id);
alter table int_instalacao add constraint endereco_instalacao_fk foreign key (end_cep, end_numero) references end_endereco(end_cep,end_numero);

