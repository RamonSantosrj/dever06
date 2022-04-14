package validations;

import interfaces.IValidation;

public class IdentificadorValidation implements IValidation {

	@Override
	public boolean isValid(Object value) {
		if(value != null && value instanceof Integer) {
			Integer id = (Integer) value;
			
			return id > 0;
		
		}
		
		return false;
	}

	
}
