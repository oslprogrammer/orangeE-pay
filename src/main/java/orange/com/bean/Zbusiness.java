package orange.com.bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Entity
@EntityListeners({AuditingEntityListener.class})
@Table(name = "zbusiness")
public class Zbusiness implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Basic(optional = false)
  @Column(name = "zid")
  private Integer zid;
  
  @Column(name = "ztime")//, updatable = false)
  @CreationTimestamp
  @Temporal(TemporalType.TIMESTAMP)
  private Date ztime;
  
  @UpdateTimestamp
  @Column(name = "zutime")
  @Temporal(TemporalType.TIMESTAMP)
  private Date zutime;
  

  @Column(name = "xshort")
  private String xshort;
  
  @Column(name = "xtaxnum")
  private String xtaxnum;
  
  @Column(name = "zorg",columnDefinition = "TEXT")
  private String zorg;
  
  @Column(name = "xcity")
  private String xcity;
  
  @Column(name = "xstate")
  private String xstate;
  
  @Column(name = "xzip")
  private String xzip;
  
  @Column(name = "xcountry")
  private String xcountry;
  
  @Column(name = "xphone")
  private String xphone;
  
  @Column(name = "xfax")
  private String xfax;
  
  @Column(name = "xcontact")
  private String xcontact;
  
  @Column(name = "xemail")
  private String xemail;
  
  @Column(name = "xurl")
  private String xurl;
  
  @Column(name = "xdformat")
  private String xdformat;
  
  @Column(name = "xdsep")
  private String xdsep;
  
  @Column(name = "xtimage")
  private String xtimage;
  
//  public static long getSerialversionuid() {
//	return serialVersionUID;
//}

@Column(name = "xbimage")
  private String xbimage;
  
  @Column(name = "xcustom")
  private String xcustom;
  
  @Column(name = "zactive")
  private String zactive;
  
  @Column(name = "zemail")
  private String zemail;
  
  @Column(name = "xmadd")
  private String xmadd;
  
  @CreatedBy
  @Column(name = "zauserid")
  private String zauserid;
  
  @LastModifiedBy
  @Column(name = "zuuserid")
  private String zuuserid;
  
  @Column(name = "zaip")
  private String zaip;
  
  @Column(name = "zuip")
  private String zuip;
  
  @Column(name = "xsignatory")
  private String xsignatory;
  
  @Column(name = "xdesignation")
  private String xdesignation;
  
  @Column(name = "xpadd")
  private String xpadd;
  
  @Column(name = "ximage")
  private String ximage;
  
  @Column(name = "xvatregno")
  private String xvatregno;
  
  @Column(name = "xtin")
  private String xtin;
  
  @Column(name = "xcur")
  private String xcur;
  
  @Column(name = "xcat")
  private String xcat; 
  
  
  @Column(name = "xterminal")
  private String xterminal;

  @Column(name = "xdiv")
  private String xdiv;
  
  public Zbusiness() {}
  
  public Zbusiness(Integer zid) {
    this.zid = zid;
  }

/**
 * @return the ztime
 */
public Date getZtime() {
	return ztime;
}

/**
 * @param ztime the ztime to set
 */
public void setZtime(Date ztime) {
	this.ztime = ztime;
}

/**
 * @return the zutime
 */
public Date getZutime() {
	return zutime;
}

/**
 * @param zutime the zutime to set
 */
public void setZutime(Date zutime) {
	this.zutime = zutime;
}

/**
 * @return the zid
 */
public Integer getZid() {
	return zid;
}

/**
 * @param zid the zid to set
 */
public void setZid(Integer zid) {
	this.zid = zid;
}

/**
 * @return the xshort
 */
public String getXshort() {
	return xshort;
}

/**
 * @param xshort the xshort to set
 */
public void setXshort(String xshort) {
	this.xshort = xshort;
}

/**
 * @return the xtaxnum
 */
public String getXtaxnum() {
	return xtaxnum;
}

/**
 * @param xtaxnum the xtaxnum to set
 */
