package orange.com.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import orange.com.bean.Zbusiness;
import orange.com.dao.impl.IZbusinessDAO;

@Repository(value = "businessDAO")
@Transactional
public class ZbusinessDAO implements IZbusinessDAO{
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public Zbusiness save(Zbusiness t) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(t);
		sessionFactory.getCurrentSession().flush();
		return t;
	}

	@Override
	public Zbusiness update(Zbusiness t) {
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
		List<Zbusiness> businessList = sessionFactory.getCurrentSession().createCriteria(Zbusiness.class).list();
        sessionFactory.getCurrentSession().flush();
        return businessList;
	}

	@Override
	public Zbusiness getById(int id) {
		// TODO Auto-generated method stub
		Zbusiness zbusiness = (Zbusiness) sessionFactory.getCurrentSession().get(Zbusiness.class, id);
        sessionFactory.getCurrentSession().flush();
        return zbusiness;
	}

}
