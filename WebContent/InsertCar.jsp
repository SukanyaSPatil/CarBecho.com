<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
input[type=text]{
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
}

input[type=submit] {
    width: 100%;
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    border-radius: 4px;
    cursor: pointer;
}

input[type=submit]:hover {
    background-color: #45a049;
}

.form {
    border-radius: 5px;
    background-color: #f2f2f2;
    padding: 40px;
}
</style>

<meta charset="utf-8">
<script type="text/javascript" src="jquery.js">
</script>
<script type="text/javascript" src="jquery-ui.min.js">
</script>
<script type="text/javascript" src="tt_slideshow.js">
</script>
<script type="text/javascript" src="bootstrap.min.js">
</script>
<script type="text/javascript" src="Customjs.js">
</script>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="Add the site description here" />
<meta  name="keywords" content="First keyword, second keyword," />
<title>
Dealer Login
</title>
<link rel="stylesheet"  href="bootstrap.css" type="text/css" media="screen"/>
<link rel="stylesheet"  href="style.css" type="text/css" media="screen"/>
<!--[if lte IE 8]>
<link rel="stylesheet"  href="menuie.css" type="text/css" media="screen"/>
<link rel="stylesheet"  href="vmenuie.css" type="text/css" media="screen"/>
<![endif]-->
<script type="text/javascript" src="totop.js">
</script>
<!--[if IE 7]>
<style type="text/css" media="screen">
#ttr_vmenu_items  li.ttr_vmenu_items_parent {margin-left:-16px;font-size:0px;}
</style>
<![endif]-->
<!--[if lt IE 9]>
<script type="text/javascript" src="html5shiv.js">
</script>
<script type="text/javascript" src="respond.min.js">
</script>
<![endif]-->

</head>
<body>

<div id="ttr_page" class="container">
<nav id="ttr_menu" class="navbar-default navbar">
   <div id="ttr_menu_inner_in">
<div class="menuforeground">
</div>
<div class="ttr_menushape1">
<div class="html_content"><p><span style="font-family:'Times New Roman';font-weight:700;font-size:2.571em;color:rgba(158,10,57,1);">CarBecho</span></p></div>
</div>
<div id="navigationmenu">
<div class="navbar-header">
<button id="nav-expander" data-target=".navbar-collapse" data-toggle="collapse" class="navbar-toggle" type="button">
<span class="sr-only">
</span>
<span class="icon-bar">
</span>
<span class="icon-bar">
</span>
<span class="icon-bar">
</span>
</button>
<img  class="ttr_menu_logo" src="menulogo.png" >
</div>
<div class="menu-center collapse navbar-collapse">
<ul class="ttr_menu_items nav navbar-nav navbar-right">
<li class="ttr_menu_items_parent dropdown"><a href="home.jsp" class="ttr_menu_items_parent_link">
Home
</a>
<hr class ="horiz_separator"/>
</li>
<li class="ttr_menu_items_parent dropdown"><a href="about-us.jsp" class="ttr_menu_items_parent_link">
About Us
</a>
<hr class ="horiz_separator"/>
</li>
<li class="ttr_menu_items_parent dropdown"><a href="search-car.jsp" class="ttr_menu_items_parent_link">
Search Car
</a>
<hr class ="horiz_separator"/>
</li>
<li class="ttr_menu_items_parent dropdown"><a href="#" class="ttr_menu_items_parent_link_arrow dropdown-toggle"data-toggle="dropdown">
Register</a>
<hr class ="horiz_separator"/>
<ul class="child dropdown-menu" role="menu">
<li><a href="dealer-registration.jsp">
Dealer Registration</a>
<hr class ="separator"/>
</li>
<li><a href="user-registration.jsp">
User Registration</a>
</li>
</ul>
</li>
<li class="ttr_menu_items_parent dropdown"><a href="#" class="ttr_menu_items_parent_link_arrow dropdown-toggle"data-toggle="dropdown">
Login</a>
<hr class ="horiz_separator"/>
<ul class="child dropdown-menu" role="menu">
<li><a href="dealer-login.jsp">
Dealer Login</a>
<hr class ="separator"/>
</li>
<li><a href="user-login.jsp">
User Login</a>
</li>
</ul>
</li>
<li class="ttr_menu_items_parent dropdown"><a href="contact-us.jsp" class="ttr_menu_items_parent_link">
Contact Us</a>
<hr class ="horiz_separator"/>
</li>
</ul>
</div>
</div>
</div>
</nav>

