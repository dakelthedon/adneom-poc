--> Import des fiches RECIF

- Exporter les données de Sharepoint dans un Excel
- Copier cet Excel sous forme de CSV avec des | comme séparateur
- Lancer les commandes décrites dans le  ksh
- Vérifier les logs et les bads

--> Import des documents

- Extraire les documents de sharepoint afin d'avoir le fichier csv des documents
- Lancer le sh ( permet d'extraire les documents physiques dans un dossier , puis lançant un sql les chargement en BDD)
- Vérifier les logs et les bads


--> Import des commentaires
- Récupérer l'export Sharepoint généré par Slim
- Supprimer toutes les tabulations du fichier via Notepad ++
- Supprimer tous les \r\n du fichier  via Notepad ++
- Remplacer tous les <td class="textmode"> par des | via Notepad ++
- Supprimer tous les </td>
- Remplacer tous les <td> par des | via Notepad ++
- Remplacer tous les <tr> par des \r\n
- Supprimer tous les </tr>
- Supprimer tous les <td rowspan="x">

Vérifer que toutes les balises HTML ont bien disparu.

Enregistrer le fichier en csv et l'ouvrir sous Excel
- Ajouter une colonne vide à coté de l'item id
- Dans cette colonne appliquer la formule suivante : =SI(A2<>""|A2|B1)
- Supprimer les colonnes inutiles
- Supprimer les lignes sans commentaires
- Si il y a des pb avec les caractères accentués, faire : Enregistrer sous .csv (séparateur point-virgule)

-- Preparer le fichier .dat

-- Vérifier le nombre de lignes insérées