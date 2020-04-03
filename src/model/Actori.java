package model;

public class Actori {
    private String nume_actor;
    private String prenume_actor;
    private String rol;

    public Actori(String nume_actor, String prenume_actor, String rol) {
        this.nume_actor = nume_actor;
        this.prenume_actor = prenume_actor;
        this.rol = rol;

    }

    public String getNume_actor() {
        return nume_actor;
    }

    public void setNume_actor(String nume_actor) {
        this.nume_actor = nume_actor;
    }

    public String getPrenume_actor() {
        return prenume_actor;
    }

    public void setPrenume_actor(String prenume_actor) {
        this.prenume_actor = prenume_actor;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Actori{" +
                "nume_actor='" + nume_actor + '\'' +
                ", prenume_actor='" + prenume_actor + '\'' +
                ", rol='" + rol + '\'' +
                '}';
    }
}
