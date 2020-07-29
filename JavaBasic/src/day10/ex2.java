package day10;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;


public class ex2 {
    public static void main(String[] args) throws IOException, ParseException, NullPointerException {
        FileReader reader = new FileReader("D:\\java\\ex2_students.json");
        JSONObject jsonObject = (JSONObject) new JSONParser().parse(reader);

        JSONArray student_list = (JSONArray) jsonObject.get("student_list");
        System.out.println(student_list);
        Iterator<Map.Entry> itr1;
        Iterator itr2 = student_list.iterator();
        while (itr2.hasNext()) {
            itr1 = ((Map) itr2.next()).entrySet().iterator();
            while (itr1.hasNext()) {
                Map.Entry pair = itr1.next();
                System.out.println(pair.getKey() + " : " + pair.getValue());
            }
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("\nNhập username kiểm tra");
        String search_username = sc.next();
//        đến đây chịu rồi


    }


}


