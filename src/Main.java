/*Exercice : Système de gestion des requêtes utilisateur
Vous devez implémenter un système qui gère les requêtes des utilisateurs via une chaîne de responsabilité. Le système repose sur une Factory pour créer les requêtes, un Builder pour les construire, et un Singleton pour gérer un journal des requêtes traitées.
Les requêtes concernent la gestion d’une BDD de film à la Netflix.

🔹 Contraintes
Builder Pattern : Construire un objet Request avec divers paramètres (id, type, contenu).
Factory Pattern : Une RequestFactory pour créer des requêtes en fonction du type demandé.
Singleton Pattern : Un RequestLogger qui stocke les requêtes traitées.
Chain of Responsibility : Une chaîne de gestionnaires (Handler) qui traitent la requête si possible, ou la passent au suivant.
Gérer l’auth
Ne pas dépasser 10 films*/

public class Main {
    public static void main(String[] args) {
        Film film1 = new Film(1, "Les bronzé font du ski", "Humour", 120);
        Film film2 = new Film(2, "Greys anatomie", "Drame", 120);
        Film film3 = new Film(3, "Les simpson", "Humour", 120);
        Film film4 = new Film(4, "Ariety", "Animé", 120);
    }
}