package main;

public class Cliente {

    private String name;
    private String gender;

    public Cliente() {
        this.name = "";
        this.gender = "";
    }

    public Cliente(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("cliente{");
        sb.append("name=").append(name);
        sb.append(", gender=").append(gender);
        sb.append('}');
        return sb.toString();
    }

}
