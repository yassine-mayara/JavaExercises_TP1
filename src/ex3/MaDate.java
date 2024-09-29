class MaDate {
    private int jour;
    private int mois;
    private int annee;

    public MaDate(int jour, int mois, int annee) {
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
    }

    public MaDate(int annee) {
        this.annee = annee;
        this.mois = 1;
        this.jour = 1;
    }

    public int getJour() {
        return jour;
    }

    public int getMois() {
        return mois;
    }

    public int getAnnee() {
        return annee;
    }

    public void setJour(int j) {
        this.jour = j;
    }

    public void setMois(int m) {
        this.mois = m;
    }

    public void setAnnee(int a) {
        this.annee = a;
    }

    @Override
    public String toString() {
        return jour + "/" + mois + "/" + annee;
    }

    public void ajouterUnJour() {
        jour += 1;
        if (jour > 31) { 
            jour = 1;
            mois += 1;
            if (mois > 12) {
                mois = 1;
                annee += 1;
            }
        }
    }

    public void ajouterPlusieursJours(int n) {
        for (int i = 0; i < n; i++) {
            ajouterUnJour();
        }
    }

    public void ajouterUnMois() {
        mois += 1;
        if (mois > 12) {
            mois = 1;
            annee += 1;
        }
    }

    public void ajouterUnAn() {
        annee += 1;
    }
}
