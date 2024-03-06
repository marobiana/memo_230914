<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>테스트</title>
<%-- bootstrap --%>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.7.1.js" integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4=" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
</head>
<body>
	<h1>테스트</h1>
	<button type="button" id="btn">클릭</button>
	
	<script>
		$(document).ready(function() {
			$("#btn").on('click', function() {
				let obj = [{"userName":"권지용","productPrice":4000,"deliveryPrice":3000,"address":"빅뱅아파트819","phoneNumber":"010-8888-8888"},{"productName":"기본마들렌","count":1},{"productName":"단팥빵","count":1}];
				
				$.ajax({
					type:"post"
					,url:"/test6"
					, data:JSON.stringify(obj)
					, contentType:'application/json' // request
					
					, dataType:'json' // response
					, success:function(data) {
						alert(data);
					}
					, error:function() {
						alert("실패");
					}
				});
			});
		});
	</script>
</body>
</html>