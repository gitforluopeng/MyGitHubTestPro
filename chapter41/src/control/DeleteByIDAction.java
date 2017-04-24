package control;

import service.CrudStudent;
import service.imp.CrudStudentImp;

import com.opensymphony.xwork2.ActionSupport;

public class DeleteByIDAction extends ActionSupport{
	private int id=0;
	private CrudStudent mycrud=new CrudStudentImp();//通过接口的引用接收Service对象

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		if(mycrud.DeleteById(id))
			return "success";
		else
			return "error";
	}
}
