# 360GroupProject
version control system for CSE360 group project

Our final project files can be found in the /CSE360 folder.
This project requires the SQlite Firefox Add-on in order to create the database which can be found here:

https://addons.mozilla.org/en-us/firefox/addon/sqlite-manager/

This addon will allow the creation of a sqlite database file, all information entered and managed by the program will be stored here. This addon will also allow the editing of the database directly without the program should that need arise for any reason. If you look into the dbconnector class file, you will see that there is a file path that is meant to lead to the database file being used. You will need to alter this line of text if you wish to make a new database file or move the database to a new location. You'll need to configure the database path to the correct location on your machine in order to write.

https://bitbucket.org/xerial/sqlite-jdbc/downloads

The jar files above are needed in order to allow java to interact with a sqlite database. You will need to download all 10 jar files and add the external jar files to your java reference library. You can do this by right clicking reference:

library->build path->add external jar files

After this has been done open your database file and create the tables UserData and SymptomRatings, make sure the spelling is the same. The UserData table should have the columns firstname, lastname, username, password, email, role, doctor, alert, address, age, and birthdate. The SymptomsRating table should have the columns name, painlevel, tiredlevel, nausealevel, depressionlevel, anxietylevel, drowsinesslevel, appetitelevel, wellbeinglevel, breathlevel, doctor, and pusername. In the UserData table add a user who will fucntion as the system admin, set a username and password and the role as "admin". This will admin is responsible for adding the other users in the system.
