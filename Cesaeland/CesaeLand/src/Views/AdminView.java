package Views;

import Controllers.AdminController;

import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class AdminView {

    AdminController adminController;

    public AdminView() throws FileNotFoundException {
        this.adminController = new AdminController();
    }

    public void adminMenu() throws InterruptedException {

        Scanner input = new Scanner(System.in);
        int menuOption;

        do {


            System.out.println("\n Bem vindo Senhor Administrador!");
            System.out.println("1. Consultar o total de todas as vendas.");
            System.out.println("2. Consultar o total de lucro.");
            System.out.println("3. Consultar o total de vendas e lucro por mês, de forma tabelar.");
            System.out.println("4. Consultar a atração mais procurada por adultos (número de bilhetes vendidos).");
            System.out.println("5. Consultar a atração mais procurada por crianças (número de bilhetes vendidos).");
            System.out.println("6. Consultar a atração mais procurada (número de bilhetes vendidos).");
            System.out.println("7. Consultar a atração mais lucrativa (considere o período total).");
            System.out.println("8. Consultar a atração menos lucrativa (considere o período total).");
            System.out.println("9. Consultar a atração com melhor preço/tempo. #####(Função que escolhi deenvolver)######.");
            System.out.println("10. Adicionar novo login");
            System.out.println("0. Exit \uD83C\uDFC3\uD83D\uDEAA");
            System.out.print("Choose: ");

            menuOption = input.nextInt();

            switch (menuOption) {
                case 1: // Most Sold Product (By Units)
                    break;

                case 2: // Most Sold Product (By Value)
                    break;

                case 3: // Best Sale (By Units)
                    break;

                case 4: // Best Sale (By Value)
                    break;

                case 5: // Total Sales
//                    double totalSales = this.adminController.getTotalSales();
//
//                    System.out.println("********** \uD83D\uDCB0 Total Sales \uD83D\uDCB0 **********");
//                    System.out.println(totalSales + " €");

                    break;

                case 6: // Average Sales
                    break;

                case 7: // Coffee Time
                    coffeeTime();
                    break;

                case 0: // Exit
                    break;

                default: // Invalid Option
                    System.out.println("\uD83D\uDEA8 Invalid Option \uD83D\uDEA8");
            }
        } while (menuOption != 0);
    }

    private void coffeeTime() throws InterruptedException {
        System.out.println("Awaiting Coffee");
        System.out.println("₊˚.\uD83C\uDFA7 ✩｡ \uD83E\uDD0E");
        System.out.println("_________________________");
        System.out.print("|");
        sleep(300);
        System.out.print("|");
        sleep(300);
        System.out.print("|");
        sleep(300);
        System.out.print("|");
        sleep(300);
        System.out.print("|");
        sleep(300);
        System.out.print("|");
        sleep(300);
        System.out.print("|");
        sleep(300);
        System.out.print("|");
        sleep(300);
        System.out.print("|");
        sleep(300);
        System.out.print("|");
        sleep(300);
        System.out.print("|");
        sleep(300);
        System.out.print("|");
        sleep(300);
        System.out.print("|");
        sleep(300);
        System.out.print("|");
        sleep(300);
        System.out.print("|");
        sleep(300);
        System.out.print("|");
        sleep(300);
        System.out.print("|");
        sleep(300);
        System.out.print("|");
        sleep(300);
        System.out.print("|");
        sleep(300);
        System.out.print("|");
        sleep(300);
        System.out.print("|");
        sleep(300);
        System.out.print("|");
        sleep(300);
        System.out.print("|");
        sleep(300);
        System.out.print("|");
        sleep(300);
        System.out.print("|");

        System.out.println("\n\n☕");

    }
}
