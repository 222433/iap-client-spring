package iap.iap;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.core.oidc.user.DefaultOidcUser;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/user")
public class UsersController {

    @GetMapping(path = "email")
    public String getName() {
        DefaultOidcUser principal = (DefaultOidcUser) SecurityContextHolder.getContext().getAuthentication()
                .getPrincipal();
        return principal.getEmail();
    }

    @GetMapping(path = "picture")
    public String getPhoto() {
        DefaultOidcUser principal = (DefaultOidcUser) SecurityContextHolder.getContext().getAuthentication()
                .getPrincipal();
        return principal.getPicture();
    }
}
