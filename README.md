# Develop a payment application that allows users to place orders for items, define the quantity, unit price, and choose a payment method (GCash, Maya, ShopeePay). The application should calculate the total amount based on the order details and any applicable discounts offered by the chosen payment method, storing the result in the totalAmount attribute of the Order class.
Specific requirements:
PaymentApp class: This class serves as the entry point for the application. It demonstrates how to create an Order object, set its properties (item, quantity, unit price, and payment method), and calculate the total amount based on the chosen payment method.
The application should have an Order class that stores information about the ordered item, quantity, unit price, chosen payment method, and the calculated total amount (totalAmount).
The application should implement a PaymentMode interface that defines a method for calculating the discount offered by the payment method.
The application should have concrete implementations of PaymentMode for GCash, Maya, ShopeePay:
GCash: Does not offer any discount (discount rate = 0.0)
Maya: Offers a 5% discount (discount rate = 0.05)
ShopeePay: Offers a 10% discount
The application should allow users to set the payment method for an order and calculate the total amount, storing it in the totalAmount attribute.


Sample output:

Order item is keyboard.
Unit price is 300.0
Quantity is 10

Payment order details  if GCash
Discount rate is 0.0
Payment amount is 3000.0

Payment order details if Maya
Discount rate is 0.05
Payment amount is 2850.0

Payment order details if ShopeePay
Discount rate is 0.10
Payment amount is 2700.0
