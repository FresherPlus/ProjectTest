package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	
	@Value("#{11+22}")
	private int x;
	
	@Value("#{1+23-6+78}")
	private int y;
	
	//Calling static method T(classname).static_method()
	
	@Value("#{T(java.lang.Math).sqrt(25)}")
	private double z;
	
	//Calling ststic variable T(classname).staticvarivble
	@Value("#{ T(java.lang.Math).PI }")
	private double pi;
	
	//Calling with Object new Class(object)
	@Value("#{ new java.lang.String('Pramod Negi')}")
	
	private String name;
	
	@Value("#{9>6}")
	private boolean isActive;
	
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public double getPi() {
		return pi;
	}
	public void setPi(double pi) {
		this.pi = pi;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", pi=" + pi + ", name=" + name + ", isActive=" + isActive
				+ "]";
	}
	
	

	

}
