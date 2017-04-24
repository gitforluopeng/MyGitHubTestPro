package control;

import service.CrudStudent;
import service.imp.CrudStudentImp;

import com.opensymphony.xwork2.ActionSupport;

import entity.Student;

public class InsertAction extends ActionSupport{
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
		if(getId()!=0){
		    student=new Student();
		    student.setId(getId());
		    student.setName(getName());
		    student.setSex(getSex());
		    student.setAge(getAge());
		    student.setGrade(getGrade());
		    student.setScore(Double.parseDouble(String.valueOf(getScore())));
		    mycrud.InsertStudent(student);
		    return "success";
		}
		else{
    	  return "error";
		}
    }
}
