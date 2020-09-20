import java.util.Scanner;
import java.util.regex.Pattern;

class app_controller {    

        //Fonction calculate
        public void calculate() {

        // Declaration
        Scanner sc = new Scanner(System.in);
        String calcul;
        int nb1 = 0, nb2 = 0;
        String userResponse = "";
        String[] tab;
        char opérateur;

        // Main code
        System.out.println(app_util.APP_TITLE);

        while (!userResponse.equals("n")) {

            try {
                System.out.print("Ton opération : ");               
                calcul = sc.nextLine();

                if (Pattern.matches(("([0-9]+)(\s{1})([+-/*])(\s{1})([0-9]+)"), calcul)) {
                    tab = calcul.split("\s");

                    nb1 = Integer.parseInt(tab[0]);
                    opérateur = tab[1].charAt(0);
                    nb2 = Integer.parseInt(tab[2]);

                if (opérateur == '+') System.out.println("Résultat de l'opération : " + (nb1 + nb2));
                if (opérateur == '-') System.out.println("Résultat de l'opération : " + (nb1 - nb2));
                if (opérateur == '*') System.out.println("Résultat de l'opération : " + (nb1 * nb2));
                if (opérateur == '/') System.out.println("Résultat de l'opération : " + (nb1 / nb2));
                }
                else if (Pattern.matches((".*[a-zA-Z].*"), calcul)) System.out.println(app_util.ERRORS[0]);
                else if (Pattern.matches(("([0-9]+)(\s{1})([+-/*])(\s{1})([0-9]+)(\s{1})([+-/*])(\s{1})([0-9]+)"), calcul)) System.out.println(app_util.ERRORS[1]);
                else if (Pattern.matches(("([0-9]+)([+-/*])([0-9]+)||([0-9]+)(\s{1})([+-/*])([0-9]+)||([0-9]+)([+-/*])(\s{1})([0-9]+)"), calcul)) System.out.println(app_util.ERRORS[2]);
            }
            catch (Exception exception) {
                System.out.println("Il y a une erreur recommence.");
            }
            System.out.println("Veux-tu effectuer une nouvelle opération ? [On]");
            userResponse = sc.nextLine();
        }


        // Final Code 
        System.out.println("La calculatrice a bien été fermée !! ;)");
        sc.close();
    }
}