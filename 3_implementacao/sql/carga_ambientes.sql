-- ////////////////////////////////////////////////////////////////////////////////////////////////////////
--   AMBIENTES
-- ////////////////////////////////////////////////////////////////////////////////////////////////////////
SELECT * FROM ambiente;
INSERT INTO ambiente (id_ambiente, descricao, tipo_ambiente) VALUES (1, 'descricao', 'SALA');
INSERT INTO ambiente (id_ambiente, descricao, tipo_ambiente) VALUES (2, 'descricao', 'COZINHA');



-- ////////////////////////////////////////////////////////////////////////////////////////////////////////
--   SUB-AMBIENTES
-- ////////////////////////////////////////////////////////////////////////////////////////////////////////
SELECT * FROM sub_ambiente;
INSERT INTO  sub_ambiente (id_subambiente, tipo_ambiente, id_ambiente) VALUES (1, 'SALA_DE_ESTAR', 1);
INSERT INTO  sub_ambiente (id_subambiente, tipo_ambiente, id_ambiente) VALUES (2, 'SALA_DE_JANTAR', 1);
INSERT INTO  sub_ambiente (id_subambiente, tipo_ambiente, id_ambiente) VALUES (3, 'AREA_GOURMET', 2);
INSERT INTO  sub_ambiente (id_subambiente, tipo_ambiente, id_ambiente) VALUES (4, 'DISPENSA', 2);



-- ////////////////////////////////////////////////////////////////////////////////////////////////////////
--   OBJETOS
-- ////////////////////////////////////////////////////////////////////////////////////////////////////////
SELECT * FROM objeto;
-- OBJETOS UNICOS
-- sala de estar
INSERT INTO objeto (id_objeto, id_subambiente, nome, tipo_objeto, ligado) VALUES (1, 1, '3 Spots acima do sofá', 'RELE', 'NAO');
INSERT INTO objeto (id_objeto, id_subambiente, nome, tipo_objeto, ligado) VALUES (2, 1, '6 Spots centrais', 'RELE', 'NAO');
INSERT INTO objeto (id_objeto, id_subambiente, nome, tipo_objeto, ligado) VALUES (3, 1, '3 Spots lateral esquerda', 'RELE', 'NAO');
INSERT INTO objeto (id_objeto, id_subambiente, nome, tipo_objeto, ligado) VALUES (4, 1, '1 Lustre central', 'RELE', 'NAO');
-- sala de jantar
INSERT INTO objeto (id_objeto, id_subambiente, nome, tipo_objeto, ligado) VALUES (5, 2, '6 Spots centrais e lateral', 'RELE', 'NAO');
INSERT INTO objeto (id_objeto, id_subambiente, nome, tipo_objeto, ligado) VALUES (6, 2, '2 Spots laterias na sanca', 'RELE', 'NAO');
INSERT INTO objeto (id_objeto, id_subambiente, nome, tipo_objeto, ligado) VALUES (7, 2, '2 bastões na sanca', 'RELE', 'NAO');
INSERT INTO objeto (id_objeto, id_subambiente, nome, tipo_objeto, ligado) VALUES (8, 2, '5 Spots laterias na sanca', 'RELE', 'NAO');

-- OBJETOS SET
-- sala de estar
INSERT INTO objeto (id_objeto, id_subambiente, nome, tipo_objeto, ligado) VALUES (9, 1, 'Objeto para configuracao de SET', 'RELE', 'NAO');



-- ////////////////////////////////////////////////////////////////////////////////////////////////////////
--   COMPONENTES
-- ////////////////////////////////////////////////////////////////////////////////////////////////////////
SELECT * FROM componente;
-- objeto 1
INSERT INTO componente (id_componente, ativo, data_da_instalacao, nome, porta, tipo_componente, id_objeto) VALUES
(1, 0, '2015/05/19', 'rele teste', '7', 'RELE', 1);
-- objeto 2
INSERT INTO componente (id_componente, ativo, data_da_instalacao, nome, porta, tipo_componente, id_objeto) VALUES
(2, 0, '2015/05/19', 'rele teste', '6', 'RELE', 2);
-- objeto 3
INSERT INTO componente (id_componente, ativo, data_da_instalacao, nome, porta, tipo_componente, id_objeto) VALUES
(3, 0, '2015/05/19', 'rele teste', '5', 'RELE', 3);
-- objeto SET
INSERT INTO componente (id_componente, ativo, data_da_instalacao, nome, porta, tipo_componente, id_objeto) VALUES
(4, 0, '2015/05/19', 'rele teste', '7', 'RELE', 9);
INSERT INTO componente (id_componente, ativo, data_da_instalacao, nome, porta, tipo_componente, id_objeto) VALUES
(5, 0, '2015/05/19', 'rele teste', '6', 'RELE', 9);
INSERT INTO componente (id_componente, ativo, data_da_instalacao, nome, porta, tipo_componente, id_objeto) VALUES
(6, 0, '2015/05/19', 'rele teste', '5', 'RELE', 9);
INSERT INTO componente (id_componente, ativo, data_da_instalacao, nome, porta, tipo_componente, id_objeto) VALUES
(7, 0, '2015/05/19', 'rele teste', '4', 'RELE', 9);


-- ////////////////////////////////////////////////////////////////////////////////////////////////////////
--   SET DE LUZES
-- ////////////////////////////////////////////////////////////////////////////////////////////////////////
SELECT * FROM set_luzes;
INSERT INTO set_luzes (id_set_luzes, nome) VALUES (1, 'AMBIENTE CUSTOMIZADO 1');



-- ////////////////////////////////////////////////////////////////////////////////////////////////////////
--   SET LUZES OBJETO
-- ////////////////////////////////////////////////////////////////////////////////////////////////////////
SELECT * FROM set_luzes_objeto;
INSERT INTO set_luzes_objeto (id_set_luzes, id_objeto) VALUES (1, 9);