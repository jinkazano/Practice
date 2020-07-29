package day8.ex2;


import java.text.SimpleDateFormat;
import java.util.*;


public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Long, String> maps = new HashMap<>();


        int selected;
        boolean sorted = false;

        maps.put(1572307200000L, "An toàn hệ điều hành");
        maps.put(1572912000000L, "Mã độc");
        maps.put(1573516800000L, "Mật mã ứng dụng trong an toàn thông tin");
        maps.put(1572480000000L, "An toàn hệ điều hành");
        maps.put(1574294400000L, "Kỹ thuật vi xử lý");
        maps.put(1574726400000L, "Thực hành vật lý đại cương 1&2");
        maps.put(1575331200000L, "Tiếng Anh 3");
        maps.put(1575936000000L, "Mật mã ứng dụng trong an toàn thông tin");
        maps.put(1576540800000L, "Thực hành vật lý đại cương 1&2");
        maps.put(1577145600000L, "An toàn hệ điều hành");
        maps.put(1576022400000L, "Mã độc");
        maps.put(1577232000000L, "An toàn hệ điều hành");
        maps.put(1565827200000L, "Cơ sở an toàn thông tin");
        maps.put(1566172800000L, "Kỹ thuật lập trình an toàn");
        maps.put(1566432000000L, "Xây dựng ứng dụng web an toàn");
        maps.put(1567036800000L, "Cơ sở an toàn thông tin");


        for (Map.Entry<Long, String> entry : maps.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        TreeMap<Long, String> sort = new TreeMap<>(maps);

        do {
            System.out.println("1. Sắp xếp lại Map theo thứ tự tăng dần theo thời gian ");
            System.out.println("2. Đổi mili giây sang dạng ngày/tháng/năm ");
            System.out.println("3. Thoát");
            System.out.println("Nhập lựa chọn:");
            selected = sc.nextInt();
            switch (selected) {
                case 1:

                    sort.forEach((key, value) -> {
                        System.out.println((key) + ": " + value);
                    });
                    sorted=true;


                    break;
                case 2:
                    if (sorted)
                        sort.forEach((key, value) -> {
                            System.out.println(getDate(key) + ": " + value);
                        });

                    else

                        maps.forEach((key, value) -> {
                            System.out.println(getDate(key) + ": " + value);
                        });

                    break;
                case 3:
                    System.out.println("Đã chọn thoát chương trình!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn trên mời nhập lại");
            }

        } while (selected != 4);


    }


    private static String getDate(Long milliseconds) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        return formatter.format(new Date(milliseconds));
    }
}
