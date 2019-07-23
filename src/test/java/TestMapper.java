import com.qf.bean.HouseInfo;
import com.qf.mapper.HouseInfoMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestMapper {
@Resource
    private HouseInfoMapper houseInfoMapper;
@Test
    public void test(){
    HouseInfo houseInfo=new HouseInfo();
    houseInfo.setTitle("好房出租");
    houseInfo.setAddress("北京昌平");
    houseInfo.setPrice(3500.0);
    houseInfo.setImages("http://192.168.82.88:82/group1/M00/00/00/wKhSWF0yx0WAca9hAABdrZgsqUU496.jpg");

    int i = houseInfoMapper.saveHouseInfo(houseInfo);
    System.err.println(i>0?"succes":"fail");
//哈哈哈哈哈哈啊啊 安徽

    //分支下开发
    System.out.println("分支开发");

}
}
