import java.util.ArrayList;

/**
 * Created by Den on 06.08.2015.
 */
public class Clinic {

     static ArrayList<Client> clientsList = new ArrayList<Client>();

    public void addClient(String name, Pet pet)
    {
        clientsList.add(new Client(name, pet));
    }

    public  void showClients(){
        for (int i = 0; i < clientsList.size(); i++){
            System.out.println(clientsList.get(i).toString());
        }
    }

}
