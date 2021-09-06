public class Professor extends Member{

	Professor(String name, int age, int id, String degree) {
		super(name, age, id);
		this.degree = degree;
	}

	private String degree;
}
