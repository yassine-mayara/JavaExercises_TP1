public class TestPoint {
    public static void main(String[] args) {
        Point p1 = new Point(3, 5);
        Point p2 = new Point("a");
        Point p3 = new Point("b", 3, 5);

        System.out.println("\n ---------------------\n");
        System.out.println("Les points créés sont :");

        p1.Affiche();
        p2.Affiche();
        p3.Affiche();

        System.out.println("\n --------------------------\n");
        if (p1.Coincide(p3)) {
            System.out.println("Les 2 points p1 et p3 coïncident");
        } else {
            System.out.println("Les 2 points ne coïncident pas");
        }

        System.out.println("\n --------------------------\n");
        System.out.println("Translation des points :");
        p1.TranslHoriz(4);
        p2.TranslVert(3);
        p3.Translation(5, 2);

        p1.Affiche();
        p2.Affiche();
        p3.Affiche();

        System.out.println("\n --------------------------\n");
        System.out.println("Modification des attributs des points :");
        p1.setNom("SRI21");
        p2.setAbscisse(25);
        p3.setOrdonnee(50);

        p1.Affiche();
        p2.Affiche();
        p3.Affiche();

        System.out.println("\n --------------------------\n");
        System.out.println("Utilisation des méthodes get :");
        String x = p1.getNom();
        int y = p1.getAbscisse();
        int z = p1.getOrdonnee();

        System.out.println("Le nom du point p1 est : " + x);
        System.out.println("Son abscisse est : " + y);
        System.out.println("Son ordonnée est : " + z);
    }
}
