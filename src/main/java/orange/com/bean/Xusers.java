package orange.com.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;

@Entity
@Table(name = "xusers")
@NamedQueries({@NamedQuery(name = "Xusers.findAll", query = "SELECT x FROM Xusers x")})
public class Xusers implements Serializable {
	private static long serialVersionUID = 1L;
	
//	private Set<Users_roles> users_roles = new HashSet<Users_roles>();
//	  
//    public Set<Users_roles> getUsers_roles() { return users_roles; }
//    void setParts(Set users_roles) { this.users_roles = users_roles; };
	  @EmbeddedId
	  protected XusersPK xusersPK;

//	  @Id
//	  @GeneratedValue
//	  @Column(name = "user_id")
//	  private long user_id;	
	  
	  
	  
//	    @OneToMany(mappedBy = "Xusers", cascade = CascadeType.ALL)
//	    private Set<Users_roles> u_roles = new HashSet<>();
//	    
//
//	    public Set<Users_roles> getRoles() {
//	        return u_roles;
//	    }
//
//	    public void setUser_Roles(Set<Users_roles> u_roles) {
//	        this.u_roles = u_roles;
//
//	        for(Users_roles b : u_roles) {
//	            b.setxusers(this);
//	        }
//	    }    
	    
	    
	    

//	  @Id
//	  @Basic(optional = false)
//	  @Column(name = "zemail")
//	  private String zemail;
//	  
//
//	  
	  @Column(name = "xaccess")
	  private String xaccess;
	  
	  @Column(name = "xdformat")
	  private String xdformat;
	  
	  @Column(name = "xdsep")
	  private String xdsep;
	  
	  @Column(name = "xlastlogdate")
	  @Temporal(TemporalType.TIMESTAMP)
	  private Date xlastlogdate;
	  
	  @Column(name = "xname")
	  private String xname;
	  
	  @Column(name = "xoldpass")
	  private String xoldpass;
	  
	  @Column(name = "xpassword")
	  private String xpassword;
	  
	  @Column(name = "xposition")
	  private String xposition;
	  
	  @Column(name = "xpriority")
	  private String xpriority;
	  
	  @Column(name = "xrole")
	  private String xrole;
	  
	  @Column(name = "xsp")
	  private String xsp;
	  
	  @Column(name = "xwh")
	  private String xwh;
	  
	  @Column(name = "zactive")
	  private String zactive;
	  
	  @Column(name = "zaip")
	  private String zaip;
	  
	  @Column(name = "zauserid")
	  @CreatedBy
	  private String zauserid;
	  
//	  @Id
	  @Column(name = "zid")
	  private Integer zid;
	  
	  @Column(name = "ztime")
	  @CreationTimestamp
	  @Temporal(TemporalType.TIMESTAMP)
	  private Date ztime;
	  
	  @Column(name = "zuip")
	  private String zuip;
	  
	  @Column(name = "zutime")
	  @UpdateTimestamp
	  @Temporal(TemporalType.TIMESTAMP)
	  private Date zutime;
	  
	  @Column(name = "zuuserid")
	  @LastModifiedBy
	  private String zuuserid;
	  

	  
	  public Xusers() {}
	  
//	  public Xusers(String zemail) {
//	    this.zemail = zemail;
//	  }
//	  
//	  public String getZemail() {
//	    return this.zemail;
//	  }
//	  
//	  public void setZemail(String zemail) {
//	    this.zemail = zemail;
//	  }
	  
	  public String getXaccess() {
	    return this.xaccess;
	  }
	  
	  public void setXaccess(String xaccess) {
	    this.xaccess = xaccess;
	  }
	  
	  public String getXdformat() {
	    return this.xdformat;
	  }
	  
	  public void setXdformat(String xdformat) {
	    this.xdformat = xdformat;
	  }
	  
	  public String getXdsep() {
	    return this.xdsep;
	  }
	  
	  public void setXdsep(String xdsep) {
	    this.xdsep = xdsep;
	  }
	  
	  public Date getXlastlogdate() {
	    return this.xlastlogdate;
	  }
	  
	  public void setXlastlogdate(Date xlastlogdate) {
	    this.xlastlogdate = xlastlogdate;
	  }
	  
	  public String getXname() {
	    return this.xname;
	  }
	  
	  public void setXname(String xname) {
	    this.xname = xname;
	  }
	  
	  public String getXoldpass() {
	    return this.xoldpass;
	  }
	  
	  public void setXoldpass(String xoldpass) {
	    this.xoldpass = xoldpass;
	  }
	  
	  public String getXpassword() {
	    return this.xpassword;
	  }
	  
	  public void setXpassword(String xpassword) {
	    this.xpassword = xpassword;
	  }
	  
	  public String getXposition() {
	    return this.xposition;
	  }
	  
	  public void setXposition(String xposition) {
	    this.xposition = xposition;
	  }
	  
	  public String getXpriority() {
	    return this.xpriority;
	  }
	  
	  public void setXpriority(String xpriority) {
	    this.xpriority = xpriority;
	  }
	  
	  public String getXrole() {
	    return this.xrole;
	  }
	  
