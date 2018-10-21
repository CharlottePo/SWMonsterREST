-- DROP tables
DROP TABLE IF EXISTS monsters;
DROP TABLE IF EXISTS runes;

-- CREATE tables
CREATE TABLE monsters (
id SERIAL, 
name VARCHAR(255), 
nat_level INTEGER, 
nb_stars INTEGER, 
level INTEGER, 
base_pv INTEGER,
base_atq INTEGER, 
base_def INTEGER, 
base_vit INTEGER, 
base_tx_crit FLOAT, 
base_dgt_crit FLOAT, 
base_res FLOAT, 
base_prec FLOAT
);

CREATE TABLE runes (
id SERIAL,
numRune INTEGER,
bonus VARCHAR(255),
nb_stars INTEGER,
level INTEGER,
type_rune VARCHAR(255)
);