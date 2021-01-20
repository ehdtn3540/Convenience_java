package com.list.test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


@WebServlet(name = "TestServlet", urlPatterns = { "/testservlet" })
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String spinner_str = request.getParameter("spinner_str");
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM CONPRODUCT WHERE PCATEGORY = ? ORDER BY PID DESC";
		List<ProductDTO> list = new ArrayList<>();

		Connection conn=null;
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		Boolean connect = false;
			
		try{
		    Class.forName(driver);
		    conn=DriverManager.getConnection(url,"edu","1234"); //자신의 아이디와 비밀번호
		    
		    pstmt = conn.prepareStatement(sql);
		    pstmt.setString(1,spinner_str);
		    rs = pstmt.executeQuery();
		    
		    while(rs.next()) {
		    	ProductDTO ob = new ProductDTO();
		    	
		    	ob.setPid(rs.getInt("Pid"));
		    	ob.setPname(rs.getString("Pname"));
		    	ob.setPprice(rs.getInt("Pprice"));
		    	ob.setPimage1(rs.getString("Pimage1"));
		    	ob.setPdetail(rs.getString("Pdetail"));
		    	ob.setPrdate(rs.getString("Prdate"));
		    	
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
		
		for (ProductDTO ob:list) {
			JSONObject pd = new JSONObject();
			pd.put("pid", ob.getPid());
			pd.put("pname", ob.getPname());
			pd.put("pprice", ob.getPprice());
			pd.put("pimage1", ob.getPimage1());
			pd.put("pdetail", ob.getPdetail());
			pd.put("prdate", ob.getPrdate());
			
			arr.add(pd);
		}
		
		response.setContentType("application/x-json; charset=UTF-8");
		response.getWriter().print(arr.toString());
	}

}
