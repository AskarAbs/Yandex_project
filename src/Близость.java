import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//3
//        2
//        12
//        2
//        13
//        3
//        123

public class Близость {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        extracted(list);
        List<String> list3 = new ArrayList<>();

        StringBuilder strings = new StringBuilder();
        int counter = 0;
        for (String integer : list) {
            List<String> list2 = new ArrayList<>();
            if (integer.length()>1){
//                for (int i = 0; i < list.size(); i++) {
                    for (int j = 0; j < integer.length(); j++) {
                        list2.add(String.valueOf(integer.charAt(j)));
                        strings.append(integer.charAt(j));
                    }

                    if (list3.size() != 0){
                        for (String s : list2) {
                            for (String s1 : list3) {
                                    for (int i = 0; i < s.length(); i++) {
                                        if (s.charAt(i) == s1.charAt(i)){
                                            counter++;
                                        }
                                    }
                            }
                        }
                    }

                list3 = list2;

            }
//            System.out.println(list2);
//            System.out.println(list3);
        }

//        var strings = list2.subList();
        System.out.println(counter);

//        System.out.println(list3);
    }

    private static void extracted(List<String> list) {
    String line = "";
        try(Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNextLine()) {
                var nextLine = scanner.nextLine();
//                var next = scanner.next();
                if (nextLine.equals("")) {
                    break;
                }
                list.add(nextLine);
            }
        }
    }
}
//
