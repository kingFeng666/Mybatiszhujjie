import com.shangguan.Mybatis.beans.School;
import com.shangguan.Mybatis.mapper.SchoolMapper;
import com.shangguan.Mybatis.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

/**
 * @ClassName: Test
 * @Description:
 * @Author: 李峰
 * @Date: 2020 年 09月 17 23:55
 * @Version 1.0
 */
public class Test {
    SqlSession sqlSession=MybatisUtil.getSqlSession();
    SchoolMapper schoolMapper=sqlSession.getMapper(SchoolMapper.class);
    @org.junit.Test
    public void deleteSchool(){
        System.out.println(schoolMapper.deleteByPrimaryKey(1));
        sqlSession.commit();
    }
    @org.junit.Test
    public void insertSchool(){
        School school = new School();
        school.setSid(10);
        school.setSname("长安大学");
        school.setSaddress("北京");
        school.setSdescription("我就在里面");
        System.out.println(schoolMapper.insert(school));
    }

}
