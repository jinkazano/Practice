<?php

if (isset($_POST['form-click'])) {
    $sodong = $_POST["sodong"];
    $socot = $_POST["socot"];

    
    if ($sodong == null || $socot == null) {
        echo 'Vui long nhap day du thong tin';
    }else if($socot<0 ||$sodong<0) 
    {
        echo 'Vui long nhap so nguyen duong';
    }
    else {
        echo '<table align="center" cellpadding="1" cellspacing="1" border="1"';
        for ($i = 0; $i < $sodong; $i++) {
            echo "<tr>";
            for ($j = 0; $j < $socot; $j++) {
                echo'<td align="center" height="50px" width="50px">' . (3 * 3 * ($i + $j)) . '</td>';
            }
        }
        echo "</tr>";
        echo '</table>';
    }
}
?>

