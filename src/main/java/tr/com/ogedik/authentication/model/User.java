/**
 * © 2020 Copyright Amadeus Unauthorised use and disclosure strictly forbidden.
 */
package tr.com.ogedik.authentication.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import tr.com.ogedik.commons.models.AbstractUser;

/**
 * @author orkun.gedik
 */
@Getter
@Setter
@Builder
public class User extends AbstractUser {

  private Long resourceId;
  @NotNull
  private String username;
  @NotNull
  @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
  private String password;

  private String team;

  private List<Group> groups;

  private String role;

  private LocalDateTime enrolmentDate;

  private LocalDateTime lastLogonDate;

  private MetaInformation metaInformation;

}