package person.hwj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@ImportResource
@MapperScan
@EnableAsync
public class SpringApp {

//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//        return builder.sources(SpringApp.class);
//    }

    /**
     * 应用启动
     *
     * @param args 参数
     */
    public static void main(String[] args) {
        SpringApplication.run(SpringApp.class, args);
    }
}
