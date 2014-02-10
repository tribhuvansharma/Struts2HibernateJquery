<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<link rel="stylesheet" type="text/css" href="css/style.css" />
	<script type="text/javascript" src="JS/jquery-1.4.2.min.js"></script>
	<script src="JS/jquery.autocomplete.js"></script>	
	
	<script>
	//jQuery(function(){
		//$("#employee").autocomplete("list.jsp");
	//});
	jQuery(function(){
		$("#employee").autocomplete("searchemployeeaction.action");
	});
    </script>
	
</head>
<body>
<br><br><center>
<font face="verdana" size="2">
<br><br><br><br>
	Select Employee   :	
	<input type="text" id="employee" name="employee" class="input_text"/>
	
</font>
</body>
</html>