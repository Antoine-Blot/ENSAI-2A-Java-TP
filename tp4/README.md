Nom de l'élève : Antoine BLOT

La JavaDoc est rédigée en anglais, le README en français.

Questions traitées et éventuels commentaires :

2.1

2.2

2.3

2.4
En l'état, l'ajout de passagers dans un ascenseur ne peut se faire qu'avec loadPassengers qui fait appel à un Floor, lui-même faisant appel à des Person.
Tester isFull serait donc compliqué.
On crée la méthode fillWithRandomPassengers dans Elevator qui peuple l'ascenseur avec comme seul paramètre le nombre de passagers, et non plus des objets externes à la classe.
Cela résout la difficulté.

2.5
CrazyElevator est créé en héritant de Elevator
Le CrazyElevator ajouté est le dernier de la liste des ascenseurs

2.6
Création de l'Enum Direction (UP, DOWN, IDLE)
Création de updateDirection dans Elevator pour déterminer et mettre à jour la direction de l'ascenseur et de ses passagers
La méthode updateDirection est appelée à la fin de loadPassengers
Création de la méthode getArrowSymbol dans Direction qui attribue un symbole à une direction
getArrowSymbol est utilisé dans la méthode display de Hotel
(A noter que le CrazyElevator est imprévisible, alors que la flèche de direction se base sur un comportement normal)
