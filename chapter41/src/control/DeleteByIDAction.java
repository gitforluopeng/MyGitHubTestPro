package control;

import service.CrudStudent;
import service.imp.CrudStudentImp;

import com.opensymphony.xwork2.ActionSupport;

public class DeleteByIDAction extends ActionSupport{
	private int id=0;
	private CrudStudent mycrud=new CrudStudentImp();//ͨ���ӿڵ����ý���Service����

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
