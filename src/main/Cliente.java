package main;

public class Cliente {

    private String nombre;
    private String sexo;

    public Cliente() {
        this.nombre = "";
        this.sexo = "";
    }

    public Cliente(String name, String gender) {
        this.nombre = name;
        this.sexo = gender;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("cliente{");
        sb.append("name=").append(nombre);
        sb.append(", gender=").append(sexo);
        sb.append('}');
        return sb.toString();
    }

}
