package com.macro.mall.portal.repository;

import com.macro.mall.portal.domain.MemberBrandAttention;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
//该项目称所有用户为会员
/**
 * 会员品牌关注Repository
 * Created by macro on 2018/8/2.
 */ //attention关注 //将会员ID及其关注品牌ID存储到数据库中，不是关注商品
public interface MemberBrandAttentionRepository extends MongoRepository<MemberBrandAttention, String> {
    /**
     * 根据会员ID和品牌ID查找记录
     */
    MemberBrandAttention findByMemberIdAndBrandId(Long memberId, Long brandId);

    /**
     * 根据会员ID和品牌ID删除记录
     */
    int deleteByMemberIdAndBrandId(Long memberId, Long brandId);

    /**
     * 根据会员ID分页查找记录
     */
    Page<MemberBrandAttention> findByMemberId(Long memberId, Pageable pageable);

    /**
     * 根据会员ID删除记录
     */
    void deleteAllByMemberId(Long memberId);
}
