package registerUser


import UserService
import kotlin.test.Test
import kotlin.test.assertEquals

 class UserServiceTest{
  private val userService = UserService()

  @Test fun validUserRegistration(){
   val userName = "LeBron James"
   val userEmail = "kingjames@test.com"

   assertEquals("$userName: $userEmail", userService.registerUser(userName, userEmail))
  }

  @Test fun invalidUserRegistration(){
   val userName = ""
   val userEmail = "kingjames@test.com"

   assertEquals("Your user name or email is invalid", userService.registerUser(userName, userEmail))
  }
 }