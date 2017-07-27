package JDBC_1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class test2 {

	public static void main(String[] args) {
		/*List<student> students =getStudents();
		for (student s : students) {
			System.out.println(s);
		}*/
		student student=getStudent(10001);
		System.out.println(student);

	}
	//查询
	public static List<student> getStudents() {
		Connection conn=null;
		PreparedStatement ps= null;
		ResultSet rs=null;
		List<student> students=new ArrayList<student>();
		try {
			conn=utilClass.getConnection();
			String sql="select * from student";
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			while (rs.next()) {
				student student = new student();
				student.setStudentNo(rs.getInt("studentNo"));
				student.setLoginPwd(rs.getString("loginPwd"));
				student.setStudentName(rs.getString("StudentName"));
				student.setSex(rs.getString("sex"));
				student.setGradeId(rs.getInt("GradeId"));
				student.setPhone(rs.getString("phone"));
				student.setAddress(rs.getString("address"));
				student.setBornDate(rs.getDate("bornDate"));
				student.setEmail(rs.getString("email"));
				student.setIdentityCard(rs.getString("IdentityCard"));
				students.add(student);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			utilClass.close(conn, ps, rs);
		}
		return students;
	}
	//根据ID查询学员
	private static student getStudent(Integer studentNo) {
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			conn=utilClass.getConnection();
			String sql="select * from student where studentNo=?";
			ps=conn.prepareStatement(sql);
			ps.setInt(1, studentNo);
			rs=ps.executeQuery();
			if (rs.next()) {
				student student = new student();
				student.setStudentNo(rs.getInt("studentNo"));
				student.setLoginPwd(rs.getString("loginPwd"));
				student.setStudentName(rs.getString("StudentName"));
				student.setSex(rs.getString("sex"));
				student.setGradeId(rs.getInt("GradeId"));
				student.setPhone(rs.getString("phone"));
				student.setAddress(rs.getString("address"));
				student.setBornDate(rs.getDate("bornDate"));
				student.setEmail(rs.getString("email"));
				student.setIdentityCard(rs.getString("IdentityCard"));
				return student;
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			utilClass.close(conn, ps, rs);
		}
		return null;
	}
}