	  public void setXrole(String xrole) {
	    this.xrole = xrole;
	  }
	  
	  public String getXsp() {
	    return this.xsp;
	  }
	  
	  public void setXsp(String xsp) {
	    this.xsp = xsp;
	  }
	  
	  public String getXwh() {
	    return this.xwh;
	  }
	  
	  public void setXwh(String xwh) {
	    this.xwh = xwh;
	  }
	  
	  public String getZactive() {
	    return this.zactive;
	  }
	  
	  public void setZactive(String zactive) {
	    this.zactive = zactive;
	  }
	  
	  public String getZaip() {
	    return this.zaip;
	  }
	  
	  public void setZaip(String zaip) {
	    this.zaip = zaip;
	  }
	  
	  public String getZauserid() {
	    return this.zauserid;
	  }
	  
	  public void setZauserid(String zauserid) {
	    this.zauserid = zauserid;
	  }
	  
	  public Integer getZid() {
	    return this.zid;
	  }
	  
	  public void setZid(Integer zid) {
	    this.zid = zid;
	  }
	  
	  public Date getZtime() {
	    return this.ztime;
	  }
	  
	  public void setZtime(Date ztime) {
	    this.ztime = ztime;
	  }
	  
	  public String getZuip() {
	    return this.zuip;
	  }
	  
	  public void setZuip(String zuip) {
	    this.zuip = zuip;
	  }
	  
	  public Date getZutime() {
	    return this.zutime;
	  }
	  
	  public void setZutime(Date zutime) {
	    this.zutime = zutime;
	  }
	  
	  public String getZuuserid() {
	    return this.zuuserid;
	  }
	  
	  public void setZuuserid(String zuuserid) {
	    this.zuuserid = zuuserid;
	  }
	  

	  
	  public Xusers(XusersPK xusersPK) {
		    this.xusersPK = xusersPK;
		  }
		  
		  public Xusers(XusersPK xusersPK, int zid) {
		    this.xusersPK = xusersPK;
		    this.zid = zid;
		  }
		  
