package Model;

import Domain.Users;
import Tools.CSVReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class UsersRepository {

    private ArrayList<Users> usersList;

    public UsersRepository() throws FileNotFoundException {
        this.usersList = CSVReader.readUserFileToArray("CesaeLand/Files/Cesaeland_logins.csv");
    }

    public ArrayList<Users> getUsersList() {
        return usersList;
    }
}
