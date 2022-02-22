//: annotations/database/Member.java
package annotations.database;

@DBTable(name = "MEMBER")

public class Member {
	@SQLString(30) String firstName;
	@SQLString(50) String lastName;
	@SQLInteger Integer age;
	@SQLString(value = 30,
			constraints = @Constraints(primaryKey = true))
			String handle;
	static int memberCount;
	public String getHandle() { return handle; }
	public String getFirstName() { return firstName; }
	public String getLastName() { return lastName; }
	public String toString() { return handle; }
	public Integer getAge() { return age; }
} ///:~

/* public class Memebers{
	 
	 String firstName;
	 String lastName;
	 Integer age;
	 String handle;
	 static int memberCount;
	 public String getfisrtName(){	return this.firstName;	}
	 public String getlastName(){	return this.lastName;	}
	 public String toString(){		return this.handle;		}
	 public Integer getAge(){		return this.age;		}
	 }
*/