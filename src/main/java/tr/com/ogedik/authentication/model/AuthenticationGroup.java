/**
 * © 2020 Copyright Amadeus Unauthorised use and disclosure strictly forbidden.
 */
package tr.com.ogedik.authentication.model;

import java.util.List;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tr.com.ogedik.authentication.constants.Permission;
import tr.com.ogedik.commons.annotation.NotNull;
import tr.com.ogedik.commons.model.AbstractBo;

/**
 * @author orkun.gedik
 */
@Getter
@Setter
@NoArgsConstructor
public class AuthenticationGroup extends AbstractBo {

  private Long resourceId;

  @NotNull
  private String name;

  private String description;

  private List<Permission> permissions;

}
