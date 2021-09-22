package orange.com.bean;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;

@Entity
@Table(name = "cacus")
@NamedQueries({@NamedQuery(name = "Cacus.findAll", query = "SELECT c FROM Cacus c")})
public class Cacus implements Serializable {
  private static final long serialVersionUID = 1L;
  
  @Column(name = "ztime")
  @CreationTimestamp
  @Temporal(TemporalType.TIMESTAMP)
  private Date ztime;
  
  @Column(name = "zutime")
  @UpdateTimestamp
  @Temporal(TemporalType.TIMESTAMP)
  private Date zutime;
  
  @Column(name = "zauserid", updatable = false)
  @CreatedBy
  private String zauserid;
  
  @Column(name = "zuuserid")
  @LastModifiedBy
  private String zuuserid;
  
  @Basic(optional = false)
  @Column(name = "zid")
  private int zid;
  
  @Id
  @Basic(optional = false)
  @Column(name = "xcus")
  private String xcus;
  
  @Column(name = "xorg")
  private String xorg;
  
  @Column(name = "xmadd")
  private String xmadd;
  
  @Column(name = "xemail")
  private String xemail;
  
  @Column(name = "xphone")
  private String xphone;
  
  @Column(name = "xfax")
  private String xfax;
  
  @Column(name = "xurl")
  private String xurl;
  
  @Column(name = "xcrlimit")
  private BigDecimal xcrlimit;
  
  @Column(name = "xgcus")
  private String xgcus;
  
  @Column(name = "xstatuscus")
  private String xstatuscus;
  
  @Column(name = "xwh")
  private String xwh;
  
  @Column(name = "xmio")
  private String xmio;
  
  @Column(name = "xterritory")
  private String xterritory;
  
  @Column(name = "xmarket")
  private String xmarket;
  
  @Column(name = "xfm")
  private String xfm;
  
  @Column(name = "xdistrict")
  private String xdistrict;
  
  @Column(name = "xthana")
  private String xthana;
  
  @Column(name = "xfield")
  private String xfield;
  
  @Column(name = "xcrterms")
  private Integer xcrterms;
  
  @Column(name = "xpaymentterm")
  private String xpaymentterm;
  
  @Column(name = "xproject")
  private String xproject;
  
  @Column(name = "xdateeff")
  @Temporal(TemporalType.TIMESTAMP)
  private Date xdateeff;
  
  @Column(name = "xdateexp")
  @Temporal(TemporalType.TIMESTAMP)
  private Date xdateexp;
  
  @Column(name = "xso")
  private String xso;
  
  @Column(name = "xroute")
  private String xroute;
  
  @Column(name = "xlastcrdate")
  @Temporal(TemporalType.DATE)
  private Date xlastcrdate;
  
  @Column(name = "xinvtoinvcr")
  private String xinvtoinvcr;
  
  @Column(name = "xallowcrinv")
  private String xallowcrinv;
  
  @Column(name = "xallbndisc")
  private String xallbndisc;
  
  @Column(name = "xcode")
  private String xcode;
  
  @Column(name = "xref")
  private String xref;
  
  @Column(name = "xdate")
  @Temporal(TemporalType.DATE)
  private Date xdate;
  
  @Column(name = "xcontact")
  private String xcontact;
  
  @Column(name = "xdisc")
  private BigDecimal xdisc;
  
  @Column(name = "xsp")
  private String xsp;
  
  @Column(name = "xoldcus")
  private String xoldcus;
  
  @Lob
  @Column(name = "xcrtermtype")
  private byte[] xcrtermtype;
  
  @Column(name = "xgsup")
  private String xgsup;
  
  @Column(name = "xtype")
  private String xtype;
  
  @Column(name = "xsupcat")
  private String xsupcat;
  
  @Column(name = "xmobile")
  private String xmobile;
  
  @Column(name = "xcomm")
  private BigDecimal xcomm;
  
  @Column(name = "xcomm1")
  private BigDecimal xcomm1;
  
  @Column(name = "xcomm2")
  private BigDecimal xcomm2;
  
  @Column(name = "xcomm3")
  private BigDecimal xcomm3;
  
  @Column(name = "xassessval1")
  private BigDecimal xassessval1;
  
