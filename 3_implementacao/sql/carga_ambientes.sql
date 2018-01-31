SELECT * FROM ambiente;
INSERT INTO ambiente (id_ambiente, descricao, tipo_ambiente) VALUES (1, 'descricao', 'SALA_DE_ESTAR');
INSERT INTO ambiente (id_ambiente, descricao, tipo_ambiente) VALUES (2, 'descricao', 'HALL');

SELECT * FROM sub_ambiente;
INSERT INTO  sub_ambiente (id_subambiente, tipo_ambiente, id_ambiente) VALUES (1, 'SALA_DE_REUNIAO', 1);
INSERT INTO  sub_ambiente (id_subambiente, tipo_ambiente, id_ambiente) VALUES (2, 'JARDIM', 1);

SELECT * FROM luz;
INSERT INTO  luz (id_luz, nome, porta, id_subambiente) VALUES (1, 'luz teste', 1, 1);
INSERT INTO  luz (id_luz, nome, porta, id_subambiente) VALUES (2, 'luz teste 2', 1, 1);

INSERT INTO  luz (id_luz, nome, porta, id_subambiente) VALUES (3, 'luz teste', 1, 2);
INSERT INTO  luz (id_luz, nome, porta, id_subambiente) VALUES (4, 'luz teste 2', 1, 2);