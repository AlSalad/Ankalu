
----------
##  AnKaLu-Tetris  ##
----------

####  AnKaLu-Tetris  ###

####  Master Test Plan  ###

#####  Version 2.2  #####

</br>

##  Revision History  ##

<table> 
<tr><td><b>Date</b></td><td><b>Version</b></td><td><b>Description</b></td><td><b>Author</b></td></tr>
<tr><td>08.05.2017</td><td>1.0</td><td>Version 1.0</td><td>André, Katharina, Luka</td></tr>
<tr><td></td><td></td><td></td><td></td></tr>
<tr><td></td><td></td><td></td><td></td></tr>
<tr><td></td><td></td><td></td><td></td></tr>
</table>
</br>


## Table of Contents ##
<ol>
<li>Introduction 
<ol type = i>
<li>Purpose</li>
<li>Scope</li>
<li>Intended Audience</li>
<li>Document Terminology and Acronyms</li>
<li>References</li>
<li>Document Structure</li>
</ol>
<li>Evaluation Mission and test Motivation
<ol type = i>
<li>Background</li>
<li>Evaluation Mission</li>
<li>Test Motivators</li>
</ol>
<li>Target test Items</li>
<li>Outline of Planned Tests
<ol type = i>
<li>Outline of Test Inclusions</li>
<li>Outline of other candidates for potential inclusion</li>
<li>Outline of Test Exclusions</li>
</ol>
<li>Test Approach
<ol type = i>
<li>Initial Test-Idea Catalogs and other reference sources</li>
<li>Testing Techniques and Types
<ol type = a>
<li>Data and Database Integrity Testing</li>
<li>Function Testing</li>
<li>Business Cycle Testing</li>
<li>User Interface Testing</li>
<li>Performance Profiling</li>
<li>Load Testing</li>
<li>Stress Testing</li>
<li>Volume Testing</li>
<li>Security and Access Control Testing</li>
<li>Failover and Recovery Testing</li>
<li>Configuration Testing</li>
<li>Installation Testing</li>
</ol>
</ol>
<li>Entry and Exit Criteria
<ol type = i>
<li> Test Plan
<ol type = a>
<li>Test Plan Entry Criteria</li>
<li>Test Plan Exit Criteria</li>
<li>Suspension and resumption criteria</li>
</ol>
<li>Test Cycles
<ol type = a>
<li>Test Cycle Entry Criteria</li>
<li>Test Cycle Exit Criteria</li>
<li>Test Cycle abnormal termination</li>
</ol>
</ol>
<li>Deliverables
<ol type = i>
<li>Test Evaluation Summaries </li>
<li>Reporting on Test Coverage</li>
<li>Perceived Quality Reports</li>
<li>Incident Logs and Change Requests</li>
<li>Smoke Test Suite and supporting Test Scripts</li>
<li>Additional work products
<ol type = a>
<li>Detailed Test Results</li>
<li>Additional automated functional Test Scripts</li>
<li>Test Guidelines</li>
<li>Traceability Matrices</li>
</ol>
</ol>
<li>Testing Workflow</li>
<li>Environmental Needs
<ol type = i>
<li>Base System Hardware</li>
<li>Base Software Elements in the Test Environment</li>
<li>Productivity and Support Tools</li>
<li>Test Environment Configurations</li>
</ol>
<li>Responsibilities, Staffing and Training Needs
<ol type = i>
<li>People and Roles</li>
<li>Staffing and Training Needs</li>
</ol>
<li>Iteration Milestones</li>
<li>Risks, Dependencies, Assumptions and Constraints</li>
<li>Management Process and Procedures
<ol type = i>
<li>Measuring and Assessing the Extent of Testing</li>
<li>Assessing the deliverables of this Test Plan</li>
<li>Problem Reporting, Escalation and Issue Resolution</li>
<li>Managing Test Cycles</li>
<li>Traceability Strategies</li>
<li>Approval and Signoff</li>
</ol>
</ol>


###  1. Introduction  ###

####  1.1 Purpose  ####

The purpose of the Iteration Test Plan is to gather all of the information necessary to plan and control the test effort for a given iteration. It describes the approach to testing the software, and is the top-level plan generated and used by managers to direct the test effort.

####  1.2 Scope  ####  

Unit Tests wit IntelliJ
--> logictests (all getter and setter)

Testing with end user (GUI easy to understand and use)

####  1.3 Intended Audience  ####

Members of the team, developers, students, colleagues.

#### 1.4 Document Terminology and Acronyms  #### 

n/a

###  2. Evaluation Mission and Test Motivation  ###

Testing needs to be done to guarantee that the software is stable and furthermore stays stable over the development of new features. After releasing patches and / or fixing bugs testing is also necessary to guarantee the best and most stable experience for the user.

####  2.1 Background  #### 

By testing our project, we can monitor the effects that changes to the source code and user interactions cause to the functionality and performance of the software. Also we can ensure a properly working application.

As a result we can:

1.    Sleep well at night because the code is doing for what is meant to.

Testing guarantees that new functionalities work fine and as intended. Inoperability between old and new functions can be detected and fixed. E.g.: a new feature could break an old legacy feature and
by testing we can prevent this from scratch and safe our users from the trouble of not (properly)
working functions and features.

2.    Catch all possible edge cases.

“No user would ever do that.” Said no developer ever.  No developer can ever think of all possible combination of user interactions possible in his system to still catch all possible bugs which are hidden in bizarre action combination. Only with wide and intense testing all hidden bugs (and maybe features) can be found.


####  2.2 Evaluation Mission  ####

Testing is done to provide stable software. And we try to reach this goal by following these points.

     Finding and fixing as many bugs as possible

     Finding and fixing problems

     Verify a specification (for example user / business requirements)


