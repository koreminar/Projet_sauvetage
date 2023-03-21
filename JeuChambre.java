package jeu;
import java.util.Random;
import java.util.Scanner;

public class JeuChambre {
    private int nbEnigmes; 
    private int nbReussi;
    private int seuilReponse = 3;
    private Random rand;
    private Scanner sc;
    private int min=11;
    private int max=20;

    public JeuChambre(int nbEnigmes) {
        this.nbEnigmes = nbEnigmes;
        nbReussi = 0;
        rand = new Random();
        sc = new Scanner(System.in);
    }

    public void jouer() {
    	
    	System.out.println("-----------------------------------");
        System.out.println("Bienvenue au jeu d'énigmes mathématiques !");
        System.out.println("Alerte : vos réponses doivent être que des entiers :) ");
        System.out.println("-----------------------------------");
        
        for (int i = 0; i < nbEnigmes; i++) {
        	int a = rand.nextInt(20);
            int b = rand.nextInt(20);
            int c = rand.nextInt(max - min + 1) + min;
            int d = rand.nextInt(10);
            
            
            char op1 = rand.nextBoolean() ? '+' : '-';
            char op2 = rand.nextBoolean() ? '*' : '/';
            
            System.out.println("Quel est le résultat de (" + a + " " + op1 + " " + b + ") " + op2 + " (" + c + " " + op1 + " " + d + ") ?");
            
            int temp1 = (op1 == '+') ? (a + b) : (a - b);
            int temp2 = (op1 == '+') ? (c + d) : (c - d);
            
            int resultat = (op2 == '*') ? (temp1 * temp2) : (temp1 / temp2);
            
            int reponse = sc.nextInt();
            
            if (reponse == resultat) {
            	
                System.out.println("Bravo, vous avez trouvé la bonne réponse !");
                nbReussi++;
            } else {
                System.out.println("Dommage, la bonne réponse était " + resultat + ".");
            }
        }
        
        System.out.println("Vous avez réussi " + nbReussi + " énigmes sur " + nbEnigmes + ".");
        
        if (nbReussi >= seuilReponse) {
            System.out.println("Félicitations, vous avez gagné !");
        } else {
            System.out.println("Dommage, vous avez perdu.");
        }
    }
}
