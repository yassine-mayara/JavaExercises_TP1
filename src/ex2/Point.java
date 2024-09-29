class Point {
    private String nom; 
    private int abscisse;  
    private int ordonnee;  

    public Point(String nom, int abscisse, int ordonnee) {
        this.nom = nom;
        this.abscisse = abscisse;
        this.ordonnee = ordonnee;
    }

    public Point(String nom) {
        this(nom, 0, 0);  
    }

    public Point(int abscisse, int ordonnee) {
        this("Point", abscisse, ordonnee);  
    }

    public void Affiche() {
        System.out.println(nom + " (" + abscisse + ", " + ordonnee + ")");
    }

    public void TranslHoriz(int a) {
        abscisse += a;
    }

    public void TranslVert(int a) {
        ordonnee += a;
    }

    public void Translation(int a, int b) {
        abscisse += a;
        ordonnee += b;
    }

    public boolean Coincide(Point p) {
        return this.abscisse == p.abscisse && this.ordonnee == p.ordonnee;
    }

    public String getNom() {
        return nom;
    }

    public int getAbscisse() {
        return abscisse;
    }

    public int getOrdonnee() {
        return ordonnee;
    }

    public void setNom(String ch) {
        this.nom = ch;
    }

    public void setAbscisse(int a) {
        this.abscisse = a;
    }

    public void setOrdonnee(int a) {
        this.ordonnee = a;
    }
}
