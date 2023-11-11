package software.ulpgc.kata3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CsvFileVideogameLoader implements VideogameLoader{
    private final File file;

    public CsvFileVideogameLoader(File file) {
        this.file = file;
    }

    public File getFile() {
        return file;
    }

    @Override
    public List<Videogame> load() {
        List<Videogame> videogames = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            reader.readLine();
            while (true) {
                String line = reader.readLine();
                if (line == null) break;
                videogames.add(toVideogame(line));
            }
        } catch (IOException e) {}
        return videogames;
    }

    private Videogame toVideogame(String line) {
        return toVideogame(line.split(",(?=\\S)"));
    }

    private Videogame toVideogame(String[] fields) {
        return new Videogame(
                fields[0],
                fields[1],
                fields[2],
                fields[3],
                fields[4],
                fields[5],
                Double.parseDouble(fields[6]),
                Double.parseDouble(fields[7]),
                Double.parseDouble(fields[8]),
                Double.parseDouble(fields[9]),
                Double.parseDouble(fields[10])
        );
    }
}
