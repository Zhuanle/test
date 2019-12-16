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
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("初始化成功");
            System.out.println("更新");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
