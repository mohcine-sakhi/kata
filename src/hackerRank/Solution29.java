package hackerRank;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

/*
	 JAVA reflection is a very powerful tool to inspect the attributes of a class in runtime. For example, we can retrieve the list of public fields of a class using getDeclaredMethods().
	
	In this problem, you will be given a class Solution in the editor. You have to fill in the incompleted lines so that it prints all the methods of another class called Student in alphabetical order. We will append your code with the Student class before running it. The Student class looks like this:
	
	class Student{
	    private String name;
	    private String id;
	    private String email;
	
	    public String getName() {
	        return name;
	    }
	    public void setId(String id) {
	        this.id = id;
	    }
	    public void setEmail(String email) {
	        this.email = email;
	    }
	    public void anothermethod(){  }
	    ......
	    ......
	    some more methods
	    ......
	}
	You have to print all the methods of the student class in alphabetical order like this:
	
	anothermethod
	getName
	setEmail
	setId
	......
	......
	some more methods
	......
	There is no sample input/output for this problem. If you press "Run Code", it will compile it, but it won't show any outputs.
	
	Hint: See the oracle docs for more details about JAVA Reflection Methods and Fields 
 
 */

public class Solution29 {

	public static void main(String[] args) {
		Class student = Student.class;
		Method[] methods = student.getDeclaredMethods();

		ArrayList<String> methodList = new ArrayList<>();
		for (Method method : methods) {
			methodList.add(method.getName());
		}
		Collections.sort(methodList);
		for (String name : methodList) {
			System.out.println(name);
		}
	}
}

/*
 * public class Solution29 {
 * 
 * public static void main(String[] args) { String nom = Paire.class.getName();
 * try { // On crée un objet Class Class cl = Class.forName(nom); // Nouvelle
 * instance de la classe Paire Object o =
 * cl.getDeclaredConstructor().newInstance();
 * 
 * // On crée les paramètres du constructeur Class[] types = new Class[] {
 * String.class, String.class }; // On récupère le constructeur avec les deux
 * paramètres Constructor ct = cl.getConstructor(types); // On instancie l'objet
 * avec le constructeur surchargé ! Object o2 = ct.newInstance(new String[] {
 * "valeur 1 ", "valeur 2" });
 * 
 * // On va chercher la méthode toString, elle n'a aucun paramètre Method m =
 * cl.getMethod("toString", null); // La méthode invoke exécute la méthode sur
 * l'objet passé en paramètre // Pas de paramètre, donc null en deuxième
 * paramètre de la méthode invoke !
 * 
 * System.out.println("----------------------------------------");
 * System.out.println("Méthode " + m.getName() + " sur o2: " + m.invoke(o2,
 * null)); System.out.println("Méthode " + m.getName() + " sur o: " +
 * m.invoke(o, null));
 * 
 * } catch (SecurityException e) { e.printStackTrace(); } catch
 * (IllegalArgumentException e) { e.printStackTrace(); } catch
 * (ClassNotFoundException e) { e.printStackTrace(); } catch
 * (InstantiationException e) { e.printStackTrace(); } catch
 * (IllegalAccessException e) { e.printStackTrace(); } catch
 * (NoSuchMethodException e) { e.printStackTrace(); } catch
 * (InvocationTargetException e) { e.printStackTrace(); } }
 * 
 * }
 * 
 * class Paire {
 * 
 * private String value1; private String value2;
 * 
 * public Paire() { super(); System.out.println("Instanciation !"); }
 * 
 * public Paire(String value1, String value2) { super(); this.value1 = value1;
 * this.value2 = value2; System.out.println("Instanciation avec des params!"); }
 * 
 * public String getValue1() { return value1; }
 * 
 * public void setValue1(String value1) { this.value1 = value1; }
 * 
 * public String getValue2() { return value2; }
 * 
 * public void setValue2(String value2) { this.value2 = value2; }
 * 
 * @Override public String toString() { return "Paire [value1=" + value1 +
 * ", value2=" + value2 + "]"; }
 * 
 * }
 */