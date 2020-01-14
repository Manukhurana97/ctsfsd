package jdbcobject;

import java.util.List;

public class empserimp implements empservise {
	private empserimp dao;
	{
		dao = new empserimp();
	}
	
	@Override
	public List<employee> getAllemployees() throws Exception {
		
		return dao.getAllemployees();
	}

}
