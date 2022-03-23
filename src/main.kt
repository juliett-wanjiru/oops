fun main(){
    var human= Human("jane",19,60)
    human.eat(6)
    println(human.weight)
    human.speak("walk the talk")
    human.birthday(20)
    println(human.age)
    var juliet= User("julie","jane","juliejane@gmail.com",7034,
        "jw897")
    println(juliet.firstName)
    println(juliet.email)



}

class Human(var name: String, var age: Int, var weight: Int) {
    fun eat(foodWeight: Int): Int {
        var foodWeight = 6
        println("i am eating ${foodWeight}kgs of food")

        weight += foodWeight
        return weight



    }
    fun speak(speech: String){
        println(speech)
    }
    fun birthday(increment: Int): Int{
        var increment= 0
        increment+=1
        return increment


    }


}
data class User(var firstName: String, var secondName: String, var email: String, var phoneNumber: Int,
                var password: String)


