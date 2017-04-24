package dao;

import java.util.List;

import entity.Student;

public interface StudentDao {
    public void InsertStudent(Student student);//���
    public boolean DeleteById(Integer id);//��IDɾ��
    public boolean UpdateStudent(String name,Student student);//�������޸�
    public Student QueryById(Integer id);//��ID��ѯ
    public Student QueryByName(String name);//��������ѯ
    public List QueryAll();//��ѯȫ��
}
