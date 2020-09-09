# Retrofit_Mysql_Login_Signup
Description:
As the name says it is a login and signup application in android. For the network transaction Rest Client (Retrofit) is used. 
The user registration infomation will be saved in MySql database. After an attempt to login, the registered users will be shown their information fetched from the database and then they can logout.
For putting the information in MySql database , server side codes(PHP Codes) are written and have been put inside the repository.

Notes:

1. Put your server infomation followed by folder name where php codes are kept in Client.java file(if using wamp/xampp/mamp localhost , put the ip address of the host). 
2. API Level 23 recommended for this particular UI design(only if you want to manipuate the status bar)
3. Double check internet permission in manifest and retrofit dependencies in build.gradle(Module:app)

Heres the database table structure:

 ![20200910_014552](https://user-images.githubusercontent.com/69322639/92646005-98acbf00-f307-11ea-92a1-b94d5072917d.png)
 
Screen Shots of the app:

![login](https://user-images.githubusercontent.com/69322639/92644438-2d61ed80-f305-11ea-8194-ac0c1ffaced8.jpg)
![signup](https://user-images.githubusercontent.com/69322639/92644446-2fc44780-f305-11ea-892a-7a69fbe43dc7.jpg)
![loggedin](https://user-images.githubusercontent.com/69322639/92644450-30f57480-f305-11ea-8e4d-c516e28b0307.jpg)
