package profile.model

class Profile(val id: Int, val login:String, val name:String, val surname: String, val status:String, val avatar: String) {
    val fullname:String
        get() {
            return "id:$id\n login:$login\n name:$name\n surname:$surname\n status:$status  "
        }
}