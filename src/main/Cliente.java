package main;

public class Cliente {

    private String name;
    private String gender;
    private int age;

    public Cliente() {
        this.name = "";
        this.gender = "";
        this.age = 0;
    }

    public Cliente(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("cliente{");
        sb.append("name=").append(name);
        sb.append(", gender=").append(gender);
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }

}
