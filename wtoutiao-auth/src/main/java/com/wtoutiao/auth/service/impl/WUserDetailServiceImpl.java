package com.wtoutiao.auth.service.impl;

import com.wtoutiao.auth.dto.AuthUser;
import com.wtoutiao.auth.service.WUserDetailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * @author wulijun
 * @date 2019/10/22 15:17
 */
@Slf4j
@Service
public class WUserDetailServiceImpl implements WUserDetailService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        AuthUser user = new AuthUser();
        user.setUsername(username);
        user.setPassword(this.passwordEncoder.encode("123456"));
        return new User(username, user.getPassword(), true,
                true, true,
                true, AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
    }
}
