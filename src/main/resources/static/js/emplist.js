
function changeInput(findBy){
	/*console.log(findBy);
	console.dir(findBy);*/
	elemLabel = document.getElementById('findByValueLabel');
	elemInput = document.getElementById('findByValue');
	
	if(findBy === "Name"){
		elemLabel.innerHTML = 'Enter any Name';
		elemInput.placeholder='Enter some character of Name';
	}	
	if(findBy === "NickName"){
		elemLabel.innerHTML = 'Enter any Nickname';
		elemInput.placeholder='Enter some character of Nickname';
	}
	if(findBy === "NID"){
		elemLabel.innerHTML = 'Enter any NID';
		elemInput.placeholder='Enter some digits of NID';
	}
	if(findBy === "EmployeeId"){
		elemLabel.innerHTML = 'Enter any Employee Id';
		elemInput.placeholder='Enter some digits of Employee Id';
	}
	if(findBy === "FingerId"){
		elemLabel.innerHTML = 'Enter any Finger Id';
		elemInput.placeholder='Enter some digits of FingerId';
	}
	
	
	/*for nominee list screen only*/	
	if(findBy === "FirstName"){
		elemLabel.innerHTML = 'Enter any First Name';
		elemInput.placeholder='Enter some character of FirstName';
	}
	if(findBy === "LastName"){
		elemLabel.innerHTML = 'Enter any Last Name';
		elemInput.placeholder='Enter some digits of Last Name';
	}
	if(findBy === "Relation"){
		elemLabel.innerHTML = 'Enter any Relation ';
		elemInput.placeholder='Father/Mother/Spouse/Children';
	}
	if(findBy === "Contact"){
		elemLabel.innerHTML = 'Enter any Contact';
		elemInput.placeholder='Enter some digits of Contact';
	}
	
}