  @Column(name = "xassessval2")
  private BigDecimal xassessval2;
  
  @Column(name = "xassessval3")
  private BigDecimal xassessval3;
  
  @Column(name = "xsamtjar")
  private BigDecimal xsamtjar;
  
  @Column(name = "xsamtdispat")
  private BigDecimal xsamtdispat;
  
  @Column(name = "xpaymenttype")
  private String xpaymenttype;
  
  @Column(name = "xcusold")
  private String xcusold;
  
  @Column(name = "xvatregno")
  private String xvatregno;
  
  @Column(name = "xvatdef")
  private String xvatdef;
  
  @Column(name = "zactive")
  private String zactive;
  
  @Column(name = "xcity")
  private String xcity;
  
  @Column(name = "xcountry")
  private String xcountry;
  
  @Column(name = "xtin")
  private String xtin;
  
  @Column(name = "xlicense")
  private String xlicense;
  
  @Column(name = "xpostcode")
  private String xpostcode;
  
  @Column(name = "xcontactphn")
  private String xcontactphn;
  
  @Column(name = "xporamt")
  private BigDecimal xporamt;
  
  @Column(name = "xbonuspoints")
  private BigDecimal xbonuspoints;
  
  @Column(name = "xexpday")
  private Integer xexpday;
  
  @Column(name = "xblockday")
  private Integer xblockday;
  
  @Column(name = "xprdcounter")
  private Integer xprdcounter;
  
  @Column(name = "xpadd")
  private String xpadd;
  
  @Column(name = "xname")
  private String xname;
  
  @Column(name = "xoccupation")
  private String xoccupation;
  
  @Column(name = "xregion")
  private String xregion;
  
  @Column(name = "xdiscdet")
  private BigDecimal xdiscdet;
  
  @Column(name = "xdiscdetamt")
  private BigDecimal xdiscdetamt;
  
  @Column(name = "xdisctype")
  private String xdisctype;
  
  @Column(name = "xreqbonuspoints")
  private BigDecimal xreqbonuspoints;
  
  @Column(name = "xearnedbonusamt")
  private BigDecimal xearnedbonusamt;
  
  @Column(name = "xsupnewitem")
  private String xsupnewitem;
  
  @Column(name = "xdeliloc")
  private String xdeliloc;
  
  @Column(name = "xdesignation")
  private String xdesignation;
  
  @Column(name = "xcustype")
  private String xcustype;
  
  @Column(name = "xdelicontact")
  private String xdelicontact;
  
  @Column(name = "xdelicontactphn")
  private String xdelicontactphn;
  
  @Column(name = "xsalesperson")
  private String xsalesperson;
  
  @Column(name = "xtransshipment")
  private String xtransshipment;
  
  @Column(name = "xsex")
  private String xsex;
  
  @Column(name = "xexpetriot")
  private String xexpetriot;
  
  @Column(name = "xcycle")
  private Integer xcycle;
  
  @Column(name = "xcrperiod")
  private Integer xcrperiod;
  
  @Column(name = "xmeritalstatus")
  private String xmeritalstatus;
  
  @Column(name = "xbirthdate")
  @Temporal(TemporalType.TIMESTAMP)
  private Date xbirthdate;
  
  @Column(name = "xspouse")
  private String xspouse;
  
  @Column(name = "xmigrationdate")
  private String xmigrationdate;
  
  @Column(name = "xcompany")
  private String xcompany;
  
  @Column(name = "xemailcomp")
  private String xemailcomp;
  
  @Column(name = "xbank")
  private String xbank;
  
  @Column(name = "xbranch")
  private String xbranch;
  
  @Column(name = "xacc")
  private String xacc;
  
  @Column(name = "xrouting")
  private String xrouting;
  
  @Column(name = "xacctype")
  private String xacctype;
  
  @Column(name = "xbonusbal")
  private BigDecimal xbonusbal;
  
  @Column(name = "xdatepo")
  @Temporal(TemporalType.DATE)
  private Date xdatepo;
  
  @Column(name = "xbeneficiary")
  private String xbeneficiary;
  
  @Column(name = "xenlistedfee")
  private BigDecimal xenlistedfee;
  
  @Column(name = "xstaff")
  private String xstaff;
  
