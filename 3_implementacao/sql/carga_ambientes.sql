select * from ambiente;
insert into ambiente (id_ambiente, descricao, tipo_ambiente) values (1, 'descricao', 'SALA_DE_ESTAR');

select * from sub_ambiente;
insert into  sub_ambiente (id_subambiente, tipo_ambiente, id_ambiente) values (1, 'SALA_DE_REUNIAO', 1);

select * from luz;
insert into  luz (id_luz, nome, porta, id_subambiente) values (1, 'luz teste', 1, 1);