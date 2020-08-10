package exercise5.models;

public class Client {
    private Long id;
    private String name;
    private Account account;

    public Client(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
