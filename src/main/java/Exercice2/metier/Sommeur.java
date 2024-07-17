package Exercice2.metier;

public class Sommeur implements Runnable {
    private int[] tableau;
    private int debut;
    private int fin;
    private long somme;

    public int[] getTableau() {
        return tableau;
    }

    public void setTableau(int[] tableau) {
        this.tableau = tableau;
    }

    public int getDebut() {
        return debut;
    }

    public void setDebut(int debut) {
        this.debut = debut;
    }

    public int getFin() {
        return fin;
    }

    public void setFin(int fin) {
        this.fin = fin;
    }

    public void setSomme(long somme) {
        this.somme = somme;
    }

    public Sommeur(int[] tableau, int debut, int fin) {
        this.tableau = tableau;
        this.debut = debut;
        this.fin = fin;
        this.somme = 0;
    }

    @Override
    public void run() {
        for (int i = debut; i <= fin; i++) {
            somme += tableau[i];
        }
    }

    public long getSomme() {
        return somme;
    }
}
