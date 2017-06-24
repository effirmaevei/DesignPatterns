package DataEncryptorDecorator;

public class EncryptedDataCrystal extends DataCrystal{	
	
	protected DataCrystal dataCrystal;

    public EncryptedDataCrystal(DataCrystal dataCrystal){
        this.dataCrystal = dataCrystal;
    }

}
