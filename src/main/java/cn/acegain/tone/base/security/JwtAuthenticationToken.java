package cn.acegain.tone.base.security;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.util.Assert;

import java.util.Collection;

@Slf4j
public class JwtAuthenticationToken extends AbstractAuthenticationToken {

    @Getter
    private String token;

    public JwtAuthenticationToken(String token, Collection<? extends GrantedAuthority> authorities) {
        super(authorities);
        Assert.notNull(token, "token cannot be null");
        this.token = token;
    }

    public static JwtAuthenticationToken unauthenticated(String token) {
        JwtAuthenticationToken authToken = new JwtAuthenticationToken(token, null);
        authToken.setAuthenticated(false);
        return authToken;
    }

    public static JwtAuthenticationToken authenticated(String token, Collection<? extends GrantedAuthority> authorities) {
        JwtAuthenticationToken authToken = new JwtAuthenticationToken(token, authorities);
        authToken.setAuthenticated(true);
        return authToken;
    }

    @Override
    public Object getCredentials() {
        return null;
    }

    @Override
    public Object getPrincipal() {
        return null;
    }

}
