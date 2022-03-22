
/**** Loan script Start ******/
/* ===================================================== */

/* date picker */
flatpickr( "#transactionDateStr", {disableMobile: "true", dateFormat: "Y-m-d", });
flatpickr( "#loanEndDateStr", {disableMobile: "true", dateFormat: "Y-m-d", });

/*calculate loan deduction amount*/
$( "#loanEndDateStr" ).change(function() {
	var tranDateString = $( "#transactionDateStr" ).val();
	if(!tranDateString){
		alert("Please enter a loan start date first!");
	}else{
		var loanEndDateStr = $( "#loanEndDateStr" ).val();
		var loanAmount = $( "#loanAmount" ).val();
		var tranDate =  new Date(tranDateString);
		var loanEndDate = new Date(loanEndDateStr);
		
		var noOfMonths = loanEndDate.getMonth() - tranDate.getMonth();
		var monthlyLoanAmount = loanAmount/noOfMonths;
		console.log(" Start " + tranDateString + " End " + loanEndDateStr);
		//console.log(" Start Date " + tranDate + " End Date " + loanEndDate);
		console.log(tranDate.getMonth() + " " + loanEndDate.getMonth() + " " +  noOfMonths + " " + monthlyLoanAmount);		
		console.log(" Start " + loanEndDate.getFullYear() + " End " + loanEndDate.getFullYear());
		$( "#deductionAmount" ).val(monthlyLoanAmount);
	}
});

/*-----  get Employee----------*/
$('#employeeId').change (function() {
    var employeeId = $('#employeeId').val();
	console.log("Employee ID: " + employeeId);
	if(employeeId && employeeId >0){
	    $.ajax({
		  type : 'POST',
		  url : 'findEmployee',
		  data : {employeeId},
		  success : function(result) {
			console.log("result " + result);
			console.log("name " + result.fullName + " sal " + result.basicSalary);
			if(result){
				$('#employeeName').val(result.fullName);
				$('#basicSalary').val(result.basicSalary);
			}else{
				alert("No employee found");
			}
		  }
	    });
	}else{
		alert("Invalid Selection");
	}
});

/**** Loan script End ******/
/* ===================================================== */



/**** Overtime script Start ******/
/* ===================================================== */


flatpickr( "#overtimeDateStr", {disableMobile: "true", dateFormat: "d-m-Y", });

/*-----  get Employee----------*/
$('#employeeId').change (function() {
    var employeeId = $('#employeeId').val();
	console.log("Employee ID: " + employeeId);
	if(employeeId && employeeId >0){
	    $.ajax({
		  type : 'POST',
		  url : 'findEmployee',
		  data : {employeeId},
		  success : function(result) {
			console.log("result " + result);
			console.log("name " + result.fullName + " sal " + result.basicSalary);
			if(result){
				$('#employeeName').val(result.fullName);
				$('#basicSalary').val(result.basicSalary);
			}else{
				alert("No employee found");
			}
		  }
	    });
	}else{
		alert("Invalid Selection");
	}
});	


/**** Overtime script End ******/
/* ===================================================== */



/**** Monthly Salary script Start ******/
/* ===================================================== */


function changeInput(findBy){
	/*console.log(findBy);
	console.dir(findBy);*/
	elemLabel = document.getElementById('findByValueLabel');
	elemInput = document.getElementById('findByValue');
	
	if(findBy === "Month"){
		elemLabel.innerHTML = 'Select Month';
		flatpickr( "#findByValue", {disableMobile: "true", dateFormat: "Y M", });
		$('#divInput').show();
		$('#divSelect').hide();
		$('#divSelectDept').hide();
	}	
	if(findBy === "Year"){
		elemLabel.innerHTML = 'Select Year';
		flatpickr( "#findByValue", {disableMobile: "true", dateFormat: "Y", });
		$('#divInput').show();
		$('#divSelect').hide();
		$('#divSelectDept').hide();
	}
	if(findBy === "Employee Type"){
		elemLabel.innerHTML = 'Select Employee Type';
		$('#divInput').css("display", "none");
		$('#divSelect').show();
		$('#divSelectDept').hide();
	}
	if(findBy === "Department"){
		elemLabel.innerHTML = 'Select Department';
		$('#divInput').hide();
		$('#divSelect').hide();
		$('#divSelectDept').show();
		
	}
	
}


/**** Monthly Salary script End ******/
/* ===================================================== */




