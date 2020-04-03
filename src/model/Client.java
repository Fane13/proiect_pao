package model;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private String nume_client;
    private String prenume_client;
    private int cod_client;

    private List<Rezervare> rezervari_client = new ArrayList<>();

    public Client(String nume_client, String prenume_client, int cod_client) {
        this.nume_client = nume_client;
        this.prenume_client = prenume_client;
        this.cod_client = cod_client;


    }

    public void adauga_rezervare(Rezervare rezervare) {
        rezervari_client.add(rezervare);
        System.out.println(">>>>>>>>La clientul " + this.nume_client + " " + this.prenume_client + " " + this.cod_client + " s-a adaugat rezervarea <<<<<<<<");
        System.out.println(rezervare);
    }

    public String getNume_client() {
        return nume_client;
    }

    public void setNume_client(String nume_client) {
        this.nume_client = nume_client;
    }

    public String getPrenume_client() {
        return prenume_client;
    }

    public void setPrenume_client(String prenume_client) {
        this.prenume_client = prenume_client;
    }

    public int getCod_client() {
        return cod_client;
    }

    public void setCod_client(int cod_client) {
        this.cod_client = cod_client;
    }

    public List<Rezervare> getRezervari_client() {
        return rezervari_client;
    }

    public void setRezervari_client(List<Rezervare> rezervari_client) {
        this.rezervari_client = rezervari_client;
    }


    @Override
    public String toString() {
        return "Client{" +
                "Nume Client='" + nume_client + '\'' +
                ", Prenume Client='" + prenume_client + '\'' +
                ", Rezervari Client=" + rezervari_client +
                '}';
    }

}
