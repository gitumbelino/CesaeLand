package Controllers;

import Domain.Attractions;
import Model.AttractionsRepository;
import Model.SalesRepository;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class AdminController {

    private AttractionsRepository attractionsRepository;
    private SalesRepository salesRepository;

    public AdminController() throws FileNotFoundException {
        this.salesRepository = new SalesRepository();
        this.attractionsRepository = new AttractionsRepository();

    }



//    O menu de Administrador deve ser acedido com login, validado com as contas permitidas guardadas num ficheiro. E deve
//    conter as seguintes funcionalidades:


    //Consultar o total de todas as vendas.
    public void totalSales() {

    }

    //Consultar o total de lucro.
    public void getTotalProfit() {

    }


    //Consultar o total de vendas e lucro por mês, de forma tabelar.
    public void totalSalesPlusEarnsTablePerMonth() {

    }


    //Consultar a atração mais procurada por adultos (número de bilhetes vendidos).
    public void mostWantedByAdults() {

    }


    //Consultar a atração mais procurada por crianças (número de bilhetes vendidos).
    public void mostWantedByChildren() {

    }


    //Consultar a atração mais procurada (número de bilhetes vendidos).

    public void mostWantedAll() {

    }


    //Consultar a atração mais lucrativa (considere o período total).
    public void mostLucrative() {

    }


    //Consultar a atração menos lucrativa (considere o período total).
    public void leastLucrative() {

    }


    //Consultar a atração com melhor preço/tempo. Apresenta a atração que custa menos por segundo.
    public Attractions priceVsTime() {


        ArrayList<Attractions> attractionsList = attractionsRepository.getAttractionList();
        if (attractionsList.isEmpty()) {
            return null;
        }

        Attractions bestAttraction = attractionsList.get(0);
        double bestRelation = bestAttraction.getPriceAdult() / bestAttraction.getDurationSeconds();

        // Percorre as demais atrações
        for (Attractions attraction : attractionsList) {
            // Calcula a relação preço/tempo para esta atração (usando preço adulto, por exemplo)
            double currentRelation = attraction.getPriceAdult() / attraction.getDurationSeconds();

            // Se esta relação for melhor (menor) que a melhor até agora
            if (currentRelation < bestRelation) {
                bestRelation = currentRelation;
                bestAttraction = attraction;
            }
        }

        return bestAttraction;
    }




}
