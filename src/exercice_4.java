/* Énoncé
Écrivez un programme qui calcule le volume d'un cylindre à partir de son rayon et de sa
hauteur.
Votre programme doit:
1. Demander à l'utilisateur d'entrer le rayon du cylindre
2. Demander à l'utilisateur d'entrer la hauteur du cylindre
3. Calculer le volume avec la formule : V = π × r² × h
4. Afficher le résultat du volume*/

void main() {
    final double PI = 3.14159;
    double rayon = Double.parseDouble(IO.readln("Entrez le rayon du cylindre"));
    double hauteur = Double.parseDouble(IO.readln("Entrez la hauteur du cylindre"));

    double volume = PI * Math.pow(rayon, 2) * hauteur;

    IO.println("Le volume du cylindre est: " + volume);
}