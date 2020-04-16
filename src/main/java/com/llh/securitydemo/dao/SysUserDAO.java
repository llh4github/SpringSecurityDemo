package com.llh.securitydemo.dao;

import com.llh.securitydemo.model.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * SysUserDAO
 * <p>
 * CreatedAt: 2020-04-16 21:50
 *
 * @author llh
 */
public interface SysUserDAO extends JpaRepository<SysUser, Integer> {
    SysUser findTopByUsername(String username);
}
