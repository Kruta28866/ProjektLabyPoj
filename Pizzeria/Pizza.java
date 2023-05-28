import java.util.Arrays;

public class Pizza {

    static String[] vegein = {"szpinak", "pomidor", "sos", "ser"};
    static String[] caprin = {"pieczarki", "szynka", "sos", "ser"};
    static String[] pepin = {"Salami", "papryka", "sos", "ser"};

    static Pizza vege = new Pizza("wegetariańska", vegein,0 ,25,33,38);
    static Pizza capri = new Pizza("capriciosa" , caprin, 1,28,33,38);
    static Pizza pepe = new Pizza("peperoni", pepin, 2, 30,35,40);

    private String name;
    private String[] ingri;
    private int scaleShu;
    private String size;

    private int pSmall;
    private int pAvarage;
    private int pBig;

    public Pizza() {
    }

    public Pizza(String name, String[] ingri, int scaleShu, String size) {
        this.name = name;
        this.ingri = ingri;
        this.scaleShu = scaleShu;
        this.size = size;
    }

    public Pizza(String name, String[] ingri, int scaleShu, int pSmall, int pAvarage, int pBig) {
        this.name = name;
        this.ingri = ingri;
        this.scaleShu = scaleShu;
        this.pSmall = pSmall;
        this.pAvarage = pAvarage;
        this.pBig = pBig;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getIngri() {
        return ingri;
    }

    public void setIngri(String[] ingri) {
        this.ingri = ingri;
    }

    public int getScaleShu() {
        return scaleShu;
    }

    public void setScaleShu(int scaleShu) {
        this.scaleShu = scaleShu;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getpSmall() {
        return pSmall;
    }

    public void setpSmall(int pSmall) {
        this.pSmall = pSmall;
    }

    public int getpAvarage() {
        return pAvarage;
    }

    public void setpAvarage(int pAvarage) {
        this.pAvarage = pAvarage;
    }

    public int getpBig() {
        return pBig;
    }

    public void setpBig(int pBig) {
        this.pBig = pBig;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "Nazwa = '" + name + '\'' +
                ", Składniki = " + Arrays.toString(ingri) +
                ", Ostrość = " + scaleShu +
                ", size= '" + size + '\'' +
                ", Cena małej pizzy = " + pSmall + " zł"+
                ", cena średniej pizzy = " + pAvarage +" zł"+
                ", cena dużej pizzy = " + pBig +" zł"+
                '}';
    }
}
