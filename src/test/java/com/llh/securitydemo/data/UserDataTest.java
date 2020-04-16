package com.llh.securitydemo.data;

import com.llh.securitydemo.dao.SysUserDAO;
import com.llh.securitydemo.model.SysUser;
import com.llh.securitydemo.service.SysUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * UserDataTest
 * <p>
 * CreatedAt: 2020-04-16 21:54
 *
 * @author llh
 */
@SpringBootTest
public class UserDataTest {


    @Autowired
    private SysUserDAO userDAO;
    @Autowired
    private SysUserService userService;

    @Autowired
    private PasswordEncoder passwordEncoder;


    @Test
    public void testAdd() {
        SysUser user = new SysUser();
        user.setUsername("Tom")
                .setPassword(passwordEncoder.encode("123"));
        userDAO.save(user);
    }
}
