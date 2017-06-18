
----------
##  AnKaLu-Tetris  ##
----------

####  AnKaLu-Tetris  ###

####  Use-Case Specification: Highscore löschen  ###

#####  Version 2.2  #####

</br>

##  Revision History  ##

<table> 
<tr><td><b>Date</b></td><td><b>Version</b></td><td><b>Description</b></td><td><b>Author</b></td></tr>
<tr><td>05.04.2017</td><td>1.0</td><td>Version 1.0</td><td>André, Katharina, Luka</td></tr>
<tr><td>19.04.2017</td><td>2.0</td><td>Version 2.0 als Markdown</td><td>Katharina</td></tr>
<tr><td>20.04.2017</td><td>2.1</td><td>Hinzufügen vom Usecase Diagram</td><td>André, Katharina, Luka</td></tr>
<tr><td>01.05.2017</td><td>2.2</td><td>Function Points Hinzufügen</td><td>André, Luka, Katharina</td></tr>
</table>
</br>

##  Table of Contents  ##

<ol>
<li>Use-Case Highscore löschen
<ol type = i>
<li>Brief Description</li>
</ol>
<li> Overall Description
<ol type = i>
<li>Basic Flow</li>
<li>Alternative Flows</li>
<li>Mock-Ups</li>
<li>Screenshots</li>
<li>Features</li>
</ol>
<li>Special Requirements
<ol type = i>
<li>Functionality</li>
</ol>
<li>Preconditions</li>
<li>Postcondotions</li>
<li>Extension Points
<ol type = i>
<li>Function Points</li>
</ol>
</ol>
</br>

##  Use-Case Specifications: Highscore löschen  ##

###  1. Use-Case Highscore löschen  ###

####  1.1 Brief Description  ####
Dieser Use-Case ermöglicht es dem User den aktuellen Highscore des Spiels einzusehen und diesen wenn gewünscht zu löschen. </br>
Link zum SRS: [https://github.com/AlSalad/Ankalu/blob/master/documents/SRS/Software%20Requirement%20Specification.md](https://github.com/AlSalad/Ankalu/blob/master/documents/SRS/Software%20Requirement%20Specification.md)

###  2. Overall Description  ###

####  2.1 Basic Flow  ####

[https://github.com/AlSalad/Ankalu/blob/master/documents/Use%20Cases/Use%20Case%20Diagrams/UCD%20Highscore%20l%C3%B6schen.png](https://github.com/AlSalad/Ankalu/blob/master/documents/Use%20Cases/Use%20Case%20Diagrams/UCD%20Highscore%20l%C3%B6schen.png)

![UCD](https://github.com/AlSalad/Ankalu/blob/master/documents/Use%20Cases/Use%20Case%20Diagrams/UCD%20Highscore%20l%C3%B6schen.png "UCD")

####  2.2 Alternative Flows  ####

n/a

####  2.3 Mock-Ups  ####

[https://github.com/AlSalad/Ankalu/blob/master/documents/Use%20Cases/Mock-Ups/MU%20Highscore%20l%C3%B6schen.png](https://github.com/AlSalad/Ankalu/blob/master/documents/Use%20Cases/Mock-Ups/MU%20Highscore%20l%C3%B6schen.png)

![Mock-Up](https://github.com/AlSalad/Ankalu/blob/master/documents/Use%20Cases/Mock-Ups/MU%20Highscore%20l%C3%B6schen.png "Mock-Up")

####  2.4 Screenshots ####

![Highscore](https://github.com/AlSalad/Ankalu/blob/master/documents/Use%20Cases/Screenshots/Highcore%200.JPG "Highscore")

![Highscore1](https://github.com/AlSalad/Ankalu/blob/master/documents/Use%20Cases/Screenshots/Highscore%201.JPG "Highscore1")

![Highscore2](https://github.com/AlSalad/Ankalu/blob/master/documents/Use%20Cases/Screenshots/Highscore%202.JPG "Highscore2")

####  2.5 Features  ####

###  3. Special Requirements  ###

####  3.1 Functionality  ####

Die Anwendung benötigt jediglich ein Java Runtime Environment.

###  4. Preconditions  ###

Bevor der Highscore gelöscht wird, sieht der User eine Auflistung des Highscores und kann somit die Bestenliste begutachten.

###  5. Postconditions  ###

Nachdem der Highscore gelöscht wurde, sind keine Daten mehr im Highscore verfügbar und werden ab diesem Zeitpunkt bei jedem Spiel wieder neu angelegt.

###  6.Extension Points  ###


####  6.1 Function Points  ####

Function Points = 14,11 <br>
Estimation = 6,3h <br>
[https://github.com/AlSalad/Ankalu/blob/master/documents/Use%20Cases/Function%20Points/Use%20Case%20Highscore%20%C3%A4ndern.PNG](https://github.com/AlSalad/Ankalu/blob/master/documents/Use%20Cases/Function%20Points/Use%20Case%20Highscore%20%C3%A4ndern.PNG)

![Function Points](https://github.com/AlSalad/Ankalu/blob/master/documents/Use%20Cases/Function%20Points/Use%20Case%20Highscore%20%C3%A4ndern.PNG "Function Points")

<table>
<tr><td>Transaction Data/ Functionality</td><td>DET</td><td>RET</td><td>FTR</td><td>Complexity</td></tr>
<tr><td>External Inputs</td><td>1</td><td>x</td><td>1</td><td>LOW</td></tr>
<tr><td>External Outputs</td><td>1</td><td>x</td><td>1</td><td>LOW</td></tr>
<tr><td>External Inqueries</td><td>1</td><td>x</td><td>0</td><td>LOW</td></tr>
<tr><td>Internal Logical Files</td><td>1</td><td>1</td><td>x</td><td>LOW</td></tr>
<tr><td>External Interface Files</td><td>0</td><td>0</td><td>x</td><td>LOW</td></tr>
</table>
