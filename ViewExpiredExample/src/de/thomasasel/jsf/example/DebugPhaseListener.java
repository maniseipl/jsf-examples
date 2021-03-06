package de.thomasasel.jsf.example;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public class DebugPhaseListener implements PhaseListener {

	@Override
	public void afterPhase(final PhaseEvent event) {
		System.out.println("After " + event.getPhaseId());
	}

	@Override
	public void beforePhase(final PhaseEvent event) {
		System.out.println("Before " + event.getPhaseId());
	}

	@Override
	public PhaseId getPhaseId() {
		return PhaseId.ANY_PHASE;
	}

}
