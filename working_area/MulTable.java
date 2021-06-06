package working_area;
public class MulTable{
    public static void main(String[] args){
        //开始；start
        for(var i=1;i<=9;i++){
            for(var j=1;j<=i;j++){
                if(j>1){System.out.print(",");}
                System.out.print(i+"*"+j+"="+i*j);
            }
            System.out.print("\n");
        }
    }
}