  @Column(name = "xidsup")
  private String xidsup;
  
  @Column(name = "xsuperior2")
  private String xsuperior2;
  
  @Column(name = "xsuperior3")
  private String xsuperior3;
  
  @Column(name = "xsignatory1")
  private String xsignatory1;
  
  @Column(name = "xsigndate1")
  @Temporal(TemporalType.TIMESTAMP)
  private Date xsigndate1;
  
  @Column(name = "xsignatory2")
  private String xsignatory2;
  
  @Column(name = "xsigndate2")
  @Temporal(TemporalType.TIMESTAMP)
  private Date xsigndate2;
  
  @Column(name = "xsignatory3")
  private String xsignatory3;
  
  @Column(name = "xsigndate3")
  @Temporal(TemporalType.TIMESTAMP)
  private Date xsigndate3;
  
  @Column(name = "xsignatory4")
  private String xsignatory4;
  
  @Column(name = "xsigndate4")
  @Temporal(TemporalType.TIMESTAMP)
  private Date xsigndate4;
  
  @Column(name = "xsignatory5")
  private String xsignatory5;
  
  @Column(name = "xsigndate5")
  @Temporal(TemporalType.TIMESTAMP)
  private Date xsigndate5;
  
  @Column(name = "xsignatory6")
  private String xsignatory6;
  
  @Column(name = "xsigndate6")
  @Temporal(TemporalType.TIMESTAMP)
  private Date xsigndate6;
  
  @Column(name = "xsignatory7")
  private String xsignatory7;
  
  @Column(name = "xsigndate7")
  @Temporal(TemporalType.TIMESTAMP)
  private Date xsigndate7;
  
  @Column(name = "xsignreject")
  private String xsignreject;
  
  @Column(name = "xdatereject")
  @Temporal(TemporalType.TIMESTAMP)
  private Date xdatereject;
  
  @Basic(optional = false)
  @Column(name = "xshopno")
  private String xshopno;
  
  public Cacus() {}
  
  public Cacus(String xcus) {
    this.xcus = xcus;
  }
  
  public Cacus(String xcus, int zid, String xshopno) {
    this.xcus = xcus;
    this.zid = zid;
    this.xshopno = xshopno;
  }
  
  public Date getZtime() {
    return this.ztime;
  }
  
  public void setZtime(Date ztime) {
    this.ztime = ztime;
  }
  
  public Date getZutime() {
    return this.zutime;
  }
  
  public void setZutime(Date zutime) {
    this.zutime = zutime;
  }
  
  public String getZauserid() {
    return this.zauserid;
  }
  
  public void setZauserid(String zauserid) {
    this.zauserid = zauserid;
  }
  
  public String getZuuserid() {
    return this.zuuserid;
  }
  
  public void setZuuserid(String zuuserid) {
    this.zuuserid = zuuserid;
  }
  
  public int getZid() {
    return this.zid;
  }
  
  public void setZid(int zid) {
    this.zid = zid;
  }
  
  public String getXcus() {
    return this.xcus;
  }
  
  public void setXcus(String xcus) {
    this.xcus = xcus;
  }
  
  public String getXorg() {
    return this.xorg;
  }
  
  public void setXorg(String xorg) {
    this.xorg = xorg;
  }
  
  public String getXmadd() {
    return this.xmadd;
  }
  
  public void setXmadd(String xmadd) {
    this.xmadd = xmadd;
  }
  
  public String getXemail() {
    return this.xemail;
  }
  
  public void setXemail(String xemail) {
    this.xemail = xemail;
  }
  
  public String getXphone() {
    return this.xphone;
  }
  
  public void setXphone(String xphone) {
    this.xphone = xphone;
  }
  
  public String getXfax() {
    return this.xfax;
  }
  
  public void setXfax(String xfax) {
    this.xfax = xfax;
  }
  
  public String getXurl() {
    return this.xurl;
  }
  
  public void setXurl(String xurl) {
    this.xurl = xurl;
  }
  
  public BigDecimal getXcrlimit() {
    return this.xcrlimit;
  }
  
  public void setXcrlimit(BigDecimal xcrlimit) {
    this.xcrlimit = xcrlimit;
  }
  
