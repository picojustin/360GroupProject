# 360GroupProject
version control system for CSE360 group project

Our final project files can be found in the /CSE360 folder.
This project requires the SQlite Firefox Add-on in order to manage the database which can be found here:

https://addons.mozilla.org/en-us/firefox/addon/sqlite-manager/

This addon will allow make a sqlite database so that you can make your own database or look into what is in the database using a nice GUI system. If you look into the dbconnector class file, you will see that there is a file path that is meant to lead to the database file being used. You will need to alter this line of text if you wish to make a new database file or move the database to a new location. You'll need to configure the database path to the correct location on your machine in order to write.

https://bitbucket.org/xerial/sqlite-jdbc/downloads

The jar files above are needed in order to allow java to interact with a sqlite database. You will need to download all 10 jar files and add the external jar files to your java reference library. You can do this by right clicking reference:

library->build path->add external jar files

Feel free to contact us if there are any issues.
