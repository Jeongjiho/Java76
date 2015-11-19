package java76.pms.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java76.pms.ContextLoader;
import java76.pms.dao.StudentDao;

public class StudentDeleteServlet extends HttpServlet {  
  private static final long serialVersionUID = 1L;

  @Override
  public void doGet(
      HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    String email = request.getParameter("email");

    StudentDao studentDao = ContextLoader.context.getBean(StudentDao.class);
    studentDao.delete(email);
    response.sendRedirect("list");
  }
}