public void setXtaxnum(String xtaxnum) {
	this.xtaxnum = xtaxnum;
}

/**
 * @return the zorg
 */
public String getZorg() {
	return zorg;
}

/**
 * @param zorg the zorg to set
 */
public void setZorg(String zorg) {
	this.zorg = zorg;
}

/**
 * @return the xcity
 */
public String getXcity() {
	return xcity;
}

/**
 * @param xcity the xcity to set
 */
public void setXcity(String xcity) {
	this.xcity = xcity;
}

/**
 * @return the xstate
 */
public String getXstate() {
	return xstate;
}

/**
 * @param xstate the xstate to set
 */
public void setXstate(String xstate) {
	this.xstate = xstate;
}

/**
 * @return the xzip
 */
public String getXzip() {
	return xzip;
}

/**
 * @param xzip the xzip to set
 */
public void setXzip(String xzip) {
	this.xzip = xzip;
}

/**
 * @return the xcountry
 */
public String getXcountry() {
	return xcountry;
}

/**
 * @param xcountry the xcountry to set
 */
public void setXcountry(String xcountry) {
	this.xcountry = xcountry;
}

/**
 * @return the xphone
 */
public String getXphone() {
	return xphone;
}

/**
 * @param xphone the xphone to set
 */
public void setXphone(String xphone) {
	this.xphone = xphone;
}

/**
 * @return the xfax
 */
public String getXfax() {
	return xfax;
}

/**
 * @param xfax the xfax to set
 */
public void setXfax(String xfax) {
	this.xfax = xfax;
}

/**
 * @return the xcontact
 */
public String getXcontact() {
	return xcontact;
}

/**
 * @param xcontact the xcontact to set
 */
public void setXcontact(String xcontact) {
	this.xcontact = xcontact;
}

/**
 * @return the xemail
 */
public String getXemail() {
	return xemail;
}

/**
 * @param xemail the xemail to set
 */
public void setXemail(String xemail) {
	this.xemail = xemail;
}

/**
 * @return the xurl
 */
public String getXurl() {
	return xurl;
}

/**
 * @param xurl the xurl to set
 */
public void setXurl(String xurl) {
	this.xurl = xurl;
}

/**
 * @return the xdformat
 */
public String getXdformat() {
	return xdformat;
}

/**
 * @param xdformat the xdformat to set
 */
public void setXdformat(String xdformat) {
	this.xdformat = xdformat;
}

/**
 * @return the xdsep
 */
public String getXdsep() {
	return xdsep;
}

/**
 * @param xdsep the xdsep to set
 */
public void setXdsep(String xdsep) {
	this.xdsep = xdsep;
}

/**
 * @return the xtimage
 */
public String getXtimage() {
	return xtimage;
}

/**
 * @param xtimage the xtimage to set
 */
public void setXtimage(String xtimage) {
	this.xtimage = xtimage;
}

/**
 * @return the xbimage
 */
public String getXbimage() {
	return xbimage;
}

/**
 * @param xbimage the xbimage to set
 */
public void setXbimage(String xbimage) {
	this.xbimage = xbimage;
}

/**
 * @return the xcustom
 */
public String getXcustom() {
	return xcustom;
}

/**
 * @param xcustom the xcustom to set
 */
public void setXcustom(String xcustom) {
	this.xcustom = xcustom;
}

/**
 * @return the zactive
 */
public String getZactive() {
	return zactive;
}

/**
 * @param zactive the zactive to set
 */
public void setZactive(String zactive) {
	this.zactive = zactive;
}

/**
 * @return the zemail
 */
public String getZemail() {
	return zemail;
}

/**
 * @param zemail the zemail to set
 */
public void setZemail(String zemail) {
	this.zemail = zemail;
}

/**
 * @return the xmadd
 */
public String getXmadd() {
	return xmadd;
}

/**
 * @param xmadd the xmadd to set
 */
public void setXmadd(String xmadd) {
	this.xmadd = xmadd;
}

/**
 * @return the zauserid
 */
public String getZauserid() {
	return zauserid;
}

/**
 * @param zauserid the zauserid to set
 */
