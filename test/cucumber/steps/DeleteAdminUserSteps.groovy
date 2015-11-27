package steps

import user.AdminUser

import static cucumber.api.groovy.EN.*

/*
Given the system has a user with login "admin"
When I ask the system to delete it
Then the user "admin" should not be stored anymore
 */

Given(~'^the system has a user with login "([^"]*)"$') { String login ->
    AdminUserTestDataAndOperations.createUser(login)
    userLogin = login
    user = AdminUser.findByAdminLogin(login)
    assert user != null
}
When(~'^I ask the system to delete it$') { ->
    AdminUserTestDataAndOperations.deleteUser(user)
}
Then(~'^the user "([^"]*)" should not be stored anymore$') { String login ->
    user = AdminUser.findByAdminLogin(login)
    assert user == null
}