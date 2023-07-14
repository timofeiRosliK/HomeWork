import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class HomeWork {
    public static void main(String[] args) {
        double usd = task1(500, Currency.EUR);
        System.out.println("The amount of dollars is " + usd);
        int[] array = task2();
        System.out.println("array = " + Arrays.toString(array));
        task3();
        task4();
        Map<Integer, String> map = new HashMap<>(Map.of(1, "Jeremy", 2, "mudak", 3, "sucks"));
        task5(map);
       List<String> list = new ArrayList<>(List.of("Motivation", "is", "not", "equal", "to", "discipline"));
        List<String> newList = task6(list);
        System.out.println("newList = " + newList);
        boolean isBirthday = task8("15-03-2023 10:00:00");
        System.out.println("isBirthday = " + isBirthday);
        boolean isAnagram = task9("listen", "silent");
        System.out.println("isAnagram = " + isAnagram);
        String str = task10("Hello world", 'l', 'x');
        System.out.println("str = " + str);

    }

    public static double task1(double cashValue, Currency currency) {

        switch (currency) {
            case GBP -> {
                return cashValue * 1.31;
            }
            case EUR -> {
                return cashValue * 1.1;
            }
            case USD -> {
                return cashValue;
            }
            case JPY -> {
                return cashValue * 0.0072;

            }

        }
        return 0;
    }

    public static int[] task2() {
        Random random = new Random();
        int[] array = new int[8];
        for (int i = 0; i < array.length; i++) {
            array[i] = (random.nextInt(10) + 1);
            if (i % 2 != 0) {
                array[i] = 0;
            }
        }
        return array;

    }

    public static void task3() {
        String s = null;
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\timof\\IdeaProjects\\depression\\src\\main\\java\\motivation"));
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void task4() {
        try (ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream("C:\\Users\\timof\\IdeaProjects\\depression\\src\\main\\java\\car.txt"));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\timof\\IdeaProjects\\depression\\src\\main\\java\\car.txt"))) {
            Vehicle bmw = new Vehicle("BMW", "hatchbak", 20.0);
            Vehicle mercedes = new Vehicle("Mercedez", "jeep", 30.0);
            ous.writeObject(bmw);
            ous.writeObject(mercedes);
            ous.close();
            Vehicle vehicle1 = (Vehicle) ois.readObject();
            Vehicle vehicle2 = (Vehicle) ois.readObject();
            System.out.println(vehicle1 + " and " + vehicle2);
        } catch (IOException e) {
            e.getMessage();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void task5(Map<Integer, String> map) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the value");
        String value = sc.nextLine();
        for (Map.Entry<Integer, String> item : map.entrySet()) {
            if (value.equals(item.getValue())) {
                System.out.println("The key is " + item.getKey());
            }

        }
    }

    public static List<String> task6(List<String> list) {
        List<String> newList = new ArrayList<>();
        for (String value : list) {
            if (value.length() > 5) {
                newList.add(value);
            }

        }
        return newList;
    }

    //Прочитай условие,ахаххаха
    public static boolean task8(String s) {
        LocalDateTime currentYear = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss", Locale.US);
        LocalDateTime birthday = LocalDateTime.parse(s, formatter);
        System.out.println();
        if (birthday.getYear() == currentYear.getYear()) {
            return true;
        }
        return false;
    }

    public static boolean task9(String s, String s1) {
        char[] ch = s.toCharArray();
        char[] ch1 = s1.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch1);
        s = new String(ch);
        s1 = new String(ch1);
        if (s.equals(s1)) {
            return true;
        }
        return false;
    }

    public static String task10(String s, char a, char b){
        return s.replace(a,b);


    }
}