public void setZauserid(String zauserid) {
	this.zauserid = zauserid;
}

/**
 * @return the zuuserid
 */
public String getZuuserid() {
	return zuuserid;
}

/**
 * @param zuuserid the zuuserid to set
 */
public void setZuuserid(String zuuserid) {
	this.zuuserid = zuuserid;
}

/**
 * @return the zaip
 */
public String getZaip() {
	return zaip;
}

/**
 * @param zaip the zaip to set
 */
public void setZaip(String zaip) {
	this.zaip = zaip;
}

/**
 * @return the zuip
 */
public String getZuip() {
	return zuip;
}

/**
 * @param zuip the zuip to set
 */
public void setZuip(String zuip) {
	this.zuip = zuip;
}

/**
 * @return the xsignatory
 */
public String getXsignatory() {
	return xsignatory;
}

/**
 * @param xsignatory the xsignatory to set
 */
public void setXsignatory(String xsignatory) {
	this.xsignatory = xsignatory;
}

/**
 * @return the xdesignation
 */
public String getXdesignation() {
	return xdesignation;
}

/**
 * @param xdesignation the xdesignation to set
 */
public void setXdesignation(String xdesignation) {
	this.xdesignation = xdesignation;
}

/**
 * @return the xpadd
 */
public String getXpadd() {
	return xpadd;
}

/**
 * @param xpadd the xpadd to set
 */
public void setXpadd(String xpadd) {
	this.xpadd = xpadd;
}

/**
 * @return the ximage
 */
public String getXimage() {
	return ximage;
}

/**
 * @param ximage the ximage to set
 */
public void setXimage(String ximage) {
	this.ximage = ximage;
}

/**
 * @return the xvatregno
 */
public String getXvatregno() {
	return xvatregno;
}

/**
 * @param xvatregno the xvatregno to set
 */
public void setXvatregno(String xvatregno) {
	this.xvatregno = xvatregno;
}

/**
 * @return the xtin
 */
public String getXtin() {
	return xtin;
}

/**
 * @param xtin the xtin to set
 */
public void setXtin(String xtin) {
	this.xtin = xtin;
}

/**
 * @return the xcur
 */
public String getXcur() {
	return xcur;
}

/**
 * @param xcur the xcur to set
 */
public void setXcur(String xcur) {
	this.xcur = xcur;
}

/**
 * @return the xcat
 */
public String getXcat() {
	return xcat;
}

/**
 * @param xcat the xcat to set
 */
public void setXcat(String xcat) {
	this.xcat = xcat;
}

/**
 * @return the xterminal
 */
public String getXterminal() {
	return xterminal;
}

/**
 * @param xterminal the xterminal to set
 */
public void setXterminal(String xterminal) {
	this.xterminal = xterminal;
}

/**
 * @return the xdiv
 */
public String getXdiv() {
	return xdiv;
}

/**
 * @param xdiv the xdiv to set
 */
public void setXdiv(String xdiv) {
	this.xdiv = xdiv;
}

/**
 * @return the serialversionuid
 */
public static long getSerialversionuid() {
	return serialVersionUID;
}

/**
 * @param ztime
 * @param zutime
 * @param zid
 * @param xshort
 * @param xtaxnum
 * @param zorg
 * @param xcity
 * @param xstate
 * @param xzip
 * @param xcountry
 * @param xphone
 * @param xfax
 * @param xcontact
 * @param xemail
 * @param xurl
 * @param xdformat
 * @param xdsep
 * @param xtimage
 * @param xbimage
 * @param xcustom
 * @param zactive
 * @param zemail
 * @param xmadd
 * @param zauserid
 * @param zuuserid
 * @param zaip
 * @param zuip
 * @param xsignatory
 * @param xdesignation
 * @param xpadd
 * @param ximage
 * @param xvatregno
 * @param xtin
 * @param xcur
 * @param xcat
 * @param xterminal
 * @param xdiv
 */
