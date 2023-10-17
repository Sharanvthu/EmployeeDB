package employee_database;

public class Employee 
{
	private int Eid;
	private String Ename;
	private int Eage;
	private int Eranking;
	public Employee(int eid, String ename, int eage, int eranking) 
	{
		super();
		Eid = eid;
		Ename = ename;
		Eage = eage;
		Eranking = eranking;
	}
	
	@Override
	public String toString() 
	{
		return "Employee [Eid=" + Eid + ", Ename=" + Ename + ", Eage=" + Eage + ", Eranking=" + Eranking + "]"+"\n";
	}
	
	public int getEid() {
		return Eid;
	}
	
	public void setEid(int eid) {
		Eid = eid;
	}
	
	public String getEname() {
		return Ename;
	}
	
	public void setEname(String ename) {
		Ename = ename;
	}
	
	public int getEage() {
		return Eage;
	}
	
	public void setEage(int eage) {
		Eage = eage;
	}
	
	public int getEranking() {
		return Eranking;
	}
	
	public void setEranking(int eranking) {
		Eranking = eranking;
	}
	
	
	
	

}
