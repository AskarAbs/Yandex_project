import javax.swing.text.DateFormatter;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class NewStory {
    public static void main(String[] args) {
        List<Integer> array1 = new ArrayList<>();
        List<Integer> array2  = new ArrayList<>();
        int i = 10;
        extracted(array1);
        array2.add(array1.get(6));
        array2.add(array1.get(7));
        array2.add(array1.get(8));
        array2.add(array1.get(9));
        array2.add(array1.get(10));
        array2.add(array1.get(11));
        array1.remove(11);
        array1.remove(10);
        array1.remove(9);
        array1.remove(8);
        array1.remove(7);
        array1.remove(6);
        var pattern = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
        LocalDateTime localDateTime1 = LocalDateTime.of(array1.get(0),array1.get(1),array1.get(2),array1.get(3),array1.get(4),array1.get(5));
        LocalDateTime localDateTime2 = LocalDateTime.of(array2.get(0),array2.get(1),array2.get(2),array2.get(3),array2.get(4),array2.get(5));
        long days = ChronoUnit.DAYS.between(localDateTime1.toLocalDate(),localDateTime2.toLocalDate());
//        var time1 = localDateTime1.getDayOfMonth() - localDateTime2.getDayOfMonth();
//        var time2 = localDateTime1.getDayOfMonth() - localDateTime2.getDayOfMonth();

        long VesokDays = ChronoUnit.YEARS.between(localDateTime1.toLocalDate(),localDateTime2.toLocalDate())/4;
        Duration duration = Duration.between(localDateTime2.toLocalTime(),localDateTime1.toLocalTime());

        System.out.println(days-Math.abs(VesokDays)-1 + " " + Math.abs(duration.getSeconds()));
    }
//980 2 12 10 30 1 980 3 1 10 31 37
    // 1001 5 20 14 15 16 9009 9 11 12 21 11
    private static void extracted(List<Integer> list) {
        Scanner scanner = new Scanner(System.in);
        LocalDateTime localDateTime;
        int counter = 0;
        while (scanner.hasNext()){
            var next = scanner.next();
            list.add(Integer.valueOf(next));
            counter++;
            if (counter >= 12){
                break;
            }
        }
    }
}
