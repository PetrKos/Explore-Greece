/*users-------------------------------------------*/

INSERT INTO USERS ( first_name, last_name, email)
VALUES ('Mike','DeLaval','D.lvl@gmail.com');

INSERT INTO USERS ( first_name, last_name, email)
VALUES ('Iwanna','Makri','iMac@gmail.com');

INSERT INTO USERS ( first_name, last_name, email)
VALUES ('George','Pap','g.pap1@gmail.com');

INSERT INTO USERS ( first_name, last_name, email)
VALUES ('John','Dow','JD@gmail.com');

INSERT INTO USERS ( first_name, last_name, email)
VALUES ('Uncle','Bob','BM@gmail.com');

INSERT INTO USERS ( first_name, last_name, email)
VALUES ('Carl','Johnson','CJ@gmail.com');


/*tour packages----------------------------------------*/

INSERT INTO TOUR_PACKAGES ( tour_Package_Name, region )
VALUES ( 'Chania tours','CHANIA');

INSERT INTO TOUR_PACKAGES ( tour_Package_Name, region )
VALUES ('Heraklion tours', 'HERAKLION');


INSERT INTO TOUR_PACKAGES ( tour_Package_Name, region )
VALUES ('Rethymno tours', 'RETHYMNO');

INSERT INTO TOUR_PACKAGES ( tour_Package_Name, region )
VALUES ('Lasithi tours', 'LASITHI');

/*tours-------------------------------------------------------------------*/

INSERT INTO TOURS (title, description, duration_in_days, price, tour_package_id )
VALUES ('Wonderful Chania', 'Best 7 days of your life', 7, 650,( select id from tour_packages where region = 'CHANIA'));

INSERT INTO TOURS (title, description, duration_in_days, price, tour_package_id )
VALUES ('Main City', 'Street Stories of Chania Morning Tour with Samples of Raki and Mezedes', 5,
400, (select id from tour_packages where id = 1)); ---id = 1, points to the id of Chania tour package. Here is a FK

INSERT INTO TOURS (title, description, duration_in_days, price, tour_package_id )
VALUES ('Jeep Safari', 'taste the best olive oil and wines', 3, 350, (select id from tour_packages where id = 1));

INSERT INTO TOURS (title, description, duration_in_days, price, tour_package_id )
VALUES ('Heraklion', 'Ancient Palace of Knossos Tour ', 1, 50, (select id from tour_packages where id = 2));
--id = 2 points to the id of Heraklion tour package. Here is a FK

INSERT INTO TOURS (title, description, duration_in_days, price, tour_package_id )
VALUES ('Zeus Cave & Lassithi Plateau', 'Are you ready for an adventurous excursion?', 1, 100,
(select id from tour_packages where id = 4)); --id = 4 points to the id of Lasithi tour package. Here is a FK