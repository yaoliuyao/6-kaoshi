package org.nf.sms.action;

import org.nf.sms.dao.StudentDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/del")
public class DeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String no = req.getParameter("no");
        try {
            int r = new StudentDao().del(no);
            resp.sendRedirect(req.getContextPath() + "/list");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
