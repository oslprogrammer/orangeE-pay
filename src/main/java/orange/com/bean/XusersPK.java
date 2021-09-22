package orange.com.bean;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Embeddable
public class XusersPK  implements Serializable {

	  @Basic(optional = false)
	  @Column(name = "user_id")
//	  @GeneratedValue
	  private int user_id;
	  

	  @Basic(optional = false)
	  @Column(name = "zemail")
	  private String zemail;
	  

	  
	  
	  public XusersPK() {}





	/**
	 * @param user_id
	 * @param zemail
	 */
	public XusersPK(int user_id, String zemail) {
		super();
		this.user_id = user_id;
		this.zemail = zemail;
	}





	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + user_id;
		result = prime * result + ((zemail == null) ? 0 : zemail.hashCode());
		return result;
	}












	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		XusersPK other = (XusersPK) obj;
		if (user_id != other.user_id)
			return false;
		if (zemail == null) {
			if (other.zemail != null)
				return false;
		} else if (!zemail.equals(other.zemail))
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
		// TODO Auto-generated method stub
		return super.toString();
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





	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	/**
	 * @return the user_id
	 */
	public int getUser_id() {
		return user_id;
	}

	/**
	 * @param user_id the user_id to set
	 */
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	/**
	 * @param user_id
	 */
//	public XusersPK(int user_id) {
//		super();
//		this.user_id = user_id;
//	}
	  
	  
	  
}