  public String getXgcus() {
    return this.xgcus;
  }
  
  public void setXgcus(String xgcus) {
    this.xgcus = xgcus;
  }
  
  public String getXstatuscus() {
    return this.xstatuscus;
  }
  
  public void setXstatuscus(String xstatuscus) {
    this.xstatuscus = xstatuscus;
  }
  
  public String getXwh() {
    return this.xwh;
  }
  
  public void setXwh(String xwh) {
    this.xwh = xwh;
  }
  
  public String getXmio() {
    return this.xmio;
  }
  
  public void setXmio(String xmio) {
    this.xmio = xmio;
  }
  
  public String getXterritory() {
    return this.xterritory;
  }
  
  public void setXterritory(String xterritory) {
    this.xterritory = xterritory;
  }
  
  public String getXmarket() {
    return this.xmarket;
  }
  
  public void setXmarket(String xmarket) {
    this.xmarket = xmarket;
  }
  
  public String getXfm() {
    return this.xfm;
  }
  
  public void setXfm(String xfm) {
    this.xfm = xfm;
  }
  
  public String getXdistrict() {
    return this.xdistrict;
  }
  
  public void setXdistrict(String xdistrict) {
    this.xdistrict = xdistrict;
  }
  
  public String getXthana() {
    return this.xthana;
  }
  
  public void setXthana(String xthana) {
    this.xthana = xthana;
  }
  
  public String getXfield() {
    return this.xfield;
  }
  
  public void setXfield(String xfield) {
    this.xfield = xfield;
  }
  
  public Integer getXcrterms() {
    return this.xcrterms;
  }
  
  public void setXcrterms(Integer xcrterms) {
    this.xcrterms = xcrterms;
  }
  
  public String getXpaymentterm() {
    return this.xpaymentterm;
  }
  
  public void setXpaymentterm(String xpaymentterm) {
    this.xpaymentterm = xpaymentterm;
  }
  
  public String getXproject() {
    return this.xproject;
  }
  
  public void setXproject(String xproject) {
    this.xproject = xproject;
  }
  
  public Date getXdateeff() {
    return this.xdateeff;
  }
  
  public void setXdateeff(Date xdateeff) {
    this.xdateeff = xdateeff;
  }
  
  public Date getXdateexp() {
    return this.xdateexp;
  }
  
  public void setXdateexp(Date xdateexp) {
    this.xdateexp = xdateexp;
  }
  
  public String getXso() {
    return this.xso;
  }
  
  public void setXso(String xso) {
    this.xso = xso;
  }
  
  public String getXroute() {
    return this.xroute;
  }
  
  public void setXroute(String xroute) {
    this.xroute = xroute;
  }
  
  public Date getXlastcrdate() {
    return this.xlastcrdate;
  }
  
  public void setXlastcrdate(Date xlastcrdate) {
    this.xlastcrdate = xlastcrdate;
  }
  
  public String getXinvtoinvcr() {
    return this.xinvtoinvcr;
  }
  
  public void setXinvtoinvcr(String xinvtoinvcr) {
    this.xinvtoinvcr = xinvtoinvcr;
  }
  
  public String getXallowcrinv() {
    return this.xallowcrinv;
  }
  
  public void setXallowcrinv(String xallowcrinv) {
    this.xallowcrinv = xallowcrinv;
  }
  
  public String getXallbndisc() {
    return this.xallbndisc;
  }
  
  public void setXallbndisc(String xallbndisc) {
    this.xallbndisc = xallbndisc;
  }
  
  public String getXcode() {
    return this.xcode;
  }
  
  public void setXcode(String xcode) {
    this.xcode = xcode;
  }
  
  public String getXref() {
    return this.xref;
  }
  
  public void setXref(String xref) {
    this.xref = xref;
  }
  
  public Date getXdate() {
    return this.xdate;
  }
  
  public void setXdate(Date xdate) {
    this.xdate = xdate;
  }
  
  public String getXcontact() {
    return this.xcontact;
  }
  
  public void setXcontact(String xcontact) {
    this.xcontact = xcontact;
  }
  
  public BigDecimal getXdisc() {
    return this.xdisc;
  }
  
  public void setXdisc(BigDecimal xdisc) {
    this.xdisc = xdisc;
  }
  
