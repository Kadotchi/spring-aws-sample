package kadotchi.training.repository;

import kadotchi.training.entity.AuditLog;

public interface AuditLogRepository {
    void insert(AuditLog auditLog);
}
