class UserService {
    fun registerUser(userName: String, email:String ): String {
        if(userName == "" || email ==""){
            return "Your user name or email is invalid"
        }

        return "$userName: $email"
    }
}