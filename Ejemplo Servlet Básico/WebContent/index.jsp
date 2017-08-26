<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

	<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
	<link rel="stylesheet" href="https://code.getmdl.io/1.3.0/material.indigo-pink.min.css">
	<script defer src="https://code.getmdl.io/1.3.0/material.min.js"></script>

	<title>Ejemplo Servlet Básico</title>
</head>
<body>
	<form action="Controlador" method="post">

	  	<div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
	    	<input name="num1" class="mdl-textfield__input" type="text" pattern="-?[0-9]*(\.[0-9]+)?">
	    	<label class="mdl-textfield__label" for="sample4">Ingrese un número:</label>
	    	<span class="mdl-textfield__error">Error!! ingrese un número</span>
	  	</div><br>
	  
	    <div  class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
	    	<input name="num2" class="mdl-textfield__input" type="text" pattern="-?[0-9]*(\.[0-9]+)?">
	    	<label class="mdl-textfield__label" for="sample4">Ingrese otro número:</label>
	    	<span class="mdl-textfield__error">Error!! ingrese un número</span>
	  	</div><br>
	  
	   	<label class="demo-list-radio mdl-radio mdl-js-radio mdl-js-ripple-effect" >
	    	Suma<input type="radio" class="mdl-radio__button"  value="1" name="options"  checked/>
	  	</label><br>
	  
	    <label class="demo-list-radio mdl-radio mdl-js-radio mdl-js-ripple-effect" >
	 	 	Resta<input type="radio"  class="mdl-radio__button"  value="2" name="options"  />
	 	</label><br>
	  
	    <label class="demo-list-radio mdl-radio mdl-js-radio mdl-js-ripple-effect" >
	    	División<input type="radio" class="mdl-radio__button"  value="3" name="options"  />
	  	</label><br>
	  
	    <label class="demo-list-radio mdl-radio mdl-js-radio mdl-js-ripple-effect" >
	    	Multiplicación<input type="radio" class="mdl-radio__button"  value="4" name="options"  />
	  	</label><br><br>
	      	
		<button type="submit" class="mdl-button mdl-js-button mdl-button--raised mdl-button--colored">
	  		Realizar operación
		</button>

	</form>

</body>
</html>




