package com.michael.cloud.mongodb.changelogs;

import com.github.mongobee.changeset.ChangeLog;
import com.github.mongobee.changeset.ChangeSet;
import com.michael.cloud.domain.AuthClientDetails;
import com.michael.cloud.domain.User;
import com.michael.cloud.enums.Authorities;

import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.HashSet;
import java.util.Set;

/**
 * insert some initial data in our Mongo database, it uses the Mongobee library which is a MongoDB data migration tool 
 * for Java, like Flyway or Liquibase for relational databases
 * @author Michael
 *
 */
@ChangeLog
public class InitialValuesChangeLog {

    @ChangeSet(order = "001", id = "insertBrowserClientDetails", author = "Marcus Hert Da Corégio")
    public void insertBrowserClientDetails(MongoTemplate mongoTemplate) {
        AuthClientDetails browserClientDetails = new AuthClientDetails();
        browserClientDetails.setClientId("browser");
        browserClientDetails.setClientSecret("$2a$10$fWNTd3H.u7G/aNROVQSifebOkZ2xzU5nUPOCI2Ld42M8E25/ljJqK");
        browserClientDetails.setScopes("ui");
        browserClientDetails.setGrantTypes("refresh_token,password");

        mongoTemplate.save(browserClientDetails);
    }

    @ChangeSet(order = "002", id = "insertUserToTestAuthentication", author = "Marcus Hert Da Corégio")
    public void insertUserToTestAuthentication(MongoTemplate mongoTemplate) {
        Set<Authorities> authorities = new HashSet<>();
        authorities.add(Authorities.ROLE_USER);

        User user = new User();
        user.setActivated(true);
        user.setAuthorities(authorities);
        user.setPassword("$2a$10$fWNTd3H.u7G/aNROVQSifebOkZ2xzU5nUPOCI2Ld42M8E25/ljJqK");
        user.setUsername("randomuser");

        mongoTemplate.save(user);
    }

    @ChangeSet(order = "003", id = "insertAccountServiceClientDetails", author = "Marcus Hert Da Corégio")
    public void insertAccountServiceClientDetails(MongoTemplate mongoTemplate) {
        AuthClientDetails accountServiceClientDetails = new AuthClientDetails();
        accountServiceClientDetails.setClientId("account-service");
        accountServiceClientDetails.setClientSecret("$2a$10$fWNTd3H.u7G/aNROVQSifebOkZ2xzU5nUPOCI2Ld42M8E25/ljJqK");
        accountServiceClientDetails.setScopes("server");
        accountServiceClientDetails.setGrantTypes("refresh_token,client_credentials");

        mongoTemplate.save(accountServiceClientDetails);
    }

}
