package cn.fanyc.action.spring.cloud.action08.model;

/**
 * 用户信息实体
 *
 * @author Fanyc
 * @date 2019/12/6 22:06
 */
public class UserInfoBean {

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 用户姓名
     */
    private String userName;

    /**
     * 用户登录名
     */
    private String loginName;

    /**
     * 获取userId
     *
     * @return 返回userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置userId的值
     *
     * @param userId 要设置的值
     * @return 当前对象
     */
    public UserInfoBean setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 获取userName
     *
     * @return 返回userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置userName的值
     *
     * @param userName 要设置的值
     * @return 当前对象
     */
    public UserInfoBean setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 获取loginName
     *
     * @return 返回loginName
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * 设置loginName的值
     *
     * @param loginName 要设置的值
     * @return 当前对象
     */
    public UserInfoBean setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
}
