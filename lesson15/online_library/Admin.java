package lesson15.online_library;

import java.util.Random;
public class Admin {
    private Libraian[] libraians;

    private String name;
    private String password;

    //public Libraian add_librarian(String name, String password, String Em, String address, String city, long contactNo) {


        

       // libraians[1].setId(.long nextLong());
    //}


    public Libraian[] view_librarian() {
        return libraians;
    }

    public boolean delet_librarian(long id) {

        for (int i = 0; i < libraians.length; i++) {
            if ((libraians[i] != null) && (id == libraians[i].getId())) {
                libraians[i] = null;
                return true;
            }
        }
        return false;
    }

}
