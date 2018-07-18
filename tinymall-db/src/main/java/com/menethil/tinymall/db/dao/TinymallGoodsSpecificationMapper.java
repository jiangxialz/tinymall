package com.menethil.tinymall.db.dao;

import com.menethil.tinymall.db.domain.TinymallGoodsSpecification;
import com.menethil.tinymall.db.domain.TinymallGoodsSpecificationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TinymallGoodsSpecificationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_goods_specification
     *
     * @mbg.generated
     */
    long countByExample(TinymallGoodsSpecificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_goods_specification
     *
     * @mbg.generated
     */
    int deleteByExample(TinymallGoodsSpecificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_goods_specification
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_goods_specification
     *
     * @mbg.generated
     */
    int insert(TinymallGoodsSpecification record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_goods_specification
     *
     * @mbg.generated
     */
    int insertSelective(TinymallGoodsSpecification record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_goods_specification
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    TinymallGoodsSpecification selectOneByExample(TinymallGoodsSpecificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_goods_specification
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    TinymallGoodsSpecification selectOneByExampleSelective(@Param("example") TinymallGoodsSpecificationExample example, @Param("selective") TinymallGoodsSpecification.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_goods_specification
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<TinymallGoodsSpecification> selectByExampleSelective(@Param("example") TinymallGoodsSpecificationExample example, @Param("selective") TinymallGoodsSpecification.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_goods_specification
     *
     * @mbg.generated
     */
    List<TinymallGoodsSpecification> selectByExample(TinymallGoodsSpecificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_goods_specification
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    TinymallGoodsSpecification selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") TinymallGoodsSpecification.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_goods_specification
     *
     * @mbg.generated
     */
    TinymallGoodsSpecification selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_goods_specification
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    TinymallGoodsSpecification selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_goods_specification
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TinymallGoodsSpecification record, @Param("example") TinymallGoodsSpecificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_goods_specification
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TinymallGoodsSpecification record, @Param("example") TinymallGoodsSpecificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_goods_specification
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TinymallGoodsSpecification record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_goods_specification
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TinymallGoodsSpecification record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_goods_specification
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") TinymallGoodsSpecificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_goods_specification
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Integer id);
}