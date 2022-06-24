package br.com.microservices.task_test.adapter.database.entity;

import lombok.Data;
import lombok.Generated;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import java.time.OffsetDateTime;

@Data
@Table("manager.tb_user")
public class UserEntity {
    @Id
    @Column("user_id")
    @Generated
    public Long userId;
    @Column("user_name")
    public String userName;
    @Column("project_id")
    public Long projectId;
    @Column("age")
    public Long age;
    @Column("date_insert")
    public OffsetDateTime dateInsert;
    @Column("date_update")
    public OffsetDateTime dateUpdate;
}
