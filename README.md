Ex�cution de Partition App

Lancer depuis l'invite de commande, en vous mettant sur la racine du r�pertoire contenant le jar adneomPoc-partition.jar, la commande :
java -jar adneomPoc-partition.jar [args]

[args] contient l'ensemble des donn�es en entr�e qui doivent �tre trait�es, la derni�re repr�sente la taille d'une partition

La taille d'une partition doit �tre sup�rieure ou �gale � 1

Exemple :

Le lancement de : java -jar adneomPoc-partition.jar 1 2 3 4 2 2 renverra [[1, 2], [3, 4], [2]]
