package chapter7;

public class ExceptionTest {
    public static void main(String[] args) {
        boolean flag = false;
        // while(flag){
        //     try{
        //         System.out.println("我觉得应该是进入死循环了");
        //         int[] arr = new int[3];
        //         arr[4] =2;
        //         System.out.println("应该是死循环");
        //         flag = false;
        //     }
        //     catch(Exception e){
        //         continue;
        //     }
        // }
        do{
            try{
            System.out.println("我觉得是死循环哦");
            int[] arr = new int[3];
            arr[4] =2;
            flag = false;
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                continue;
            }
        }while(flag);
    }
}
