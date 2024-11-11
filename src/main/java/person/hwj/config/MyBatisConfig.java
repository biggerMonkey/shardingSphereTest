package person.hwj.config;

import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author:
 * @date: 2024/11/8 10:23
 * @description:
 */
@Configuration
public class MyBatisConfig {

    //    masterSlaveDataSource
//    shardingDataSource
    @Autowired
    private DataSource dataSource;

    @Value("${mybatis-plus.mapper-locations}")
    private String mapperLocations;

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        MybatisSqlSessionFactoryBean sessionFactory = new MybatisSqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        // 其他配置...
        PathMatchingResourcePatternResolver pathMatchingResourcePatternResolver = new PathMatchingResourcePatternResolver();
        List<Resource> resourceList = new ArrayList<>();
        String[] mapperLocationArray = mapperLocations.split(",");
        for (String mapperLocation : mapperLocationArray) {
            Resource[] resources = pathMatchingResourcePatternResolver.getResources(mapperLocation);
            resourceList.addAll(Arrays.asList(resources));
        }
        sessionFactory.setMapperLocations(resourceList.toArray(new Resource[0]));
        return sessionFactory.getObject();
    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
