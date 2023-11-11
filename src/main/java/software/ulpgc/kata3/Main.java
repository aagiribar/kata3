package software.ulpgc.kata3;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        VideogameLoader loader = new CsvFileVideogameLoader(new File("vgsales.csv"));
        List<Videogame> videogames = loader.load();
        Map<String, Integer> chart = new HashMap<>();
        for (Videogame videogame: videogames) {
            if(chart.containsKey(videogame.getPlatform())) {
                chart.put(videogame.getPlatform(), chart.get(videogame.getPlatform()) + 1);
            }
            else {
                chart.put(videogame.getPlatform(), 1);
            }
        }
        for (String key : chart.keySet()) {
            System.out.println(key + ": " + chart.get(key));
        }
    }
}
