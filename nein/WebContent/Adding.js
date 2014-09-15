function addThisShit() 
{
	var firstNum = document.getElementById("firstNum").value;
	var secondNum = document.getElementById("secondNum").value;
	
	
	$.ajax({
        type: "POST",
        url: "http://localhost:8080/nein/sum",
        contentType: "application/json; charset=utf-8",
        data: {param1: firstNum , param2: secondNum},
        dataType: "json",
        success: function(resultSum)
        {
        	document.getElementById("sum").value = resultSum;
        },
        error: function (request, status, error) 
        {
            alert(request.responseText);
        }
    });
}