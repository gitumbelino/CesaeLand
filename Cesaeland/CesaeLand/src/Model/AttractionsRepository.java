package Model;

import Domain.Attractions;
import Tools.CSVReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class AttractionsRepository {

    ArrayList<Attractions> attractionList;

    public AttractionsRepository() throws FileNotFoundException {
        this.attractionList = CSVReader.readAttractionsFileToArray("CesaeLand/Files/Cesaeland_atracoes.csv");
    }

    public ArrayList<Attractions> getAttractionList() {
        return attractionList;
    }
}
