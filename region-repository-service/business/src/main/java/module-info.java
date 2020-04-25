module regionrepositoryservice.business {
	requires spring.beans;
	requires spring.boot;
	requires spring.boot.autoconfigure;
	requires spring.context;
	requires spring.core;
	requires spring.web;
	
	requires org.hibernate.orm.core;
	requires java.instrument;
	requires java.sql;
	requires java.persistence;

	opens com.astl.esk.ms.regionrepositoryservice;
	opens com.astl.esk.ms.regionrepositoryservice.entity;
}