package exercise3.models;

import java.time.LocalDate;

public class Owner {

    private String name;
    private String cpf;
    private String rg;
    private LocalDate dateOfBirth;
    private Address address;

    public Owner(String name, LocalDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public Owner (String name, String cpf, String rg, Address address) {
        this.name = name;
        this.cpf = cpf;
        this.rg = rg;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return name + ", nascimento: " + dateOfBirth;
    }
}
