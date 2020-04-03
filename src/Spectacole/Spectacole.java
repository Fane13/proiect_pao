package Spectacole;

import model.Client;
import model.Actori;
import model.Rezervare;
public interface Spectacole {
    public void adauga_client(Client client);

    public void sterge_client(int index);

    public void adauga_rezervare(Rezervare rezervare);

    public void adauga_actori(Actori actor);
}
