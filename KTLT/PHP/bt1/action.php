<?php

if (isset($_POST["submit-click"])) {
    $name = $_POST["username"];
    $address = $_POST["address"];
    $job = $_POST["job"];
    $notice = $_POST["notice"];
    if ($name == NULL || $address == NULL || $job == NULL || $notice == NULL) {
        echo "Vui long dien day du thong tin";
    } else {
        echo "Ten: " . $_POST['username'] . "</br>";
        echo "Dia chi: " . $_POST['address'] . "</br>";
        echo "Nghe nghiep: " . $_POST['job'] . "</br>";
        echo "Ghi chu: " . $_POST['notice'] . "</br>";
    }
}
?>
