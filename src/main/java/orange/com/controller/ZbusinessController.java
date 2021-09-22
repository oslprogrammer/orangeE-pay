package orange.com.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import orange.com.bean.Zbusiness;
import orange.com.controller.impl.IZbusinessController;
import orange.com.service.impl.IZbusinessService;

@RestController
public class ZbusinessController implements IZbusinessController{
	
	@Autowired
	IZbusinessService zbusinessService;

	@Override
	@RequestMapping("/businessSave")
    public ModelAndView save(HttpServletRequest request) {
        System.out.println("*********** Hitted ***********");
        Zbusiness zbusiness = zbusinessService.save(request);

        Map<String, Object> map = new HashMap<>();
        if (zbusiness != null) {
            map.put("status", "Data Saved");
            return new ModelAndView("zbusiness", "map", map);
        } else {
            map.put("status", "Data NOT Saved");
            return new ModelAndView("zbusiness", "map", map);
        }
    }

	@Override
	public ModelAndView edit(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelAndView update(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelAndView delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Zbusiness> getAll() {
		// TODO Auto-generated method stub
		List<Zbusiness> zbusinessList = zbusinessService.getAll();
        return zbusinessList;
	}

}