  public String getXsp() {
    return this.xsp;
  }
  
  public void setXsp(String xsp) {
    this.xsp = xsp;
  }
  
  public String getXoldcus() {
    return this.xoldcus;
  }
  
  public void setXoldcus(String xoldcus) {
    this.xoldcus = xoldcus;
  }
  
  public byte[] getXcrtermtype() {
    return this.xcrtermtype;
  }
  
  public void setXcrtermtype(byte[] xcrtermtype) {
    this.xcrtermtype = xcrtermtype;
  }
  
  public String getXgsup() {
    return this.xgsup;
  }
  
  public void setXgsup(String xgsup) {
    this.xgsup = xgsup;
  }
  
  public String getXtype() {
    return this.xtype;
  }
  
  public void setXtype(String xtype) {
    this.xtype = xtype;
  }
  
  public String getXsupcat() {
    return this.xsupcat;
  }
  
  public void setXsupcat(String xsupcat) {
    this.xsupcat = xsupcat;
  }
  
  public String getXmobile() {
    return this.xmobile;
  }
  
  public void setXmobile(String xmobile) {
    this.xmobile = xmobile;
  }
  
  public BigDecimal getXcomm() {
    return this.xcomm;
  }
  
  public void setXcomm(BigDecimal xcomm) {
    this.xcomm = xcomm;
  }
  
  public BigDecimal getXcomm1() {
    return this.xcomm1;
  }
  
  public void setXcomm1(BigDecimal xcomm1) {
    this.xcomm1 = xcomm1;
  }
  
  public BigDecimal getXcomm2() {
    return this.xcomm2;
  }
  
  public void setXcomm2(BigDecimal xcomm2) {
    this.xcomm2 = xcomm2;
  }
  
  public BigDecimal getXcomm3() {
    return this.xcomm3;
  }
  
  public void setXcomm3(BigDecimal xcomm3) {
    this.xcomm3 = xcomm3;
  }
  
  public BigDecimal getXassessval1() {
    return this.xassessval1;
  }
  
  public void setXassessval1(BigDecimal xassessval1) {
    this.xassessval1 = xassessval1;
  }
  
  public BigDecimal getXassessval2() {
    return this.xassessval2;
  }
  
  public void setXassessval2(BigDecimal xassessval2) {
    this.xassessval2 = xassessval2;
  }
  
  public BigDecimal getXassessval3() {
    return this.xassessval3;
  }
  
  public void setXassessval3(BigDecimal xassessval3) {
    this.xassessval3 = xassessval3;
  }
  
  public BigDecimal getXsamtjar() {
    return this.xsamtjar;
  }
  
  public void setXsamtjar(BigDecimal xsamtjar) {
    this.xsamtjar = xsamtjar;
  }
  
  public BigDecimal getXsamtdispat() {
    return this.xsamtdispat;
  }
  
  public void setXsamtdispat(BigDecimal xsamtdispat) {
    this.xsamtdispat = xsamtdispat;
  }
  
  public String getXpaymenttype() {
    return this.xpaymenttype;
  }
  
  public void setXpaymenttype(String xpaymenttype) {
    this.xpaymenttype = xpaymenttype;
  }
  
  public String getXcusold() {
    return this.xcusold;
  }
  
  public void setXcusold(String xcusold) {
    this.xcusold = xcusold;
  }
  
  public String getXvatregno() {
    return this.xvatregno;
  }
  
  public void setXvatregno(String xvatregno) {
    this.xvatregno = xvatregno;
  }
  
  public String getXvatdef() {
    return this.xvatdef;
  }
  
  public void setXvatdef(String xvatdef) {
    this.xvatdef = xvatdef;
  }
  
  public String getZactive() {
    return this.zactive;
  }
  
  public void setZactive(String zactive) {
    this.zactive = zactive;
  }
  
  public String getXcity() {
    return this.xcity;
  }
  
  public void setXcity(String xcity) {
    this.xcity = xcity;
  }
  
  public String getXcountry() {
    return this.xcountry;
  }
  
  public void setXcountry(String xcountry) {
    this.xcountry = xcountry;
  }
  
  public String getXtin() {
    return this.xtin;
  }
  
