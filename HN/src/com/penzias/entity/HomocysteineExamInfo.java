package com.penzias.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 描述：人群同型半胱氨酸检查表<br/>
 * 作者：Bob <br/>
 * 修改日期：2015年12月16日 - 下午2:46:53<br/>
 * E-mail: sireezhang@163.com<br/>
 */
public class HomocysteineExamInfo {
    private Integer homocysteineexamid;

    private Integer crowdid;

    //检查时间
    private Date examtime;

    //同型半胱氨酸(μmol/L)
    private BigDecimal homocysteine;

    private String flag;

    public Integer getHomocysteineexamid() {
        return homocysteineexamid;
    }

    public void setHomocysteineexamid(Integer homocysteineexamid) {
        this.homocysteineexamid = homocysteineexamid;
    }

    public Integer getCrowdid() {
        return crowdid;
    }

    public void setCrowdid(Integer crowdid) {
        this.crowdid = crowdid;
    }

    public Date getExamtime() {
        return examtime;
    }

    public void setExamtime(Date examtime) {
        this.examtime = examtime;
    }

    public BigDecimal getHomocysteine() {
        return homocysteine;
    }

    public void setHomocysteine(BigDecimal homocysteine) {
        this.homocysteine = homocysteine;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}