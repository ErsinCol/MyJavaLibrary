select Code,Name,Region,Population from world.country where Continent='Europe' and Region='Western Europe';

INSERT INTO city (Name,CountryCode,District,Population)
values ('Sakarya','TUR','Sakarya',1000000);

update city set Population=900000 where ID=4083;

delete from city where ID=4083;

