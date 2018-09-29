package pe.cleancode.domain;

public interface IRepository {
	int saveSpeaker(Speaker speaker);
	
	int calculateRegistrationFee(int exp)  ;
}