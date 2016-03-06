package mum.edu.cs.util.Intercept;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.List;

/**
 * Created by su on 3/6/16.
 */
public class AuthIntercept extends HandlerInterceptorAdapter {

    private List<String> exceptUri =Arrays.asList("/login");


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {

        String uri = request.getRequestURI();

        if( uri.startsWith("/resources") || exceptUri.contains(uri)){
            return  true;
        }

        HttpSession session = request.getSession();
        String uid = (String) session.getAttribute("uid");
        if(uid == null || uid.length() == 0){
            response.sendRedirect("/login");
            return false;
        }

        return true;
    }
}
