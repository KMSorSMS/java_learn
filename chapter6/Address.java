package chapter6;

public class Address {
    private final String detail;
    private final String postCode;
    //在构造器中初始化这两个实例变量
    public Address(String detail,String postCode){
        this.detail = detail;
        this.postCode = postCode;
    } 
    //仅为两个实例变量提供getter方法
    public String getDetail(){
        return this.detail;
    }
    public String getPostCode(){
        return this.postCode;
    }
    //重写equals方法
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj!=null&&obj.getClass() == Address.class)
        {
            var ad = (Address) obj;
            //当detail和postCode相等时，可以认为两个Address相等
            if(this.detail.equals(ad.getDetail())&&this.postCode.equals(ad.getDetail())){
                return true;
            }
        }
        return false;
    }
    public int hashCode(){
        return detail.hashCode() + postCode.hashCode() * 31;
    }
}
