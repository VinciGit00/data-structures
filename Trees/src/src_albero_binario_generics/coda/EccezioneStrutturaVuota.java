package src_albero_binario_generics.coda;

@SuppressWarnings("serial")
public class EccezioneStrutturaVuota extends RuntimeException {

	public EccezioneStrutturaVuota(String messaggioErrore) {
		super(messaggioErrore);
	}

	public EccezioneStrutturaVuota() {
	}
}
