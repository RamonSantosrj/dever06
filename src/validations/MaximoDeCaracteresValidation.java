package validations;

import interfaces.IValidation;

public class MaximoDeCaracteresValidation implements IValidation{

	@Override
	public boolean isValid(Object value) {
		if (value != null && value instanceof String) {

			String texto = (String) value;

			return texto.trim().length() <= 15;
		}
		return false;
	}
	
	
	
}
