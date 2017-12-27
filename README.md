# Micro-Service-Architecture

This is a demostration of micro-service-architecture based on Spring Cloud


1 cloud-config-server
	
This application provides the function of config-center, you can use a git repository or svn as the 
configuration center, which other clients fetch configuration from the config server.

2 cloud-eureka-server
Eureka, which belongs to Netflix, is the default choice for service registry center.
	
3 cloud-product-service
This application provides product related restful services.
	
4 cloud-order-service
This application provides order related restful services, and depends on product service. Use Feign Client to access to product service.
Ribbon is a client side load balancer, and Feign Client already uses Ribbon.

5 cloud-zuul-server
Zuul, belongs to Netflix too, is a reverse-proxy server, acts like nginx or apache server.
	
	
	
Demo:	
http://localhost:8088/orderService/order/1    returns desired json object.
	

