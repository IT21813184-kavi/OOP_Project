<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/header.css"/>
<link rel="stylesheet" href="css/index.css"/>
<link rel="stylesheet" href="css/makepayment.css"/>
<meta charset="UTF-8">
<meta charset="ISO-8859-1">
<title>make payment</title>
</head>
<body>
    
   <div class ="nav">
	<header>
		<ul>
			<li><a href="index.jsp"> Home </a></li>
			<li><a href=""> About </a></li>
			<li><a href=""> Contact us </a></li>
		</ul>
	</header>
	</div>
	
  <div class="row">
  <div class="column">
  <div class="container">
  <form action="paymentServlet" method="post">
            <h3>Billing Address</h3>
            <label for="nic"><i class="fa fa-user"></i> NIC</label>
            <input type="text" id="nic" name="NIC" placeholder="200054801193">
            <label for="fname"><i class="fa fa-user"></i> Full Name</label>
            <input type="text" id="fname" name="firstname" placeholder="John M. Doe">
            <label for="email"><i class="fa fa-envelope"></i> Email</label>
            <input type="text" id="email" name="email" placeholder="john@example.com">
            <label for="adr"><i class="fa fa-address-card-o"></i> Address</label>
            <input type="text" id="adr" name="address" placeholder="542 W. 15th Street">
            <label for="city"><i class="fa fa-institution"></i> City</label>
            <input type="text" id="city" name="city" placeholder="New York">
            <label for="state">State</label>
            <input type="text" id="state" name="state" placeholder="NY">
            <label for="zip">Select your Zip</label>
            <input type="file" id="zip" name="zip" multiple>
       
         
          
          <div class="column">
          <h3>Payment</h3>
            <label for="fname">Accepted Cards</label>
            <div class="icon-container">
              <i class="fa fa-cc-visa" style="color:navy;"></i>
              <i class="fa fa-cc-amex" style="color:blue;"></i>
              <i class="fa fa-cc-mastercard" style="color:red;"></i>
              <i class="fa fa-cc-discover" style="color:orange;"></i>
             </div>
            <label for="bname">Bank Name</label>
            <input type="text" id="bname" name="bankname" placeholder="Bank of Ceylon">
            <label for="cname">Name of the Card holder</label>
            <input type="text" id="cname" name="cardname" placeholder="W.M.L.L.Fernando">
            <label for="ccnum">Credit card number</label>
            <input type="text" id="ccnum" name="cardnumber" placeholder="1111-2222-3333-4444">
            <label for="expmonth">Exp Month</label>
            <input type="text" id="expmonth" name="expmonth" placeholder="September">
            <label for="expyear">Exp Year</label>
            <input type="text" id="expyear" name="expyear" placeholder="2018">
            <label for="cvv">CVV</label>
            <input type="text" id="cvv" name="cvv" placeholder="352">
            
            <label>
            <input type="checkbox" checked="checked" name="sameadr"> Shipping address same as billing
            </label>
            <input type="submit" value="Continue to checkout" class="btn">
            </form>
            
       </div>
       </div>
           </div>
	
</body>
</html>