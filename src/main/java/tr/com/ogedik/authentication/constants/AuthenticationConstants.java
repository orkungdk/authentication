/**
 * © 2020 Copyright Amadeus Unauthorised use and disclosure strictly forbidden.
 */
package tr.com.ogedik.authentication.constants;

import lombok.experimental.UtilityClass;

/**
 * @author orkun.gedik
 */
@UtilityClass
public class AuthenticationConstants {

  public static class Header {
    public static final String AUTH_TOKEN = "X-Auth-Token";
    public static final String AUTH_USER = "X-Auth-User";
    public static final String ANONYMOUS = "Anonymous";
  }

  public static class Paths {
    public static final String AUTHENTICATE = "/authenticate";
    public static final String USERS = "/users";
    public static final String GROUPS = "/groups";
    public static final String IDENTIFIER = "/{identifier}";
    public static final String PERMISSIONS = "/permissions";
  }

  public static class Entity {
    public static final String APPLICATION_USER = "APP_USER";
    public static final String APPLICATION_GROUP = "APP_GROUP";
  }

  public static class COLS {
    public static final String USERNAME = "username";
    public static final String PASSWORD = "password";
    public static final String EMAIL = "email" ;
    public static final String TEAM = "team";
    public static final String ENROLMENT_DATE = "enrolmentDate";
    public static final String LAST_LOGON_DATE = "lastLogonDate";
    public static final String NAME = "name";
    public static final String DESCRIPTION = "description";
    public static final String GROUPS = "groups";
    public static final String PERMISSIONS = "permissions";
    public static final String RESOURCE_ID = "resourceId";
    public static final String CREATED_AT = "createdAt";
    public static final String UPDATED_AT = "updatedAt";
    public static final String CREATED_BY = "createdBy";
    public static final String UPDATED_BY = "updatedBy";
  }
}
