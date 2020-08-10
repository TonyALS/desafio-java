package exercise3.models;

public class Brand {

    private String name;
    private String idCode;

    public Brand(String name, String idCode) {
        this.name = name;
        this.idCode = idCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
