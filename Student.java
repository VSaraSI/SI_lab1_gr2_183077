class Student {
	String index;
	String firstName;
	String lastName;
	int grades[]=new int [] {9,8,10,7,6,7,7,10,9,8,9}
	//TODO constructor
	public Student(String ind,String fn,String ln,int arr[]) {
		this.index=ind;
		this.firstName=fn;
		this.lastName=ln;
		this.grades=arr;
	}
	//TODO seters & getters
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getIndex() {
		return index;
	}
	public int[] getGrades() {
		return grades;
	}
	public void setFirstName(String n) {
		this.firstName=n;
	}
	public void setLastName(String l) {
		this.lastName=l;
	}
	public void setIndex(String ind) {
		this.index=ind;
	}
	public void setGrades(int[] gr) {
		this.grades=gr;
	}
	public double getAverage() {
		//TODO
		double br=0;
		for(int i=0;i<grades.length;i++)
			br+=grades[i];
		br=br/grades.length;
		return br;
	}

	public int ECTSCredits() {
		//TODO
		int krediti=0;
		krediti=grades.length*6;
		return krediti;
	}
}
class Faculty{
	String name;
	List<Student> lista=new ArrayList<>;
	
	public void dodavanjeStudent(Student s) {
		lista.add(s);
	}
	public void brisenje Student(Student t) {
		lista.remove(t);
	}
	public double prosekNaStudenti() {
		int k=0;
		double prosek=0;
		while(lista!=null) {
			for(int i=0;i<lista.getGrades();i++) {
			k+=lista.getGrades[i];
		}
			prosek+=k;
			k=0;
	}
		prosek=prosek/lista.size();
		return prosek;
}}