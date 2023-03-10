package com.rbtxm.springdatajpa.common.pojo.po;

import com.rbtxm.springdatajpa.common.constant.DelFlag;
import com.rbtxm.springdatajpa.common.constant.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.UUID;

/**
 * @Author: guanxiangkai
 * @Description:
 * @Data: 2023年03月07日 周二 19时38分19秒
 **/
@Data
@Builder
@MappedSuperclass
@NoArgsConstructor
@AllArgsConstructor
public class BaseEntity implements Serializable {

    @Id
    @Column(name = "id", columnDefinition = "uuid")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "create_by", columnDefinition = "uuid comment '创建人ID'")
    private UUID createBy;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_time", columnDefinition = "timestamp comment '创建时间'")
    private Timestamp createTime;

    @Column(name = "update_by", columnDefinition = "uuid comment '更新人ID'")
    private UUID updateBy;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "update_time", columnDefinition = "timestamp comment '更新时间'")
    private Timestamp updateTime;

    @Enumerated(EnumType.STRING)
   @Column(name = "status", columnDefinition = "varchar(2) comment '状态'")
    private Status status;

    @Enumerated(EnumType.STRING)
    @Column(name = "del_flag", columnDefinition = "varchar(2) comment '删除标识'")
    private DelFlag delFlag;

    @Version
    @Column(name = "version", columnDefinition = "int comment '版本号'")
    private Integer version;

}
