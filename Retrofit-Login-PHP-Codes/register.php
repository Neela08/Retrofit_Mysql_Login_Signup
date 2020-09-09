<?php
if($_SERVER['REQUEST_METHOD']=='POST'){
$con=mysqli_connect("localhost","username","password","dbname");
$name=$_POST['name'];
$user_name=$_POST['user_name'];
$password=$_POST['password'];
$phone=$_POST['phone'];

$sql="INSERT INTO logininfo (name, user_name,password,phone) VALUES ('".$name."','".$user_name."','".$password."','".$phone."')";
	if(mysqli_query($con,$sql)){
		echo("Yes");
	}else{
		echo("No");
	}

}
 


?>
