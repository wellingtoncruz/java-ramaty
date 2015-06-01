import com.craam.wellington.interfaces.IInput;
import com.craam.wellington.interfaces.IOutput;
import com.craam.wellington.isrcsr.ISRCSR;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Locale;

import com.craam.wellington.statics.Constants;
import com.craam.wellington.synclab.SyncLab;
import com.craam.wellington.synclab.io.CSVOutput;
import com.craam.wellington.synclab.io.InputData;
import com.craam.wellington.synclab.io.ManualInput;
import com.craam.wellington.utils.*;

public class Sandbox {

	public static void main(String[] args) {

			IInput<com.craam.wellington.ramaty.io.InputData> ramatyInput = new com.craam.wellington.ramaty.io.ManualInput(new HashMap<String, Double>(){{
														put("ex", 3.); // 3
														put("anor", 5.0e37); // 5.0e37
														put("bmag", 300.);
														put("angle",45.);	
														put("theta", 10.); 
														put("j1",1.);
														put("j2",30.);
														put("kf",131.);
														put("etr", 2.5);
														put("alpha",0.3);
														}});
			
			IOutput ramatyOutput = new CSVOutput("ramaty.out").setExportAbsorption(false).setExportEmissivity(false).setExportPolarization(false).setExportTotalFluxOnly(true).setExportFluxPolarization(false).setExportFluxSFU(true).setExportFreqHz(true).setExportFrequency(true);
			Ramaty ramaty = new Ramaty(ramatyInput,ramatyOutput);
	}

}
