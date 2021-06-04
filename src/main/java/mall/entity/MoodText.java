package mall.entity;

import java.util.Date;

/**
 * @author elmer
 * @date 2021/6/4 16:04
 */
public class MoodText {

    private Integer id;
    private String text;
    private Integer name_id;
    private Date createDate;

    @Override
    public String toString() {
        return "MoodText{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", name_id=" + name_id +
                ", createDate=" + createDate +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getName_id() {
        return name_id;
    }

    public void setName_id(Integer name_id) {
        this.name_id = name_id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
