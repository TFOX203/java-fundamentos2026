package reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

import datastructure.FlexibleArray;
import oopmodeling.addressbook.AddressBook;
import oopmodeling.addressbook.Contact;

public class ReflectionTest {

	public static void main(String[] args) throws ClassNotFoundException {
		// to load
		Class<AddressBook> cls1 = AddressBook.class;
		Class<AddressBook> cls2 = (Class<AddressBook>) new AddressBook().getClass();
		Class<?> cls3 = Class.forName("oopmodeling.addressbook.AddressBook");
		
		inspectClass(cls1);
		
		AddressBook addressBook = new AddressBook();
		manipulateObject(addressBook);
		
		invokeMehodOfAnObject(addressBook);
		
		invokeMethodOfAnObject(cls3);
	}
	

	private static void invokeMethodOfAnObject(Class<?> cls) {
		try {
			cls.getConstructor().newInstance();
			
			Object obj = cls.getConstructor().newInstance();
			invokeMehodOfAnObject(obj);
			System.out.println(obj);
			
			System.out.println(cls.getConstructor().newInstance());
			System.out.println(cls.getConstructor().newInstance());
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	private static void invokeMehodOfAnObject(Object obj) {
		Class<?> cls = obj.getClass();
		try {
			Method method = cls.getDeclaredMethod("getContacts",String.class);
			method.invoke(obj, null);
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}


	private static void manipulateObject(AddressBook addressBook) {
		Class<?> cls = addressBook.getClass();
		Field[] fields = cls.getDeclaredFields();
		
		try {
			//potentially we may get an no such field exception
			//if we pass a field name that does not exist
			Field field = cls.getDeclaredField("contacts");
			System.out.println(addressBook.getContacts());
			//change the access modifier from private to public
			field.setAccessible(true);
			//read the value of a specified field
			field.set(addressBook,new FlexibleArray<Contact>());
			System.out.println(field.get(addressBook));
			System.out.println(field.get(addressBook));
			System.out.println(addressBook.getContacts());
			
			//modify the value of a field of the object
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	private static void inspectClass(Class<AddressBook> cls) {
		
		cls.getDeclaredConstructors();

		Method[] ms = cls.getDeclaredMethods();
		for(int i = 0; i < ms.length; i++) {

			System.out.print("method name is " + ms[i].getName());
			System.out.print(" | parameters: ");

			Parameter[] params = ms[i].getParameters();

			for(int j = 0; j < params.length; j++) {
				System.out.print(params[j].getType().getSimpleName() + " " + params[j].getName());

				if(j < params.length - 1) {
					System.out.print(", ");
				}
			}

			System.out.println();
		}

		for(Field field : cls.getDeclaredFields()) {
			System.out.println("field name is " + field.getName());
			System.out.println("field type is " + field.getType().getSimpleName());
		}
		
		for (Annotation annotation : cls.getAnnotations()) {
			System.out.println("annotation is " + annotation.annotationType().getSimpleName());
		}
	}
}