package entities;

public class Student {
	public String nome;
	public double note_1;
	public double note_2;
	public double note_3;
	
	public static double media_approve = 7;
	
	public double finalNotes(){
		return note_1 + note_2 + note_3;
	}
	
	public double finalMedia(){
		return finalNotes() / 3;
	}
	
	public double missingPoint(){
		if(finalMedia() < media_approve){
			return media_approve - finalMedia();
		} else {
			return 0.0;	
		}
		
	}

}
