package javaDay2;

class Staff{
	String name;
	String ssn;
	String dept;
	int salary;
	Staff(String name,String ssn,String dept,int salary){
		this.dept=dept;
		this.name=name;
		this.salary=salary;
		this.ssn=ssn;
	}
	@Override
	public String toString() {
		return  name + "\n" + ssn + "\n" + dept + "\n" + salary + "\n";
	}
}
class StaffImplementation{	
	Staff getStaffInfo(String str) {
		int i = str.indexOf("@");
		String name = str.substring(0, i);
		int j = str.indexOf("-");
		String ssn = str.substring(i+1, j);
		int k = str.indexOf("#");
		String dept = str.substring(j+1,k);
		String sl = str.substring(k+1,str.length());
		int salary = Integer.parseInt(sl);
		Staff s= new Staff(name,ssn,dept,salary);
		return s;
 }
	String getStaffLevel(Staff s) {
		String sub = s.ssn.substring(s.ssn.length()-3,s.ssn.length());
		int ss = Integer.parseInt(sub);
		if(ss>0 && ss<=60) {
			return "L1";
		}
		else if(ss>60 && ss<=120) {
			return "L2";
			}
		else if(ss>120 && ss<=180) {
			return "L3";
		}
		else {
			return "L4";
		}
	}
	
}
public class Source {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaffImplementation si = new StaffImplementation();
			Staff s1 = si.getStaffInfo("Rishab@1PE16CS046-SDE#8");
			String level = si.getStaffLevel(s1);
			System.out.println(s1);
			System.out.println(level);
	}

}
