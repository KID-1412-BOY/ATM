fun main(){
   val java=JavaText()
    val name:String ?=java.name
    print(name?.length)

}

class KotlinClass(val name:String){
    fun show(){
        println("name is $name")
    }
}
class Test(val name:String){
    fun getMenue(){
        print("I am $name")
    }
}