<!-- <script type="text/javascript">
	function validate() {
	
		var str2 = document.getElementsById("model").value;
		var str3 = document.getElementsById("type").value;
		var str4 = document.getElementsById("color").value;
		var str5 = document.getElementsById("engineNumber").value;
		var str6 = document.getElementsById("company").value;
		var str7 = document.getElementsById("price").value;
		var str8 = document.getElementsById("description").value;
		if (str1.length==0) {
			alert(" in user ");
			document.getElementById("span1").innerHTML = "*chasisNumber Can't be Empty";
		}
		else if (str2.length==0) {
			document.getElementById("span2").innerHTML = "*Model Can't be Empty";
		}
		else if (str3.length==0) {
			document.getElementById("span3").innerHTML = "*Type Can't be Empty";
		}
		else if (str4.length==0) {
			document.getElementById("span4").innerHTML = "*Color Can't be Empty";
		}
		else if (str5.length==0) {
			document.getElementById("span5").innerHTML = "*Engine Number Can't be Empty";
		}
		else if (str6.length==0) {
			document.getElementById("span6").innerHTML = "*Company Can't be Empty";
		}
		else if (str7.length==0) {
			document.getElementById("span7").innerHTML = "*Price Can't be Empty";
		}
		else if (str8.length==0) {
			document.getElementById("span8").innerHTML = "*Description Can't be Empty";
		}
		else{
			form.submit("insertCar/xyz");
			}
	}
	</script> -->
<br><br><br>
<div class="form">
<form method="get" action="insertCar.xyz">
		
		<%
HttpSession session1=request.getSession();
		String chasisNo=(String)session1.getAttribute("chasisNo");
session1.setAttribute("chasisNo", chasisNo); %>

        <label for="fname">&nbsp 	Enter Car Chasis Number:</label>
				<input type="text" id="chasisNumber" name="chasisNumber" placeholder="Your Car Chasis Number.." required="required">
				<span
					id="span1" style="color: red"></span>
		
		<label for="fname">&nbsp Enter Car Model:</label>
				<input type="text" id="model" name="model" placeholder="Your Car Model.." required="required"><span
					id="span2" style="color: red"></span>
		
		<label for="fname">&nbsp Enter Car Type:</label>
		<select id="type" name="type" placeholder="Your Car Type.." >
		<option value="Petrol">Petrol</option>
		<option value="Disel">Disel</option>
		<option value="Petrol/Disel">Petrol/Disel</option>
		</select>
		<label for="fname">&nbsp 	Enter Car Color:</label>
		 <select id="color" name="color" placeholder="Your Car Colour..">
		 <option value="Red">Red</option>
		  <option value="Orange">Orange</option>
		  <option value="Black">Black</option>
		   <option value="White">White</option>
		    <option value="Green">Green</option>
		     <option value="Yellow">Yellow</option>
		      <option value="Blue">Blue</option>
		 </select>
		<label for="fname">&nbsp Enter Car Engine Type:</label>
			<input type="text" id="engineNumber" name="engineNumber"  placeholder="Your Car Engine Number.." required="required"><span
					id="span5" style="color: red"></span>
			
			<label for="fname">&nbsp 	Enter Car Company:</label>
			<select id="company" name="company" placeholder="Your Car Company..">
			<option value="BMW">BMW</option>
		  <option value="Audi">Audi</option>
		  <option value="Ford">Ford</option>
			</select>
				<label for="fname">&nbsp 	Enter Car Price:</label>
			<input type="text" id="price" name="price"  placeholder="Your Car Price.." required="required"><span
					id="span7" style="color: red"></span>
			
			<label for="fname">&nbsp Enter Car Description:</label>
			<input type="text" id="description" name="description" placeholder="Your Car Description.." required="required"><span
					id="span8" style="color: red"></span>
		
		<label for="fname">&nbsp Enter Car Image:</label>
			<input type="file" id="image" name="image" placeholder="Your Car Image.." required="required"><span
					id="span8" style="color: red"></span>
			<br><br>
			<label for="fname">&nbsp Enter Car Quantity:</label>
		<input type="number" id="quantity" name="quantity" min="0" placeholder="Your Car Quantity.." required="required"><span
					id="span9" style="color: red"></span>
			<br>
		<label for="fname">&nbsp Enter Car PaymentOption:</label>	
			<input type="text" id="paymentOpt" name="paymentopt" placeholder="Your Car Payment Option.." required="required"><span
					id="span10" style="color: red"></span>
		
		<label for="fname">&nbsp Enter Car Delivery:</label>	
		<input type="text" id="delivery" name="delivery"  placeholder="Your Car Delivery.." required="required"><span
					id="span11" style="color: red"></span>
		
			<input type="submit" value="insert" class="button">
	
	</form>
	</div>
