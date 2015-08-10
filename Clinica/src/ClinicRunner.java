
import java.util.Scanner;


/**
 * Created by Den on 06.08.2015.
 */
public class ClinicRunner {

   public static void Headband() {
        System.out.println("Hello! What do you want to do?");
        System.out.println("1: Add client");
        System.out.println("2: Show pet client");
        System.out.println("3: Find");
        System.out.println("4: Edit");
        System.out.println("5: Delete");
        System.out.println("6: Exit");
    }
    public static int OtherOperation(){
        Scanner scanner = new Scanner(System.in);
        int in = Integer.parseInt(scanner.next());
        return in;
    }

    public static void main(String[] args) {
        String name;
        String namep;
        String s;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            Headband();
            switch (OtherOperation()) {
                case 1:
                    do {
                        System.out.println("Enter the name of the client");
                        name = scanner.next();
                        System.out.println("Enter a name for your pet");
                        namep = scanner.next();
                        System.out.println("Enter the age of the pet");
                        int ago = Integer.parseInt(scanner.next());
                        System.out.println("Enter the weight of your pet");
                        int weight = Integer.parseInt(scanner.next());
                        Clinic clinic = new Clinic();
                        Pet pet = new Pet(namep, ago, weight);
                        clinic.addClient(name, pet);
                        System.out.println("Enter more? yes/no");
                        s = scanner.next();
                    }
                    while (s.equals("yes"));
                    break;

                case 2:
                    do {
                        do {
                            System.out.println("Enter the name of the client");
                            name = scanner.next();
                            System.out.println(Clinic.Check(name));
                           }
                        while (Clinic.Check(name).equals("Name not found"));
                        System.out.println(Clinic.searchByName(name).pet.getNamep());
                        System.out.println("Enter more? yes/no");
                        s = scanner.next();
                    }
                    while (s.equals("yes"));
                    break;

                case 3:
                    do {
                        do {
                            System.out.println("Enter name client or enter name pet for find");
                            name = scanner.next();
                            System.out.println(Clinic.Check(name));
                        }
                        while (Clinic.Check(name).equals("Name not found"));
                        System.out.println(Clinic.searchByName(name).pet.getNamep());
                        System.out.println("Enter more? yes/no");
                        s = scanner.next();
                    } while (s.equals("yes"));
                    break;

                case 4:
                    do {
                        do {
                            System.out.println("Enter name client");
                            name = scanner.next();
                            System.out.println(Clinic.Check(name));
                        }
                        while (Clinic.Check(name).equals("Name not found"));

                        System.out.println("Edit his  name? yes/no");
                        s = scanner.next();
                        if (s.equals("yes")) {
                            Client client = Clinic.searchByName(name);
                            System.out.println("Enter now  name");
                            name = scanner.next();
                            client.setName(name);
                        }

                        System.out.println("Edit the name of your pet? yes/no");
                        s = scanner.next();
                        if (s.equals("yes")) {
                            Client client = Clinic.searchByName(name);
                            System.out.println("Enter now name pet");
                            name = scanner.next();
                            client.pet.setNamep(name);
                        }
                        System.out.println("Edit more?");
                        s = scanner.next();
                    } while (s.equals("yes"));
                    break;

                case 5:
                    do {
                        System.out.println("Enter name client or name pet to DELETE");
                        name = scanner.next();
                        for (int i = 0; i< Clinic.clientsList.size(); i++){
                            if (name.equals(Clinic.clientsList.get(i).getName())){
                                Clinic.clientsList.remove(i);
                                break;
                            }
                        }
                        System.out.println("Want more delete? yes/no");
                        s = scanner.next();
                    } while (s.equals("yes"));
                    break;

                case 6:
                    System.exit(0);
            }
        }
    }}
