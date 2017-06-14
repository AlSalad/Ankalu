
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

####  1.2 Scope  #### 

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

###  2. Architectural Representation  ###

[https://github.com/AlSalad/Ankalu/blob/master/documents/Software%20Architecture%20Dokument/MVP.png](https://github.com/AlSalad/Ankalu/blob/master/documents/Software%20Architecture%20Dokument/MVP.png)
![https://github.com/AlSalad/Ankalu/blob/master/documents/Software%20Architecture%20Dokument/MVP.png](https://github.com/AlSalad/Ankalu/blob/master/documents/Software%20Architecture%20Dokument/MVP.png)

###  3. Achitectural Goals and Constraints  ###

Wir wenden die klassischen MVC (bzw. MVP) Prinzipien an. Wir benutzen kein spezielles Tool dafür, da wir mit Android Studio arbeiten und das dort schon vorhanden ist.  
Wie in der Grafik in Punkt 2 zu sehen ist wird unsere View vom Model isoliert und weiß sozusagen nichts. Jegliche Änderungen werden über den Presenter vorgenommen und an die View weitergeleitet.

###  4. Use-Case View  ###

Overall-Use-Case-Diagram:<br>
[https://github.com/AlSalad/Ankalu/blob/master/documents/Use%20Cases/Use%20Case%20Diagrams/Overall%20Use%20Case%20Diagram.png](https://github.com/AlSalad/Ankalu/blob/master/documents/Use%20Cases/Use%20Case%20Diagrams/Overall%20Use%20Case%20Diagram.png)

####  4.1 Use-Case Realizations  ####

###  5. Logical View  ###

####  5.1 Overview ####

####  5.2 Architecturally Significant Design Packages  ####



###  6. Process View  ###

tbd

###  7. Deployment View  ###



###  8. Implementation View  ###

####  8.1 Overview  ####

####  8.2 Layers #### 

###  9. Data View  ###


###  10. Size and Performance  ##

tbd

### 11. Quality ###
tbd
