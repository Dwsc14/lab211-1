package Controller;

import java.util.Scanner;

public class utils {

    static Scanner scan = new Scanner(System.in);

    /*
     * Author Baor(Bảo)
     */
    public static Integer inputInt(String msg, int min, int max, boolean update) {
        if (min > max) {
            int temp = min;
            min = max;
            max = temp;
        }
        int data = 0;
        String check;
        while (true) {
            try {
                System.out.print(msg);
                check = scan.nextLine();
                if (check.equals("") && update) {
                    return null;
                }
                data = Integer.parseInt(check);
                if ((data >= min && data <= max)) {
                    break;
                }
            } catch (Exception e) {
            }
        }
        return data;
    }

    public static String inputStr(String msg, boolean update) {
        System.out.print(msg);
        String data = scan.nextLine();
        if (data.equals("") && update) {
            return null;
        }
        return data.trim();
    }

    public static String inputNonBlankStr(String msg, boolean update) {
        String data;
        do {
            System.out.print(msg);
            data = scan.nextLine().trim();
        } while (data.length() == 0);
        return data;
    }

    public static String inputPattern(String msg, String pattern, boolean update) {
        String data;
        do {
            System.out.print(msg);
            data = scan.nextLine();
            if (data.equals("") && update) {
                return null;
            }
        } while (!data.trim().matches(pattern));
        return data.trim();
    }

    public static Double inputDouble(String msg, boolean update) {
        String check;
        double data;
        while (true) {
            try {
                System.out.print(msg);
                check = scan.nextLine();
                if (check.equals("") && update) {
                    return null;
                }
                data = Integer.parseInt(check);
                break;
            } catch (Exception e) {
            }
        }
        return data;
    }

    /*
     * Author Finn(Nhi)
     */

    public static String convertRightFormat(String nName) {
        nName = nName.trim();
        nName = nName.replaceAll("\\s+", " ");
        return nName;
    }

    /*
     * Author Cudamii(Đức)
     */

    public static int findLargestLenght(String[] list) {
        int rs;
        rs = list[0].length();
        for (String st : list) {
            if (st.length() > rs) {
                rs = st.length();
            }
        }
        return rs;
    }
}