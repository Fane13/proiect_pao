import helper.Spectacole_helper_ext;
import model.Client;
import model.Spectacol;
import model.Actori;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Spectacol spectacol = new Spectacole_helper_ext().adauga_spectacol_cu_date_de_baza();


        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Selectati una din optiunile de mai jos pentru a afla mai multe informatii.");
            System.out.println("1.Adauga client");
            System.out.println("2.Sterge client");
            System.out.println("3.Adauga actor");
            System.out.println("4.Listeaza clientii si rezervarile acestora");
            System.out.println("5.Listeaza actorii si rolurile acestora");
            System.out.println("6.exit");
            String optiune = scanner.next();
            switch (optiune) {
                case "1":
                    System.out.println("Introduceti numele Clientului: ");
                    String nume_client = scanner.next();
                    System.out.println("Introduceti prenumele Clientului: ");
                    String prenume_client = scanner.next();
                    System.out.println("Introduceti id-ul Clientului: ");
                    String id_client = scanner.next();
                    Client client = new Client(nume_client, prenume_client, Integer.parseInt(id_client));
                    spectacol.adauga_client(client);
                    break;
                case "2":
                    System.out.println("Introduceti indexul clientului ce va fi sters: ");
                    String index = scanner.next();
                    spectacol.sterge_client(Integer.parseInt(index));
                    break;
                case "3":
                    System.out.println("Introduceti numele actorului: ");
                    String nume_actor = scanner.next();
                    System.out.println("Introduceti prenumele actorului: ");
                    String prenume_actor = scanner.next();
                    System.out.println("Introduceti rolul actorului: ");
                    String rol = scanner.next();
                    Actori actor = new Actori(nume_actor, prenume_actor, rol);
                    spectacol.adauga_actori(actor);
                    break;
                case "4":
                    System.out.println("Clientii sunt si rezervarile acestora sunt: ");
                    System.out.println("\n");
                    System.out.println(spectacol.getClienti());
                    break;
                case "5":
                    System.out.println("actorii din restaurant sunt: ");
                    System.out.println("\n");
                    System.out.println(spectacol.getActori());
                    //spectacol.getActori().stream().forEach(System.out::print);
                    break;
                case "exit":
                    System.exit(0);
                    break;
                default:
                    System.out.println("\n");
                    System.out.println("Ai ales o optiune incorecta, selectati una din cele de mai sus.");
            }
        }
    }
}