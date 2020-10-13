package day8.ex1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionary {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> dictionary = new HashMap<>();
        int chon;

        do {
            System.out.println("1. Thêm từ");
            System.out.println("2. Tra từ Anh-Viêt");
            System.out.println("3. Tra từ Việt-Anh");
            System.out.println("4. Thoát");
            System.out.println("Nhập lựa chọn:");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    inputDictionary(dictionary);

                    break;
                case 2:
                    System.out.println("Nhập từ TA cần tra:");
                    String searchE = sc.next();
                    if (dictionary.containsKey(searchE))
                        System.out.println(searchE + ": " + dictionary.get(searchE));
                    else {
                        System.out.println("Hiện chưa có từ cần tra. Mời thêm vào!");
                        inputDictionary(dictionary);
                    }

                    break;
                case 3:
                    System.out.println("Nhập từ TV cần tra:");
                    String searchV = sc.next();
                    boolean flag = true;
                    for (Map.Entry<String, String> entry : dictionary.entrySet()) {
                        String keyString = entry.getKey();
                        String valueString = entry.getValue();
                        if (valueString.equals(searchV)) {
                            System.out.println(valueString + ": " + keyString);
                            flag = false;
                        }
                    }
                    if (flag) {
                        System.out.println("Hiện chưa có từ cần tra. Mời thêm vào!");
                        inputDictionary(dictionary);
                    }

                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Mời nhập lại");
            }

        } while (chon != 4);

    }

    public static void inputDictionary(Map<String, String> dictionary) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập từ TA:");
        String E = sc.next();
        System.out.println("Nhập từ TV:");
        String V = sc.next();
        dictionary.put(E, V);
    }


}
