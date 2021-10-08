package profile

import profile.model.Profile

fun main (){

    val user = Profile(1,"Дан","Даниил","Кузьмин","В активном поиске"," ")
    print(user.fullname)
}