  public void setXtin(String xtin) {
    this.xtin = xtin;
  }
  
  public String getXlicense() {
    return this.xlicense;
  }
  
  public void setXlicense(String xlicense) {
    this.xlicense = xlicense;
  }
  
  public String getXpostcode() {
    return this.xpostcode;
  }
  
  public void setXpostcode(String xpostcode) {
    this.xpostcode = xpostcode;
  }
  
  public String getXcontactphn() {
    return this.xcontactphn;
  }
  
  public void setXcontactphn(String xcontactphn) {
    this.xcontactphn = xcontactphn;
  }
  
  public BigDecimal getXporamt() {
    return this.xporamt;
  }
  
  public void setXporamt(BigDecimal xporamt) {
    this.xporamt = xporamt;
  }
  
  public BigDecimal getXbonuspoints() {
    return this.xbonuspoints;
  }
  
  public void setXbonuspoints(BigDecimal xbonuspoints) {
    this.xbonuspoints = xbonuspoints;
  }
  
  public Integer getXexpday() {
    return this.xexpday;
  }
  
  public void setXexpday(Integer xexpday) {
    this.xexpday = xexpday;
  }
  
  public Integer getXblockday() {
    return this.xblockday;
  }
  
  public void setXblockday(Integer xblockday) {
    this.xblockday = xblockday;
  }
  
  public Integer getXprdcounter() {
    return this.xprdcounter;
  }
  
  public void setXprdcounter(Integer xprdcounter) {
    this.xprdcounter = xprdcounter;
  }
  
  public String getXpadd() {
    return this.xpadd;
  }
  
  public void setXpadd(String xpadd) {
    this.xpadd = xpadd;
  }
  
  public String getXname() {
    return this.xname;
  }
  
  public void setXname(String xname) {
    this.xname = xname;
  }
  
  public String getXoccupation() {
    return this.xoccupation;
  }
  
  public void setXoccupation(String xoccupation) {
    this.xoccupation = xoccupation;
  }
  
  public String getXregion() {
    return this.xregion;
  }
  
  public void setXregion(String xregion) {
    this.xregion = xregion;
  }
  
  public BigDecimal getXdiscdet() {
    return this.xdiscdet;
  }
  
  public void setXdiscdet(BigDecimal xdiscdet) {
    this.xdiscdet = xdiscdet;
  }
  
  public BigDecimal getXdiscdetamt() {
    return this.xdiscdetamt;
  }
  
  public void setXdiscdetamt(BigDecimal xdiscdetamt) {
    this.xdiscdetamt = xdiscdetamt;
  }
  
  public String getXdisctype() {
    return this.xdisctype;
  }
  
  public void setXdisctype(String xdisctype) {
    this.xdisctype = xdisctype;
  }
  
  public BigDecimal getXreqbonuspoints() {
    return this.xreqbonuspoints;
  }
  
  public void setXreqbonuspoints(BigDecimal xreqbonuspoints) {
    this.xreqbonuspoints = xreqbonuspoints;
  }
  
  public BigDecimal getXearnedbonusamt() {
    return this.xearnedbonusamt;
  }
  
  public void setXearnedbonusamt(BigDecimal xearnedbonusamt) {
    this.xearnedbonusamt = xearnedbonusamt;
  }
  
  public String getXsupnewitem() {
    return this.xsupnewitem;
  }
  
  public void setXsupnewitem(String xsupnewitem) {
    this.xsupnewitem = xsupnewitem;
  }
  
  public String getXdeliloc() {
    return this.xdeliloc;
  }
  
  public void setXdeliloc(String xdeliloc) {
    this.xdeliloc = xdeliloc;
  }
  
  public String getXdesignation() {
    return this.xdesignation;
  }
  
  public void setXdesignation(String xdesignation) {
    this.xdesignation = xdesignation;
  }
  
  public String getXcustype() {
    return this.xcustype;
  }
  
  public void setXcustype(String xcustype) {
    this.xcustype = xcustype;
  }
  
  public String getXdelicontact() {
    return this.xdelicontact;
  }
  
  public void setXdelicontact(String xdelicontact) {
    this.xdelicontact = xdelicontact;
  }
  
  public String getXdelicontactphn() {
    return this.xdelicontactphn;
  }
  
