package algo;


public class Person {
    String name;
    int age;
    
    
    
    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    @Override
    public boolean equals(Object obj) {
        if ((obj instanceof Person) == false) return false;
        Person p = (Person)obj;
        return (this.name == null ? p.name == null : this.name.equals(p.name)) && this.age == p.age;
    }

    
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
    
    
    
    @Override
    public String toString() {
        return String.format("Person{name=\"%s\", age=%d}", name, age);
    }
}

