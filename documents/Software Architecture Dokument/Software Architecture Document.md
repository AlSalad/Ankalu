
----------
##   AnKaLu-Tetris  ##
----------

####  AnKaLu-Tetris  ####
####  Software Requirements Specification  ####
#####  Version 2.0 #####



</br>

##  Revision History  ##

<table> 
<tr><td><b>Date</b></td><td><b>Version</b></td><td><b>Description</b></td><td><b>Author</b></td></tr>
<tr><td>04.04.2017</td><td>1.0</td><td>Version 1.0</td><td>André, Katharina, Luka</td></tr>
<tr><td>14.06.2017</td><td>2.0</td><td>Version 2.0 als Markdown</td><td>Katharina</td></tr>
<tr><td></td><td></td><td></td><td></td></tr>
<tr><td></td><td></td><td></td><td></td></tr>
</table>
</br>

##  Table of Contents  ##

<ol>
<li> Introduction
<ol type = i>
<li>Purpose</li>
<li>Scope</li>
<li>Definitions, Acronyms and Abbreviations</li>
<li>References</li>
<li>overview</li>
</ol>
<li>Architectural Represenation</li>
<li>Architectural Goals and Constraints</li>
<li>Use-Case View</li>
<li>Logical View
<ol>
<li>Architecturally Significant Design Packages</li>
</ol>
<li>Process View</li>
<li>Deployment View</li>
<li>Implementation View</li>
<li>Use-Case View
<ol type = i>
<li>Use-Case Realizations</li>
</ol>
<li>Logical View
<ol type = i>
<li>Overview</li>
<li>Architecturally Significant Design Packages</li>
</ol>
<li>Process View</li>
<li>Deployment View</li>
<li>Implementation View</li>
<ol type = i>
<li>Overview</li>
<li>Layers</li>
</ol>
<li>Data View</li>
<li>Size and Performance</li>
<li>Quality</li>

#  Software Architecture Document  #

### 1. Introduction ###

####  1.1 Purpose  ####

Dieses Dokument soll eine Übersicht über die Java Awendung "Ankalu Tetris" aus diversen architektonischen Sichtweisen geben.


####  1.3 Definitions, Acronyms, and Abbreviations  ####  

AnKaLi = Andre, Katharina, Luka
n/a = not applicable  
tbd = to be determined

####  1.4 References  ####  

<table>
<tr><td>File</td><td>Link</td></tr>
<tr><td>SRS</td><td><a href = "https://github.com/AlSalad/Ankalu/blob/master/documents/SRS/Software%20Requirement%20Specification.md">https://github.com/AlSalad/Ankalu/blob/master/documents/SRS/Software%20Requirement%20Specification.md</a></td></tr>
</table>

####  1.5 Overview  #### 

Dieses Dokument beschreibt die architektonische Zusammensetzung der Anwendung und dient zum Verständnis dieser. 

###  2. Architectural Representation  ###

[https://github.com/AlSalad/Ankalu/blob/master/documents/Software%20Architecture%20Dokument/MVP.png](https://github.com/AlSalad/Ankalu/blob/master/documents/Software%20Architecture%20Dokument/MVP.png)
![https://github.com/AlSalad/Ankalu/blob/master/documents/Software%20Architecture%20Dokument/MVP.png](https://github.com/AlSalad/Ankalu/blob/master/documents/Software%20Architecture%20Dokument/MVP.png) <br>
Es werden Java Spring Elemente benutzt.

###  3. Achitectural Goals and Constraints  ###

Die herausstechenste Eigenschaft des MVP Models ist, dass die View gänzlich isoliert vom Model arbeitet. Somit werden alle Informationen und Aktionen über einen Presenter zwischen den beiden Elementen weitergeleitet.

###  4. Use-Case View  ###

####  4.1 Use-Case Realizations  ####

Overall-Use-Case-Diagram:<br>
[https://github.com/AlSalad/Ankalu/blob/master/documents/Use%20Cases/Use%20Case%20Diagrams/Overall%20Use%20Case%20Diagram.png](https://github.com/AlSalad/Ankalu/blob/master/documents/Use%20Cases/Use%20Case%20Diagrams/Overall%20Use%20Case%20Diagram.png)

![https://github.com/AlSalad/Ankalu/blob/master/documents/Use%20Cases/Use%20Case%20Diagrams/Overall%20Use%20Case%20Diagram.png](https://github.com/AlSalad/Ankalu/blob/master/documents/Use%20Cases/Use%20Case%20Diagrams/Overall%20Use%20Case%20Diagram.png)

###  5. Logical View  ###

####  5.1 Overview ####

Class Diagram:<br>
[https://github.com/AlSalad/Ankalu/blob/master/documents/Pattern/Classdiagram.PNG](https://github.com/AlSalad/Ankalu/blob/master/documents/Pattern/Classdiagram.PNG)

![https://github.com/AlSalad/Ankalu/blob/master/documents/Pattern/Classdiagram.PNG](https://github.com/AlSalad/Ankalu/blob/master/documents/Pattern/Classdiagram.PNG)

####  5.2 Architecturally Significant Design Packages  ####

n/a

###  6. Process View  ###

n/a

###  7. Deployment View  ###

Es wird für unsere Anwendung kein Server verwendet, es handelt sich um eine lokale Browseranwendung.

###  8. Implementation View  ###

####  8.1 Overview  ####

n/a

####  8.2 Layers #### 

n/a

###  9. Data View  ###

n/a

###  10. Size and Performance  ##

Die Anwendung wird in der Größe nicht verändert, da es keine Datenbank oder sonstigen Informationsspeicher gibt. Jediglich der Highscore speichert maximal zehn Einträge ab, was allerdings zu vernachlässigen ist, da es sich nur um wenige Zeichen handelt. Somit ist die Performance gleichbleibend gut und wird durch häufige Anwendung nicht verschlechtert.

### 11. Quality ###

Die Funktionsweise der verschiendenen Spielmodi, sowie des Highscores und der Musik sind bereitgestellt. 


