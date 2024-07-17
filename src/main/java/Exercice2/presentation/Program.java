package Exercice2.presentation;
import Exercice2.metier.Sommeur;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
public class Program {
    public static void main(String[] args) {
        int[] tableau = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int nombreThreads = 4;
        int taillePlage = tableau.length / nombreThreads;
        ExecutorService executor = Executors.newFixedThreadPool(nombreThreads);
        Sommeur[] sommeurs = new Sommeur[nombreThreads];
        for (int i = 0; i < nombreThreads; i++) {
            int debut = i * taillePlage;
            int fin = (i == nombreThreads - 1) ? tableau.length - 1 : (i + 1) * taillePlage - 1;
            sommeurs[i] = new Sommeur(tableau, debut, fin);
            executor.execute(sommeurs[i]);
        }
        executor.shutdown();
        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            System.err.println("Erreur lors de l'attente des threads");
        }
        int sommeTotale = 0;
        for (Sommeur sommeur : sommeurs) {
            sommeTotale += sommeur.getSomme();
        }
        System.out.println("Somme totale du tableau: " + sommeTotale);
    }
}
