package tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @program: springanntotation
 * @description:
 * @author: sxj
 * @create: 2019-09-12 18:11
 **/
@Repository
public class GirlRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void inserGirl(){
        String sql = "INSERT INTO girl(age,cup_size) VALUES (?,?)";
        jdbcTemplate.update(sql,20,"B");
    }
}