<br><br><br>
	<div style="height:0px;width:0px;overflow:hidden;"></div>
<footer id="ttr_footer">
<div class="ttr_footerDealer-Login_html_row0 row">
<div class="post_column col-lg-3 col-md-6 col-sm-6 col-xs-12">
<div class="ttr_footerDealer-Login_html_column00">
<div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
<div class="html_content"><p style="margin:0em 0em 0em 1.43em;"><br style="font-family:'Arial';font-weight:700;font-size:1.143em;color:rgba(52,52,52,1);" /></p><p style="margin:0em 0em 0em 1.43em;"><br style="font-family:'Arial';font-weight:700;font-size:1.143em;color:rgba(52,52,52,1);" /></p><p style="margin:0em 0em 0em 1.43em;"><span style="font-family:'Arial';font-weight:700;font-size:1.143em;color:rgba(52,52,52,1);">LOCATION</span><br style="font-family:'Arial';font-size:1em;color:rgba(52,52,52,1);" /></p><p style="margin:0em 0em 0em 1.43em;"><br style="font-family:'Arial';font-size:1em;color:rgba(52,52,52,1);" /></p><p style="margin:0em 0em 0em 1.43em;line-height:1.54929577464789;"><span style="font-family:'Arial';font-size:1em;color:rgba(52,52,52,1);">3252, First Street</span></p><p style="margin:0em 0em 0em 1.43em;line-height:1.54929577464789;"><span style="font-family:'Arial';font-size:1em;color:rgba(52,52,52,1);">Golden Park, New York.</span></p><p style="margin:0em 0em 0em 1.43em;line-height:1.54929577464789;"><span style="font-family:'Arial';font-size:1em;color:rgba(52,52,52,1);">Phone: +1 800 210 3100</span></p></div>
<div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
</div>
</div>
<div class="clearfix visible-xs-block">
</div>
<div class="post_column col-lg-3 col-md-6 col-sm-6 col-xs-12">
<div class="ttr_footerDealer-Login_html_column01">
<div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
<div class="html_content"><p style="margin:0em 0em 0em 1.43em;"><br style="font-family:'Arial';font-weight:700;font-size:1.143em;color:rgba(52,52,52,1);" /></p><p style="margin:0em 0em 0em 1.43em;"><br style="font-family:'Arial';font-weight:700;font-size:1.143em;color:rgba(52,52,52,1);" /></p><p style="margin:0em 0em 0em 1.43em;"><span style="font-family:'Arial';font-weight:700;font-size:1.143em;color:rgba(52,52,52,1);">INFORMATION</span><br style="font-family:'Arial';font-size:1em;color:rgba(51,51,51,1);" /></p><p style="margin:0em 0em 0em 1.43em;"><br style="font-family:'Arial';font-size:1em;color:rgba(51,51,51,1);" /></p><p style="margin:0em 0em 0em 1.43em;line-height:1.54929577464789;"><span style="font-family:'Arial';font-size:1em;color:rgba(52,52,52,1);">Laoreet recteque </span></p><p style="margin:0em 0em 0em 1.43em;line-height:1.54929577464789;"><span style="font-family:'Arial';font-size:1em;color:rgba(52,52,52,1);">pertinacia eam eu </span></p><p style="margin:0em 0em 0em 1.43em;line-height:1.54929577464789;"><span style="font-family:'Arial';font-size:1em;color:rgba(52,52,52,1);">sea ut dignissim </span></p><p style="margin:0em 0em 0em 1.43em;line-height:1.54929577464789;"><span style="font-family:'Arial';font-size:1em;color:rgba(52,52,52,1);">consetetur voluptatum. </span></p><p style="margin:0em 0em 0em 1.43em;line-height:1.54929577464789;"><span style="font-family:'Arial';font-size:1em;color:rgba(52,52,52,1);">Eu epicurei partiendo has.</span></p></div>
<div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
</div>
</div>
<div class="clearfix visible-sm-block visible-md-block visible-xs-block">
</div>
<div class="post_column col-lg-3 col-md-6 col-sm-6 col-xs-12">
<div class="ttr_footerDealer-Login_html_column02">
<div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
<div class="html_content"><p style="margin:0em 0em 0em 1.43em;"><br style="font-family:'Arial';font-weight:700;font-size:1.143em;color:rgba(52,52,52,1);" /></p><p style="margin:0em 0em 0em 1.43em;"><br style="font-family:'Arial';font-weight:700;font-size:1.143em;color:rgba(52,52,52,1);" /></p><p style="margin:0em 0em 0em 1.43em;"><span style="font-family:'Arial';font-weight:700;font-size:1.143em;color:rgba(52,52,52,1);">RECENT POSTS</span><br style="font-family:'Arial';font-size:1em;color:rgba(51,51,51,1);" /></p><p style="margin:0em 0em 0em 1.43em;"><br style="font-family:'Arial';font-size:1em;color:rgba(51,51,51,1);" /></p><p style="margin:0em 0em 0em 1.43em;line-height:1.54929577464789;"><span style="font-family:'Arial';font-size:1em;color:rgba(51,51,51,1);">Deserunt repudiare ad sed, vel et alii eleifend contentiones, nam et noluisse probatus. Ad vim perfecto reprehendunt, mel et illud nonumy pericula. Sed eu nostrud eleifend, sea brute iriure ad, mei veri.</span></p></div>
<div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
</div>
</div>
<div class="clearfix visible-xs-block">
</div>
<div class="post_column col-lg-3 col-md-6 col-sm-6 col-xs-12">
<div class="ttr_footerDealer-Login_html_column03">
<div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
<div class="html_content"><p style="margin:0em 0em 0em 1.43em;"><br style="font-family:'Arial';font-weight:700;font-size:1.143em;color:rgba(52,52,52,1);" /></p><p style="margin:0em 0em 0em 1.43em;"><br style="font-family:'Arial';font-weight:700;font-size:1.143em;color:rgba(52,52,52,1);" /></p><p style="margin:0em 0em 0em 1.43em;"><span style="font-family:'Arial';font-weight:700;font-size:1.143em;color:rgba(52,52,52,1);">CONTACT</span><br style="font-family:'Arial';font-size:1em;color:rgba(51,51,51,1);" /></p><p style="margin:0em 0em 0em 1.43em;"><br style="font-family:'Arial';font-size:1em;color:rgba(51,51,51,1);" /></p><p style="margin:0em 0em 0em 1.43em;line-height:1.54929577464789;"><a HREF="http://facebook.com/TemplateToaster" class="tt_link" target="_self"><span style="font-family:'Arial';font-size:1em;color:rgba(51,51,51,1);">Facebook</span></a></p><p style="margin:0em 0em 0em 1.43em;line-height:1.54929577464789;"><a HREF="http://ttp://twitter.com/templatetoaster" class="tt_link" target="_self"><span style="font-family:'Arial';font-size:1em;color:rgba(51,51,51,1);">Twitter</span></a></p><p style="margin:0em 0em 0em 1.43em;line-height:1.54929577464789;"><a HREF="http://www.templatetoaster.com" class="tt_link" target="_self"><span style="font-family:'Arial';font-size:1em;color:rgba(51,51,51,1);">RSS</span></a></p></div>
<div style="height:0px;width:0px;overflow:hidden;-webkit-margin-top-collapse: separate;"></div>
</div>
</div>
<div class="clearfix visible-lg-block visible-sm-block visible-md-block visible-xs-block">
</div>
</div>
<div class="ttr_footer_bottom_footer">
<div class="ttr_footer_bottom_footer_inner">
<div id="ttr_footer_designed_by_links">
<a href="http://templatetoaster.com" target="_self" >
Website
</a>
<span id="ttr_footer_designed_by">
Designed With TemplateToaster
</span>
</div>
</div>
</div>
</footer>
<div style="height:0px;width:0px;overflow:hidden;-webkit-margin-bottom-collapse: separate;"></div>
</div>
<script type="text/javascript">
WebFontConfig = {
google: { families: [ 'Roboto:700','Roboto'] }
};
(function() {
var wf = document.createElement('script');
wf.src = ('https:' == document.location.protocol ? 'https' : 'http') + '://ajax.googleapis.com/ajax/libs/webfont/1.0.31/webfont.js';
wf.type = 'text/javascript';
wf.async = 'true';
var s = document.getElementsByTagName('script')[0];
s.parentNode.insertBefore(wf, s);
})();
</script>
</body>
</html>
</body>
</html>