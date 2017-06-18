
----------
##  AnKaLu-Tetris  ##
----------

####  AnKaLu-Tetris  ###

####  Use-Case Specification: Standard-Mode spielen  ###

#####  Version 2.2  #####

</br>

##  Revision History  ##

<table> 
<tr><td><b>Date</b></td><td><b>Version</b></td><td><b>Description</b></td><td><b>Author</b></td></tr>
<tr><td>05.04.2017</td><td>1.0</td><td>Version 1.0</td><td>André, Katharina, Luka</td></tr>
<tr><td>19.04.2017</td><td>2.0</td><td>Version 2.0 als Markdown</td><td>Katharina</td></tr>
<tr><td>20.04.2017</td><td>2.1</td><td>Hinzufügen von Usecase Diagrams und Mock-Ups</td><td>André, Katharina, Luka</td></tr>
<tr><td>01.05.2017</td><td>2.2</td><td>Function Points hinzufügen</td><td>André, Katharina, Luka</td></tr>
</table>
</br>

##  Table of Contents  ##

<ol>
<li>Use-Case: Standard-Mode spielen 
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

##  Use-Case Specifications: Standard-Mode spielen  ##

###  1. Use-Case Standard-Mode spielen  ###

####  1.1 Brief Description  ####

Dieser Use-Case ermöglicht es dem User das Standart-Tetris Spiel zu spielen. Dies kann er solange, bis das Spiel "Game over" anzeigt, sobald ein Objekt den oberen Spielfeldrand berührt. Die Steuerung der Blöcke wird mithilfe der Pfeiltasten der Tastatur verwirklicht. Mit der rechten und linken Pfeiltaste bewegt man das Objekt jeweils nach links oder rechts, mit der Pfeiltaste nach unten bewegt sich das Objekt schneller zum unteren Spielfeldrand und mit der Pfeiltaste nach oben wird das Objet gedreht. </br>
Link zum SRS: [https://github.com/AlSalad/Ankalu/blob/master/documents/SRS/Software%20Requirement%20Specification.md](https://github.com/AlSalad/Ankalu/blob/master/documents/SRS/Software%20Requirement%20Specification.md)

###  2. Overall Description  ###

####  2.1 Basic Flow  ####

[https://github.com/AlSalad/Ankalu/blob/master/documents/Use%20Cases/Use%20Case%20Diagrams/UCD%20Standard-Mode%20spielen.png](https://github.com/AlSalad/Ankalu/blob/master/documents/Use%20Cases/Use%20Case%20Diagrams/UCD%20Standard-Mode%20spielen.png)

![UCD](https://github.com/AlSalad/Ankalu/blob/master/documents/Use%20Cases/Use%20Case%20Diagrams/UCD%20Standard-Mode%20spielen.png "UCD")

####  2.2 Alternative Flows  ####

n/a

####  2.3 Mock-Ups  ####

[https://github.com/AlSalad/Ankalu/blob/master/documents/Use%20Cases/Mock-Ups/MU%20Standard-Mode%20spielen.png](https://github.com/AlSalad/Ankalu/blob/master/documents/Use%20Cases/Mock-Ups/MU%20Standard-Mode%20spielen.png)

![Mock-Up](https://github.com/AlSalad/Ankalu/blob/master/documents/Use%20Cases/Mock-Ups/MU%20Standard-Mode%20spielen.png "Mock-Up")

####  2.4 Screenshots  ####

[https://github.com/AlSalad/Ankalu/blob/master/documents/Use%20Cases/Screenshots/Standard%20Mode%201.JPG](https://github.com/AlSalad/Ankalu/blob/master/documents/Use%20Cases/Screenshots/Standard%20Mode%201.JPG)

![Standard-Mode](https://github.com/AlSalad/Ankalu/blob/master/documents/Use%20Cases/Screenshots/Standard%20Mode%201.JPG "Sandard-Mode")

[https://github.com/AlSalad/Ankalu/blob/master/documents/Use%20Cases/Screenshots/Standard%20Mode%202.JPG](https://github.com/AlSalad/Ankalu/blob/master/documents/Use%20Cases/Screenshots/Standard%20Mode%202.JPG)

![Standard-Mode1](https://github.com/AlSalad/Ankalu/blob/master/documents/Use%20Cases/Screenshots/Standard%20Mode%202.JPG "Sandard-Mode1")

[https://github.com/AlSalad/Ankalu/blob/master/documents/Use%20Cases/Screenshots/Standard%20Mode%203.JPG](https://github.com/AlSalad/Ankalu/blob/master/documents/Use%20Cases/Screenshots/Standard%20Mode%203.JPG)

![Standard-Mode2](https://github.com/AlSalad/Ankalu/blob/master/documents/Use%20Cases/Screenshots/Standard%20Mode%203.JPG "Sandard-Mode2")

####  2.5 Features  ####

###  3. Special Requirements  ###

####  3.1 Functionality  ####

Die Anwendung benötigt jediglich ein Java Runtime Environment.

###  4. Preconditions  ###

n/a

###  5. Postconditions  ###

Nachdem das Standardspiel gespielt wurde, wird der aktuelle Highscore gespeichert.

###  6.Extension Points ###


####  6.1 Function Points  ####

Function Points = 65,57 <br>
Estimation = 23h <br>
[https://github.com/AlSalad/Ankalu/blob/master/documents/Use%20Cases/Function%20Points/Use%20Case%20Standard%20Mode%20spielen.PNG](https://github.com/AlSalad/Ankalu/blob/master/documents/Use%20Cases/Function%20Points/Use%20Case%20Standard%20Mode%20spielen.PNG)

![Function Points](https://github.com/AlSalad/Ankalu/blob/master/documents/Use%20Cases/Function%20Points/Use%20Case%20Standard%20Mode%20spielen.PNG "Function Points")


<table>
<tr><td>Transaction Data/ Functionality</td><td>DET</td><td>RET</td><td>FTR</td><td>Complexity</td></tr>
<tr><td>External Inputs</td><td>5</td><td>x</td><td>1</td><td>LOW</td></tr>
<tr><td>External Outputs</td><td>10</td><td>x</td><td>2</td><td>AVERAGE</td></tr>
<tr><td>External Inqueries</td><td>0</td><td>x</td><td>0</td><td>LOW</td></tr>
<tr><td>Internal Logical Files</td><td>2</td><td>1</td><td>x</td><td>LOW</td></tr>
<tr><td>External Interface Files</td><td>0</td><td>0</td><td>x</td><td>LOW</td></tr>
</table>
