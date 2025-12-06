/* Énoncé
Écrivez un programme qui calcule le montant du pourboire et le total à payer au restaurant.
Votre programme doit :
1. Demander à l'utilisateur d'entrer le montant de l'addition (avant pourboire)
2. Demander à l'utilisateur d'entrer le pourcentage de pourboire désiré (ex: 15 pour 15%)
3. Calculer le montant du pourboire avec la formule:
Pourboire = addition x (pourcentage / 100)
1. Calculer le total à payer avec la formule : Total = addition + pourboire
2. Afficher le montant du pourboire et le total à payer*/

void main() {
    double addition = Double.parseDouble(IO.readln("Montant de l'addition: "));
    int pourcentage = Integer.parseInt(IO.readln("Pourboire désiré: "));
    double pourboire = addition * (pourcentage / 100.0);

    double total = addition + pourboire;
    IO.println("Le montant total avec pourboire est " + total);


}