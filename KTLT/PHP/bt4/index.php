<!DOCTYPE html>

<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
        <form method="POST" action="action.php">
            <table align="center" cellspacing="1" cellpadding="1">
                <tr>
                    <td><b>May tinh bo tui</b></td>
                </tr>
                <tr>
                    <td>So A</td>
                    <td><input type=number step=any name="a"></td>
                </tr>
                <tr>
                    <td>So B</td>
                    <td><input type=number step="any" name="b"></td>
                </tr>
                <tr>
                <td >Lua chon</td>
                <td>
                    <input type="checkbox" name="tong"> Tong 2 so </br>
                    <input type="checkbox" name="hieu"> Hieu 2 so </br>
                    <input type="checkbox" name="tich"> Tich 2 so </br>
                    <input type="checkbox" name="thuong"> Thuong 2 so </br>
                </td>
                </tr>
                <tr align="center">
			<td><input type="reset" name="reset-click" value="Nhap lai" /></td>
			<td><input type="submit" name="form-click" value="Ve" /></td>
		</tr>
                
                
            </table>
            
        </form>
    </body>
</html>
