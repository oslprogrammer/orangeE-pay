package orange.com.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import orange.com.bean.Zbusiness;
import orange.com.dao.ZbusinessDAO;
import orange.com.service.impl.IZbusinessService;

@Service(value = "zbusinessService")
public class ZbusinessService implements IZbusinessService{
	
	@Autowired
	ZbusinessDAO zbusinessDAO;

	@Override
	public Zbusiness save(HttpServletRequest request) {
		Zbusiness zbusiness = new Zbusiness();
		zbusiness.setXshort(request.getParameter("xshort"));
		zbusiness.setXtaxnum(request.getParameter("xtaxnum"));
		zbusiness.setZorg(request.getParameter("zorg"));
		zbusiness.setXcity(request.getParameter("xcity"));
		zbusiness.setXstate(request.getParameter("xstate"));
		zbusiness.setXzip(request.getParameter("xzip"));
		zbusiness.setXcountry(request.getParameter("xcountry"));
		zbusiness.setXphone(request.getParameter("xphone"));
		zbusiness.setXfax(request.getParameter("xfax"));
		zbusiness.setXcontact(request.getParameter("xcontact"));
		zbusiness.setXemail(request.getParameter("xemail"));
		zbusiness.setXurl(request.getParameter("xurl"));
		zbusiness.setXdformat(request.getParameter("xdformat"));
		zbusiness.setXdsep(request.getParameter("xdsep"));
		zbusiness.setXtimage(request.getParameter("xtimage"));
		zbusiness.setXbimage(request.getParameter("xbimage"));
		zbusiness.setXcustom(request.getParameter("xcustom"));
		zbusiness.setZactive(request.getParameter("zactive"));
		zbusiness.setZemail(request.getParameter("zemail"));
		zbusiness.setXmadd(request.getParameter("xmadd"));
		zbusiness.setZaip(request.getParameter("zaip"));
		zbusiness.setZuip(request.getParameter("zuip"));
		zbusiness.setXsignatory(request.getParameter("xsignatory"));
		zbusiness.setXdesignation(request.getParameter("xdesignation"));
		zbusiness.setXpadd(request.getParameter("xpadd"));
		zbusiness.setXimage(request.getParameter("ximage"));
		zbusiness.setXvatregno(request.getParameter("xvatregno"));
		zbusiness.setXtin(request.getParameter("xtin"));
		zbusiness.setXcur(request.getParameter("xcur"));
		zbusiness.setXcat(request.getParameter("xcat"));
		zbusiness.setXterminal(request.getParameter("xterminal"));
		zbusiness.setXdiv(request.getParameter("xdiv"));

		
		
		System.out.println("---------------" + zbusiness.getZorg());
		System.out.println("---------------" + zbusiness.getXcity());
		
		zbusinessDAO.save(zbusiness);
		return zbusiness;
	}

	@Override
	public Zbusiness update(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Zbusiness delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Zbusiness> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Zbusiness getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
