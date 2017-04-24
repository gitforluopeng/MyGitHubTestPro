package dao;

import java.util.List;

import entity.Student;

public interface StudentDao {
    public void InsertStudent(Student student);//添加
    public boolean DeleteById(Integer id);//按ID删除
    public boolean UpdateStudent(String name,Student student);//按姓名修改
    public Student QueryById(Integer id);//按ID查询
    public Student QueryByName(String name);//按姓名查询
    public List QueryAll();//查询全部
}