  public void setXdelicontactphn(String xdelicontactphn) {
    this.xdelicontactphn = xdelicontactphn;
  }
  
  public String getXsalesperson() {
    return this.xsalesperson;
  }
  
  public void setXsalesperson(String xsalesperson) {
    this.xsalesperson = xsalesperson;
  }
  
  public String getXtransshipment() {
    return this.xtransshipment;
  }
  
  public void setXtransshipment(String xtransshipment) {
    this.xtransshipment = xtransshipment;
  }
  
  public String getXsex() {
    return this.xsex;
  }
  
  public void setXsex(String xsex) {
    this.xsex = xsex;
  }
  
  public String getXexpetriot() {
    return this.xexpetriot;
  }
  
  public void setXexpetriot(String xexpetriot) {
    this.xexpetriot = xexpetriot;
  }
  
  public Integer getXcycle() {
    return this.xcycle;
  }
  
  public void setXcycle(Integer xcycle) {
    this.xcycle = xcycle;
  }
  
  public Integer getXcrperiod() {
    return this.xcrperiod;
  }
  
  public void setXcrperiod(Integer xcrperiod) {
    this.xcrperiod = xcrperiod;
  }
  
  public String getXmeritalstatus() {
    return this.xmeritalstatus;
  }
  
  public void setXmeritalstatus(String xmeritalstatus) {
    this.xmeritalstatus = xmeritalstatus;
  }
  
  public Date getXbirthdate() {
    return this.xbirthdate;
  }
  
  public void setXbirthdate(Date xbirthdate) {
    this.xbirthdate = xbirthdate;
  }
  
  public String getXspouse() {
    return this.xspouse;
  }
  
  public void setXspouse(String xspouse) {
    this.xspouse = xspouse;
  }
  
  public String getXmigrationdate() {
    return this.xmigrationdate;
  }
  
  public void setXmigrationdate(String xmigrationdate) {
    this.xmigrationdate = xmigrationdate;
  }
  
  public String getXcompany() {
    return this.xcompany;
  }
  
  public void setXcompany(String xcompany) {
    this.xcompany = xcompany;
  }
  
  public String getXemailcomp() {
    return this.xemailcomp;
  }
  
  public void setXemailcomp(String xemailcomp) {
    this.xemailcomp = xemailcomp;
  }
  
  public String getXbank() {
    return this.xbank;
  }
  
  public void setXbank(String xbank) {
    this.xbank = xbank;
  }
  
  public String getXbranch() {
    return this.xbranch;
  }
  
  public void setXbranch(String xbranch) {
    this.xbranch = xbranch;
  }
  
  public String getXacc() {
    return this.xacc;
  }
  
  public void setXacc(String xacc) {
    this.xacc = xacc;
  }
  
  public String getXrouting() {
    return this.xrouting;
  }
  
  public void setXrouting(String xrouting) {
    this.xrouting = xrouting;
  }
  
  public String getXacctype() {
    return this.xacctype;
  }
  
  public void setXacctype(String xacctype) {
    this.xacctype = xacctype;
  }
  
  public BigDecimal getXbonusbal() {
    return this.xbonusbal;
  }
  
  public void setXbonusbal(BigDecimal xbonusbal) {
    this.xbonusbal = xbonusbal;
  }
  
  public Date getXdatepo() {
    return this.xdatepo;
  }
  
  public void setXdatepo(Date xdatepo) {
    this.xdatepo = xdatepo;
  }
  
  public String getXbeneficiary() {
    return this.xbeneficiary;
  }
  
  public void setXbeneficiary(String xbeneficiary) {
    this.xbeneficiary = xbeneficiary;
  }
  
  public BigDecimal getXenlistedfee() {
    return this.xenlistedfee;
  }
  
  public void setXenlistedfee(BigDecimal xenlistedfee) {
    this.xenlistedfee = xenlistedfee;
  }
  
  public String getXstaff() {
    return this.xstaff;
  }
  
  public void setXstaff(String xstaff) {
    this.xstaff = xstaff;
  }
  
  public String getXidsup() {
    return this.xidsup;
  }
  
  public void setXidsup(String xidsup) {
    this.xidsup = xidsup;
  }
  
