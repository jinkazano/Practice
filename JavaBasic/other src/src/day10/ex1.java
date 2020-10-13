package day10;


import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) throws IOException, ParseException {
        Scanner sc = new Scanner(System.in);
        FileReader reader = new FileReader("D:\\java\\ex1_profile.json");
        Object obj = new JSONParser().parse(reader);
        JSONObject jsonObject = (JSONObject) obj;

        Map user = (Map) jsonObject.get("user");
        Iterator<Map.Entry> itr1 = user.entrySet().iterator();
        while (itr1.hasNext()) {
            Map.Entry pair = itr1.next();
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }

        String  email_replace;
        do
        {
            System.out.println("Nhập email thay thế: (Nhập đúng định dạng)");
            email_replace=sc.next();
        }while (!email_replace.matches("^[A-Za-z0-9+_.-]+@(.+)$"));

        user.replace("email",email_replace);

        FileWriter file = new FileWriter("D:\\java\\ex1_profile.json");
        file.write(jsonObject.toString());
        file.flush();






    }


}
