package com.assignment3;

public class WrapperClassConvert {

	public static Object convertToWrapper(Object value)
	{
		if(value instanceof Integer)
		{
		   Integer in = (Integer)value;
		   System.out.println(in + " " + value.getClass().getName());
		}
		else if(value instanceof Character)
		{
			Character ch = (Character)value;
			System.out.println(ch + " " + value.getClass().getName());
		}
		else if(value instanceof Byte)
		{
			Byte b = (Byte)value;
			System.out.println(b + " " + value.getClass().getName());
		}
		else if(value instanceof Boolean)
		{
			Boolean bl = (Boolean)value;
			System.out.println(bl + " " + value.getClass().getName());
		}
		else if(value instanceof Float)
		{
			Float f = (Float)value;
			System.out.println(f + " " + value.getClass().getName());
		}
		else if(value instanceof Double)
		{
			Double d = (Double)value;
			System.out.println(d + " " + value.getClass().getName());
		}
		else if(value instanceof Short)
		{
			Short s = (Short)value;
			System.out.println(s + " " + value.getClass().getName());
		}
		else if(value instanceof Long)
		{
			Long l = (Long)value;
			System.out.println(l + " " + value.getClass().getName());
		}
		else if(value == null)
		{
			System.out.println("Give proper primitive as input");
		}
		
		return null;
		
	}
	
	public static void main(String[] args) {
		
		int i =10;
		convertToWrapper(i);
		char c = 'a';
		convertToWrapper(c);
		convertToWrapper(null);
		byte b = 20;
		convertToWrapper(b);
		long l = 30;
		convertToWrapper(l);
		short s = 5;
		convertToWrapper(s);
		float f = 50.0f;
		convertToWrapper(f);
		double d= 40.0d;
		convertToWrapper(d);
		boolean bl = true;
		convertToWrapper(bl);
		
		
	}
}
