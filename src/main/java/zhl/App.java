package zhl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
            System.out.println("注册驱动");
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("初始化成功");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
