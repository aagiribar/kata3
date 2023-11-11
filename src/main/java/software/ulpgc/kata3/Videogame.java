package software.ulpgc.kata3;

public class Videogame {
    private final String rank;
    private final String name;
    private final String platform;
    private final String year;
    private final String genre;
    private final String publisher;
    private final double naSales;
    private final double euSales;
    private final double jpSales;
    private final double otherSales;
    private final double globalSales;

    public Videogame(String rank, String name, String platform, String year, String genre, String publisher, double naSales, double euSales, double jpSales, double otherSales, double globalSales) {
        this.rank = rank;
        this.name = name;
        this.platform = platform;
        this.year = year;
        this.genre = genre;
        this.publisher = publisher;
        this.naSales = naSales;
        this.euSales = euSales;
        this.jpSales = jpSales;
        this.otherSales = otherSales;
        this.globalSales = globalSales;
    }

    public String getRank() {
        return rank;
    }

    public String getName() {
        return name;
    }

    public String getPlatform() {
        return platform;
    }

    public String getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    public String getPublisher() {
        return publisher;
    }

    public double getNaSales() {
        return naSales;
    }

    public double getEuSales() {
        return euSales;
    }

    public double getJpSales() {
        return jpSales;
    }

    public double getOtherSales() {
        return otherSales;
    }

    public double getGlobalSales() {
        return globalSales;
    }

    @Override
    public String toString() {
        return "Videogame{" +
                "rank='" + rank + '\'' +
                ", name='" + name + '\'' +
                ", platform='" + platform + '\'' +
                ", year='" + year + '\'' +
                ", genre='" + genre + '\'' +
                ", publisher='" + publisher + '\'' +
                ", naSales=" + naSales +
                ", euSales=" + euSales +
                ", jpSales=" + jpSales +
                ", otherSales=" + otherSales +
                ", globalSales=" + globalSales +
                '}';
    }
}
