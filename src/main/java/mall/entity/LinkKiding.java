package mall.entity;

import java.util.Date;

/**
 * @author elmer
 * @date 2021/6/4 17:22
 */
public class LinkKiding {

    private Integer id;
    private String mood;
    private String text;
    private Date createDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "LinkKiding{" +
                "id=" + id +
                ", mood='" + mood + '\'' +
                ", text='" + text + '\'' +
                ", createDate=" + createDate +
                '}';
    }
}
