/* Énoncé
Écrivez un programme qui convertit une température de degrés Celsius en degrés Fahrenheit.
Votre programme doit :
•Demander à l'utilisateur d'entrer une température en Celsius
•Convertir cette température en Fahrenheit en utilisant la formule : °F = (°C × 9/5) + 32
•Afficher le résultat en Fahrenheit*/

void main() {
    int tempInCelcius;
    double tempInFarenheit;

    String saisie = IO.readln("Entrez la température en degrès celcius: ");
    tempInCelcius = Integer.parseInt(saisie);
     tempInFarenheit = (tempInCelcius * 9.0/5) + 32;

     IO.println("°F: " + tempInFarenheit + " " + tempInCelcius);

}