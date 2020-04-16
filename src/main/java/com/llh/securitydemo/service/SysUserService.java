package com.llh.securitydemo.service;

import com.llh.securitydemo.dao.SysUserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * SysUserService
 * <p>
 * CreatedAt: 2020-04-16 21:52
 *
 * @author llh
 */
@Service("sysUserService")
public class SysUserService implements UserDetailsService {

    @Autowired
    private SysUserDAO userDAO;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return userDAO.findTopByUsername(s);
    }
}
