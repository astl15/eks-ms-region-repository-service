module regionrepositoryservice.business {
	requires spring.beans;
	requires spring.context;
	requires spring.data.jpa;
	requires spring.data.commons;
	requires spring.tx;
	requires java.persistence;
	requires transitive regionrepositoryservice.lib;
	requires java.xml;
	requires spring.core;
	
	exports com.astl.esk.ms.regionrepositoryservice.business.dao to spring.beans;
	exports com.astl.esk.ms.regionrepositoryservice.business.entity to regionrepositoryservice.api;
	exports com.astl.esk.ms.regionrepositoryservice.business.manager to regionrepositoryservice.api;
	exports com.astl.esk.ms.regionrepositoryservice.business.mapper to regionrepositoryservice.api;
	
	opens com.astl.esk.ms.regionrepositoryservice.business.dao;
	opens com.astl.esk.ms.regionrepositoryservice.business.manager;
	opens com.astl.esk.ms.regionrepositoryservice.business.entity;
}