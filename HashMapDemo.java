import java.util.*;
public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Integer EmpCodeOne = new Integer(2);
			Integer EmpCodeTwo = new Integer(4);
			Integer EmpCodeThree = new Integer(5);
			Integer EmpCodeFour = new Integer(9);
			
			String EmpNameOne = new String("Sid");
			String EmpNameTwo = new String("Maya");
			String EmpNameThree = new String("Kushal");
			String EmpNameFour = new String("Rahul");
			
			HashMap<Integer,String> emp = new HashMap<Integer,String>();
			
			emp.put(EmpCodeOne, EmpNameOne);
			emp.put(EmpCodeTwo, EmpNameTwo);
			emp.put(EmpCodeThree, EmpNameThree);
			emp.put(EmpCodeFour, EmpNameFour);
			
			System.out.println(emp.get(EmpCodeOne)+ " \n" +emp.get(EmpCodeTwo) + " \n" + emp.get(EmpCodeThree)+ " \n"+ emp.get(EmpCodeFour));
	}
}
			
			