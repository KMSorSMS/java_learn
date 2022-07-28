public class Tag_continue {
    public static void main(String[] args) {
        // 外层循环
        outer: 
        for (var i = 0; i < 5; i++) {
            System.out.println("i的值为"+i);
            //内层循环
            for(var j = 0;j<5;j++){
                System.out.println("i的值为："+i+" j的值为："+j);
                if(j==1){
                    //忽略outer标签所指定的循环中本次循环剩下的语句
                   //continue outer;
                   //试一下return
                   return;
                }
            }
        }
    }
}