package com.gentech.program;

public class TrafficSignal {

	public static void main(String[] args) {
		String signal=args[0];
		switch(signal)
		{
		case "Red":
		      System.out.println("Stop the Vehical");
		      break;
		  
		case "Yellow":
			  System.out.println("Get ready to Go");
			  break;
			  
		case "Green":
			  System.out.println("Lets Go");
			  break;
			  
	    default:
				System.out.println("invalid");
		}
			
		}
		
		   
	}
	


