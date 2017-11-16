/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mooasoft.app.jpa.entities;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author NiyiO
 */
@Entity
@Table(name = "transactions")
@NamedQueries({
    @NamedQuery(name = "Transactions.findAll", query = "SELECT t FROM Transactions t")
    , @NamedQuery(name = "Transactions.findByTranId", query = "SELECT t FROM Transactions t WHERE t.tranId = :tranId")
    , @NamedQuery(name = "Transactions.findByTranDate", query = "SELECT t FROM Transactions t WHERE t.tranDate = :tranDate")
    , @NamedQuery(name = "Transactions.findByMaskedPan", query = "SELECT t FROM Transactions t WHERE t.maskedPan = :maskedPan")
    , @NamedQuery(name = "Transactions.findByMedia", query = "SELECT t FROM Transactions t WHERE t.media = :media")
    , @NamedQuery(name = "Transactions.findByDescription", query = "SELECT t FROM Transactions t WHERE t.description = :description")
    , @NamedQuery(name = "Transactions.findByStatus", query = "SELECT t FROM Transactions t WHERE t.status = :status")
    , @NamedQuery(name = "Transactions.findByStatusdescription", query = "SELECT t FROM Transactions t WHERE t.statusdescription = :statusdescription")
    , @NamedQuery(name = "Transactions.findByAmount", query = "SELECT t FROM Transactions t WHERE t.amount = :amount")
    , @NamedQuery(name = "Transactions.findByTransactionType", query = "SELECT t FROM Transactions t WHERE t.transactionType = :transactionType")
    , @NamedQuery(name = "Transactions.findByBillerType", query = "SELECT t FROM Transactions t WHERE t.billerType = :billerType")
    , @NamedQuery(name = "Transactions.findByWalletid", query = "SELECT t FROM Transactions t WHERE t.walletid = :walletid")
    , @NamedQuery(name = "Transactions.findByTransactionTypeDescription", query = "SELECT t FROM Transactions t WHERE t.transactionTypeDescription = :transactionTypeDescription")
    , @NamedQuery(name = "Transactions.findByInnitiatorId", query = "SELECT t FROM Transactions t WHERE t.innitiatorId = :innitiatorId")
    , @NamedQuery(name = "Transactions.findByWebpayTranReference", query = "SELECT t FROM Transactions t WHERE t.webpayTranReference = :webpayTranReference")
    , @NamedQuery(name = "Transactions.findByStan", query = "SELECT t FROM Transactions t WHERE t.stan = :stan")
    , @NamedQuery(name = "Transactions.findByTerminalId", query = "SELECT t FROM Transactions t WHERE t.terminalId = :terminalId")
    , @NamedQuery(name = "Transactions.findByMerchantLoc", query = "SELECT t FROM Transactions t WHERE t.merchantLoc = :merchantLoc")
    , @NamedQuery(name = "Transactions.findByBeneficiary", query = "SELECT t FROM Transactions t WHERE t.beneficiary = :beneficiary")
    , @NamedQuery(name = "Transactions.findByMaskedpan", query = "SELECT t FROM Transactions t WHERE t.maskedpan = :maskedpan")
    , @NamedQuery(name = "Transactions.findByHashedpan", query = "SELECT t FROM Transactions t WHERE t.hashedpan = :hashedpan")
    , @NamedQuery(name = "Transactions.findByProductid", query = "SELECT t FROM Transactions t WHERE t.productid = :productid")
    , @NamedQuery(name = "Transactions.findByBalancebefore", query = "SELECT t FROM Transactions t WHERE t.balancebefore = :balancebefore")
    , @NamedQuery(name = "Transactions.findByApproval", query = "SELECT t FROM Transactions t WHERE t.approval = :approval")
    , @NamedQuery(name = "Transactions.findByLatitude", query = "SELECT t FROM Transactions t WHERE t.latitude = :latitude")
    , @NamedQuery(name = "Transactions.findByLongitude", query = "SELECT t FROM Transactions t WHERE t.longitude = :longitude")})
