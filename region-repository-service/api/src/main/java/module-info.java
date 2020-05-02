open module regionrepositoryservice.api {
	requires spring.beans;
	requires spring.boot;
	requires spring.boot.autoconfigure;
	requires java.instrument;
	requires java.sql;
	
	requires regionrepositoryservice.business;
	requires regionrepositoryservice.lib;
	requires spring.context;
	requires spring.data.commons;
	requires spring.data.jpa;
	requires spring.web;

}