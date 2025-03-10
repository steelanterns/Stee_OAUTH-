package stee.security.fortify.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@Entity
@Table(name = "AUTHORIZATION")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Authorization {
    @Id
    @Column
    private String id;
    private String registeredClientId;
    private String principalName;
    private String authorizationGrantType;
    @Column(length = 1000)
    private String authorizedScopes;
    @Lob
    @Column(length = 4000)
    private String attributes;
    @Column(length = 500)
    private String state;
    @Lob
    @Column(length = 4000)
    private String authorizationCodeValue;
    private Instant authorizationCodeIssuedAt;
    private Instant authorizationCodeExpiresAt;
    private String authorizationCodeMetadata;
    @Lob
    @Column(length = 4000)
    private String accessTokenValue;
    private Instant accessTokenIssuedAt;
    private Instant accessTokenExpiresAt;
    @Lob
    @Column(length = 2000)
    private String accessTokenMetadata;
    private String accessTokenType;
    @Column(length = 1000)
    private String accessTokenScopes;
    @Lob
    @Column(length = 4000)
    private String refreshTokenValue;
    private Instant refreshTokenIssuedAt;
    private Instant refreshTokenExpiresAt;
    @Lob
    @Column(length = 2000)
    private String refreshTokenMetadata;
    @Lob
    @Column(length = 4000)
    private String oidcIdTokenValue;
    private Instant oidcIdTokenIssuedAt;
    private Instant oidcIdTokenExpiresAt;
    @Lob
    @Column(length = 2000)
    private String oidcIdTokenMetadata;
    @Lob
    @Column(length = 2000)
    private String oidcIdTokenClaims;
}
