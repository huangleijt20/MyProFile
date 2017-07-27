package JDBC_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class test1 {

	public static void main(String[] args) {
		/*List<student> students=getStu();
		for (student s : students) {
			System.out.println(s);
		}*/
		student s=new student();
		s.setStudentNo(30013);
		s.setStudentName("张大川");
		s.setSex("男");
		if(setDate(s)){
			System.out.println("插入数据成功！");
		}else {
			System.out.println("插入失败！");
		}
		
	}
	//查询方法
	public static List<student> getStu() {
		Connection conn=null;
		Statement stm=null;
		ResultSet rs=null;
		List<student> students=new ArrayList<student>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/jt20";
			String user="root";
			String password="";
			conn=DriverManager.getConnection(url, user, password);
			stm=conn.createStatement();
			rs=stm.executeQuery("select * from student");
			while (rs.next()) {
				student s=new student();
				s.setStudentNo(rs.getInt("studentNo"));
				s.setStudentName(rs.getString("StudentName"));
				s.setLoginPwd(rs.getString("loginPwd"));
				s.setSex(rs.getString("sex"));
				s.setGradeId(rs.getInt("gradeId"));
				s.setAddress(rs.getString("address"));
				s.setPhone(rs.getString("phone"));
				s.setBornDate(rs.getDate("bornDate"));
				s.setEmail(rs.getString("email"));
				s.setIdentityCard(rs.getString("identityCard"));
				students.add(s);
				
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			if (rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (stm!=null) {
				try {
					stm.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return students;
	}
	//插入方法
	public static boolean setDate(student s) {
		Connection conn=null;
		Statement stm=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/jt20?useUnicode=true&characterEncoding=utf-8";
			String user="root";
			String password="";
			conn=DriverManager.getConnection(url, user, password);
			stm=conn.createStatement();
			String sql="insert into student(studentNo,studentName,sex) value ("+s.getStudentNo()+",'"+s.getStudentName()+"','"+s.getSex()+"')";
			int num=stm.executeUpdate(sql);
			if (num>0) {
				return true;
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			if (stm!=null) {
				try {
					stm.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return false;
	}
}
