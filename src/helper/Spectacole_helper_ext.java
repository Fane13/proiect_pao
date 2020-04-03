package helper;

import spectacole.Spectacole_helper;
import model.Spectacol;
import model.Rezervare;
import model.Actori;
import model.Client;

import java.util.ArrayList;
import java.util.List;


public class Spectacole_helper_ext extends Spectacole_helper {
    @Override
    public Spectacol adauga_spectacol_cu_date_de_baza() {
        //ACTORI
        Actori actor1 = new Actori("Pelea", "Amza", "actor_principal");
        Actori actor2 = new Actori("Malaele", "Horatiu", "actor_principal");
        Actori actor3 = new Actori("Radulescu", "Dan", "actor_secundar");
        Actori actor4 = new Actori("Moraru", "Marin", "actor_secundar");

        List<Actori> Actorii = new ArrayList<>();
        Actorii.add(actor1);
        Actorii.add(actor2);
        Actorii.add(actor3);
        Actorii.add(actor4);

        //Rezervari
        Rezervare rez = new Rezervare(1, 12);
        List<Rezervare> comenzi = new ArrayList<>();
        comenzi.add(rez);

        //clienti
        Client client1 = new Client("Glodeanu", "Alexandru", 123);
        Client client2 = new Client("Turtoi", "Radu", 46);

        client1.adauga_rezervare(rez);

        List<Client> clients = new ArrayList<>();
        clients.add(client1);
        clients.add(client2);


        return new Spectacol(
                "A doua tinere",
                120,
                "21-04.2020 20:00",
                Actorii,
                comenzi,
                clients
        );
    }
}

