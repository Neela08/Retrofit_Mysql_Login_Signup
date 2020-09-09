# Retrofit_Mysql_Login_Signup
Description:

As the name says it is a login and signup application in android. For the network transaction Rest Client (Retrofit) is used. 
The user registration infomation will be saved in MySql database. After an attempt to login, the registered users will be shown their information fetched from the database and then they can logout.
For putting the information in MySql database , server side codes(PHP Codes) are written and have been put inside the repository.

Notes:

1. Put your server information followed by folder name where php codes are kept in Client.java file(if using wamp/xampp/mamp localhost , put the ip address of the host). 
2. API Level 23 recommended for this particular UI design(only if you want to manipulate the status bar)
3. Double check internet permission in manifest and retrofit dependencies in build.gradle(Module:app)

Heres the database table structure:

 ![20200910_014552](https://user-images.githubusercontent.com/69322639/92646005-98acbf00-f307-11ea-92a1-b94d5072917d.png)
 
Screen Shots of the app:


![login](https://user-images.githubusercontent.com/69322639/92646377-2ab4c780-f308-11ea-93d5-b486fdce58e9.jpg)
![signup](https://user-images.githubusercontent.com/69322639/92646383-2d172180-f308-11ea-84b8-cdf27e261d38.jpg)
![loggedin](https://user-images.githubusercontent.com/69322639/92646393-2e484e80-f308-11ea-8e92-b75f99935978.jpg)
