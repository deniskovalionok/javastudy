import java.util.ArrayList;

/**
 * Created by Den on 06.08.2015.
 */
public class Clinic {

    static ArrayList<Client> clientsList = new ArrayList<Client>();

    public static String Check(String name) {
         int  sizelist = clientsList.size();
        String out = null;
        for (int i = 0; i < sizelist; i++) {
            if (name.equals(clientsList.get(i).getName()) || name.equals(clientsList.get(i).pet.getNamep())){
                out = "Rigth!";
                break;
        }
            else {
                out = "Name not found";
            }
        }
        return out;
    }
    public static Client searchByName(String name){
        Client client = null;
        int sizelist = clientsList.size();
        for (int i = 0; i < sizelist; i++ ){
            if (name.equals(clientsList.get(i).getName()) || name.equals(clientsList.get(i).pet.getNamep())) {
                client = clientsList.get(i);
                break;
            }
        }
        return client;
    }
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
