public class School {
	public static void main(String[] args) {
		Member[] members = new Member[3];

		members[0] = new Student("Pepino", 56, 990);
		members[1] = new Student("Barbara", 16, 120);
		members[2] = new Professor("Fonchirulo", 99, 12400, "Master Business");
    
		/* use methods inherited from Person and Member*/
		for(Member s: members) {
			System.out.println("School member:");
			System.out.println("name:    " + s.getName());
			System.out.println("age:     " + s.getAge());
			System.out.println("id       " + s.getId());
			System.out.println("-----------------");

		}
	}
}
