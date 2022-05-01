import sun.rmi.rmic.iiop.ClassPathLoader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;

public class HelloXclassLoader extends ClassLoader{


    public static void main(String[] args) throws Exception {
       // String className = "Hello.xlass";
        String className = "Hello";
      // There's something wrong when loading Hello.xlass file
      // but all goes well with hello.class file
        HelloXclassLoader hello = new HelloXclassLoader();

        // Convert class
        Class<?> class_01= hello.findClass(className);

        // Get methods
        for (Method m : class_01.getDeclaredMethods()){
            System.out.println(class_01.getSimpleName()+ "." + m.getName());
        };
       // System.out.println(hello.findClass(className).getDeclaredMethods());

    }
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        // 如果支持包名, 则需要进行路径转换
        String resourcePath = name.replace(".", "/");
        // 文件后缀
        final String suffix = ".xlass";
        // 获取输入流
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(resourcePath+suffix);
        System.out.println("Path : "+resourcePath+suffix);
        System.out.println(inputStream);
        try{
            int length = inputStream.available();
            byte[] byteArray = new byte[length];
            inputStream.read(byteArray);
            System.out.println("length :"+length);
            System.out.println(byteArray.length);
          //  byte[] classBytes = byteArray;
            byte[] classBytes = decode(byteArray);
            // 通知底层定义这个类
            return defineClass(name, classBytes, 0, classBytes.length);
        } catch (IOException e) {
            throw new ClassNotFoundException(name, e);
        }

    }

    private static byte[] decode(byte[] byteArray) {
        byte[] targetArray = new byte[byteArray.length];
        for (int i = 0; i < byteArray.length; i++) {
            targetArray[i] = (byte) (255 - byteArray[i]);
        }
        return targetArray;
    }

    // 关闭
    private static void close(Closeable res) {
        if (null != res) {
            try {
                res.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
