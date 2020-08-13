<!DOCTYPE html>

<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
        <form method="POST" action="action.php">
            <table align="center" >
                <tr>
                    <td align="center" colspan="2"><b>Dang Ky</b></td>
                </tr>
                <tr>
                    <td>Ma SV</td>
                    <td><input type="text" name="id"></td>
                </tr>
                <tr>
                    <td>Ten</td>
                    <td><input type="text" name="username"></td>
                </tr>
                <tr>
                    <td>Ngay sinh</td>
                    <td><input type="date" name="birthday"></td>
                </tr>
                
                <tr>
                    <td>Gioi tinh</td>
                    <td>
                        <input type="radio" name="gender" value="nam">Nam
                        <input type="radio" name="gender" value="nu">Nu
                    </td>
                    
                        
                </tr>
                <tr>
                    <td>Noi sinh</td>
                    <td><input type="text" name="country"></td>
                </tr>
                <tr>
                    <td>Lop</td>
                    <td><input type="text" name="class"></td>
                </tr>
                <tr >
                    <td align="center" colspan="2">
                    <input type="reset" name="rs-click" value="Xoa">
                    <input type="submit" name="submit-click" value="Dang ky">
                    <td>
                </tr>
            </table>
        </form>
    </body>
</html>
