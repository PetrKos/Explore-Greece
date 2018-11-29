# Explore-Greece

 README_1ST!!!

Notes:
It will be a simple CRUD app (Monolith obviously) which will be enhanced with new features as I learn about 
Spring Boot, Security, REST etc etc... This is regularly being updated with new and improved features and knowledge.

General idea:
The purpose of the project is to create an application where a user can view available tour packages for
Greece and rate them. Each tour package contains one or more tours and each tour contains various
information regarding that tour. The application should provide an interface where the user will be able
to see all available tour packages and by clicking on one of them, a page with the tour package details
will appear. The user will also be able to rate each tour package on a scale of 1 to 5 (1 is bad, 5 is good).

What has been done?
1. data.sql file with data to populate tables in the database.
2. Model, Repository, Service and Controller packages.
3. Persisted classes with JPA and Hibernate to H2 in-built database (will change to MySQL in the future).
3. Create Read Update Delete methods on UserController,  which fetches data from UserRepository.

What needs to be done? A LOT!!
1. Complete CRUD methods for tours
2. Add validation to all controllers
3. HATEOAS 
4. Spring Security
Bonus: Might try to find my way around bootstrap to show a nice presentation
