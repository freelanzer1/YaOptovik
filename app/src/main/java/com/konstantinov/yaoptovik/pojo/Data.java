package com.konstantinov.yaoptovik.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("citizenship")
    @Expose
    private Object citizenship;
    @SerializedName("source")
    @Expose
    private Object source;
    @SerializedName("qc")
    @Expose
    private Object qc;
    @SerializedName("hid")
    @Expose
    private String hid;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("state")
    @Expose
    private State state;
    @SerializedName("opf")
    @Expose
    private Opf opf;
    @SerializedName("name")
    @Expose
    private Name name;
    @SerializedName("inn")
    @Expose
    private String inn;
    @SerializedName("ogrn")
    @Expose
    private String ogrn;
    @SerializedName("okpo")
    @Expose
    private String okpo;
    @SerializedName("okato")
    @Expose
    private String okato;
    @SerializedName("oktmo")
    @Expose
    private Object oktmo;
    @SerializedName("okogu")
    @Expose
    private String okogu;
    @SerializedName("okfs")
    @Expose
    private String okfs;
    @SerializedName("okved")
    @Expose
    private String okved;
    @SerializedName("okveds")
    @Expose
    private Object okveds;
    @SerializedName("authorities")
    @Expose
    private Object authorities;
    @SerializedName("documents")
    @Expose
    private Object documents;
    @SerializedName("licenses")
    @Expose
    private Object licenses;
    @SerializedName("finance")
    @Expose
    private Object finance;
    @SerializedName("address")
    @Expose
    private Address address;
    @SerializedName("phones")
    @Expose
    private Object phones;
    @SerializedName("emails")
    @Expose
    private Object emails;
    @SerializedName("ogrn_date")
    @Expose
    private String ogrnDate;
    @SerializedName("okved_type")
    @Expose
    private String okvedType;
    @SerializedName("employee_count")
    @Expose
    private Object employeeCount;

    public Object getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(Object citizenship) {
        this.citizenship = citizenship;
    }

    public Object getSource() {
        return source;
    }

    public void setSource(Object source) {
        this.source = source;
    }

    public Object getQc() {
        return qc;
    }

    public void setQc(Object qc) {
        this.qc = qc;
    }

    public String getHid() {
        return hid;
    }

    public void setHid(String hid) {
        this.hid = hid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Opf getOpf() {
        return opf;
    }

    public void setOpf(Opf opf) {
        this.opf = opf;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getOgrn() {
        return ogrn;
    }

    public void setOgrn(String ogrn) {
        this.ogrn = ogrn;
    }

    public String getOkpo() {
        return okpo;
    }

    public void setOkpo(String okpo) {
        this.okpo = okpo;
    }

    public String getOkato() {
        return okato;
    }

    public void setOkato(String okato) {
        this.okato = okato;
    }

    public Object getOktmo() {
        return oktmo;
    }

    public void setOktmo(Object oktmo) {
        this.oktmo = oktmo;
    }

    public String getOkogu() {
        return okogu;
    }

    public void setOkogu(String okogu) {
        this.okogu = okogu;
    }

    public String getOkfs() {
        return okfs;
    }

    public void setOkfs(String okfs) {
        this.okfs = okfs;
    }

    public String getOkved() {
        return okved;
    }

    public void setOkved(String okved) {
        this.okved = okved;
    }

    public Object getOkveds() {
        return okveds;
    }

    public void setOkveds(Object okveds) {
        this.okveds = okveds;
    }

    public Object getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Object authorities) {
        this.authorities = authorities;
    }

    public Object getDocuments() {
        return documents;
    }

    public void setDocuments(Object documents) {
        this.documents = documents;
    }

    public Object getLicenses() {
        return licenses;
    }

    public void setLicenses(Object licenses) {
        this.licenses = licenses;
    }

    public Object getFinance() {
        return finance;
    }

    public void setFinance(Object finance) {
        this.finance = finance;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Object getPhones() {
        return phones;
    }

    public void setPhones(Object phones) {
        this.phones = phones;
    }

    public Object getEmails() {
        return emails;
    }

    public void setEmails(Object emails) {
        this.emails = emails;
    }

    public String getOgrnDate() {
        return ogrnDate;
    }

    public void setOgrnDate(String ogrnDate) {
        this.ogrnDate = ogrnDate;
    }

    public String getOkvedType() {
        return okvedType;
    }

    public void setOkvedType(String okvedType) {
        this.okvedType = okvedType;
    }

    public Object getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(Object employeeCount) {
        this.employeeCount = employeeCount;
    }

}
