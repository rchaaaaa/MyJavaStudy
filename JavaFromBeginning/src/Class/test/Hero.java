package Class.test;

public class Hero {
	private long ID;

	private int level;

	private String name;

	private long exp;

	private String job;

	public Hero(long iD, int level, String name, long exp, String job) {
		super();
		ID = iD;
		this.level = level;
		this.name = name;
		this.exp = exp;
		this.job = job;
	}

	public Hero() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getExp() {
		return exp;
	}

	public void setExp(long exp) {
		this.exp = exp;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
}
