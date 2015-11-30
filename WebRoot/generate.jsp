<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>注册</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
  </head>
  
  <body>
  	<form name="frm1" action="${pageContext.request.contextPath }/generateServlet?method=generate" method="post" >
  		<table>
  			<tr>
  				<td>Plaintext</td>
  				<td>
  					<input type="text" name="plaintext"/>
  					${requestScope.message } <!-- Show message if the submission is failed -->
  				</td>
  			</tr>
  			<tr>
  				<td>Keylength</td>
  				<td><input type="text" name="keylength"/></td>
  			</tr>
  			<tr>
  				<td>Times</td>
  				<td><input type="text" name="times"/></td>
  			</tr>
  			<tr>
  				<td colspan="2">
  					<input type="submit" value="Calculate">
  				</td>
  			</tr>
  		</table>
  	
  	</form>
  </body>
</html>
