package com.kodewala.interface5.clonable;

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException {
		Account obj = new Account("Sudarshan");
		System.out.println(obj.name);
		
		Account obj3 = (Account) obj.clone();
		System.out.println(obj3.name);
		
		System.out.println(obj.equals(obj3));
		

		
		/*
		 * 
		Runtime runtime = Runtime.getRuntime();

		//Heap Area
		long maxMemory = runtime.maxMemory();
		long totalMemory = runtime.totalMemory();
		long freeMemory = runtime.freeMemory();
		
		//Heap Memory
		System.out.println("Maximum Heap: " + maxMemory / (1024 * 1024) + " MB");
		System.out.println("Allocated Heap: " + totalMemory / (1024 * 1024) + " MB");
		System.out.println("Free Heap: " + freeMemory / (1024 * 1024) + " MB");
		
		*/
		
		
		obj3 = null;
		
		
		Object obj1 = new Object();

        Object obj2 = obj1;

        obj2 = null;
        
        /*
         * obj1 still references the object.
		    obj2 = null removes only the reference held by obj2.
		    The object is NOT eligible for GC because obj1 still references it.
         * */
		
	}

}
