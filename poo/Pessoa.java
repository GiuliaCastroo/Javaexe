package poo;

public class Pessoa {
		private String primeiroNome;
		private String ultimoNome;
		private String nomeDoMeio;
		
		public Pessoa (String primeiro, String meio, String ultimo)
		{
			primeiroNome = primeiro;
			ultimoNome = ultimo;
			nomeDoMeio = meio;
			
			
		}

		public String getnomeCompleto()
		{
			String nomeCompleto = primeiroNome+" "+nomeDoMeio+ " " + ultimoNome;
			return nomeCompleto;
		}

}
