import java.util.*;

public class Peaks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> foodPortion = new ArrayDeque<>();
        ArrayDeque<Integer> stamina = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt).forEach(foodPortion::push);

        Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt).forEach(stamina::offer);

        List<Integer> peaksDifficulty = new ArrayList<>();
        peaksDifficulty.add(80);
        peaksDifficulty.add(90);
        peaksDifficulty.add(100);
        peaksDifficulty.add(60);
        peaksDifficulty.add(70);
        List<String> peaksNames = new ArrayList<>();
        peaksNames.add("Vihren");
        peaksNames.add("Kutelo");
        peaksNames.add("Banski Suhodol");
        peaksNames.add("Polezhan");
        peaksNames.add("Kamenitza");
        List<String> conquaredPeaksNames = new ArrayList<>();

        int days = 7;
        int conquaredPeaks = 0;

        while (days != 0 && conquaredPeaks != 5) {
            days--;
            int dayFoodPortion = foodPortion.peek();
            int dayStamina = stamina.peek();
            int daySum = dayFoodPortion + dayStamina;

            if (daySum >= peaksDifficulty.get(0)) {
                conquaredPeaks++;
                foodPortion.pop();
                stamina.poll();
                conquaredPeaksNames.add(peaksNames.get(0));
                peaksNames.remove(0);
                peaksDifficulty.remove(0);
            } else {
                foodPortion.pop();
                stamina.poll();
            }

        }

        if (conquaredPeaks == 5) {
            System.out.println
                    ("Alex did it! He climbed all top five Pirin peaks in one week -> @FIVEinAWEEK");
            System.out.printf("Conquered peaks:%n");
            conquaredPeaksNames.forEach(System.out::println);
        } else {
            System.out.println
                    ("Alex failed! He has to organize his journey better next time -> @PIRINWINS");
            if (conquaredPeaks != 0) {
                System.out.printf("Conquered peaks:%n");
                conquaredPeaksNames.forEach(System.out::println);
            }
        }
    }
}
