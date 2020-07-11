/**
 * © 2020 Copyright Amadeus Unauthorised use and disclosure strictly forbidden.
 */
package tr.com.ogedik.authentication.exception;

import lombok.Getter;
import tr.com.ogedik.commons.expection.constants.ErrorType;
/**
 * @author orkun.gedik
 */
@Getter
public enum AuthenticationErrorType implements ErrorType {

  AUTH_FAIL("Authentication failed.", 401),
  USER_DISABLED(AUTH_FAIL + "User has been disabled.", 401),
  INVALID_CREDENTIALS(AUTH_FAIL + "Invalid credentials.", 401),
  UNABLE_GET_TOKEN("Unable to get token.", 401),
  TOKEN_EXPIRED("Token has expired.", 401),
  UNAUTHORIZED("Unauthorized request.", 401),
  USER_NOT_FOUND("User record cannot be found.", 401),
  USER_EXIST("User is already exist.", 401),
  GROUP_NOT_FOUND("Group record cannot be found.", 401),
  GROUP_EXIST("Group is already exist.", 401);

  String title;
  int status;

  AuthenticationErrorType(String title, int status) {
    this.title = title;
    this.status = status;
  }
}
