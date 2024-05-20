package iap.iap;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class UserDetailsManager {
    @Bean
    public InMemoryUserDetailsManager inMemoryUserDetailsManager() {
        UserDetails userDetails = new UserDetails() {

            @Override
            public Collection<? extends GrantedAuthority> getAuthorities() {
                // TODO Auto-generated method stub
                return new ArrayList<>();
            }

            @Override
            public String getPassword() {
                // TODO Auto-generated method stub
                return "pass";
            }

            @Override
            public String getUsername() {
                // TODO Auto-generated method stub
                return "username";
            }

            @Override
            public boolean isAccountNonExpired() {
                // TODO Auto-generated method stub
                return true;
            }

            @Override
            public boolean isAccountNonLocked() {
                // TODO Auto-generated method stub
                return true;
            }

            @Override
            public boolean isCredentialsNonExpired() {
                // TODO Auto-generated method stub
                return true;
            }

            @Override
            public boolean isEnabled() {
                // TODO Auto-generated method stub
                return true;
            }
        };
        InMemoryUserDetailsManager inMemoryUserDetailsManager = new InMemoryUserDetailsManager(userDetails);
        return inMemoryUserDetailsManager;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }

}
