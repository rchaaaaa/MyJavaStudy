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
		if(name.equals("����"))
			System.out.println("������");
		else if (name.equals("���"))
			System.out.println("�����");
		else if(name.equals("����ƽ"))
			System.out.println("����");
	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}
