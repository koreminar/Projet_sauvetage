package jeu;

import java.util.Random;
import java.util.Scanner;

public class JeuScalier {
    private int nbEnigmes; // Le nombre d'énigmes à résoudre
    private int nbReussi; // Le nombre d'énigmes réussies
    private Random rand;
    private Scanner sc;

    public JeuScalier(int nbEnigmes) {
        this.nbEnigmes = nbEnigmes;
        this.nbReussi = 0;
        this.rand = new Random();
        this.sc = new Scanner(System.in);
    }

    public void jouer() {
        int choix; // Le choix de l'utilisateur
        String question; // La question de l'énigme
        String[] propositions; // Les propositions de réponse
        int reponse; // L'indice de la réponse correcte

        System.out.println("Bienvenue au jeu d'énigmes informatiques !");

        // Boucle pour poser les énigmes
        for (int i = 0; i < nbEnigmes; i++) {
            // Choisir aléatoirement une question et ses réponses
            int typeQuestion = rand.nextInt(3); // 3 types de questions différentes
            switch (typeQuestion) {
                case 0:
                    question = "Quel est le langage de programmation le plus populaire en 2023 ?";
                    propositions = new String[]{"Java", "Python", "C++", "JavaScript"};
                    reponse = 1;
                    break;
                case 1:
                    question = "Qu'est-ce qu'un algorithme ?";
                    propositions = new String[]{"Un programme informatique", "Une suite d'instructions", "Un langage de programmation", "Un composant matériel"};
                    reponse = 1;
                    break;
                case 2:
                    question = "Qu'est-ce que le cloud computing ?";
                    propositions = new String[]{"Un système de stockage local", "Un réseau local", "Un système d'exploitation", "Un système de stockage à distance"};
                    reponse = 3;
                    break;
                default:
                    question = "";
                    propositions = new String[0];
                    reponse = 0;
                    break;
            }

            // Poser l'énigme
            System.out.println(question);
            for (int j = 0; j < propositions.length; j++) {
                System.out.println((j + 1) + ". " + propositions[j]);
            }

            // Lire le choix de l'utilisateur
            choix = sc.nextInt();

            // Vérifier si la réponse est correcte
            if (choix == reponse + 1) {
                System.out.println("Bravo, vous avez trouvé la bonne réponse !");
                nbReussi++;
            } else {
                System.out.println("Dommage, la bonne réponse était " + (reponse + 1) + ".");
            }
        }
    }

    public int getNbReussi() {
        return nbReussi;
        
    }
    
}

