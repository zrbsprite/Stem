package com.penzias.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 描述：人群血糖检查表<br/>
 * 作者：Bob <br/>
 * 修改日期：2015年12月16日 - 下午2:38:31<br/>
 * E-mail: sireezhang@163.com<br/>
 *
 */
public class BloodGlucoseExamInfo {
    private Integer bloodglucoseexamid;

    //人群ID
    private Integer crowdid;

    //血糖类型（YD）
    private String bloodglucosetype;

    //检查时间
    private Date examtime;

    //检查结果
    private BigDecimal examresult;

    private String flag;

    public Integer getBloodglucoseexamid() {
        return bloodglucoseexamid;
    }

    public void setBloodglucoseexamid(Integer bloodglucoseexamid) {
        this.bloodglucoseexamid = bloodglucoseexamid;
    }

    public Integer getCrowdid() {
        return crowdid;
    }

    public void setCrowdid(Integer crowdid) {
        this.crowdid = crowdid;
    }

    public String getBloodglucosetype() {
        return bloodglucosetype;
    }

    public void setBloodglucosetype(String bloodglucosetype) {
        this.bloodglucosetype = bloodglucosetype;
    }

    public Date getExamtime() {
        return examtime;
    }

    public void setExamtime(Date examtime) {
        this.examtime = examtime;
    }

    public BigDecimal getExamresult() {
        return examresult;
    }

    public void setExamresult(BigDecimal examresult) {
        this.examresult = examresult;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}