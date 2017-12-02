package Package.renchao;

public class Role {
	public String name;
	
	public int level;
	
	private String job;
	
	public Role(){
		
	}
	
	public Role(String name,int level,String job){
		this.name=name;
		this.level=level;
		this.job=job;
	}
	public void sendSkill(){
		if(name.equals("劳拉"))
			System.out.println("劳拉的");
		else if (name.equals("悟空"))
			System.out.println("是悟空");
		else if(name.equals("侯亮平"))
			System.out.println("送礼");
	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}
