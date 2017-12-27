# Micro-Service-Architecture
micro service architecture

This is a demostration of micro-service-architecture based on Spring Cloud


	1 cloud-config-server
	
	This application provides the function of config-center, you can use a git repository or svn as the configuration center, which
	other clients fetch configuration from the config server.

	2 cloud-eureka-server
	Eureka, which belongs to Netflix, is the default choise for service registry center
	
	3 cloud-product-service
	This application provides product related restful services, which can be used by other service
	
	4 cloud-order-service
	This application provides order related restful services, and depends on product service
	
	5 cloud-zuul-server
	Zuul, belongs to Netflix too, is a reverse-proxy server, acts like nginx or apache server, 
	
	
	
Demo:
	
	http://localhost:8088/orderService/order/1    returns a json value.
	

