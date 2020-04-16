package com.llh.securitydemo.config;

import com.llh.securitydemo.model.SysUser;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * MyAuthSuccessHandler
 * <p>
 * CreatedAt: 2020-04-16 22:54
 *
 * @author llh
 */
@Component
public class MyAuthSuccessHandler implements AuthenticationSuccessHandler {
    @Override
    public void onAuthenticationSuccess(HttpServletRequest request,
                                        HttpServletResponse response,
                                        Authentication authentication) throws IOException, ServletException {
        SysUser details = (SysUser) authentication.getPrincipal();
        System.out.println(details.getUsername());
        response.sendRedirect("/home");
    }
}
