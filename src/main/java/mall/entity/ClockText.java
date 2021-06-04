package mall.entity;

import java.util.Date;

/**
 * @author elmer
 * @date 2021/6/4 17:32
 */
public class ClockText {

    private Integer id;
    private String userId;
    private String userName;
    private String clockInfo;
    private Date createDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getClockInfo() {
        return clockInfo;
    }

    public void setClockInfo(String clockInfo) {
        this.clockInfo = clockInfo;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "ClockText{" +
                "id=" + id +
                ", userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", clockInfo='" + clockInfo + '\'' +
                ", createDate=" + createDate +
                '}';
    }
}
