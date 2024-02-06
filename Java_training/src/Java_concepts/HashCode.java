<<<<<<< HEAD
package Java_concepts;
import java.lang.reflect.Method;

public class HashCode {

	public void getSampleMethod() {}
	 
    // create main method
    public static void main(String args[])
    {
 
        try {
 
            // create class object for class name HashCode
            Class c = HashCode.class;
 
            // get Method object of method name getSampleMethod
            Method method = c.getDeclaredMethod("getSampleMethod", null);
 
            // get hashcode of method object using hashCode() method
            int hashCode = method.hashCode();
 
            // Print hashCode with method name
            System.out.println("hashCode of method " + method.getName()
                               + " is " + hashCode);
        }
        catch (Exception e) {
            // print if any exception occurs
            e.printStackTrace();
        }
    }
}
=======
package Java_concepts;
import java.lang.reflect.Method;

public class HashCode {

	public void getSampleMethod() {}
	 
    // create main method
    public static void main(String args[])
    {
 
        try {
 
            // create class object for class name HashCode
            Class c = HashCode.class;
 
            // get Method object of method name getSampleMethod
            Method method = c.getDeclaredMethod("getSampleMethod", null);
 
            // get hashcode of method object using hashCode() method
            int hashCode = method.hashCode();
 
            // Print hashCode with method name
            System.out.println("hashCode of method " + method.getName()
                               + " is " + hashCode);
        }
        catch (Exception e) {
            // print if any exception occurs
            e.printStackTrace();
        }
    }
}
>>>>>>> 993e728c6925ff6f35c145acc643240027a3c0d8
