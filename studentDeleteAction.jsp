<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> 

<%@ page import="jdbc01.*" %> 
<% String s = request.getParameter("id"); 
int id = Integer.parseInt(s); 
StudentDAO.delete(id); 
response.sendRedirect("studentList1.jsp"); 
%>