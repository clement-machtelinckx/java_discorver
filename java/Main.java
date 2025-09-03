public class Main {
    public static void main(String[] args) {
        GameCollection collection = new GameCollection();

        PhysicalGame g1 = new PhysicalGame(
            1, "Elden Ring", "Action", "2022-02-25", 59.99, Platform.PLAYSTATION, "Neuf");

        DigitalGame g2 = new DigitalGame(
            2, "Elden Ring", "Action", "2022-02-25", 49.99, Platform.PLAYSTATION, 45.3); // doublon

        DigitalGame g3 = new DigitalGame(
            3, "Elden Ring", "Action", "2022-02-25", 49.99, Platform.PC, 48.0); // OK

        collection.add(g1); // ajouté
        collection.add(g2); // refusé
        collection.add(g3); // ajouté

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


################################################################


Itération 3 — Plateformes & identité
Nouvelles règles : 
5) Un jeu est associé à une plateforme principale (PC, PS, Xbox, Switch, etc.). 
6) La collection refuse les doublons : le même jeu sur la même plateforme ne peut pas être ajouté deux fois.

Notions POO : énumération (plateforme), identité métier, equals/hashCode consistants, invariants.

Questions‑guides

Qu’est‑ce qui définit l’identité d’un jeu dans cette collection ?
Comment garantir l’unicité lors de l’ajout ?
Où placez‑vous la logique de détection des doublons ?
Checklist

Deux entrées identiques (même titre + même plateforme, par exemple) sont rejetées proprement.
L’égalité et le hashing reflètent bien l’identité choisie.

*/