public class Country {
    private String id;
    private String name;
    private int citizens;

    public Country(String id, String name, int citizens) {
        this.id = id;
        this.name = name;
        this.citizens = citizens;
    }

    public Country() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCitizens() {
        return citizens;
    }

    public void setCitizens(int citizens) {
        this.citizens = citizens;
    }

    @Override
    public String toString() {
        return name + " (" + id + ")" + " ma " + citizens + " ludności.";
    }
}
