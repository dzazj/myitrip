package cn.itrip.dao;

import cn.itrip.service.beans.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    /**
     * 根据参数查用户
     * @param params
     * @return
     */
    List<User> getUsersByParams(Map<String,Object> params);
    int getUsersCountByParams(Map<String,Object> params);
}
