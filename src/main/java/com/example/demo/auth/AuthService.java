package com.example.demo.auth;

import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AuthService implements UserDetailsService {
//    CURRENT LINE OF CODE USER_NOT_FOUND 23 MINUTES 19 SECONDS LINE 14
    private final EmployeeObject employeeObject;
    private final static String EMPLOYEE_NOT_FOUND_MSG = "Employee with email %s not found";

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return employeeObject.findByEmail(email)
                .orElseThrow(() ->
                        new UsernameNotFoundException(String.format(EMPLOYEE_NOT_FOUND_MSG, email)));
    }
}
