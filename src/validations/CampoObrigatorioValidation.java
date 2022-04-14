package validations;

import interfaces.IValidation;

public class CampoObrigatorioValidation implements IValidation{

	@Override
	public boolean isValid(Object value) {
		
		
		if(value != null && value instanceof String) {
			
			String texto = (String) value;
			
			return texto.trim().isEmpty() != true;
		}
		
		return false;
	}

	
	
	
}
