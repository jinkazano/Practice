<?php

if (isset($_POST["submit-click"])) {
    $id = $_POST["id"];
    $username = $_POST["username"];
    $birthday = $_POST["birthday"];
    
    $country = $_POST["country"];
    $class = $_POST["class"];

    if (empty($id) || empty($username) || empty($birthday) || empty($POST_['gender']) || empty($country) || empty($class)) {
        echo "Vui long dien day du thong tin";
    } else {
        $gender = $_POST["gender"];
        echo "MSSV: " . $_POST['id'] . "</br>";
        echo "Ten: " . $_POST['username'] . "</br>";
        echo "Ngay sinh: " . $_POST['birthday'] . "</br>";
        echo "Gioi tinh: " . $_POST['gender'] . "</br>";
        echo "Noi sinh: " . $_POST['country'] . "</br>";
        echo "Lop: " . $_POST['class'] . "</br>";
    }
}
?>
