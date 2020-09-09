<?php


$con=mysqli_connect("localhost","username","pass","dbname");

$user_name=$_POST['user_name'];
$password=$_POST['password'];

$sql="SELECT * from logininfo where user_name='$user_name' and password='$password'";
$result= mysqli_query($con,$sql);
if(!mysqli_num_rows($result)>0)
{

$status="failed";
echo json_encode(array("response"=>$status));

}
else

{
$row= mysqli_fetch_assoc($result);
$name= $row['name'];
$phone= $row['phone'];
$status="ok";
echo json_encode(array("response"=>$status,"name"=>$name,"phone"=>$phone));
}

mysqli_close($con);
?>
