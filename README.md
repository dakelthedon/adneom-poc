Exécution de Partition App

Lancer depuis l'invite de commande, en vous mettant sur la racine du répertoire contenant le jar adneomPoc-partition.jar, la commande :
java -jar adneomPoc-partition.jar [args]

[args] contient l'ensemble des données en entrée qui doivent être traitées, la dernière représente la taille d'une partition

Exemple : 
Le lancement de : java -jar adneomPoc-partition.jar 1 2 3 4 2 2 renverra [[1, 2], [3, 4], [2]]