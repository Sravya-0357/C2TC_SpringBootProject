package com.springdemo.springboot_sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Customer {
private int cid;
private String name;
@Autowired
@Qualifier("grocery")
private Ordering ordering;

public void order()
{
	ordering.order();
}
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
