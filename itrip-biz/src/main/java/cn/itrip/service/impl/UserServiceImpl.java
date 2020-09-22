package cn.itrip.service.impl;

import cn.itrip.service.UserService;
import cn.itrip.service.beans.pojo.User;

import cn.itrip.dao.UserMapper;
import com.itrip.common.Page;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;
    @Override
    public Page<User> getPagedUsers(int pageIndex,String userName) {
        int pageSize=5;
        Map<String,Object> params=new HashMap<>();
        params.put("userName",userName);
        params.put("from",(pageIndex-1)*pageSize);
        params.put("limit",pageSize);
        List<User> users = userMapper.getUsersByParams(params);
        int tatalCount = userMapper.getUsersCountByParams(params);
        Page<User> pagedUsers=new Page<>(pageIndex,pageSize,tatalCount,users);
        return pagedUsers;
    }
}
