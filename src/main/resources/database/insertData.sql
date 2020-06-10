-- Insert data into "Persons" table
INSERT INTO persons (id, first_name, last_name, patronymic, iin, region_id) VALUES (1, 'Lionel', 'Messi', 'Andrés', '001234567891', 1);
INSERT INTO persons (id, first_name, last_name, patronymic, iin, region_id) VALUES (2, 'Самат', 'Смаков', 'Кабирович', '001234567892', 2);
INSERT INTO persons (id, first_name, last_name, patronymic, iin, region_id) VALUES (3, 'Бахтиёр', 'Зайнутдинов', 'Батыржанович', '001234567893', 3);
INSERT INTO persons (id, first_name, last_name, patronymic, iin, region_id) VALUES (4, 'Бауыржан', 'Исламхан', 'Ербосынович', '001234567894', 4);
INSERT INTO persons (id, first_name, last_name, patronymic, iin, region_id) VALUES (5, 'Ян', 'Вороговский', 'Владимирович', '001234567895', 5);
commit;
-- Insert data into "Regions" table
INSERT INTO regions (id, name) VALUES (1, 'Barcelona');
INSERT INTO regions (id, name) VALUES (2, 'Актобе');
INSERT INTO regions (id, name) VALUES (3, 'Ростов-на-Дону');
INSERT INTO regions (id, name) VALUES (4, 'Эль-Айн');
INSERT INTO regions (id, name) VALUES (5, 'Антверпен');
commit;
