package software.ulpgc.kata3;

import software.ulpgc.kata3.swing.MainFrame;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        VideogameLoader loader = new CsvFileVideogameLoader(new File("vgsales.csv"));
        List<Videogame> videogames = loader.load();
        Map<String, Double> data = new HashMap<>();
        for (Videogame videogame: videogames) {
            if(data.containsKey(videogame.getPlatform())) {
                data.put(videogame.getPlatform(), data.get(videogame.getPlatform()) + 1);
            }
            else {
                data.put(videogame.getPlatform(), 1.0);
            }
        }
        Chart chart = new Chart("Videogames by platform in the top sales", "Platforms", "Number of videogames", data);
        MainFrame frame = new MainFrame();
        frame.getChartDisplay().show(chart);
        frame.setVisible(true);
    }
}
