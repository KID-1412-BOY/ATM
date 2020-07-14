import java.util.*

var money=1000.00
var user: String? =null
var password: String? =null
var temppassword:String?=null
var tempu:String?=null
fun main(){

    welcome()
    Judge_Count()
    chose()



}
fun chose(){
    while (true){
        println("请选择下列操作：")
        println("1.查询余额")
        println("2.取钱")
        println("3.存钱")
        println("4.修改账户密码")
        println("5.退出")
        chose_list()
    }


}
fun chose_list(){
    print("\n操作选项：")
    val choice= readLine()
    when(choice){
        "1"-> balance()
        "2"-> withdraw()
        "3"->deposit()
        "4"->changPassword()
        "5"->Exit()
        else-> print("操作错误，请重新操作")
    }
}

fun balance(){
    println("您当前的余额为：$money 元\n")
}
fun withdraw(){
    println("请输入取钱金额:")
    val scanner = Scanner(System.`in`)
    val temp=scanner.nextDouble()
    if (temp>money){
        println("金额超出存款，无法取出！\n")
    }
    else{
        money-=temp
        println("取款成功\n")
    }
}
fun deposit(){
    print("请将钞票放入验钞口，您的存款金额为：")
    val scanner = Scanner(System.`in`)
    val temp=scanner.nextDouble()
    money+=temp
    println("存款成功！\n")
}
fun changPassword(){
    var temp:String?
    var tempp:String?
    while (true){
        println("请输入原始密码：")
        temppassword = readLine()
        println("请输入新密码：")
        tempp= readLine()
        println("请再次确认密码：")
        temp= readLine()
        if (temppassword.equals(password) and temp.equals(tempp)){
            println("密码修改成功！\n")
            password=temp
            return
        }
        if (temppassword != password){
            println("原始密码输入错误，请重新输入")
        }
        else if (tempp != temp ){
            println("两次密码前后不一致，请重新输入")
        }
        else if (temp==null)
            println("密码为空，请重新设置！")
        print("是否继续修改：Y/N")
        val chice= readLine()
        if (chice=="N")return
    }

}
fun Exit(){
    println("确认退出 Y/N ?")
    val choice= readLine()
    if (choice=="Y") exit()
}
fun welcome(){
    println("欢迎来到XX银行，自动提款机为您服务")
}
fun Judge_Count(){
    println("请输入用户名：")
    tempu= readLine()
    println("请输入密码：")
    temppassword = readLine()
    if (password.equals(null) or user.equals(null)) {
        register()
        tempu=null
        temppassword=null
        return
    }
    else
        login()
}

fun login(){
    for (i in 1..3){
        if (tempu.equals(user) and temppassword.equals(password)){
            println("登陆成功！\n")
            tempu=null
            temppassword=null
            return
        }else{
            if (i==3){
                println("账户输入错误到达三次，账户已被锁定！")
                exit()
            }else{
                println("密码或账户输入错误，请重新输入")
                println("请输入用户名：")
                tempu= readLine()
                println("请输入密码：")
                temppassword = readLine()
            }
        }
    }



}
fun register(){
    println("初次登陆，需要设置密码")
    print("请确认密码：")
    var tempp: String? = readLine()
    var times=0
    while(true){
       if (tempp.equals(temppassword) and !tempu.equals(null)){
           password=tempp
           user=tempu
           return
       }else
           times+=1
           if(times<3){
               val rest=3-times
               println("前后密码不一致，请重新确认密码（您还有 $rest 次机会）：")
               tempp= readLine()
           }else{
               println("密码设置失败，请重新登录！！！")
               exit()
           }
    }


}
fun exit(){
    println("感谢您的使用！")
    System.exit(0)
}