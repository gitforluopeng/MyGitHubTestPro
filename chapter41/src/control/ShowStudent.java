package control;

import service.CrudStudent;
import service.imp.CrudStudentImp;

import com.opensymphony.xwork2.ActionSupport;

import entity.Student;

public class ShowStudent extends ActionSupport{
	private int id=0;
	private String name;
	private String sex;
	private int age;
	private String grade;
    private float score;
    private CrudStudent mycrud=new CrudStudentImp();//通过接口的引用接收Service对象
    Student student=null;
    
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
    	student=mycrud.QueryById(getId());
    	if(student!=null){
    	   setId(student.getId());
 		   setName(student.getName());
 		   setSex(student.getSex());
 		   setAge(student.getAge());
 		   setGrade(student.getGrade());
 		   setScore(student.getScore().floatValue());
 		   return "success";
    	}
    		
    	
    	else return "error";
    }
}
