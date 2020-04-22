module regionrepositoryservice.business {
	requires spring.beans;
	requires spring.boot;
	requires spring.boot.autoconfigure;
	requires spring.context;
	requires spring.core;
	requires spring.web;
	
	requires java.instrument;
	
	opens com.astl.esk.ms.regionrepositoryservice.config;
}