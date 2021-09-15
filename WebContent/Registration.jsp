<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
.button {
	background-color: #4CAF50;
	border: none;
	color: white;
	padding: 15px 32px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 16px;
	margin: 4px 2px;
	cursor: pointer;
}
r
th, td {
	padding: 15px;
	text-align: left;
}
</style>
 <script language="Javascript" src="jquery.js"></script>
    <script type="text/JavaScript" src='state.js'></script>
<script type="text/javascript">
	function validate() {
		alert(" hi ");
		var str1 = document.getElementById("uname").value;
		var str2 = document.getElementsByName("pass").value;
		var str3 = document.getElementsByName("fname").value;
		var str4 = document.getElementsByName("lname").value;
		var str5 = document.getElementsByName("state").value;
		var str6 = document.getElementsByName("city").value;
		var str7 = document.getElementsByName("email").value;
		var str8 = document.getElementsByName("tel").value;
		var str9 = document.getElementsByName("dealer").value;
		var str10 = document.getElementsByName("company").value;
		
		if(str9.length==0){
			document.getElementById("span9").innerHTML = "*Dealer Id Can't be Empty";
			}
		else if(str10.length==0){
			document.getElementById("span1").innerHTML = "*Company Name Can't be Empty";
			}
		else if (str1.length==0) {
			document.getElementById("span1").innerHTML = "*UserName Can't be Empty";
		}
		else if (str2.length==0) {
			document.getElementById("span2").innerHTML = "*PassWord Can't be Empty";
		}
		else if (str3.length==0) {
			document.getElementById("span3").innerHTML = "*First Name Can't be Empty";
		}
		else else if (str4.length==0) {
			document.getElementById("span4").innerHTML = "*Last Name Can't be Empty";
		}
		else if (str5.length==0) {
			document.getElementById("span5").innerHTML = "*State Can't be Empty";
		}
		else if (str6.length==0) {
			document.getElementById("span6").innerHTML = "*City Can't be Empty";
		}
		else if (str7.length==0) {
			document.getElementById("span7").innerHTML = "*Email Can't be Empty";
		}
		else if (str8.length==0) {
			document.getElementById("span8").innerHTML = "*TelePhone Can't be Empty";
		}
		
	}
</script>
</head>
<body>
	<form action="RegisterDelaer.xyz">
		<table>
		<tr>
				<td>Enter Delaer Id:</td>
				<td><input id="dealer" type="text" name="dealer"
					required="required"><span id="span9" style="color:red"></span></td>
			</tr>
			<tr>
				<td>Enter Company Name:</td>
				<td><input id="company" type="text" name="company"
					required="required"><span id="span10" style="color:red"></span></td>
			</tr>
			
			<tr>
				<td>Enter First Name:</td>
				<td><input type="text" name="fname" required="required"><span id="span3" style="color:red"></span></td>
			</tr>
			<tr>
				<td>Enter Last Name:</td>
				<td><input type="text" name="lname" required="required"><span id="span4" style="color:red"></span></td>
			</tr>
			<tr>
				<td>Enter State:</td>
				<td><select id="listBox" name="state" onchange='selct_district(this.value)'></select></td>
			</tr>
			<tr>
				<td>Enter City:</td>
				<td><select id='secondlist' name="city"></select></td>
			</tr>
			<tr>
				<td>Enter Telephone:</td>
				<td><input type="tel" name="tel" required="required"><span id="span8" style="color:red"></span></td>
			</tr>
			<tr>
				<td>Enter Email:</td>
				<td><input type="email" name="email" required="required"><span id="span7" style="color:red"></span></td>
			</tr>
			<tr>
				<td>Enter PassWord:</td>
				<td><input type="password" name="pass" required="required"><span id="span2" style="color:red"></span></td>
			</tr>
			
			<tr>
				<td><input type="submit" value="Submit" class="button"></td>
				<td><a href="#" class="button">Cancle</a></td>
			</tr>
		</table>
	</form>
</body>
</html>