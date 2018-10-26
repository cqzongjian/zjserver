package site.zongjian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;

/**
 * @author zongjian
 * @since 1.0
 */
@SpringBootApplication
@MapperScan(basePackages = "site.zongjian.dao", markerInterface = org.hswebframework.web.dao.Dao.class)

public class ZjserverApplicateion {
    public static void main(String[] args) {
        SpringApplication.run(ZjserverApplicateion.class, args);
    }
}
