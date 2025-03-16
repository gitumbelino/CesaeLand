package Model;

import Domain.Sales;
import Tools.CSVReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class SalesRepository {

    private ArrayList<Sales> salesList;

    public SalesRepository() throws FileNotFoundException {
        this.salesList = CSVReader.readSalesFileToArray("CesaeLand/Files/Cesaeland_vendas.csv");
    }

    public ArrayList<Sales> getUsersList() {
        return salesList;
    }

}
