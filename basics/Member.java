public abstract class Member extends Person {
	Member(String name, int age, int id) {
		super(name, age);
		this.id = id;
	}

	public int getId() {
		return this.id;
	}

	protected int id;
}
