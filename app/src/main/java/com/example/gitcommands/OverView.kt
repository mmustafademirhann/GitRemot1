package com.example.gitcommands

fun main(){
    val name:String="mustfa"
    val age:Int=34
    val isMale:Boolean=true
    val firstLetterOfSurname:Char='D'
}
//calisma zamaninda primitive donuşur
//val immutable değil only readdir

class Engine(){
    fun start(){
        print("MOTOR BAŞLATILDI")
    }
}
//class box =Box()

class Box{
    var with:Int=20
    var height:Int=40
    var lenght:Int=50
    var usedSpace:Int=0

    val available :Int
        get(){
            return (with*height*lenght)-usedSpace
        }

}

class Car(){
    val engine:Engine=Engine()
    fun start(){
        engine.start()
    }


}