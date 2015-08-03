package com.stem.entity;

public class ProductTypeRelation {
    private Integer id;

    private String productTypeCode;

    private String productCCode;

    private Integer sequence;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductTypeCode() {
        return productTypeCode;
    }

    public void setProductTypeCode(String productTypeCode) {
        this.productTypeCode = productTypeCode;
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