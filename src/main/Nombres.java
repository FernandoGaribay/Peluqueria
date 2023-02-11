package main;

import java.util.Random;

public class Nombres {

    private String[] nombresHombre;
    private String[] nombresMujer;

    public Nombres() {
        this.nombresHombre = new String[]{
            "Juan",
            "Miguel",
            "Carlos",
            "Pedro",
            "José",
            "Francisco",
            "Antonio",
            "Diego",
            "Alejandro",
            "Jesus",
            "Ricardo",
            "Mario",
            "Jorge",
            "Eduardo",
            "David",
            "Daniel",
            "Israel",
            "Santiago",
            "Luis",
            "Manuel"
        };

        this.nombresMujer = new String[]{
            "María",
            "Guadalupe",
            "Juanita",
            "Ana",
            "Teresa",
            "Rosalba",
            "Isabel",
            "Esperanza",
            "Lourdes",
            "Magdalena",
            "Alicia",
            "Aurora",
            "Carmen",
            "Laura",
            "Esther",
            "Rosa",
            "Dolores",
            "Rita",
            "Ofelia",
            "Norma"
        };
    }

    public String[] getNombresHombre() {
        return nombresHombre;
    }

    public String getNombresHombre(int i) {
        return nombresHombre[i];
    }

    public String getNombreHombreAleatorio() {
        Random random = new Random();
        return getNombresHombre(random.nextInt(nombresHombre.length));
    }

    public void setNombresHombre(String[] nombresHombre) {
        this.nombresHombre = nombresHombre;
    }

    public String[] getNombresMujer() {
        return nombresMujer;
    }

    public String getNombresMujer(int i) {
        return nombresMujer[i];
    }

    public String getNombreMujerAleatorio() {
        Random random = new Random();
        return getNombresMujer(random.nextInt(nombresMujer.length));
    }

    public void setNombresMujer(String[] nombresMujer) {
        this.nombresMujer = nombresMujer;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombres{");
        sb.append("nombresHombre=").append(nombresHombre);
        sb.append(", nombresMujer=").append(nombresMujer);
        sb.append('}');
        return sb.toString();
    }

}
