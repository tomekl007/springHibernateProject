package my.spitterP.mainP;



import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;


public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("conf.xml");
		ctx.refresh();
		
		SpitterDao spitterDao = ctx.getBean("databaseFacade", SpitterDao.class);
		
		Spitter s = spitterDao.getSpitterById(1);
		System.out.println(s.getFullName());
		List<Spitter> lS = spitterDao.findAllSpitters();
		System.out.println(lS);
		
		List<Spittle> lS2 = spitterDao.getRecentSpittle();
		System.out.println(lS2);
		
		
		Spittle spittle = spitterDao.getSpittleById(1);
		System.out.println(spittle.getText());
		

	}

}
