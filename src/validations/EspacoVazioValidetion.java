package validations;

import interfaces.IValidation;

public class EspacoVazioValidetion implements IValidation {

	@Override
	public boolean isValid(Object value) {

		if (value != null && value instanceof String) {

			String texto = (String) value;

			return texto.trim().contains(" ") != true ;
		}

		return true;
	}

}
