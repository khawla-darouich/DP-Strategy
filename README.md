# DP-Strategy
## Définition 
un design pattern du catégorie comportement qui permet à un objet de varier une partie de son alorithme dynamiquement
## Application
Une classe Employe défini par deux variables d'instance, une méthode getSalaireNetAnnuel et une méthode calculerIGR qui retourne l'impôt général sur les revenus salariaux qui varie d'une pays à une autre.
pour cela on va utiliser le design pattern Strategy dans la conception de cette application 
un Interface IIGR contient une méthode calculerIGR et des classes concrètes (IGRMaroc, IGRFrance, IGRAlgerie...) qui implémentent cette interface en implémentant la méthode calculerIGR avec des taux correspandants à chaque pays
## Conception
![Image of Yaktocat](https://github.com/khawla-darouich/DP-Strategy/blob/master/Capture.PNG)
