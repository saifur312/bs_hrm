
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
	