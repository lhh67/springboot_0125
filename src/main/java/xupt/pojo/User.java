package xupt.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
@Data
@Table(name = "tb_user")
public class User {
    @Id
    //主键回填
    @KeySql(useGeneratedKeys = true)
    private Long id;
    private String user_name;
    private String password;
    private String name;
    private Integer age;
    private Integer sex;
    private Date birthday;
    private String note;
    private Date created;
    private Date updated;

}


