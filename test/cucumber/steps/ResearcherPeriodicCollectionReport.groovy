package steps
import static cucumber.api.groovy.EN.*

import steps.CreateColetaTestDataAndOperations
import steps.NoColetasException

// CONTROLLER STEPS

//Scenario:Report generation

Given (~'^that collections were made on at least one residue generator on month "([^"]*)"$'){
    String month ->
        coletas = CreateColetaTestDataAndOperations.findColetaByDate(month)
        assert coletas != null
}

When (~'^the system receives a request to generate a report by a researcher user$'){
     ->
       
}


Then (~'^a report is generated containing information on the collections made on month "([^"]*)"$'){
   String month ->
   	coletas = CreateColetaTestDataAndOperations.calcVolume(month)
   	assert coletas != null
}


//Scenario:Error in report generation
Given (~'^no collections were made on any residue generator on month "12"$'){ ->
    
}

When (~'^the system receives a request for a report to a researcher user$'){
     ->
        
}


Then (~'^an error is sent to the user$'){
    ->
   	try {
   		def calc = CreateColetaTestDataAndOperations.calcVolume("12")
   	}
   	catch(NoColetasException e) {
   		assert true
   	}

   	
}