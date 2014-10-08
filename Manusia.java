import java.util.Scanner; 
public class Manusia{
	public String nama;
	public static void main(String[]args){
	Scanner masuk = new Scanner (System.in);
		Manusia orang= new Manusia();
		orang.setNama("Andreas");
		System.out.println ("Namaku adalah =" + orang.getNama());
	}
	public void setNama (String namaku){
		this.nama=namaku;
		}
		public String getNama() {
			return this.nama;
		}
	}