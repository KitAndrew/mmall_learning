package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.Category;

import java.util.List;

/**
 * Created By Kit.Andrew.Lee on 2018/7/13.
 */
public interface ICategoryService {
    ServerResponse addCategory(String categoryName,Integer parentId);

    ServerResponse updateCategoryName(Integer categroyId,String categoryName);

    ServerResponse<List<Category>> getChildrenParallelCategory(Integer parentId);

    ServerResponse selectCategoryAndChildrenById(Integer categoryId);
}