public Zbusiness(Date ztime, Date zutime, Integer zid, String xshort, String xtaxnum, String zorg, String xcity,
		String xstate, String xzip, String xcountry, String xphone, String xfax, String xcontact, String xemail,
		String xurl, String xdformat, String xdsep, String xtimage, String xbimage, String xcustom, String zactive,
		String zemail, String xmadd, String zauserid, String zuuserid, String zaip, String zuip, String xsignatory,
		String xdesignation, String xpadd, String ximage, String xvatregno, String xtin, String xcur, String xcat,
		String xterminal, String xdiv) {
	super();
	this.ztime = ztime;
	this.zutime = zutime;
	this.zid = zid;
	this.xshort = xshort;
	this.xtaxnum = xtaxnum;
	this.zorg = zorg;
	this.xcity = xcity;
	this.xstate = xstate;
	this.xzip = xzip;
	this.xcountry = xcountry;
	this.xphone = xphone;
	this.xfax = xfax;
	this.xcontact = xcontact;
	this.xemail = xemail;
	this.xurl = xurl;
	this.xdformat = xdformat;
	this.xdsep = xdsep;
	this.xtimage = xtimage;
	this.xbimage = xbimage;
	this.xcustom = xcustom;
	this.zactive = zactive;
	this.zemail = zemail;
	this.xmadd = xmadd;
	this.zauserid = zauserid;
	this.zuuserid = zuuserid;
	this.zaip = zaip;
	this.zuip = zuip;
	this.xsignatory = xsignatory;
	this.xdesignation = xdesignation;
	this.xpadd = xpadd;
	this.ximage = ximage;
	this.xvatregno = xvatregno;
	this.xtin = xtin;
	this.xcur = xcur;
	this.xcat = xcat;
	this.xterminal = xterminal;
	this.xdiv = xdiv;
}


public boolean equals(Object object) {
    if (!(object instanceof orange.com.bean.Zbusiness))
      return false; 
    orange.com.bean.Zbusiness other = (orange.com.bean.Zbusiness)object;
    if ((this.zid == null && other.zid != null) || (this.zid != null && !this.zid.equals(other.zid)))
      return false; 
    return true;
  }


@Override
public String toString() {
	return "Zbusiness [ztime=" + ztime + ", zutime=" + zutime + ", zid=" + zid + ", xshort=" + xshort + ", xtaxnum="
			+ xtaxnum + ", zorg=" + zorg + ", xcity=" + xcity + ", xstate=" + xstate + ", xzip=" + xzip + ", xcountry="
			+ xcountry + ", xphone=" + xphone + ", xfax=" + xfax + ", xcontact=" + xcontact + ", xemail=" + xemail
			+ ", xurl=" + xurl + ", xdformat=" + xdformat + ", xdsep=" + xdsep + ", xtimage=" + xtimage + ", xbimage="
			+ xbimage + ", xcustom=" + xcustom + ", zactive=" + zactive + ", zemail=" + zemail + ", xmadd=" + xmadd
			+ ", zauserid=" + zauserid + ", zuuserid=" + zuuserid + ", zaip=" + zaip + ", zuip=" + zuip
			+ ", xsignatory=" + xsignatory + ", xdesignation=" + xdesignation + ", xpadd=" + xpadd + ", ximage="
			+ ximage + ", xvatregno=" + xvatregno + ", xtin=" + xtin + ", xcur=" + xcur + ", xcat=" + xcat
			+ ", xterminal=" + xterminal + ", xdiv=" + xdiv + "]";
}
  
  
  
//  public boolean equals(Object object) {
//    if (!(object instanceof com.dibrosys.dev.bean.Zbusiness))
//      return false; 
//    com.dibrosys.dev.bean.Zbusiness other = (com.dibrosys.dev.bean.Zbusiness)object;
//    if ((this.zid == null && other.zid != null) || (this.zid != null && !this.zid.equals(other.zid)))
//      return false; 
//    return true;
//  }
//  
//  public String toString() {
//    return "com.dibrosys.dev.bean.Zbusiness[ zid=" + this.zid + " ]";
//  }
//public Zbusiness() 
//{
//	
//}


}
