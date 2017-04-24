package control;

import java.util.List;

import service.CrudStudent;
import service.imp.CrudStudentImp;

import com.opensymphony.xwork2.Action;

import entity.Student;

public class QueryAllAction implements Action {
	private List<Student> sjsp =null;
	private CrudStudent mycrud=new CrudStudentImp();//通过接口的引用接收Service对象
	
	public List<Student> getSjsp() {
		return sjsp;
	}

	public void setSjsp(List<Student> sjsp) {
		this.sjsp = sjsp;
	}

	public String execute() throws Exception {
		// TODO Auto-generated method stub
		List<Student> sn=mycrud.QueryAll();
		/*for (Student student : sn) {
			System.out.println(student.getId());
		}*/
		setSjsp(sn);
		return "success";
	}

}
