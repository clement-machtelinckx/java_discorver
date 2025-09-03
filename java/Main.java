

public class Main {
    public static void main(String[] args) {
    // dans java/Main.java (uniquement les 2 lignes de création)
    PhysicalGame game1 = new PhysicalGame(1, "Game Title", "Action", "2023-01-01", 59.99, "Neuf");
    PhysicalGame game2 = new PhysicalGame(2, "coucou", "Action", "2023-01-01", 49.99, "Bon état");
    DigitalGame game3 = new DigitalGame(3, "Indie Chill", "Puzzle", "2024-02-10", 14.99, 2.3);



        GameCollection collection = new GameCollection();
        collection.addGame(game1);
        collection.addGame(game2);
        collection.addGame(game3);

        collection.listGames();
    }
}



/*
Règles métier
Iteration 1 

Un jeu a un identifiant, un titre, un genre, une date de sortie et un prix d’achat.
La collection permet d’ajouter un jeu et de lister tous les jeux.
Notions POO ciblées : encapsulation, classes & objets, packages, énumérations (genre), collections.

Questions‑guides

Quelles propriétés sont essentielles au départ ? Lesquelles sont optionnelles et peuvent attendre ?
Comment protéger l’état des objets (immutabilité partielle, accesseurs, validations) ?
Où vit la responsabilité d’ajout/liste : dans un service, une collection dédiée, ou ailleurs ?
Checklist

Vous pouvez créer quelques jeux et les afficher.
Les champs obligatoires sont validés (ex. titre non vide).
La structure de packages est claire.


################################################################


Itération 2 — Types de jeux (héritage)
Nouvelles règles 3) Il existe des jeux physiques (boîte/disque) et des jeux numériques (clé/téléchargement). 4) Certains attributs sont spécifiques à chaque type (ex. condition pour le physique, taille de téléchargement pour le numérique).

Notions POO : abstraction, classe de base abstraite, héritage, override.

Questions‑guides

Quelles caractéristiques communes justifient une abstraction ?
Quelles responsabilités ne doivent pas remonter dans la classe de base ? Pourquoi ?
Quelles méthodes auront un comportement différent selon le type de jeu ?
Checklist

Votre hiérarchie distingue au moins deux sous‑types.
Les attributs spécifiques n’existent que là où ils font sens.
Les comportements communs sont factorisés correctement.

*/