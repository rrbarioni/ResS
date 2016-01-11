package steps

import user.AdminUser

import static cucumber.api.groovy.EN.*

/*
Controller

Given the system has an user with the email "johndoe@johndoe.com"
And I leave the new email blank
Then the new information is not stored in the system
*/

Given(~'^the system has an user with the email "([^"]*)"$'){ String oldEmail->
    AdminUserTestDataAndOperations.createUserByEmail(oldEmail)
    user = AdminUser.findByAdminEmail(oldEmail)
    assert user != null
}
When(~'^I leave the new email blank$'){ ->
    newEmail = null
    AdminUserTestDataAndOperations.editUser(null,user)
}
Then(~'^the new information is not stored in the system$'){ ->
    assert AdminUser.findByAdminEmail(newEmail) == null
}