  public String getXsuperior2() {
    return this.xsuperior2;
  }
  
  public void setXsuperior2(String xsuperior2) {
    this.xsuperior2 = xsuperior2;
  }
  
  public String getXsuperior3() {
    return this.xsuperior3;
  }
  
  public void setXsuperior3(String xsuperior3) {
    this.xsuperior3 = xsuperior3;
  }
  
  public String getXsignatory1() {
    return this.xsignatory1;
  }
  
  public void setXsignatory1(String xsignatory1) {
    this.xsignatory1 = xsignatory1;
  }
  
  public Date getXsigndate1() {
    return this.xsigndate1;
  }
  
  public void setXsigndate1(Date xsigndate1) {
    this.xsigndate1 = xsigndate1;
  }
  
  public String getXsignatory2() {
    return this.xsignatory2;
  }
  
  public void setXsignatory2(String xsignatory2) {
    this.xsignatory2 = xsignatory2;
  }
  
  public Date getXsigndate2() {
    return this.xsigndate2;
  }
  
  public void setXsigndate2(Date xsigndate2) {
    this.xsigndate2 = xsigndate2;
  }
  
  public String getXsignatory3() {
    return this.xsignatory3;
  }
  
  public void setXsignatory3(String xsignatory3) {
    this.xsignatory3 = xsignatory3;
  }
  
  public Date getXsigndate3() {
    return this.xsigndate3;
  }
  
  public void setXsigndate3(Date xsigndate3) {
    this.xsigndate3 = xsigndate3;
  }
  
  public String getXsignatory4() {
    return this.xsignatory4;
  }
  
  public void setXsignatory4(String xsignatory4) {
    this.xsignatory4 = xsignatory4;
  }
  
  public Date getXsigndate4() {
    return this.xsigndate4;
  }
  
  public void setXsigndate4(Date xsigndate4) {
    this.xsigndate4 = xsigndate4;
  }
  
  public String getXsignatory5() {
    return this.xsignatory5;
  }
  
  public void setXsignatory5(String xsignatory5) {
    this.xsignatory5 = xsignatory5;
  }
  
  public Date getXsigndate5() {
    return this.xsigndate5;
  }
  
  public void setXsigndate5(Date xsigndate5) {
    this.xsigndate5 = xsigndate5;
  }
  
  public String getXsignatory6() {
    return this.xsignatory6;
  }
  
  public void setXsignatory6(String xsignatory6) {
    this.xsignatory6 = xsignatory6;
  }
  
  public Date getXsigndate6() {
    return this.xsigndate6;
  }
  
  public void setXsigndate6(Date xsigndate6) {
    this.xsigndate6 = xsigndate6;
  }
  
  public String getXsignatory7() {
    return this.xsignatory7;
  }
  
  public void setXsignatory7(String xsignatory7) {
    this.xsignatory7 = xsignatory7;
  }
  
  public Date getXsigndate7() {
    return this.xsigndate7;
  }
  
  public void setXsigndate7(Date xsigndate7) {
    this.xsigndate7 = xsigndate7;
  }
  
  public String getXsignreject() {
    return this.xsignreject;
  }
  
  public void setXsignreject(String xsignreject) {
    this.xsignreject = xsignreject;
  }
  
  public Date getXdatereject() {
    return this.xdatereject;
  }
  
  public void setXdatereject(Date xdatereject) {
    this.xdatereject = xdatereject;
  }
  
  public String getXshopno() {
    return this.xshopno;
  }
  
  public void setXshopno(String xshopno) {
    this.xshopno = xshopno;
  }
  
  public int hashCode() {
    int hash = 0;
    hash += (this.xcus != null) ? this.xcus.hashCode() : 0;
    return hash;
  }
  
  public boolean equals(Object object) {
    if (!(object instanceof orange.com.bean.Cacus))
      return false; 
    orange.com.bean.Cacus other = (orange.com.bean.Cacus)object;
    if ((this.xcus == null && other.xcus != null) || (this.xcus != null && !this.xcus.equals(other.xcus)))
      return false; 
    return true;
  }
  
  public String toString() {
    return "unbound.com.bean.Cacus[ xcus=" + this.xcus + " ]";
  }
}
