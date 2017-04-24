package control;

import com.opensymphony.xwork2.ActionSupport;

import entity.Student;

import service.CrudStudent;
import service.imp.CrudStudentImp;

public class UpdateAction extends ActionSupport{
	private String uname="";
	private int id=0;
	private String name;
	private String sex;
	private int age;
	private String grade;
    private float score;
    private CrudStudent mycrud=new CrudStudentImp();//通过接口的引用接收Service对象
    Student student=null;
    
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public float getScore() {
		return score;
	}
	public void setScore(float score) {
		this.score = score;
	}
    @Override
    public String execute() throws Exception {
    	// TODO Auto-generated method stub
    	student=new Student();
    	student.setId(getId());
	    student.setName(getName());
	    student.setSex(getSex());
	    student.setAge(getAge());
	    student.setGrade(getGrade());
	    student.setScore(Double.parseDouble(String.valueOf(getScore())));
    	if(mycrud.UpdateStudent(getUname(), student))
    		return "success";
		else
			return "error";
    	
    }
}
