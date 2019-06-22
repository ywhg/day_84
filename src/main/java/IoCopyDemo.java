import java.io.*;

public class IoCopyDemo {

    public static  void  main(String args[]) throws IOException {
        //1.创建两个文件路径
        String file1="F:/1901/a.txt";
        String file2="F:/1901/b.txt";
        //2.1声明一个缓冲区输入流
        FileInputStream fis=new FileInputStream(file1);
        BufferedInputStream bis=new BufferedInputStream(fis);
        //2.2声明一个缓冲区输出流
        FileOutputStream fos=new FileOutputStream(file2);
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        //2.3 输入流读数据，输出流写数据
        int b=0;

        while ((b=bis.read())!=-1){
            //输出流写数据
            bos.write(b);
        }

        bis.close();
        bos.close();

        System.out.println("文件拷贝完成");
    }
}
