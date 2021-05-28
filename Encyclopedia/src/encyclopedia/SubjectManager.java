package encyclopedia;

import items.Subject;

public class SubjectManager {

	private Subject[] subjects;

	public SubjectManager() {
		super();
	}

	public void init() {

		Subject Kitchen = new Subject("Kitchen",
				"A kitchen is a room" + " or part of a room used for cooking and food preparation.",
				"A kitchen is a room or part of a room used for cooking and food"
						+ " preparation in a dwelling or in a commercial establishment.\n"
						+ "The main functions of a kitchen are to store, prepare and"
						+ " cook food (and to complete related tasks such as dishwashing).\n");

		Subject nanoTechnology = new Subject("Nanotechnology", "Nanotechnology is a part of science and technology\n"
				+ "about the control of matter on the atomic and molecular scale - this means things that\n"
				+ "are about 100 nanometres across",
				"Nanotechnology includes making products that use parts this small, such as electronic devices,\n"
				+ "catalysts, sensors, etc. To give you an idea of how small that is, there are more nanometres\n"
				+ "in an inch than there are inches in 400 miles.\n");
		
		Subject tcp = new Subject("Transmission Control Protocol (TCP)", "The Transmission Control Protocol (TCP) is a transport protocol that is used on top\n"
				+ "of IP to ensure reliable transmission of packets.",
				"TCP includes mechanisms to solve many of the problems that arise from packet-based messaging,"
				+ "such as lost packets, out of order packets, duplicate packets, and corrupted packets.\n");

		Subject livingRoom = new Subject("Living Room",
				"A living room is a room in a home that's used" + " for entertaining.",
				"A living room is a room in a home that's used for entertaining"
						+ " friends, talking, reading, or watching television. If you're a couch potato,"
						+ " you most likely spend lots of time in your living room. You can also call a"
						+ " living room a sitting room, a front room, or a parlor.\n");
		
		Subject steveJobs = new Subject("Steve Jobs", "Steven Paul Jobs; (February 24, 1955 – October 5, 2011) was\n"
				+ "an American business magnate, industrial designer, investor, and pioneer.", 
				"He was the chairman, chief executive officer (CEO), and co-founder of Apple Inc.; the \n"
				+ "chairman and majority shareholder of Pixar; a member of The Walt Disney Company's board \n"
				+ "of directors following its acquisition of Pixar; and the founder, chairman, and CEO of NeXT. \n"
				+ "Jobs is widely recognized as a pioneer of the personal computer revolution of \n"
				+ "the 1970s and 1980s, along with his early business partner and fellow Apple \n"
				+ "co-founder Steve Wozniak.\n");
		
		Subject wikipedia = new Subject("Wikipedia",
				"is a free, multilingual online encyclopedia written and maintained by a community \n"
				+ "of volunteer contributors through a model of open collaboration, using a wiki-based \n"
				+ "editing system.", 
				"Wikipedia is the largest and most-read reference work in history, and is consistently one of the \n"
				+ "15 most-popular websites as ranked by Alexa; as of 2021, it ranked as the 13th most-popular site. \n"
				+ "The project carries no advertisements and is hosted by the Wikimedia Foundation, an American non-profit \n"
				+ "organization funded mainly through individual donations.\n");

		setSubjects(Kitchen, nanoTechnology, tcp, livingRoom, steveJobs,
				wikipedia);

	}


	/*
	 * Getters and Setters...
	 */

	public Subject[] getSubjects() {
		return subjects;
	}

	public void setSubjects(Subject... subjects) {
		this.subjects = subjects;
	}
}