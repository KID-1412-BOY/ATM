public class JavaText {
    public  String getName(){
        return null;
    }
    public static void main(String[] args){
//        KotlinClass kc=new KotlinClass("Jack");
//        kc.show();
//        Test T=new Test("Tom");
//        T.getMenue();
        loadData(new HttpReqClass());

    }
    public static void loadData(HttpReq req){
        req.Success();
    }
    interface HttpReq {
        void Success();
    }

    public static class HttpReqClass implements HttpReq {

        @Override
        public void Success() {
            System.out.println("下载成功");
        }
    }
}