public class Transactions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "tran_id")
    private Long tranId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tran_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tranDate;
    @Size(max = 30)
    @Column(name = "masked_pan")
    private String maskedPan;
    @Size(max = 30)
    @Column(name = "media")
    private String media;
    @Size(max = 90)
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @NotNull
    @Column(name = "status")
    private short status;
    @Size(max = 20)
    @Column(name = "statusdescription")
    private String statusdescription;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "amount")
    private Double amount;
    @Size(max = 19)
    @Column(name = "transaction_type")
    private String transactionType;
    @Size(max = 30)
    @Column(name = "biller_type")
    private String billerType;
    @Column(name = "walletid")
    private BigInteger walletid;
    @Size(max = 50)
    @Column(name = "transaction_type_description")
    private String transactionTypeDescription;
    @Basic(optional = false)
    @NotNull
    @Column(name = "innitiator_id")
    private long innitiatorId;
    @Size(max = 100)
    @Column(name = "webpay_tran_reference")
    private String webpayTranReference;
    @Size(max = 40)
    @Column(name = "stan")
    private String stan;
    @Size(max = 20)
    @Column(name = "terminal_id")
    private String terminalId;
    @Size(max = 70)
    @Column(name = "merchant_loc")
    private String merchantLoc;
    @Column(name = "beneficiary")
    private BigInteger beneficiary;
    @Size(max = 30)
    @Column(name = "maskedpan")
    private String maskedpan;
    @Size(max = 70)
    @Column(name = "hashedpan")
    private String hashedpan;
    @Column(name = "productid")
    private BigInteger productid;
    @Column(name = "balancebefore")
    private Double balancebefore;
    @Basic(optional = false)
    @NotNull
    @Column(name = "approval")
    private long approval;
    @Size(max = 15)
    @Column(name = "latitude")
    private String latitude;
    @Size(max = 15)
    @Column(name = "longitude")
    private String longitude;

    public Transactions() {
    }

    public Transactions(Long tranId) {
        this.tranId = tranId;
    }

    public Transactions(Long tranId, Date tranDate, short status, long innitiatorId, long approval) {
        this.tranId = tranId;
        this.tranDate = tranDate;
        this.status = status;
        this.innitiatorId = innitiatorId;
        this.approval = approval;
    }

    public Long getTranId() {
        return tranId;
    }

    public void setTranId(Long tranId) {
        this.tranId = tranId;
    }

    public Date getTranDate() {
        return tranDate;
    }

    public void setTranDate(Date tranDate) {
        this.tranDate = tranDate;
    }

    public String getMaskedPan() {
        return maskedPan;
    }

    public void setMaskedPan(String maskedPan) {
        this.maskedPan = maskedPan;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public short getStatus() {
        return status;
    }

    public void setStatus(short status) {
        this.status = status;
    }

    public String getStatusdescription() {
        return statusdescription;
    }

    public void setStatusdescription(String statusdescription) {
        this.statusdescription = statusdescription;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getBillerType() {
        return billerType;
    }

    public void setBillerType(String billerType) {
        this.billerType = billerType;
    }

    public BigInteger getWalletid() {
        return walletid;
    }

    public void setWalletid(BigInteger walletid) {
        this.walletid = walletid;
    }

    public String getTransactionTypeDescription() {
        return transactionTypeDescription;
    }

    public void setTransactionTypeDescription(String transactionTypeDescription) {
        this.transactionTypeDescription = transactionTypeDescription;
    }

    public long getInnitiatorId() {
        return innitiatorId;
    }

    public void setInnitiatorId(long innitiatorId) {
        this.innitiatorId = innitiatorId;
    }

    public String getWebpayTranReference() {
        return webpayTranReference;
    }

    public void setWebpayTranReference(String webpayTranReference) {
        this.webpayTranReference = webpayTranReference;
    }

    public String getStan() {
        return stan;
    }

    public void setStan(String stan) {
        this.stan = stan;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getMerchantLoc() {
        return merchantLoc;
    }

    public void setMerchantLoc(String merchantLoc) {
        this.merchantLoc = merchantLoc;
    }

    public BigInteger getBeneficiary() {
        return beneficiary;
    }

    public void setBeneficiary(BigInteger beneficiary) {
        this.beneficiary = beneficiary;
    }

    public String getMaskedpan() {
        return maskedpan;
    }

    public void setMaskedpan(String maskedpan) {
        this.maskedpan = maskedpan;
    }

    public String getHashedpan() {
        return hashedpan;
    }

    public void setHashedpan(String hashedpan) {
        this.hashedpan = hashedpan;
    }

    public BigInteger getProductid() {
        return productid;
    }

    public void setProductid(BigInteger productid) {
        this.productid = productid;
    }

    public Double getBalancebefore() {
        return balancebefore;
    }

    public void setBalancebefore(Double balancebefore) {
        this.balancebefore = balancebefore;
    }

    public long getApproval() {
        return approval;
    }

    public void setApproval(long approval) {
        this.approval = approval;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tranId != null ? tranId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transactions)) {
            return false;
        }
        Transactions other = (Transactions) object;
        if ((this.tranId == null && other.tranId != null) || (this.tranId != null && !this.tranId.equals(other.tranId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mooasoft.app.jpa.entities.Transactions[ tranId=" + tranId + " ]";
    }
    
}
