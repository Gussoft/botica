package com.gussoft.botica.core.models.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Table(name = " users", schema = "farmacia")
@Getter
@Setter
@AllArgsConstructor
public class User implements UserDetails {

  @Id
  private Long idUser;
  private Long idEmployee;
  private String roles;
  private String name;
  private String password;
  private String status;

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    List<SimpleGrantedAuthority> grantedAuthoritiesRoles = new ArrayList<>();
    grantedAuthoritiesRoles.add(new SimpleGrantedAuthority(this.roles));
    return grantedAuthoritiesRoles;
  }

  @JsonIgnore
  @Override
  public String getPassword() {
    return password;
  }

  @Override
  public String getUsername() {
    return name;
  }

  @Override
  public boolean isAccountNonExpired() {
    return true;
  }

  @Override
  public boolean isAccountNonLocked() {
    return true;
  }

  @Override
  public boolean isCredentialsNonExpired() {
    return true;
  }

  @Override
  public boolean isEnabled() {
    return true;
  }
}
