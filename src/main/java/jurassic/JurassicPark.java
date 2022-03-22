package jurassic;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class JurassicPark {

    private JdbcTemplate jdbcTemplate;

    public JurassicPark(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<String> checkOverpopulation() {
        List<Dinosaur> result = getAllDinos();
        return result.stream()
                .filter(dinosaur -> dinosaur.getExpectedCount() < dinosaur.getActualCount())
                .map(Dinosaur::getBreed)
                .toList();
    }

    public List<Dinosaur> getAllDinos() {
        //language=sql
        return jdbcTemplate.query("select * from dinosaur", (rs, rowNum) -> new Dinosaur
                (rs.getString("breed"), rs.getInt("expected"), rs.getInt("actual")));
    }
}
