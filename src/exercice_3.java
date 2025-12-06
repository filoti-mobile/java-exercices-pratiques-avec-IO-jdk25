/* Énoncé
Écrire un programme qui calcule l'aire et le périmètre d'un rectangle à partir de sa longueur et de sa largeur.
Votre programme doit:
1. Demander à l'utilisateur d'entrer la longueur du rectangle
2. Demander à l'utilisateur d'entrer la largeur du rectangle
3. Calculer l'aire avec la formule: Aire = L × l
4. Calculer le périmètre avec la formule: Périmètre = 2 × (L + l)
5. Afficher les deux résultats*/



void main() {
    double longueur = Double.parseDouble(IO.readln("Entrez la longueur du rectangle: "));
    double largeur = Double.parseDouble(IO.readln("Entrez la largeur du rectangle: "));

    double aire = longueur * largeur;
    double perimeter = 2 * (longueur + largeur);

    IO.println("L'aire du triangle est " + aire + "\n" + "Le périmetre est " + perimeter );
}