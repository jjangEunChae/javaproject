<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%@ include file="../include/member_menu.jsp" %>
</head>
<body>
<h3>결제하기</h3>

	<form  name="form1" method="post" action="${path}/payment/paymentCheck">
		name : <input type="text" name="p_name"><br> 
		phone : <input type="text" name="p_phone"><br> 
		card_num : <input type="text" name="p_card_num"><br> 
		cvc : <input type="password" name="p_cvc"><br> 
		card_pw : <input type="password" name="p_card_pw"><br> 
		<input type="submit" value="payment"> 
		<input type="reset" value="cancel">
	</form>
<c:if test="${msg=='결제실패'}">
<div> 불일치</div>
</c:if>

</body>
</html>