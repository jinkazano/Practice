package day9.ex1;




import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


import java.io.*;

import java.text.SimpleDateFormat;
import java.util.Date;



public class ex1 {

    public static void main(String[] args) throws IOException, ParseException, java.text.ParseException {


        FileReader reader = new FileReader("D:\\java\\bai1.json");
        Object obj = new JSONParser().parse(reader);
        JSONObject jsonObject = (JSONObject) obj;



        Long height = (Long) jsonObject.get("height");
        String chain = (String) jsonObject.get("chain");
        Long total = (Long) jsonObject.get("total");
        String size = String.valueOf(jsonObject.get("size"));
        String time  = getDate(String.valueOf(jsonObject.get("time")));
        String received_time = getDate((String)jsonObject.get("received_time"));


        System.out.println("height: " + height);
        System.out.println("chain: " + chain);
        System.out.println("total: " + total);
        System.out.println("size: " + size);
        System.out.println("time: " + time);
        System.out.println("received_time: " + received_time);


        JSONObject another_bai1=new JSONObject();
        another_bai1.put("heigh",height);
        another_bai1.put("chain",chain);
        another_bai1.put("total",total);
        another_bai1.put("size",size);
        another_bai1.put("time",time);
        another_bai1.put("received_time",received_time);

        System.out.println(another_bai1);








    }
    private static String getDate(String dateString) throws java.text.ParseException {
        Date parsedDate = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").parse(dateString);
        return new SimpleDateFormat("dd/MM/yy").format(parsedDate);
    }
}