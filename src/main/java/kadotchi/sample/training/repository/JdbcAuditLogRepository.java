package kadotchi.sample.training.repository;

import kadotchi.sample.training.entity.AuditLog;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcAuditLogRepository implements AuditLogRepository {

    private final JdbcTemplate jdbcTemplate;

    public JdbcAuditLogRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void insert(AuditLog auditLog) {
        jdbcTemplate.update("INSERT INTO audit_log VALUES (?,?,?,?)",
                auditLog.getId(),
                auditLog.getFunctionName(),
                auditLog.getEventDateTime(),
                auditLog.getUserId()
        );
    }
}

