package my.spitterP.mainP;



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

	}

}
