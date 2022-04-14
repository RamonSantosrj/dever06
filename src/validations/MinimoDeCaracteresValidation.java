package validations;

import interfaces.IValidation;

public class MinimoDeCaracteresValidation implements IValidation {

	@Override
	public boolean isValid(Object value) {
		
		if (value != null && value instanceof String) {

			String texto = (String) value;

			return texto.trim().length() >= 1;
		}
		
		return false;
	}

}
