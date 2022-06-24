package br.com.microservices.task_test.adapter.database.entity;

import lombok.Data;
import lombok.Generated;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.OffsetDateTime;

@Table("manager.tb_project")
@Data
public class ProjectEntity {
    @Id
    @Column
    @Generated
    public Long projectId;
    @Column("user_id")
    public Long userId;
    @Column("project_name")
    public String name;
    @Column("description")
    public String description;
    @Column("date_insert")
    public OffsetDateTime  dateInsert;
    @Column("date_update")
    public OffsetDateTime dateUpdate;
}
