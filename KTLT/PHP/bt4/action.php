<?php
if(isset($_POST['form-click']))
{
    $a=(float)$_POST['a'];
    $b=(float)$_POST['b'];
    
    if($a===NULL||$b===NULL)
    {
        echo "Vui long nhap so thuc hoac nhap day du thong tin";
    }
    else  if(isset($_POST['tong'])&&isset($_POST['hieu'])&&isset($_POST['tich'])&&isset($_POST['thuong']))

    {
        if(isset($_POST['tong']))
        {
            
            
            echo"Tong hai so: " .($a+$b). "</br>";
        }
        if(isset($_POST['hieu']))
        {
            echo"Hieu hai so: ".($a-$b)."</br>";
        }
        if(isset($_POST['tich']))
        {
            
            
            echo"Tich hai so: " .($a*$b). "</br>";
        }
        if(isset($_POST['thuong']))
        {
            
            if($b==0)
            {
                echo "Thuong khong ton tai vi khong the chia cho so 0 ";
            }
            else
            {
                echo "Thuong hai so: ".($a/$b)."</br>";
            }
        }
       
    }
    else {
        echo "Ban chua chon chuc nang";
    }

}
?>

