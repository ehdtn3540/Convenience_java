package com.border;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

@WebServlet("/Border")
public class BorderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM CONBORDER ORDER BY BIDX DESC";
		List<BorderDTO> list = new ArrayList<>();

		Connection conn=null;
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		Boolean connect = false;
			
		try{
		    Class.forName(driver);
		    conn=DriverManager.getConnection(url,"edu","1234"); //자신의 아이디와 비밀번호
		    
		    pstmt = conn.prepareStatement(sql);
//		    pstmt.setString(1,spinner_str);
		    rs = pstmt.executeQuery();
		    
		    while(rs.next()) {
		    	BorderDTO ob = new BorderDTO();
		    	
		    	ob.setMidx(rs.getInt("Midx"));
		    	ob.setBidx(rs.getInt("Bidx"));
		    	ob.setBtitle(rs.getString("Btitle"));
		    	ob.setBcontext(rs.getString("Bcontext"));
		    	ob.setBdate(rs.getString("Bdate"));
		    	
		    	list.add(ob);
		    }
		    
		    connect = true;
		    conn.close();
		}catch(Exception e){
		    connect = false;
		    e.printStackTrace();
		}
		
		//제이슨에 넣어주기
		JSONArray arr = new JSONArray();
		
		for (BorderDTO ob:list) {
			JSONObject pd = new JSONObject();
			pd.put("midx", ob.getMidx());
			pd.put("bidx", ob.getBidx());
			pd.put("btitle", ob.getBtitle());
			pd.put("bcontext", ob.getBcontext());
			pd.put("bdate", ob.getBdate());
			
			arr.add(pd);
		}
		
		response.setContentType("application/x-json; charset=UTF-8");
		response.getWriter().print(arr.toString());
	}

}
