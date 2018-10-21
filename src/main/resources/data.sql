-- INIT monsters
INSERT INTO monsters (name, nat_level, nb_stars, level, base_pv, base_atq, base_def, base_vit, base_tx_crit, base_dgt_crit, base_res, base_prec) VALUES ('Veromos', 5, 5, 35, 6780, 565, 557, 100, 0.15, 0.15, 0.25, 0);
INSERT INTO monsters (name, nat_level, nb_stars, level, base_pv, base_atq, base_def, base_vit, base_tx_crit, base_dgt_crit, base_res, base_prec) VALUES ('Belladeon', 3, 5, 35, 7260, 347, 500, 108, 0.15, 0.15, 0.25, 0);
INSERT INTO monsters (name, nat_level, nb_stars, level, base_pv, base_atq, base_def, base_vit, base_tx_crit, base_dgt_crit, base_res, base_prec) VALUES ('Chasun', 4, 5, 16, 6030, 360, 318, 101, 0.15, 0.15, 0.15, 0);
INSERT INTO monsters (name, nat_level, nb_stars, level, base_pv, base_atq, base_def, base_vit, base_tx_crit, base_dgt_crit, base_res, base_prec) VALUES ('Shannon', 3, 5, 35, 6420, 371, 412, 111, 0.15, 0.15, 0.15, 0);
INSERT INTO monsters (name, nat_level, nb_stars, level, base_pv, base_atq, base_def, base_vit, base_tx_crit, base_dgt_crit, base_res, base_prec) VALUES ('Bernard', 3, 5, 35, 7635, 307, 517, 111, 0.15, 0.15, 0.15, 0);
INSERT INTO monsters (name, nat_level, nb_stars, level, base_pv, base_atq, base_def, base_vit, base_tx_crit, base_dgt_crit, base_res, base_prec) VALUES ('Colleen', 3, 5, 35, 7620, 324, 324, 106, 0.15, 0.15, 0.15, 0);


-- INIT runes
INSERT INTO runes (numRune, bonus, nb_stars, level, type_rune) VALUES (1, 255, 6, 15, 'Energy');
INSERT INTO runes (numRune, bonus, nb_stars, level, type_rune) VALUES (2,12, 6, 15, 'Despair');
INSERT INTO runes (numRune, bonus, nb_stars, level, type_rune) VALUES (6, 145, 6, 15, 'Will');