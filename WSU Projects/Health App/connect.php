<?php
	$FullName = $_POST['Full Name'];
	$Username = $_POST['Username'];
	$Email= $_POST['Email'];
	$PhoneNumber = $_POST['Phone Number'];
	$Password = $_POST['Password'];
	$ConfirmPassword = $_POST['Confirm password'];
    $Gender = $_POST['Gender'];

	

	// Database connection
	$conn = new mysqli('localhost','root','','test');
	if($conn->connect_error){
		echo "$conn->connect_error";
		die("Connection Failed : ". $conn->connect_error);
	} else {
		$stmt = $conn->prepare("insert into registration(Full Name, username, Email,Phone number, password,confirmPassword, Gender) values(?, ?, ?, ?, ?, ?)");
		$stmt->bind_param("sssssi", $FullName, $Username,$email, $PhoneNumber, $Password, $ConfirmPaawsord, $Gender);
		$execval = $stmt->execute();
		echo $execval;
		echo "Registration successfully...";
		$stmt->close();
		$conn->close();
	}
?>