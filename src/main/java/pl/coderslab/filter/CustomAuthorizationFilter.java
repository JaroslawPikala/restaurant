package pl.coderslab.filter;

import org.springframework.web.filter.GenericFilterBean;
import pl.coderslab.admin.Admin;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(urlPatterns = {"/panel/*"})
public class CustomAuthorizationFilter extends GenericFilterBean {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpSession session = req.getSession();
        Admin admin = (Admin) session.getAttribute("adminSession");
        if (admin == null) {
            HttpServletResponse httpResponse = (HttpServletResponse) response;
            httpResponse.sendRedirect("/login");
            return;
        }else{
            chain.doFilter(request, response);
        }
    }
}
