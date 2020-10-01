import com.qk.dao.DogDao;
import com.qk.po.Dog;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author samasung
 * @create 2020-10-01-9:03
 */
public class Test01 {
    private  InputStream is;
    private  SqlSessionFactory sqlSessionFactory;
    private  SqlSession sqlSession;
    private  DogDao dd;
    @Before
    public void before() throws IOException {
        //1加载配置文件
        is= Resources.getResourceAsStream("MyBatis-config.xml");
        //2创建会话工厂
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        //3获取会话对象
        sqlSession = sqlSessionFactory.openSession(true);
        dd = sqlSession.getMapper(DogDao.class);
    }
    @org.junit.Test
    public void testSelectAll() throws IOException {
        List<Dog> list = dd.selectAll();
        for (Dog dog : list) {
            System.out.println(dog);
        }


    }
    @org.junit.Test
    public void testSelectOne() throws IOException {
       /* Dog dog = dd.selectOne(6);
        System.out.println(dog);*/
      /*  int delete = dd.delete(6);
        System.out.println(delete);*/
       /*Dog dog=new Dog();
       dog.setId(1);
       dog.setName("刘科华");
       dog.setLove(60);
       dog.setType("土狗");
        int insert = dd.insert(dog);
        System.out.println(insert);*/
      /* Dog dog=new Dog();
       dog.setId(2);
       dog.setName("小白");
       dog.setLove(50);
       dog.setType("土狗");
        int update = dd.update(dog);
        System.out.println(update);*/


    }
}
