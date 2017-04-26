package com.teja.lambda;

public class ThisReferenceExample {

	public void execute(){
		doProcess(10, i ->{
			System.out.println("The value of I is : "+i);
			System.out.println(this);
		});
	}
	
	public static void main(String[] args) {
		ThisReferenceExample thisRef  = new ThisReferenceExample();
		thisRef.execute();
		
		thisRef.doProcess(20, new Process(){

			@Override
			public void process(int i) {
				System.out.println("The value of I is : "+i);
				System.out.println(this);
			}
			
			public String toString(){
				return "This is the this reference of Annonymus Inner class";
			}
		});
		
	}

	public void doProcess(int i, Process p){
		p.process(i);
	}
	
	public String toString(){
		return "This is the this reference of ThisReferenceExample";
	}
}
