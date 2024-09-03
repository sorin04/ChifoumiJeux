import java.util.Scanner;

public class chifoumi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Joueur 1, entrez 0 pour Pierre, 1 pour Papier, 2 pour Ciseaux: ");
        int joueur1 = scanner.nextInt();

        System.out.print("Joueur 2, entrez 0 pour Pierre, 1 pour Papier, 2 pour Ciseaux: ");
        int joueur2 = scanner.nextInt();

        if (joueur1 == joueur2){
            System.out.println("Match null");

        } else if ((joueur1 ==0 && joueur2 == 2)){

            
        }


    }
}