####  2.3 Test Motivators  ####

     Reduce technical risks.
     Functional and no-functional requirements
     Design elements
     Ensure q high quality software


###  3. Target Test Items  ###

The listing below identifies those test itemssoftware, hardware, and supporting product elements that have been identified as targets for testing. This list represents what items will be tested.

     Controller (Logic)

     View        (Design)

     Routing   (Interaction of parts above)

###  4. Outline of Planned Tests  ###

####  4.1 Outline of other candidates for potential inclusion  ####  

Stress and “Penetration” testing the application

####  4.2 Outline of Test Exclusions  ####

n/a

###  5. Test Approach  ###

####  5.1 Initial Test-Idea Catalogs and other reference sources  ####

n/a

####  5.2 Testing Techniques and Types  ####

<b>TESTING WITH ENDUSER</b>

<b>Technique Objective:</b>
Testing the simplicity /accessibility of the app

<b>Technique: </b>
Testing the different menus / timer
Testing the application for easy understanding
Survey after finished hands on test

<b>Oracles:	
The test users are happy with the app. They were able to use and navigate around it without many instructions

<b>Required Tools:</b>
A Device capable of running a Java environment.

<b>Success Criteria:	</b>
The user is happy and benefits of improved learning conditions.


<b>UNIT TESTS:</b>

<b>Technique Objective:	</b>
Testing the functionality of the code

<b>Technique:	</b>
Testing the code of the testable classes.

<b>Oracles:	</b>
We are sure, that all will be passed successfully.

<b>Required Tools:	</b>
IntelliJ

<b>Success Criteria:	</b>
All tests passed, every function works as intended


###  6. Entry and Exit Criteria  ###

####  6.1 Test Plan  ####

#####  6.1.1 Test Plan Entry Criteria  #####
Implementation of buttons and / or textboxes must be done.

#####  6.1.2 Test Plan Exit Criteria  #####
logic works righ/ the system and genreration of the game itself

#####  6.1.3 Suspension and resumption criteria  #####

Testing should be suspended when the testing software is not able to create / get information from the subsystem. Resumption should only be possible by manual advice.

####  6.2 Test Cycles  ####

#####  6.2.1 Test Cycle Entry Criteria  #####
[Specify the criteria to be used to determine whether the test effort for the next Test Cycle of this Test Plan can begin.]

#####  6.2.2 Test Cycle Exit Criteria  #####
[Specify the criteria that will be used to determine whether the test effort for the current Test Cycle of this Test
Plan is deemed sufficient.]

#####  6.2.3 Test Cycle abnormal termination  #####
[Specify the criteria that will be used to determine whether testing should be prematurely suspended or ended for the current test cycle, or whether the intended build candidate to be tested must be altered.]

###  7. Deliverables  ###
Screenshots

####  7.1 Test Evaluation Summaries  ####  
A evaluation can / should / will be produced after a new test was implemented / finished.

####  7.2 Reporting on Test Coverage  ####    

###  8. Testing Workflow  ###
User interface tests will be executed before every push.

###  9. Environmental Needs  ###
A computer with a working Java environment and the testing software + IDE 

####  9.1 Base System Hardware  #### 
Any device which is capable of running IntelliJ
device storage min. 500MB

####  9.2 Base Software Elements in the Test Environment  #### 
Windows with IntelliJ

####  9.3 Productivity and Support Tools  #### 
n/a

####  9.4Test Environment Configurations  #### 
n/a

###  10. Responsibilities, Staffing and Training Needs  ###

<b>Test Manager</b>		

Provides management oversight.

Responsibilities include:

     planning and logistics

     agree mission

     identify motivators

     acquire appropriate resources

     present management reporting

     advocate the interests of test

     evaluate effectiveness of test effort
     
<b>Test Analyst	</b>	

Identifies and defines the specific tests to be
conducted. Responsibilities include:
     identify test ideas

     define test details

     determine test results

     document change requests

     evaluate product quality
     
<b>Test Designer</b>		

Defines the technical approach to the
implementation of the test effort.

Responsibilities include:

     define test approach

     define test automation architecture

     verify test techniques

     define testability elements

     structure test implementation


####  10.1 Staffing and Training Needs  #### 
This section outlines how to approach staffing and training the test roles for the project.

###  11. Iteration Milestones  ###
[Identify the key schedule milestones that set the context for the Testing effort. Avoid repeating too much detail that is documented elsewhere in plans that address the entire project.]

<b>Milestone 1</b>
more than 30% test coverage. --> achieved 28.05.2017

<b>Milestone 2</b>
Easy use of the GUI for external people. --> achieved 14.04.2017

###  12. Risks, Dependencies, Assumptions and Constraints  ###
[List any risks that may affect the successful execution of this Test Plan, and identify mitigation and contingency strategies for each risk. Also indicate a relative ranking for both the likelihood of occurrence and the impact if the risk is realized.]


<b>Risk</b>
-Prerequisite entry criteria is not met.
-Test data proves to be inadequate.	
-Database requires refresh.

<b>Mitigation Strategy</b>
-<Tester> will define the prerequisites that must be met before Load Testing can start.
<Customer> will endeavor to meet prerequisites indicated by <Tester>.
-<Customer> will ensure a full set of suitable and protected test data is available.
<Tester> will indicate what is required and will verify the suitability of test data.
-<System Admin> will endeavor to ensure the Database is regularly refreshed as required by <Tester>.	

<b>Contingency (Risk is realized)</b>
-Meet outstanding prerequisites Consider Load Test Failure
-Redefine test data Review Test Plan and modify components (that is, scripts) Consider Load Test Failure
-Restore data and restart Clear Database

