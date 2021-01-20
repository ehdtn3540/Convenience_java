package com.member;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM CONMEMBER WHERE mID = ? AND mPASS = ?";

		Connection conn=null;
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		Boolean connect = false;
			
		MemberDTO ob = new MemberDTO();
		int n = 0;
		try{
		    Class.forName(driver);
		    conn=DriverManager.getConnection(url,"edu","1234"); //자신의 아이디와 비밀번호
		    
		    pstmt = conn.prepareStatement(sql);
		    pstmt.setString(1, id);
		    pstmt.setString(2, pass);
		    rs = pstmt.executeQuery();
		    
		    if(rs.next()){
		    	// null 값이 아닌경우 이 부분에 while(rs.next()){} 또는 do{ }while(rs.next()){} 구문을 쓸수 있다.
//			    while(rs.next()) {
			    	ob.setMidx(rs.getInt("Midx"));
			    	ob.setMid(rs.getString("Mid"));
			    	ob.setMpass(rs.getString("Mpass"));
			    	ob.setMname(rs.getString("Mname"));
			    	ob.setMdate(rs.getString("Mdate"));		    	
//			    }
			    n = 1;
	    	 }else{ 
	    		// ResultSet값이 null인 경우 처리하고 싶은 코드를 작성하면 된다.
	    		n = 0;
	    	 }
		    
		    connect = true;
		    conn.close();
		}catch(Exception e){
		    connect = false;
		    e.printStackTrace();
		}
		
		if(n == 0) {
			response.setContentType("application/x-json; charset=UTF-8");
			response.getWriter().print("로그인실패");
		}else {
			//제이슨에 넣어주기
			JSONArray arr = new JSONArray();
			
			JSONObject member = new JSONObject();
			member.put("midx", ob.getMidx());
			member.put("mid", ob.getMid());
			member.put("mpass", ob.getMpass());
			member.put("mname", ob.getMname());
			member.put("mdate", ob.getMdate());
			
			arr.add(member);

			response.setContentType("application/x-json; charset=UTF-8");
			response.getWriter().print(arr.toString());
		}
		
	}

}
