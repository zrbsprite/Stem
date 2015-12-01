package com.penzias.entity;

import java.math.BigDecimal;
import java.util.Date;

public class PhysiqueExamInfo {
    private Integer physiqueexamid;

    private Integer crowdid;

    private Date examtime;

    private BigDecimal height;

    private BigDecimal weight;

    private BigDecimal bmi;

    private BigDecimal waist;

    private BigDecimal onesbp;

    private BigDecimal onedbp;

    private Integer onepulse;

    private BigDecimal twosbp;

    private BigDecimal twodbp;

    private Integer twopulse;

    private String cardiacsouffle;

    private String rhythm;

    private String flag;

    public Integer getPhysiqueexamid() {
        return physiqueexamid;
    }

    public void setPhysiqueexamid(Integer physiqueexamid) {
        this.physiqueexamid = physiqueexamid;
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

    public BigDecimal getHeight() {
        return height;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getBmi() {
        return bmi;
    }

    public void setBmi(BigDecimal bmi) {
        this.bmi = bmi;
    }

    public BigDecimal getWaist() {
        return waist;
    }

    public void setWaist(BigDecimal waist) {
        this.waist = waist;
    }

    public BigDecimal getOnesbp() {
        return onesbp;
    }

    public void setOnesbp(BigDecimal onesbp) {
        this.onesbp = onesbp;
    }

    public BigDecimal getOnedbp() {
        return onedbp;
    }

    public void setOnedbp(BigDecimal onedbp) {
        this.onedbp = onedbp;
    }

    public Integer getOnepulse() {
        return onepulse;
    }

    public void setOnepulse(Integer onepulse) {
        this.onepulse = onepulse;
    }

    public BigDecimal getTwosbp() {
        return twosbp;
    }

    public void setTwosbp(BigDecimal twosbp) {
        this.twosbp = twosbp;
    }

    public BigDecimal getTwodbp() {
        return twodbp;
    }

    public void setTwodbp(BigDecimal twodbp) {
        this.twodbp = twodbp;
    }

    public Integer getTwopulse() {
        return twopulse;
    }

    public void setTwopulse(Integer twopulse) {
        this.twopulse = twopulse;
    }

    public String getCardiacsouffle() {
        return cardiacsouffle;
    }

    public void setCardiacsouffle(String cardiacsouffle) {
        this.cardiacsouffle = cardiacsouffle;
    }

    public String getRhythm() {
        return rhythm;
    }

    public void setRhythm(String rhythm) {
        this.rhythm = rhythm;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}