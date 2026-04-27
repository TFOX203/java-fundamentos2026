package reflection;

import oopmodeling.addressbook.AddressBook;

public class ReflectionTest {

	public static void main(String[] args) throws ClassNotFoundException {
		// to load
		Class<AddressBook> cls = AddressBook.class;
		Class<AddressBook> cls2 = (Class<AddressBook>) new AddressBook().getClass();
		Class<?> cls3 = Class.forName("oopmodeling.addressbook.AddressBook");
	}
}
