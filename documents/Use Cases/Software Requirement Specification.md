
----------
##   AnKaLu-Tetris  ##
----------

####  AnKaLu-Tetris  ####
####  Software Requirements Specification  ####
#####  Version 2.1 #####



</br>

##  Revision History  ##

<table> 
<tr><td><b>Date</b></td><td><b>Version</b></td><td><b>Description</b></td><td><b>Author</b></td></tr>
<tr><td>04.04.2017</td><td>1.0</td><td>Version 1.0</td><td>André, Katharina, Luka</td></tr>
<tr><td>19.04.2017</td><td>2.0</td><td>Version 2.0 als Markdown</td><td>Katharina</td></tr>
<tr><td>20.04.2017</td><td>2.1</td><td>Update Overall Use Case Diagram</td><td>Katharina</td></tr>
<tr><td><font color = white>j</font></td><td></td><td></td><td></td></tr>
</table>
</br>

##  Table of Contents  ##

<ol>
<li>Introduction
<ol type = i>
<li>Purpose</li>
<li>Scope</li>
<li>Definitions, Acronyms and Abbreviations</li>
<li>Document - References</li>
</ol>
<li> Overall Description
<ol type = i>
<li>Product Perspective</li>
<li>Product Functions</li>
<li>User Characteristics</li>
<li>Assumptions and Dependencies</li>
</ol>
<li>Special Requirements
<ol type = i>
<li>Functionality</li>
<ol type = a>
<li>Overall Use-Case-Diagram</li>
<li>Startseiten-Optionen</li>
<li>Bearbeitung-ijl,s</li>
<li>Bearbeds</li>
</ol>
<li>Usability
<ol type = a>
<li>Hardware Requirements</li>
<li>Software-Requirements</li>
</ol>
<li>Reliability
<ol type = a>
</ol>
<li>Performance
<ol type = a>
</ol>
<li>Supportability</li>
<li>Design Constrains</li>
<li>On-Line User Documentation and Help System Requirements</li>
<li>Purchased Components</li>
<li>Interfaces
<ol type = a>
<li>User Interfaces</li>
<li>Hardware Interfaces</li>
<li>Software Interfaces</li>
<li>Communication Interfaces</li>
</ol>
<li>Licensing Requirements</li>
<li>Legal, Copyright, and Other Notices</li>
<li>Applicable Standards</li>
</ol>
<li>Supporting Information
</ol>
</br>


#  Software Requirements Specification  #

###  1. Introduction  ###

Unser Ziel ist es, das legendäre Tetris Spiel aus den 80ern wieder aufleben zu lassen. Hier werden einige Änderungen vorgenommen und verschiedene, noch nie dagewesene, Spielmodi hinzugefügt.

####  1.1 Purpose  ####

Dieses Software Requirement Specification Dokument soll einen Überblick über die Anforderungen und Dokumente unseres Projektes bieten.

####  1.2 Scope  ####

Dieses Software Requirement Specification Dokument dient als Richtlinie für die Entwickler sowie als Überblick für externe.

####  1.3 Definitions, Acronyms, and Abbreviations  ####

AnKaLu - André, Katharina, Luka</br>
n/a - not appliciable<br>

####  1.4 Document - References  ####

<table>
<tr><td>Blog</td><td><a href url="https://ankalublog.wordpress.com/blog/">https://ankalublog.wordpress.com/blog/</a></td></tr>
<tr><td>Github</td><td><a href url="https://github.com/AlSalad/Ankalu">https://github.com/AlSalad/Ankalu</a></td></tr>
<tr><td>IntelliJ</td><td><a href url="https://www.jetbrains.com/idea/">https://www.jetbrains.com/idea/</a></td></tr>
<tr><td>Jira</td><td><a href url="http://193.196.7.27:8080/secure/Dashboard.jspa">http://193.196.7.27:8080/secure/Dashboard.jspa</a></td></tr>
<tr><td>Use-Case: Musik ändern</td><td><a href url=""></a></td></tr>
<tr><td>Use-Case: Highscore löschen</td><td><a href url=""></a></td></tr><tr><td>Use-Case: Standard-Mode spielen</td><td><a href url=""></a></td></tr><tr><td>Use-Case: Fast-Mode spielen</td><td><a href url=""></a></td></tr><tr><td>Use-Case: Reversed-Mode spielen</td><td><a href url=""></a></td></tr><tr><td>Use-Case: Epilepsie-Mode spielen</td><td><a href url=""></a></td></tr>
<tr><td>Software Architecture Document</td><td><a href = ""></a></td></tr>
</table>


