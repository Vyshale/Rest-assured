package pojo_package;

public class UserKeyCreationUsingCons {
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	private String name;
	private String job;
	
	public UserKeyCreationUsingCons(String name,String job)
	{
		super();
		this.name=name;
		this.job=job;
	}
	

}
