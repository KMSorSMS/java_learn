package chapter6;

public class CacheImmutable {
    private static int MAX_SIZE = 10;
    //使用数组来缓存已有的实例
    private static CacheImmutable[] cache = new CacheImmutable[MAX_SIZE];
    //记录缓存实例在缓存中的位置，cache[pos-1]是最新的缓存的实例
    private static int pos = 0;
    private final String name;
    private CacheImmutable(String name){
        this.name = name;
    }
    public String getname(){
        return name;
    }
    public static CacheImmutable valueof(String name){
        for (var i = 0;i<MAX_SIZE;i++){
            //如果已经有相同的实例，则直接返回该缓存的实例
            if(cache[i] != null && cache[i].getname().equals(name)){
                return cache[i];
            }
        }
        //如果缓存池已满
        if(pos == MAX_SIZE){
            //叭缓存的第一个对象覆盖，即把刚刚生成的对象放在缓冲池的最开始位置；
            cache[0] = new CacheImmutable(name);
            //把pos设为1
            pos = 1;
        }
        else{
            //把新建的对象缓存起来，pos +1
            cache[pos++] = new CacheImmutable(name);
        }
        return cache[pos-1];
    }
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj!= null&&obj.getClass()==CacheImmutable.class){
            var ci = (CacheImmutable) obj;
            return name.equals(ci.getname());
        }
        return false;
    }
    public int hashCode(){
        return name.hashCode();
    }
}
