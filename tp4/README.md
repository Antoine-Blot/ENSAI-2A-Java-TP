Nom de l'élève : Antoine BLOT

Questions traitées :

2.1

2.2

2.3
Retrait staticité de la méthode

2.4
En l'état, l'ajout de passagers dans un ascenseur ne peut se faire qu'avec loadPassengers qui fait appel à un Floor, lui-même faisant appel à des Person.
Tester isFull serait donc compliqué.
On crée la méthode fillWithRandomPassengers dans Elevator qui peuple l'ascenseur avec comme seul paramètre le nombre de passagers, et non plus des objets externes à la classe.
Cela résout la difficulté.
