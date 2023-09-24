package kadotchi.sample.training.repository;

import kadotchi.sample.training.entity.AuditLog;

public interface AuditLogRepository {
    void insert(AuditLog auditLog);
}