		  public Xusers(int user_id, String zemail) {
		    this.xusersPK = new XusersPK(user_id,zemail);
		  }
		  
		  
		  public XusersPK geXusersPK() {
		    return this.xusersPK;
		  }
		  
		  
		  public void setXusersPK(XusersPK xusersPK) {
			  this.xusersPK = xusersPK;
			  }

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((xaccess == null) ? 0 : xaccess.hashCode());
			result = prime * result + ((xdformat == null) ? 0 : xdformat.hashCode());
			result = prime * result + ((xdsep == null) ? 0 : xdsep.hashCode());
			result = prime * result + ((xlastlogdate == null) ? 0 : xlastlogdate.hashCode());
			result = prime * result + ((xname == null) ? 0 : xname.hashCode());
			result = prime * result + ((xoldpass == null) ? 0 : xoldpass.hashCode());
			result = prime * result + ((xpassword == null) ? 0 : xpassword.hashCode());
			result = prime * result + ((xposition == null) ? 0 : xposition.hashCode());
			result = prime * result + ((xpriority == null) ? 0 : xpriority.hashCode());
			result = prime * result + ((xrole == null) ? 0 : xrole.hashCode());
			result = prime * result + ((xsp == null) ? 0 : xsp.hashCode());
			result = prime * result + ((xusersPK == null) ? 0 : xusersPK.hashCode());
			result = prime * result + ((xwh == null) ? 0 : xwh.hashCode());
			result = prime * result + ((zactive == null) ? 0 : zactive.hashCode());
			result = prime * result + ((zaip == null) ? 0 : zaip.hashCode());
			result = prime * result + ((zauserid == null) ? 0 : zauserid.hashCode());
			result = prime * result + ((zid == null) ? 0 : zid.hashCode());
			result = prime * result + ((ztime == null) ? 0 : ztime.hashCode());
			result = prime * result + ((zuip == null) ? 0 : zuip.hashCode());
			result = prime * result + ((zutime == null) ? 0 : zutime.hashCode());
			result = prime * result + ((zuuserid == null) ? 0 : zuuserid.hashCode());
			return result;
		}





		/**
		 * @param serialversionuid the serialversionuid to set
		 */
		public static void setSerialversionuid(long serialversionuid) {
			serialVersionUID = serialversionuid;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Xusers other = (Xusers) obj;

			if (xaccess == null) {
				if (other.xaccess != null)
					return false;
			} else if (!xaccess.equals(other.xaccess))
				return false;
			if (xdformat == null) {
				if (other.xdformat != null)
					return false;
			} else if (!xdformat.equals(other.xdformat))
				return false;
			if (xdsep == null) {
				if (other.xdsep != null)
					return false;
			} else if (!xdsep.equals(other.xdsep))
				return false;
			if (xlastlogdate == null) {
				if (other.xlastlogdate != null)
					return false;
			} else if (!xlastlogdate.equals(other.xlastlogdate))
				return false;
			if (xname == null) {
				if (other.xname != null)
					return false;
			} else if (!xname.equals(other.xname))
				return false;
			if (xoldpass == null) {
				if (other.xoldpass != null)
					return false;
			} else if (!xoldpass.equals(other.xoldpass))
				return false;
			if (xpassword == null) {
				if (other.xpassword != null)
					return false;
			} else if (!xpassword.equals(other.xpassword))
				return false;
			if (xposition == null) {
				if (other.xposition != null)
					return false;
			} else if (!xposition.equals(other.xposition))
				return false;
			if (xpriority == null) {
				if (other.xpriority != null)
					return false;
			} else if (!xpriority.equals(other.xpriority))
				return false;
			if (xrole == null) {
				if (other.xrole != null)
					return false;
			} else if (!xrole.equals(other.xrole))
				return false;
			if (xsp == null) {
				if (other.xsp != null)
					return false;
			} else if (!xsp.equals(other.xsp))
				return false;
			if (xusersPK == null) {
				if (other.xusersPK != null)
					return false;
			} else if (!xusersPK.equals(other.xusersPK))
				return false;
			if (xwh == null) {
				if (other.xwh != null)
					return false;
			} else if (!xwh.equals(other.xwh))
				return false;
			if (zactive == null) {
				if (other.zactive != null)
					return false;
			} else if (!zactive.equals(other.zactive))
				return false;
			if (zaip == null) {
				if (other.zaip != null)
					return false;
			} else if (!zaip.equals(other.zaip))
				return false;
			if (zauserid == null) {
				if (other.zauserid != null)
					return false;
			} else if (!zauserid.equals(other.zauserid))
				return false;
			if (zid == null) {
				if (other.zid != null)
					return false;
			} else if (!zid.equals(other.zid))
				return false;
			if (ztime == null) {
				if (other.ztime != null)
					return false;
			} else if (!ztime.equals(other.ztime))
				return false;
			if (zuip == null) {
				if (other.zuip != null)
					return false;
			} else if (!zuip.equals(other.zuip))
				return false;
			if (zutime == null) {
				if (other.zutime != null)
					return false;
			} else if (!zutime.equals(other.zutime))
				return false;
			if (zuuserid == null) {
				if (other.zuuserid != null)
					return false;
			} else if (!zuuserid.equals(other.zuuserid))
				return false;
			return true;
		}

		@Override
		protected Object clone() throws CloneNotSupportedException {
			// TODO Auto-generated method stub
			return super.clone();
		}

		@Override
		public String toString() {
			return "Xusers [xusersPK=" + xusersPK + ", xaccess=" + xaccess + ", xdformat=" + xdformat + ", xdsep="
					+ xdsep + ", xlastlogdate=" + xlastlogdate + ", xname=" + xname + ", xoldpass=" + xoldpass
					+ ", xpassword=" + xpassword + ", xposition=" + xposition + ", xpriority=" + xpriority + ", xrole="
					+ xrole + ", xsp=" + xsp + ", xwh=" + xwh + ", zactive=" + zactive + ", zaip=" + zaip
					+ ", zauserid=" + zauserid + ", zid=" + zid + ", ztime=" + ztime + ", zuip=" + zuip + ", zutime="
					+ zutime + ", zuuserid=" + zuuserid + "]";
		}

		@Override
		protected void finalize() throws Throwable {
			// TODO Auto-generated method stub
			super.finalize();
		}

		/**
		 * @return the serialversionuid
		 */
		public static long getSerialversionuid() {
			return serialVersionUID;
		}

		/**
		 * @return the xusersPK
		 */
		public XusersPK getXusersPK() {
			return xusersPK;
		}

		/**
		 * @param xusersPK
		 * @param xaccess
		 * @param xdformat
		 * @param xdsep
		 * @param xlastlogdate
		 * @param xname
		 * @param xoldpass
		 * @param xpassword
		 * @param xposition
		 * @param xpriority
		 * @param xrole
		 * @param xsp
		 * @param xwh
		 * @param zactive
		 * @param zaip
		 * @param zauserid
		 * @param zid
		 * @param ztime
		 * @param zuip
		 * @param zutime
		 * @param zuuserid
		 */
		public Xusers(XusersPK xusersPK, String xaccess, String xdformat, String xdsep, Date xlastlogdate, String xname,
				String xoldpass, String xpassword, String xposition, String xpriority, String xrole, String xsp,
				String xwh, String zactive, String zaip, String zauserid, Integer zid, Date ztime, String zuip,
				Date zutime, String zuuserid) {
			super();
			this.xusersPK = xusersPK;
			this.xaccess = xaccess;
			this.xdformat = xdformat;
			this.xdsep = xdsep;
			this.xlastlogdate = xlastlogdate;
			this.xname = xname;
			this.xoldpass = xoldpass;
			this.xpassword = xpassword;
			this.xposition = xposition;
			this.xpriority = xpriority;
			this.xrole = xrole;
			this.xsp = xsp;
			this.xwh = xwh;
			this.zactive = zactive;
			this.zaip = zaip;
			this.zauserid = zauserid;
			this.zid = zid;
			this.ztime = ztime;
			this.zuip = zuip;
			this.zutime = zutime;
			this.zuuserid = zuuserid;
		}
		  	  
		  
//		  
    
	  
}
