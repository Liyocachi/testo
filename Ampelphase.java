package de.habelitz.uebung12;

public class Ampelphase {
    enum Phase {AUS, ROT, ROTGELB, GRUEN, GELB};
    
    private Phase phase;
    
    Ampelphase() {
	setPhase(Phase.AUS);
    }

    public Phase getPhase() {
	return phase;
    }

    public void setPhase(Phase phase) {
	this.phase = phase;
    }

}
