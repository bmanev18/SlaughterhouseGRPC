-- Create table "slaughterhouse.animal"
CREATE TABLE IF NOT EXISTS animal
(
    regNum  INTEGER PRIMARY KEY AUTOINCREMENT,
    regDate TEXT,
    weight  REAL CHECK (weight BETWEEN 0.00 AND 10.00),
    origin  TEXT
);

-- Create table "slaughterhouse.animal_part"
CREATE TABLE IF NOT EXISTS animal_part
(
    id        INTEGER PRIMARY KEY AUTOINCREMENT,
    animal_id INTEGER REFERENCES animal (regNum),
    type      TEXT CHECK (type IN ('Wing', 'Leg', 'Breast', 'Neck')),
    weight    REAL CHECK (weight BETWEEN 0.00 AND 10.00)
);

-- Create table "slaughterhouse.tray"
CREATE TABLE IF NOT EXISTS tray
(
    id         INTEGER PRIMARY KEY AUTOINCREMENT,
    weight     REAL,
    parts_type TEXT CHECK (parts_type IN ('Wing', 'Leg', 'Breast', 'Neck'))
);

-- Create table "slaughterhouse.tray_contains"
CREATE TABLE IF NOT EXISTS tray_contains
(
    tray_id INTEGER REFERENCES tray (id),
    part_id INTEGER REFERENCES animal_part (id),
    PRIMARY KEY (tray_id, part_id)
);

-- Create table "slaughterhouse.product"
CREATE TABLE IF NOT EXISTS product
(
    id           INTEGER PRIMARY KEY AUTOINCREMENT,
    product_type TEXT CHECK (product_type IN ('Wing', 'Leg', 'Breast', 'Neck'))
);

-- Create table "slaughterhouse.product_contains"
CREATE TABLE IF NOT EXISTS product_contains
(
    product_id INTEGER REFERENCES product (id),
    tray_id    INTEGER REFERENCES tray (id),
    PRIMARY KEY (product_id, tray_id)
);