###  2. Overall Description  ###

Es handelt sich um eine Desktopanwendung, die das legendäre Tetris mit einigen speziellen Features wieder aufleben lässt. Die Grundstruktur stellt der Standard-Mode dar, der dem Standard Tetris entspricht. Zusätzlich kann man individuelle Spieleinstellungen, wie z.B. Musik ändern oder Design ändern, im Menü einstellen. Des Weiteren stehen noch nie dagewesene Spielmodi zur Verfügung:</br>
<ul>
<li>Fast-Mode: Die Blöcke bewegen sich schneller als zuvor zum Boden
<li>Reverse-Mode: Die Steuerung der Blöcke ist spiegelverkehrt
<li>Epilepsie-Mode: Die Steuerung der Blöcke ist spiegelverkehrt und die Blöcke bewegen sich schneller zum Boden. Zudem flackert der Hintergrund in verschiedenen Farben.
</ul>

####  2.1 Product Perspective  ####

Dieses Spiel soll den Tetrisfans die Möglichkeit bieten, das damalige Spieleerlebnis wieder aufleben zu lassen. Zusätzlich sorgen die verschiedenen Spielmodi für eine frische Abwechslung, da das Standard Tetris, vorallem für junge Leute, sehr schnell eintönig werden kann.

####  2.2 Product Functions  ####

<ul>
<li>Musik ändern
<li>Highscore einsehen und löschen
<li>Tetris im Standard-Mode spielen
<li>Tetris im Fast-Mode spielen
<li>Tetris im Reverse-Mode spielen
<li>Tetris im Epilepsie-Mode spielen
</ul>

####  2.3 User Characteristics  ####

Der Nutzer wird durch den Highscore motiviert weiter zu spielen und dadurch seinen Highscore zu verbessern. Durch die verschiedenen Modi wird es dem Nutzer nicht langweilig und kann sich auch mit anderen in diesem Spiel messen.

####  2.4 Contraits  ####

Da diese Datei später als Anwendung (.exe) vorliegt, benötigt man nichts weiter als einen funktionierenden PC, mit einer funktionierenden Maus (damit die Anwendung gestartet und im Menü die Modi etc. ausgewählt werden können) und eine funktionierende Tastatur, damit die einzelnen Blöcke gesteuert werden können.

#### 2.5 Assumptions and Dependencies  ####

<ul>
<li>IDE: IntelliJ</li>
<li>Versionskontrolle: GitHub</li>
<li>Scrum: Jira</li>
<li>Programmiersprache: Java</li>
<li>Tests: Cucumber, Feature File Test</li>
</ul>

###  3. Specific Requirements  ###

####  3.1 Functionality  ####

#####  3.1.1 Overall Use-Case-Diagram  #####

Github: [https://github.com/AlSalad/Ankalu/blob/master/documents/Use%20Cases/Use%20Case%20Diagrams/Overall%20Use%20Case%20Diagram.pdf](https://github.com/AlSalad/Ankalu/blob/master/documents/Use%20Cases/Use%20Case%20Diagrams/Overall%20Use%20Case%20Diagram.pdf)</br>


![Overall UCD](https://github.com/AlSalad/Ankalu/blob/master/documents/Use%20Cases/Use%20Case%20Diagrams/UCD%20Epilepsie-Mode%20spielen.png "Overall UCD")
n
