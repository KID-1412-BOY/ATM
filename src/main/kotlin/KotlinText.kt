fun main(){
   val java=JavaText()
    val name:String ?=java.name
    print(name?.length)
    val names="jack"
    val namexes="rose"
    print("my name is $name ")
    loadData(KotHttpreq())
    loadData(object :KotHtt{
        override fun success() {

        }
    })
    loadD {
        print("ndsjdnd")
    }

}

fun loadD(dd:(String)->Unit){

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

interface KotHtt{
    fun success();
}
class KotHttpreq: KotHtt {
    override fun success() {
        print("下载成功")
    }

}
fun loadData(kk:KotHtt){
    kk.success();
}