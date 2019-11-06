import com.ylw.springboot.lombok.UserEntity;
import org.junit.Test;

public class LomBokTest {

    @Test
    public void test(){
        UserEntity userEntity = new UserEntity();
        userEntity.setUserName("zhangsan");
        userEntity.setAge(20);
        System.out.println(userEntity.toString());
    }
}
