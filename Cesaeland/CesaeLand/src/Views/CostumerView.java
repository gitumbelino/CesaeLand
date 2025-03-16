package Views;

import Controllers.CustomerController;
import Domain.Attractions;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CostumerView {
    CustomerController customerController;


    public CostumerView() throws FileNotFoundException {
        this.customerController = new CustomerController();
    }

    public void clientMenu() {

        Scanner input = new Scanner(System.in);
        int menuOption;

        do {
            System.out.println("\nBem-vindo ao CESAELand. \uD83D\uDED2");
            System.out.println("1. As nossas attracções");
            System.out.println("2. As atracções preferidas");
            System.out.println("0. Sair \uD83C\uDFC3\uD83D\uDEAA");
            System.out.print("Escolha: ");

            menuOption = input.nextInt();

            switch (menuOption) {
                case 1:
                    showAttractions();
                    break;

                case 2:
                    printFavouriteAttractions();
                    break;

                case 0:
                    break;

                default: // Invalid Option
                    System.out.println("\uD83D\uDEA8 Invalid Option \uD83D\uDEA8");
            }

        } while (menuOption != 0);
    }

    private void showAttractions() {

        ArrayList<Attractions> attractionList = this.customerController.getAttractionsList();

        System.out.println("\n+---------------------------------------+----------------+----------------+----------+");
        System.out.println("| Atração                               | Preço Adulto   | Preço Criança  | Duração  |");
        System.out.println("+---------------------------------------+----------------+----------------+----------+");

        for (Attractions currentAttraction : attractionList) {
            int minutes = currentAttraction.getDurationSeconds() / 60;
            int seconds = currentAttraction.getDurationSeconds() % 60;
            String duration = String.format("%02d:%02d", minutes, seconds);

            String attractionName = currentAttraction.getAttraction();
            if (attractionName.length() > 37) {
                attractionName = attractionName.substring(0, 34) + "...";
            }

            System.out.printf("| %-37s | %13.2f€ | %13.2f€ | %8s |\n",
                    attractionName,
                    currentAttraction.getPriceAdult(),
                    currentAttraction.getPriceChildren(),
                    duration);
        }
        System.out.println("+---------------------------------------+----------------+----------------+----------+");
    }



        private void printFavouriteAttractions () {
        }


    }
