import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MaDate date1 = new MaDate(1, 1, 2004); 
        MaDate date2 = new MaDate(12, 3, 2012); 
        MaDate date3 = new MaDate(6, 7, 1999); 

        System.out.println("Date 1: " + date1);
        System.out.println("Date 2: " + date2);
        System.out.println("Date 3: " + date3);
        
        if (date1.getJour() == date2.getJour() && date1.getMois() == date2.getMois() && date1.getAnnee() == date2.getAnnee()) {
            System.out.println("Les dates 1 et 2 sont identiques.");
        } else {
            System.out.println("Les dates 1 et 2 ne sont pas identiques.");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choisissez une opération :");
        System.out.println("1. Ajouter un jour");
        System.out.println("2. Ajouter plusieurs jours");
        System.out.println("3. Ajouter un mois");
        System.out.println("4. Ajouter une année");

        int choix = scanner.nextInt();
        switch (choix) {
            case 1:
                date1.ajouterUnJour();
                System.out.println("Nouvelle date : " + date1);
                break;
            case 2:
                System.out.println("Combien de jours ajouter ?");
                int jours = scanner.nextInt();
                date1.ajouterPlusieursJours(jours);
                System.out.println("Nouvelle date : " + date1);
                break;
            case 3:
                date1.ajouterUnMois();
                System.out.println("Nouvelle date : " + date1);
                break;
            case 4:
                date1.ajouterUnAn();
                System.out.println("Nouvelle date : " + date1);
                break;
            default:
                System.out.println("Choix invalide.");
        }

        scanner.close();
    }
}
