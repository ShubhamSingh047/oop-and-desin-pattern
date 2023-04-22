package com.oops.abstract_class;

public abstract class Department {
	public abstract int getEmployee();
	
	public abstract void method();
	
}

class DeptOne extends Department{

	@Override
	public int getEmployee() {
		// TODO Auto-generated method stub
		return 100;
	}

	@Override
	public void method() {
		// TODO Auto-generated method stub
		System.out.print("This is implemented class");
	}
	
}
