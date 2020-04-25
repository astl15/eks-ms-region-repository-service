module regionrepositoryservice.business {
	requires spring.beans;
	requires spring.boot;
	requires spring.boot.autoconfigure;
	requires spring.context;
	requires spring.core;
	requires spring.web;
	requires spring.data.jpa;
	requires spring.data.commons;
	requires spring.tx;
	
	requires java.instrument;
	requires java.sql;
	requires java.persistence;
	
	requires org.hibernate.orm.core;

	requires regionrepositoryservice.lib;

	opens com.astl.esk.ms.regionrepositoryservice;
	opens com.astl.esk.ms.regionrepositoryservice.entity;
}