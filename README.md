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



A demo on HTTP endpoints in UserController tested with Postman:

![1 get users](https://user-images.githubusercontent.com/40169430/49296768-d0939b00-f4c1-11e8-8eb5-2bd6188c1adb.PNG)
![2 get user byid](https://user-images.githubusercontent.com/40169430/49296770-d0939b00-f4c1-11e8-8167-e2944f2fd634.PNG)
![3 postuser](https://user-images.githubusercontent.com/40169430/49296773-d12c3180-f4c1-11e8-994c-50de40a43689.PNG)
![4 list with john](https://user-images.githubusercontent.com/40169430/49296775-d12c3180-f4c1-11e8-939b-894611565abc.PNG)
![5 updated john](https://user-images.githubusercontent.com/40169430/49296779-d12c3180-f4c1-11e8-94b6-f57e8ea15055.PNG)
![6 after deletion](https://user-images.githubusercontent.com/40169430/49296782-d1c4c800-f4c1-11e8-979c-7aca21d96bda.PNG)
