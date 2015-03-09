<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<P>  value of a is ${a}. </P>
<P>  value of a is ${b}. </P>

<P>  value of dbname is ${dbname}. </P>
<P>  value of dbname2 is ${dbname2}. </P>

<input type="button"  onclick="location.href='test/helloworld'" value="to helloworld" >
</body>
</html>
