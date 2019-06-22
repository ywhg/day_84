import java.io.File;

public class IoDemo2 {

    public static void main(String args[]){

        File f=new File("F:"+File.separator+"1809");
        fun(f);
    }

    public static void fun(File file){
        if (file.isDirectory()){
            for (File f:file.listFiles()) {
                fun(f);
            }

        }else{
              System.out.println(file.getAbsolutePath());
        }
    }
}
