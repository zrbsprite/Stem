package com.stem.entity;

import java.math.BigDecimal;

public class Statement extends StatementKey {
    private String customername;

    private String phone;

    private String customerid;

    private String fundtype;

    private BigDecimal netvalue;

    private BigDecimal purchaseamount;

    private BigDecimal totalpurchaseamount;

    private BigDecimal exchangerate;

    private BigDecimal addvalueofassert;

    private Integer purchaseshares;

    private BigDecimal currentbalance;

    private Integer redemptionshares;

    private BigDecimal redemptionamount;

    private BigDecimal totalredemptionamount;

    private Integer totalshares;

    private BigDecimal totalamount;

    private BigDecimal totalbalance;

    private BigDecimal totalreturn;

    private BigDecimal totalrate;

    private BigDecimal currentreturn;

    private BigDecimal currentrate;

    private BigDecimal currentdividend;

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

    public String getFundtype() {
        return fundtype;
    }

    public void setFundtype(String fundtype) {
        this.fundtype = fundtype;
    }

    public BigDecimal getNetvalue() {
        return netvalue;
    }

    public void setNetvalue(BigDecimal netvalue) {
        this.netvalue = netvalue;
    }

    public BigDecimal getPurchaseamount() {
        return purchaseamount;
    }

    public void setPurchaseamount(BigDecimal purchaseamount) {
        this.purchaseamount = purchaseamount;
    }

    public BigDecimal getTotalpurchaseamount() {
        return totalpurchaseamount;
    }

    public void setTotalpurchaseamount(BigDecimal totalpurchaseamount) {
        this.totalpurchaseamount = totalpurchaseamount;
    }

    public BigDecimal getExchangerate() {
        return exchangerate;
    }

    public void setExchangerate(BigDecimal exchangerate) {
        this.exchangerate = exchangerate;
    }

    public BigDecimal getAddvalueofassert() {
        return addvalueofassert;
    }

    public void setAddvalueofassert(BigDecimal addvalueofassert) {
        this.addvalueofassert = addvalueofassert;
    }

    public Integer getPurchaseshares() {
        return purchaseshares;
    }

    public void setPurchaseshares(Integer purchaseshares) {
        this.purchaseshares = purchaseshares;
    }

    public BigDecimal getCurrentbalance() {
        return currentbalance;
    }

    public void setCurrentbalance(BigDecimal currentbalance) {
        this.currentbalance = currentbalance;
    }

    public Integer getRedemptionshares() {
        return redemptionshares;
    }

    public void setRedemptionshares(Integer redemptionshares) {
        this.redemptionshares = redemptionshares;
    }

    public BigDecimal getRedemptionamount() {
        return redemptionamount;
    }

    public void setRedemptionamount(BigDecimal redemptionamount) {
        this.redemptionamount = redemptionamount;
    }

    public BigDecimal getTotalredemptionamount() {
        return totalredemptionamount;
    }

    public void setTotalredemptionamount(BigDecimal totalredemptionamount) {
        this.totalredemptionamount = totalredemptionamount;
    }

    public Integer getTotalshares() {
        return totalshares;
    }

    public void setTotalshares(Integer totalshares) {
        this.totalshares = totalshares;
    }

    public BigDecimal getTotalamount() {
        return totalamount;
    }

    public void setTotalamount(BigDecimal totalamount) {
        this.totalamount = totalamount;
    }

    public BigDecimal getTotalbalance() {
        return totalbalance;
    }

    public void setTotalbalance(BigDecimal totalbalance) {
        this.totalbalance = totalbalance;
    }

    public BigDecimal getTotalreturn() {
        return totalreturn;
    }

    public void setTotalreturn(BigDecimal totalreturn) {
        this.totalreturn = totalreturn;
    }

    public BigDecimal getTotalrate() {
        return totalrate;
    }

    public void setTotalrate(BigDecimal totalrate) {
        this.totalrate = totalrate;
    }

    public BigDecimal getCurrentreturn() {
        return currentreturn;
    }

    public void setCurrentreturn(BigDecimal currentreturn) {
        this.currentreturn = currentreturn;
    }

    public BigDecimal getCurrentrate() {
        return currentrate;
    }

    public void setCurrentrate(BigDecimal currentrate) {
        this.currentrate = currentrate;
    }

    public BigDecimal getCurrentdividend() {
        return currentdividend;
    }

    public void setCurrentdividend(BigDecimal currentdividend) {
        this.currentdividend = currentdividend;
    }
}