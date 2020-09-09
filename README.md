# Retrofit_Mysql_Login_Signup
Description:
As the name says it is a login and signup application in android. For the network transaction Rest Client (Retrofit) is used. 
The user registration infomation will be saved in MySql database. After a attempt to login the registered users will be prompted to their information fetched from the database and then they can logout.
For putting the information in MySql database , server side codes(PHP Codes) have been put inside the repository.
Notes:
1. Put your server infomation followed by folder name where php codes are kept in Client.java file(if using wamp/xampp/mamp localhost , put the ip address of the host). 
2. API Level 23 recommended for this particular UI design(only if you want to manipuate the status bar)
3. Double check internet permission in manifest and retrofit dependencies in build.gradle(Module:app)
 
