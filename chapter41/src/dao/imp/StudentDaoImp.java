package dao.imp;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import dao.StudentDao;
import dao.factory.HibernateSessionFactory;
import entity.Student;

public class StudentDaoImp implements StudentDao{
    Session session=HibernateSessionFactory.getSession();
    Transaction tx=null;
	
	/**
	 * //按ID删除
	 * 1.QueryById()!=null
	 * 2.delete if 1.
	 */
	public boolean DeleteById(Integer id) {
		// TODO Auto-generated method stub
		if(QueryById(id)!=null){
			try {
				tx=session.beginTransaction();
				session.clear();
				session.delete(QueryById(id));
				tx.commit();
			} catch (HibernateException e) {
				// TODO Auto-generated catch block
				if(null!=tx){tx.rollback();}
				e.printStackTrace();
				throw new RuntimeException();
			}finally{
				session.close();
			}
			return true;
		}
		else 
			return false;
	}

	public void InsertStudent(Student student) {//添加
		// TODO Auto-generated method stub
		try{
		    tx=session.beginTransaction();
		    session.save(student);
		    tx.commit();
		}catch(Exception e){
			if(null!=tx){tx.rollback();}
			e.printStackTrace();
			throw new RuntimeException();
		}finally{
			session.close();
		}
	}

	public List QueryAll() {//查询全部
		// TODO Auto-generated method stub
		String hqlString="from Student";
		Query queryObj = session.createQuery(hqlString);
		return queryObj.list();
	}

	public Student QueryById(Integer id) {//按ID查询
		// TODO Auto-generated method stub
		
		try {
			Student student=(Student) session.get(Student.class, id);
			return student;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	public Student QueryByName(String name) {//按姓名查询
		// TODO Auto-generated method stub
		String HqlString=null;
		Student student=null;
		boolean bs=((name==null)||(name.equals("")));//bs為false日了狗了
		if(bs){
			return null;
		}
		else{
			try {
			HqlString="from Student where name like '%"+name+"%' order by id desc";
			Query queryObject=session.createQuery(HqlString);
			List lis = queryObject.list();
			Iterator iterator =  lis.iterator();
			while(iterator.hasNext()) {
				student=new Student();
				student=(Student)iterator.next();
			}
			return student;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}
		}
	}
    /**
     * //按姓名修改
     * 1.QueryByName()!=null
     * 2.update if 1.
     */
	public boolean UpdateStudent(String name, Student student) {
		// TODO Auto-generated method stub
		if(QueryByName(name)!=null){
			try {
				tx=session.beginTransaction();
				session.clear();
				session.update(student);
				tx.commit();
			} catch (HibernateException e) {
				// TODO Auto-generated catch block
				if(null!=tx){tx.rollback();}
				e.printStackTrace();
				throw new RuntimeException();
			}finally{
				session.close();
			}
			return true;
		}
		else 
			return false;
		
	}

}
