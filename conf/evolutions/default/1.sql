# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table disponibilidade (
  hotel                         varchar(255),
  data                          varchar(255),
  disponibilidade               varchar(255),
  minimo_de_noites              varchar(255)
);

create table hotel (
  id                            bigint auto_increment not null,
  codigo                        varchar(255),
  cidade                        varchar(255),
  nome                          varchar(255),
  constraint pk_hotel primary key (id)
);


# --- !Downs

drop table if exists disponibilidade;

drop table if exists hotel;

