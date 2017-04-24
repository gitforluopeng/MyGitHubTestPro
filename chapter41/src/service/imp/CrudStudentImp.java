package service.imp;

import java.util.List;

import dao.StudentDao;
import dao.imp.StudentDaoImp;
import entity.Student;
import service.CrudStudent;

public class CrudStudentImp implements CrudStudent {
    private StudentDao studentdao=new StudentDaoImp();
	public boolean DeleteById(Integer id) {
		// TODO Auto-generated method stub
        return studentdao.DeleteById(id);
	}

	public void InsertStudent(Student student) {
		// TODO Auto-generated method stub
        studentdao.InsertStudent(student);
	}

	public List QueryAll() {
		// TODO Auto-generated method stub
        return studentdao.QueryAll();
	}

	public Student QueryById(Integer id) {
		// TODO Auto-generated method stub
        return studentdao.QueryById(id);
	}

	public Student QueryByName(String name) {
		// TODO Auto-generated method stub
        return studentdao.QueryByName(name);
	}

	public boolean UpdateStudent(String name, Student student) {
		// TODO Auto-generated method stub
        return studentdao.UpdateStudent(name, student);
	}

}
