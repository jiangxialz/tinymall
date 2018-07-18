package com.menethil.tinymall.db.dao;

import com.menethil.tinymall.db.domain.TinymallRegion;
import com.menethil.tinymall.db.domain.TinymallRegionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TinymallRegionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_region
     *
     * @mbg.generated
     */
    long countByExample(TinymallRegionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_region
     *
     * @mbg.generated
     */
    int deleteByExample(TinymallRegionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_region
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_region
     *
     * @mbg.generated
     */
    int insert(TinymallRegion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_region
     *
     * @mbg.generated
     */
    int insertSelective(TinymallRegion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_region
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    TinymallRegion selectOneByExample(TinymallRegionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_region
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    TinymallRegion selectOneByExampleSelective(@Param("example") TinymallRegionExample example, @Param("selective") TinymallRegion.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_region
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<TinymallRegion> selectByExampleSelective(@Param("example") TinymallRegionExample example, @Param("selective") TinymallRegion.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_region
     *
     * @mbg.generated
     */
    List<TinymallRegion> selectByExample(TinymallRegionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_region
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    TinymallRegion selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") TinymallRegion.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_region
     *
     * @mbg.generated
     */
    TinymallRegion selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_region
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TinymallRegion record, @Param("example") TinymallRegionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_region
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TinymallRegion record, @Param("example") TinymallRegionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_region
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TinymallRegion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_region
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TinymallRegion record);
}