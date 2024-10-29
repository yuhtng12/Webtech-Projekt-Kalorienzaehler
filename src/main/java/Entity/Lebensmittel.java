package Entity;

public class Lebensmittel {
    private String name;
    private int kalorien; // Kalorien pro 100g

    // Standardkonstruktor
    public Lebensmittel() {}

    // Konstruktor mit Parametern
    public Lebensmittel(String name, int kalorien) {
        this.name = name;
        this.kalorien = kalorien;
    }

    // Getter und Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKalorien() {
        return kalorien;
    }

    public void setKalorien(int kalorien) {
        this.kalorien = kalorien;
    }
}



