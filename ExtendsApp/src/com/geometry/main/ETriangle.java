package com.geometry.main;

public class ETriangle extends Geometry{
	private float base; 
	private float h; 
	
	public ETriangle(float base) { 
		super(3);
		this.base=base; 
		this.h = (float) (Math.sqrt(3)*base/2);  
	}
	
	@Override
	public float computeArea(){
		return base*h/2; 
	}

	@Override
	public float computePerimeter() {
		return base*3; 
	}

}
