package org.ku8eye.mapping;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;
import org.ku8eye.domain.Ku8ServiceInst;

public interface Ku8ServiceInstMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ku8_service_inst
	 * @mbggenerated
	 */
	@Delete({ "delete from ku8_service_inst", "where ID = #{id,jdbcType=INTEGER}" })
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ku8_service_inst
	 * @mbggenerated
	 */
	@Insert({ "insert into ku8_service_inst (ID, PROJECTID, ", "KU8_SERVICE_ID, TENANT_ID, ", "ZONE_ID, CLUSTER_ID, ",
			"RES_PARTION_ID, SERVICE_NAME, ", "REPLICA, NOTE, STATUS, ", "LAST_UPDATED)",
			"values (#{id,jdbcType=INTEGER}, #{projectid,jdbcType=INTEGER}, ",
			"#{ku8ServiceId,jdbcType=INTEGER}, #{tenantId,jdbcType=INTEGER}, ",
			"#{zoneId,jdbcType=INTEGER}, #{clusterId,jdbcType=INTEGER}, ",
			"#{resPartionId,jdbcType=INTEGER}, #{serviceName,jdbcType=VARCHAR}, ",
			"#{replica,jdbcType=TINYINT}, #{note,jdbcType=VARCHAR}, #{status,jdbcType=TINYINT}, ",
			"#{lastUpdated,jdbcType=TIMESTAMP})" })
	int insert(Ku8ServiceInst record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ku8_service_inst
	 * @mbggenerated
	 */
	@Select({ "select", "ID, PROJECTID, KU8_SERVICE_ID, TENANT_ID, ZONE_ID, CLUSTER_ID, RES_PARTION_ID, ",
			"SERVICE_NAME, REPLICA, NOTE, STATUS, LAST_UPDATED", "from ku8_service_inst",
			"where ID = #{id,jdbcType=INTEGER}" })
	@Results({ @Result(column = "ID", property = "id", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "PROJECTID", property = "projectid", jdbcType = JdbcType.INTEGER),
			@Result(column = "KU8_SERVICE_ID", property = "ku8ServiceId", jdbcType = JdbcType.INTEGER),
			@Result(column = "TENANT_ID", property = "tenantId", jdbcType = JdbcType.INTEGER),
			@Result(column = "ZONE_ID", property = "zoneId", jdbcType = JdbcType.INTEGER),
			@Result(column = "CLUSTER_ID", property = "clusterId", jdbcType = JdbcType.INTEGER),
			@Result(column = "RES_PARTION_ID", property = "resPartionId", jdbcType = JdbcType.INTEGER),
			@Result(column = "SERVICE_NAME", property = "serviceName", jdbcType = JdbcType.VARCHAR),
			@Result(column = "REPLICA", property = "replica", jdbcType = JdbcType.TINYINT),
			@Result(column = "NOTE", property = "note", jdbcType = JdbcType.VARCHAR),
			@Result(column = "STATUS", property = "status", jdbcType = JdbcType.TINYINT),
			@Result(column = "LAST_UPDATED", property = "lastUpdated", jdbcType = JdbcType.TIMESTAMP) })
	Ku8ServiceInst selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ku8_service_inst
	 * @mbggenerated
	 */
	@Select({ "select", "ID, PROJECTID, KU8_SERVICE_ID, TENANT_ID, ZONE_ID, CLUSTER_ID, RES_PARTION_ID, ",
			"SERVICE_NAME, REPLICA, NOTE, STATUS, LAST_UPDATED", "from ku8_service_inst" })
	@Results({ @Result(column = "ID", property = "id", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "PROJECTID", property = "projectid", jdbcType = JdbcType.INTEGER),
			@Result(column = "KU8_SERVICE_ID", property = "ku8ServiceId", jdbcType = JdbcType.INTEGER),
			@Result(column = "TENANT_ID", property = "tenantId", jdbcType = JdbcType.INTEGER),
			@Result(column = "ZONE_ID", property = "zoneId", jdbcType = JdbcType.INTEGER),
			@Result(column = "CLUSTER_ID", property = "clusterId", jdbcType = JdbcType.INTEGER),
			@Result(column = "RES_PARTION_ID", property = "resPartionId", jdbcType = JdbcType.INTEGER),
			@Result(column = "SERVICE_NAME", property = "serviceName", jdbcType = JdbcType.VARCHAR),
			@Result(column = "REPLICA", property = "replica", jdbcType = JdbcType.TINYINT),
			@Result(column = "NOTE", property = "note", jdbcType = JdbcType.VARCHAR),
			@Result(column = "STATUS", property = "status", jdbcType = JdbcType.TINYINT),
			@Result(column = "LAST_UPDATED", property = "lastUpdated", jdbcType = JdbcType.TIMESTAMP) })
	List<Ku8ServiceInst> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ku8_service_inst
	 * @mbggenerated
	 */
	@Update({ "update ku8_service_inst", "set PROJECTID = #{projectid,jdbcType=INTEGER},",
			"KU8_SERVICE_ID = #{ku8ServiceId,jdbcType=INTEGER},", "TENANT_ID = #{tenantId,jdbcType=INTEGER},",
			"ZONE_ID = #{zoneId,jdbcType=INTEGER},", "CLUSTER_ID = #{clusterId,jdbcType=INTEGER},",
			"RES_PARTION_ID = #{resPartionId,jdbcType=INTEGER},", "SERVICE_NAME = #{serviceName,jdbcType=VARCHAR},",
			"REPLICA = #{replica,jdbcType=TINYINT},", "NOTE = #{note,jdbcType=VARCHAR},",
			"STATUS = #{status,jdbcType=TINYINT},", "LAST_UPDATED = #{lastUpdated,jdbcType=TIMESTAMP}",
			"where ID = #{id,jdbcType=INTEGER}" })
	int updateByPrimaryKey(Ku8ServiceInst record);
}