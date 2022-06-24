package br.com.microservices.task_test.adapter.database.entity;

import lombok.Data;
import lombok.Generated;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import java.time.OffsetDateTime;

@Table("manager.tb_task")
@Data
public class TaskEntity {
    @Id
    @Generated
    @Column("task_id")
    public Long taskId;
    @Column("user_id")
    public Long userId;
    @Column("task_name")
    public String taskName;
    @Column("task_description")
    public String description;
    @Column("date_insert")
    public OffsetDateTime dateInsert;
    @Column("date_update")
    public OffsetDateTime dateUpdate;
}
