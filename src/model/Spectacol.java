package model;
import java.util.ArrayList;
import java.util.List;

import Spectacole.Spectacole;

public class Spectacol implements Spectacole{
    private String nume_spectacol ;
    private int pret_bilet;
    private String data_si_ora;

    private List<Actori> actori = new ArrayList<>();
    private List<Rezervare> revervari = new ArrayList<>();
    private List<Client> clienti = new ArrayList<>();

    public Spectacol(String nume_spectacol,int pret_bilet,String data_si_ora){
        this.nume_spectacol = nume_spectacol;
        this.data_si_ora = data_si_ora;
        this.pret_bilet =pret_bilet;

    }


    public Spectacol(String nume_spectacol, int pret_bilet, String data_si_ora, List<Actori> actori, List<Rezervare> rezervari,List<Client> clienti){
        this.nume_spectacol = nume_spectacol;
        this.data_si_ora = data_si_ora;
        this.pret_bilet =pret_bilet;
        this.actori  = actori;
        this.revervari = rezervari;
        this.clienti =clienti;
    }

    public String getNume_spectacol() {
        return nume_spectacol;
    }

    public void setNume_spectacol(String nume_spectacol) {
        this.nume_spectacol = nume_spectacol;
    }

    public int getPret_bilet() {
        return pret_bilet;
    }

    public void setPret_bilet(int pret_bilet) {
        this.pret_bilet = pret_bilet;
    }

    public String getData_si_ora() {
        return data_si_ora;
    }

    public void setData_si_ora(String data_si_ora) {
        this.data_si_ora = data_si_ora;
    }

    public List<Actori> getActori() {
        return actori;
    }

    public void setActori(List<Actori> actori) {
        this.actori = actori;
    }

    public List<Rezervare> getRevervari() {
        return revervari;
    }

    public void setRevervari(List<Rezervare> revervari) {
        this.revervari = revervari;
    }

    public List<Client> getClienti() {
        return clienti;
    }

    public void setClienti(List<Client> clienti) {
        this.clienti = clienti;
    }

    @Override
    public void adauga_client(Client client) {
        this.clienti.add(client);
        System.out.println(">>>>>>>>>>>: <<<<<<<<<<<<<<");
        System.out.println(client);
    }

    @Override
    public void sterge_client(int index) {
        this.clienti.remove(index);
        System.out.println(">>>>>>>>>>>S-a sters din sistem clientul cu indexul : "+ index +" <<<<<<<<<<<<<<");
    }

    @Override
    public void adauga_rezervare(Rezervare rezervare){
        this.revervari.add(rezervare);
        System.out.println(rezervare);
    }

    @Override
    public void adauga_actori(Actori actor) {
        this.actori.add(actor);
        System.out.println(actor);
    }

}
