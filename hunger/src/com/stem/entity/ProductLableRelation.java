package com.stem.entity;

public class ProductLableRelation {
    private Integer id;

    private String lableCode;

    private String productCCode;

    private Integer sequence;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLableCode() {
        return lableCode;
    }

    public void setLableCode(String lableCode) {
        this.lableCode = lableCode;
    }

    public String getProductCCode() {
        return productCCode;
    }

    public void setProductCCode(String productCCode) {
        this.productCCode = productCCode;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }
}