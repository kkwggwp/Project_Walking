package com.walking.project_walking.repository;

import com.walking.project_walking.domain.MyGoods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyGoodsRepository extends JpaRepository<MyGoods, Long> {
    Boolean existsByUserIdAndGoodsId(Long userId, Long goodsId);
    MyGoods findByUserIdAndGoodsId(Long userId, Long goodsId);
}
