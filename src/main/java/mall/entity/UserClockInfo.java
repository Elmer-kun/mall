package mall.entity;

import java.util.Date;

/**
 * @author elmer
 * @date 2021/6/4 17:34
 */
public class UserClockInfo {

    private Integer id;
    private String userId;
    private String userName;
    private String clockInfo;
    private Date startTime;
    private Date endTime;
    private Integer clockLen;

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

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getLen() {
        return clockLen;
    }

    public void setLen(Integer len) {
        this.clockLen = len;
    }

    @Override
    public String toString() {
        return "UserClockInfo{" +
                "id=" + id +
                ", userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", clockInfo='" + clockInfo + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", clockLen=" + clockLen +
                '}';
    }
}
