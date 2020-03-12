@cricbuzz_Features
Feature: Cricbuzz website 

@tc01_google
Scenario: 
	Learn cucumber framework with the help of cricbuzz website
	
	Given the user launched the chrome browser 
	When the user opens Google Homepage 
	Then the user enters "Steven Smith"
	And the user clicks search button
	
@tc02_cricbuzz
Scenario: 
	Check that main elements on a google homepage are displayed

	Given launch an chrome browser 
	When the user opens Cricbuzz homepage 
	Then the user moves to "Ranking" icon 
	Then the user clicks "ICC-Rankings Men" 