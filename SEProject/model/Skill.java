package model;

public enum Skill {
	ART,
	BIOLOGY,
	CHEMISTRY,
	COOKING,
	ENGLISH,
	FRENCH,
	GAELIC,
	GEOGRAPHY,
	GERMAN,
	HISTORY,
	IT,
	ITALIAN,
	MATHS,
	MUSIC,
	PE,
	PHOTOGRAPHY,
	PHYSICS,
	PSYCHOLOGY,
	SOCIOLOGY,
	SPANISH,;

	public static Skill getSkillByString(String s) {
		if(s.equals("ART")) return ART;
		else if(s.equals("BIOLOGY")) return BIOLOGY;
		else if(s.equals("CHEMISTRY")) return CHEMISTRY;
		else if(s.equals("COOKING")) return COOKING;
		else if(s.equals("ENGLISH")) return ENGLISH;
		else if(s.equals("FRENCH")) return FRENCH;
		else if(s.equals("GAELIC")) return GAELIC;
		else if(s.equals("GEOGRAPHY")) return GEOGRAPHY;
		else if(s.equals("GERMAN")) return GERMAN;
		else if(s.equals("HISTORY")) return HISTORY;
		else if(s.equals("IT")) return IT;
		else if(s.equals("ITALIAN")) return ITALIAN;
		else if(s.equals("MATHS")) return MATHS;
		else if(s.equals("MUSIC")) return MUSIC;
		else if(s.equals("ART")) return ART;
		else if(s.equals("PHOTOGRAPHY")) return PHOTOGRAPHY;
		else if(s.equals("PHYSICS")) return PHYSICS;
		else if(s.equals("PSYCHOLOGY")) return PSYCHOLOGY;
		else if(s.equals("SOCIOLOGY")) return SOCIOLOGY;
		else if(s.equals("PE")) return PE;
		else return SPANISH;
	}
}
