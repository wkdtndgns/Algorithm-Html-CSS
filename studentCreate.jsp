<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import=" java.util.*, jdbc01.*" %>
<%
    String error = null;
	List<Department> list = DepartmentDAO.findAll(); 
    if (request.getMethod().equals("POST")) {
        request.setCharacterEncoding("UTF-8");
        String studentNumber = request.getParameter("studentNumber");
        String name = request.getParameter("name");
        String s1 = request.getParameter("departmentId");
        int departmentId = Integer.parseInt(s1);
        String s2 = request.getParameter("year");
        int year = Integer.parseInt(s2);
        
        if (studentNumber == null || studentNumber.isEmpty()){
	       	error = "학번을 입력하세요.";
        }
        else if (name == null || name.length() == 0){
			error = "이름을 입력하세요";
        }
        else if (year <=0 || year >= 5){
			error = "학년을 확인하세요. 학년 범위는 1~4.";
        }
		else {
			StudentDAO.insert(studentNumber, name, departmentId, year);
			response.sendRedirect("studentList1.jsp");
			return;
		}
    }
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>lecture1</title>
<link href="http://maxcdn.bootstrapcdn.com/bootstrap/2.3.2/css/bootstrap.min.css" rel="stylesheet" media="screen">
<style>
    form > div { margin-top: 20px; }
</style>
</head>

<body>

<div class="container">

<h1>학생 생성</h1>
<hr />

<form method="post">
    <div>학번</div>
    <input type="text" name="studentNumber" />

    <div>이름</div>
    <input type="text" name="name" />

    <div>학과</div>
    <select name="departmentId">
        <% for (Department department : list) { %>
            <option value="<%= department.getId() %>">
                <%= department.getDepartmentName() %>
            </option>
        <% } %>
    </select>

    <div>학년</div>
    <input type="text" name="year" value="0"/>

    <hr />
    
    <div>
        <button type="submit" class="btn btn-primary">
            <i class="icon-hdd icon-white"></i> 저장
        </button>
        <a href="studentList1.jsp" class="btn">
            <i class="icon-list"></i> 목록으로
        </a>
    </div>
</form>

<% if (error != null) { %>
    <div class="alert alert-error"><%= error %></div>
<% } %>

</div>
</body>
</html>
