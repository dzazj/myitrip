package cn.itrip.service;

import cn.itrip.service.beans.pojo.User;
import com.itrip.common.Page;

public interface UserService {
    Page<User> getPagedUsers(int pageIndex, String userName);
}
