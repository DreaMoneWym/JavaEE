package com.wym.petshop.mapper;

import java.util.List;

import com.wym.petshop.model.Item;
import com.wym.petshop.model.ItemExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface ItemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Mon Jun 25 22:12:15 CST 2018
     */
    @SelectProvider(type=ItemSqlProvider.class, method="countByExample")
    long countByExample(ItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Mon Jun 25 22:12:15 CST 2018
     */
    @DeleteProvider(type=ItemSqlProvider.class, method="deleteByExample")
    int deleteByExample(ItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Mon Jun 25 22:12:15 CST 2018
     */
    @Delete({
        "delete from item",
        "where itemid = #{itemid,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String itemid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Mon Jun 25 22:12:15 CST 2018
     */
    @Insert({
        "insert into item (itemid, productid, ",
        "listprice, unitcost, ",
        "status, attr1, attr2, ",
        "attr3, attr4, attr5)",
        "values (#{itemid,jdbcType=VARCHAR}, #{productid,jdbcType=VARCHAR}, ",
        "#{listprice,jdbcType=DECIMAL}, #{unitcost,jdbcType=DECIMAL}, ",
        "#{status,jdbcType=VARCHAR}, #{attr1,jdbcType=VARCHAR}, #{attr2,jdbcType=VARCHAR}, ",
        "#{attr3,jdbcType=VARCHAR}, #{attr4,jdbcType=VARCHAR}, #{attr5,jdbcType=VARCHAR})"
    })
    int insert(Item record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Mon Jun 25 22:12:15 CST 2018
     */
    @InsertProvider(type=ItemSqlProvider.class, method="insertSelective")
    int insertSelective(Item record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Mon Jun 25 22:12:15 CST 2018
     */
    @SelectProvider(type=ItemSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="itemid", property="itemid", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="productid", property="productid", jdbcType=JdbcType.VARCHAR),
        @Result(column="listprice", property="listprice", jdbcType=JdbcType.DECIMAL),
        @Result(column="unitcost", property="unitcost", jdbcType=JdbcType.DECIMAL),
        @Result(column="status", property="status", jdbcType=JdbcType.VARCHAR),
        @Result(column="attr1", property="attr1", jdbcType=JdbcType.VARCHAR),
        @Result(column="attr2", property="attr2", jdbcType=JdbcType.VARCHAR),
        @Result(column="attr3", property="attr3", jdbcType=JdbcType.VARCHAR),
        @Result(column="attr4", property="attr4", jdbcType=JdbcType.VARCHAR),
        @Result(column="attr5", property="attr5", jdbcType=JdbcType.VARCHAR),
        @Result( property="product",column = "productid",
                    one =@One(select="com.wym.petshop.mapper.ProductMapper.selectByPrimaryKey") )
    })
    List<Item> selectByExample(ItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Mon Jun 25 22:12:15 CST 2018
     */
    @Select({
        "select",
        "itemid, productid, listprice, unitcost, status, attr1, attr2, attr3, attr4, ",
        "attr5",
        "from item",
        "where itemid = #{itemid,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="itemid", property="itemid", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="productid", property="productid", jdbcType=JdbcType.VARCHAR),
        @Result(column="listprice", property="listprice", jdbcType=JdbcType.DECIMAL),
        @Result(column="unitcost", property="unitcost", jdbcType=JdbcType.DECIMAL),
        @Result(column="status", property="status", jdbcType=JdbcType.VARCHAR),
        @Result(column="attr1", property="attr1", jdbcType=JdbcType.VARCHAR),
        @Result(column="attr2", property="attr2", jdbcType=JdbcType.VARCHAR),
        @Result(column="attr3", property="attr3", jdbcType=JdbcType.VARCHAR),
        @Result(column="attr4", property="attr4", jdbcType=JdbcType.VARCHAR),
        @Result(column="attr5", property="attr5", jdbcType=JdbcType.VARCHAR),
        @Result(column="productid", property="product",
                  one = @One(select ="com.wym.petshop.mapper.ProductMapper.selectByPrimaryKey"))
    })
    Item selectByPrimaryKey(String itemid);
    @Select({
            "select",
            "itemid, productid, listprice, unitcost, status, attr1, attr2, attr3, attr4, ",
            "attr5",
            "from item",
            "where itemid = #{itemid,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="itemid", property="itemid", jdbcType=JdbcType.VARCHAR, id=true),
            @Result(column="productid", property="productid", jdbcType=JdbcType.VARCHAR),
            @Result(column="listprice", property="listprice", jdbcType=JdbcType.DECIMAL),
            @Result(column="unitcost", property="unitcost", jdbcType=JdbcType.DECIMAL),
            @Result(column="status", property="status", jdbcType=JdbcType.VARCHAR),
            @Result(column="attr1", property="attr1", jdbcType=JdbcType.VARCHAR),
            @Result(column="attr2", property="attr2", jdbcType=JdbcType.VARCHAR),
            @Result(column="attr3", property="attr3", jdbcType=JdbcType.VARCHAR),
            @Result(column="attr4", property="attr4", jdbcType=JdbcType.VARCHAR),
            @Result(column="attr5", property="attr5", jdbcType=JdbcType.VARCHAR),
            @Result( property="product",column = "productid",
                    one =@One(select="com.wym.petshop.mapper.ProductMapper.selectByPrimaryKey") )
    })
    Item findItemByItemid(String itemid);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Mon Jun 25 22:12:15 CST 2018
     */
    @UpdateProvider(type=ItemSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Item record, @Param("example") ItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Mon Jun 25 22:12:15 CST 2018
     */
    @UpdateProvider(type=ItemSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Item record, @Param("example") ItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Mon Jun 25 22:12:15 CST 2018
     */
    @UpdateProvider(type=ItemSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Item record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Mon Jun 25 22:12:15 CST 2018
     */
    @Update({
        "update item",
        "set productid = #{productid,jdbcType=VARCHAR},",
          "listprice = #{listprice,jdbcType=DECIMAL},",
          "unitcost = #{unitcost,jdbcType=DECIMAL},",
          "status = #{status,jdbcType=VARCHAR},",
          "attr1 = #{attr1,jdbcType=VARCHAR},",
          "attr2 = #{attr2,jdbcType=VARCHAR},",
          "attr3 = #{attr3,jdbcType=VARCHAR},",
          "attr4 = #{attr4,jdbcType=VARCHAR},",
          "attr5 = #{attr5,jdbcType=VARCHAR}",
        "where itemid = #{itemid,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Item record);
}