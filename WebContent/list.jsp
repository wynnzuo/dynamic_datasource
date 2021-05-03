<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery.min.js"></script>
<title>Insert title here</title>
<script type="text/javascript">
	$(function(){
		$.ajax({
			type:"post",
			url:"<%=request.getContextPath()%>/findAll",
			dataType:"json",
			success:function(data){
				for(var i = 0; i<data.length;i++){
					var c = "<tr><td>"+data[i].id+"</td><td>"+data[i].username+"</td><td>"+data[i].pwd+"</td></tr>"
					$("#tab").append(c);
				}
			}
		})
	})
</script>
</head>
<body>
	<table id="tab">
		<tr>
			<th>id</th>
			<th>name</th>
			<th>pwd</th>
		</tr>
	</table>
</body>
</html>